package co.edu.sena.models.service;

import java.util.List;

import co.edu.sena.models.entity.Usuario2;
public interface Usuario2Service {
	
	public Usuario2 save (Usuario2 u);
	public String login(String user, String ctr);
	public List<Usuario2> listarUsuariosLogeados();
	}



