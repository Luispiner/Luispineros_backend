package co.edu.sena.models.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "usuarios")

public class Usuario {
	
	@Id
	@Column (name = "idu")
	private int idusuario;
	@Column (name = "name")
	private String nombre;
	@Column (name = "lastname")
	private String apellido;
	@Column (name = "ip")
	private int cedula;
	@Column (name = "movil")
	private int telefono;
	@Column (name = "addres")
	private String direccion;
	@Column (name = "correo")
	private String email;
	public Usuario(int idusuario, String nombre, String apellido, int cedula, int telefono, String direccion,
			String email) {
		
		this.idusuario = idusuario;
		this.nombre = nombre;
		this.apellido = apellido;
		this.cedula = cedula;
		this.telefono = telefono;
		this.direccion = direccion;
		this.email = email;
	}
	public Usuario() {
		
		
	}
	public int getIdusuario() {
		return idusuario;
	}
	public void setIdusuario(int idusuario) {
		this.idusuario = idusuario;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getCedula() {
		return cedula;
	}
	public void setCedula(int cedula) {
		this.cedula = cedula;
	}
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	

}

 