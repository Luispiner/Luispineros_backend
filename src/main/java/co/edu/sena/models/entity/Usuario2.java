package co.edu.sena.models.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "usuarioslogin")
public class Usuario2 {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column (name = "id_usu") // Este es el identificador unico  Autoincrementable
	private Long id;
	@Column (name = "nom_usu") // Este es el Nombre del Usuario
	private String username;
	@Column (name = "cont_usu") // Este es la Contraseña
	private String password;
	public Usuario2() {
		
	}
	public Usuario2(Long id, String username, String password) {
		
		this.id = id;
		this.username = username; //Aqui se almacena  el nombre de Usuario
		this.password = password; //Aqui esta almacena la contraseña
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
