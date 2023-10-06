package co.edu.sena.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.sena.models.entity.Usuario2;
import co.edu.sena.models.service.Usuario2Service;

@RestController
@RequestMapping ("/api/usuarioslogin")
public class Usuario2Controller {
	
	@Autowired Usuario2Service usuario2Service;
	
	// Este es el Metodo para Guardar un Usuario nuevo
	@PostMapping
	public Usuario2 guardar(@RequestBody Usuario2 u) {
		return usuario2Service.save(u);
		
	}
	
	// Este es el Metodo para Realizar el login
	@PostMapping ("/login")
	public ResponseEntity<String> login(@RequestBody Usuario2 usuario2){
	
	// Aqui llama al servicio para realizar el login y obtener un mensaje de respuesta
	String mensaje = usuario2Service.login(usuario2.getUsername(),usuario2.getPassword());
	
	// Devuelve una respuesta HTTP con el mensaje
		return ResponseEntity.ok(mensaje);
		
	}
	
	
	
	

}
