package cl.praxis.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import cl.praxis.model.UsuarioDTO;
import cl.praxis.conexion.Conexion;

public class UsuariosDAOImpl implements IUsuariosDAO {

	@Override
	public void create(UsuarioDTO p) {
		try {
			Connection c = Conexion.getCon();

			Statement s = c.createStatement();
			String sql = "insert into usuarios (nombre, correo, nick, password, peso, create_at, update_at) values "
					+ "('" + p.getNombre() + "','" + p.getCorreo() + "','" + p.getNick() + "','" + p.getPassword()
					+ "','" + p.getPeso() + "','" + p.getCreate_at() + "','" + p.getUpdate_at() + "')";

			ResultSet re = s.executeQuery(sql);

		} catch (SQLException e) {
			System.out.println("ERROR en create(proveedores)");
			e.printStackTrace();
		}
	}

	@Override
	public UsuarioDTO read(String email, String pass) {
		
		UsuarioDTO p = null;

		try {
			Connection c = Conexion.getCon();

			Statement s = c.createStatement();
			String sql = "select id, nombre, correo, nick, password, peso, create_at, update_at from usuarios where correo = '"
					+ email+ "' and password= '" +pass+"'";
			System.out.println(sql);
			ResultSet rs = s.executeQuery(sql);
			if (rs.next()) {
				p = new UsuarioDTO(rs.getInt("id"), rs.getString("nombre"), rs.getString("correo"), rs.getString("nick"),
						rs.getString("password"), rs.getInt("peso"), rs.getDate("create_at"),
						rs.getDate("update_at"));
			}
		} catch (SQLException e) {
			System.out.println("ERROR en read(id)");
			e.printStackTrace();
		}

		return p;
	}
@Override
public boolean verificaEmail(String email) {
		
		try {
			Connection c = Conexion.getCon();

			Statement s = c.createStatement();
			String sql = "select id from usuarios where correo = '"
					+ email+ "'";
			System.out.println(sql);
			ResultSet rs = s.executeQuery(sql);
			if (rs.next()) {
				return true;
			}
		} catch (SQLException e) {
			System.out.println("ERROR en read(id)");
			e.printStackTrace();
		}

		return false;
	}
	
	@Override
	public List<UsuarioDTO> read() {
	List<UsuarioDTO> usuarioDTO = new ArrayList<UsuarioDTO>();

	try {
		Connection c = Conexion.getCon();

		Statement s = c.createStatement();
		String sql = "select id, nombre, rut, direccion, correo, telefono, contacto,telefono_contacto from usuarios order by nombre asc";

		ResultSet rs = s.executeQuery(sql);

		while (rs.next()) {

			usuarioDTO.add(new UsuarioDTO(rs.getInt("id"), rs.getString("nombre"), rs.getString("correo"), rs.getString("nick"),
					rs.getString("password"), rs.getInt("peso"), rs.getDate("create_at"),
					rs.getDate("update_at")));

		}

	} catch (SQLException e) {
		System.out.println("ERROR en read()");
		e.printStackTrace();
	}
	return usuarioDTO;
	}

	@Override
	public void update(UsuarioDTO a) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String delete(int id) {
		try {
			Connection c = Conexion.getCon();

			Statement s = c.createStatement();
			String sql = "delete from usuarios where  id = " + id;

			ResultSet re = s.executeQuery(sql);

		} catch (SQLException e) {
			System.out.println("ERROR en delete(id)");
			e.printStackTrace();
		}
		return "Borrado";
	}

	
}
