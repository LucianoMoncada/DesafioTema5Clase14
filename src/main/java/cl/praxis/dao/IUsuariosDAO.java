package cl.praxis.dao;

import java.util.List;

import cl.praxis.model.UsuarioDTO;



public interface IUsuariosDAO {

	void create(UsuarioDTO p);

	UsuarioDTO read(String email, String pass);
	
	boolean verificaEmail(String email);

	List<UsuarioDTO> read();

	void update(UsuarioDTO a);

	String delete(int id);
	
	
}
