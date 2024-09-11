package cl.praxis.model;

import java.util.Date;

public class UsuarioDTO {
	
	private int id;
	private String correo;
	private Date create_at;
	private String nick;
	private String nombre;
	private String password;
	private int peso;
	private Date update_at;
	
	public UsuarioDTO(String correo, String nick, String nombre, String password, int peso, Date create_at,
			Date update_at) {
		super();
		this.correo = correo;
		this.create_at = create_at;
		this.nick = nick;
		this.nombre = nombre;
		this.password = password;
		this.peso = peso;
		this.update_at = update_at;
	}
	
	public UsuarioDTO(int id, String nombre, String correo, String nick, String password, int peso, Date create_at,
			Date update_at) {
		super();
		this.id = id;
		this.correo = correo;
		this.create_at = create_at;
		this.nick = nick;
		this.nombre = nombre;
		this.password = password;
		this.peso = peso;
		this.update_at = update_at;
	}
	
	

	public UsuarioDTO() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public Date getCreate_at() {
		return create_at;
	}
	public void setCreate_at(Date create_at) {
		this.create_at = create_at;
	}
	public String getNick() {
		return nick;
	}
	public void setNick(String nick) {
		this.nick = nick;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}
	public Date getUpdate_at() {
		return update_at;
	}
	public void setUpdate_at(Date update_at) {
		this.update_at = update_at;
	}
	@Override
	public String toString() {
		return "Usuario [id=" + id + ", correo=" + correo + ", create_at=" + create_at + ", nick=" + nick + ", nombre="
				+ nombre + ", password=" + password + ", peso=" + peso + ", update_at=" + update_at + "]";
	}
	
	

}
