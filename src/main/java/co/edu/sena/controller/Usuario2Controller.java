package co.edu.sena.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import co.edu.sena.models.entity.Usuario2;
import co.edu.sena.models.service.Usuario2Service;

@RestController
@RequestMapping("/api/usuarioslogin")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.DELETE, RequestMethod.PUT})
public class Usuario2Controller {

    @Autowired
    private Usuario2Service usuario2Service;

    // Este es el Método para Guardar un Usuario nuevo
    @PostMapping
    public Usuario2 guardar(@RequestBody Usuario2 u) {
        return usuario2Service.save(u);
    }

    // Este es el Método para Realizar el login
    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody Usuario2 usuario2) {
        // Aquí llama al servicio para realizar el login y obtener un mensaje de respuesta
        String mensaje = usuario2Service.login(usuario2.getUsername(), usuario2.getPassword());
        // Devuelve una respuesta HTTP con el mensaje
        return ResponseEntity.ok(mensaje);
    }
      //Aqui se llama al servicio para listar los usuarios logeados
    @GetMapping("/listarlogeados")
    public List<Usuario2> listarUsuariosLogeados() {
        // Aquí obtienes y devuelves la lista de usuarios logeados desde tu servicio
        return usuario2Service.listarUsuariosLogeados();
    }
}
