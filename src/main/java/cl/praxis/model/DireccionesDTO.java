package cl.praxis.model;

public class DireccionesDTO {

	private int id;
	private String nombre;
	private String numeracion;
	private int usuario_id;
	public DireccionesDTO(int id, String nombre, String numeracion, int usuario_id) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.numeracion = numeracion;
		this.usuario_id = usuario_id;
	}
	public DireccionesDTO() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getNumeracion() {
		return numeracion;
	}
	public void setNumeracion(String numeracion) {
		this.numeracion = numeracion;
	}
	public int getUsuario_id() {
		return usuario_id;
	}
	public void setUsuario_id(int usuario_id) {
		this.usuario_id = usuario_id;
	}
	@Override
	public String toString() {
		return "DireccionesDTO [id=" + id + ", nombre=" + nombre + ", numeracion=" + numeracion + ", usuario_id="
				+ usuario_id + "]";
	}
	
}
