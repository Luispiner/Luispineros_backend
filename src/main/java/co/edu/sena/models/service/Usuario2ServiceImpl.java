package co.edu.sena.models.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.sena.models.entity.Usuario2;
import co.edu.sena.repository.Usuario2Repository;

@Service
public class Usuario2ServiceImpl implements Usuario2Service {
	
	@Autowired
	Usuario2Repository usuario2Repository;
	
	@Override
	public Usuario2 save(Usuario2 u) {
	//Aqui guarda un nuevo usuario en la base de datos
		return usuario2Repository.save(u);
	}

	@Override
	public String login(String user, String ctr) { 
		// Aqui busca al usuario por su nombre en la base de datos
		Usuario2 usuario2 = usuario2Repository.findByUsername(user);  
		//Aqui verifica si el usuario Existe
		if (usuario2 == null) {
			return "Usuario no encontrado";
		}
		// Aqui compara la contraseña proporcionada con la almacenada
		if (!usuario2.getPassword().equals(ctr)) { 
			// En caso que la contraseña no sea la correcta entonces devuelve mensaje: contraseña incorrecta
			return "Contraseña incorrecta";
		}
		// Aqui si la contraseña es correcta , devuelve un mensaje de inicio Exitoso
		return "Inicio de sesión exitoso";
	}
}
