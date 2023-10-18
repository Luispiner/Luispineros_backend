package co.edu.sena.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import co.edu.sena.models.entity.Usuario;
import co.edu.sena.models.service.UsuarioService;

@RestController
@RequestMapping("/api/usuarios")
@CrossOrigin (origins = "*", methods = {RequestMethod.GET,RequestMethod.POST,RequestMethod.DELETE,RequestMethod.PUT})
public class UsuarioController {
	
	@Autowired
	UsuarioService usuarioService;
	
	@GetMapping ("/{id}")
	public Optional<Usuario> buscarPorId (@PathVariable Integer id) {
		return usuarioService.findById(id);
		
	}
	
	@GetMapping("/Listar")
	public List <Usuario> ListarTodos (){
		return usuarioService.findAll();
	}
	
	@PostMapping
	public Usuario guardar(@RequestBody Usuario e) {
		return usuarioService.save(e);
		
	}
	
	@DeleteMapping ("/{id}")
	public void eliminar (@PathVariable Integer id) {
		usuarioService.deleteById(id);
		
	}
	@PutMapping("/actualizar/{id}")
	
	public Usuario actualizar(@RequestBody Usuario e, @PathVariable Integer id) {
		
		Usuario eEnBD=usuarioService.findById(id).get();
				eEnBD.setNombre(e.getNombre());
				eEnBD.setApellido(e.getApellido());
				eEnBD.setCedula(e.getCedula());
				eEnBD.setTelefono(e.getTelefono());
				eEnBD.setDireccion(e.getDireccion());
				eEnBD.setEmail(e.getEmail());
				
				return usuarioService.save(eEnBD);
	}
}
