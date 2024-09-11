package cl.praxis.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import cl.praxis.conexion.Conexion;

public class Conexion {

private static Connection conexion = null;
	
	private Conexion() {
		
		try {
			
			Class.forName("org.postgresql.Driver"); 			
			conexion = DriverManager.getConnection("jdbc:postgresql://localhost:5432/startup", "postgres", "admin");
			
			boolean isValid = conexion.isValid(50000);
			
			System.out.println(isValid ? " POSTGRES TEST OK" : "POSTGRES TEST NO SO GOOD");
			
		} catch (ClassNotFoundException | SQLException ex) {
			System.out.println("Error con BD: " + ex.getMessage());
		}
		
	}
	/**
	 * Implementando patron Singleton
	 * @return
	 */
	public static Connection getCon() {	
		if (conexion == null) {
			new Conexion();
		}
		
		return conexion;
	}	
}
