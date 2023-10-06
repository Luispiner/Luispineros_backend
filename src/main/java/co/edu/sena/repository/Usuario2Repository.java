package co.edu.sena.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.edu.sena.models.entity.Usuario2;

public interface Usuario2Repository extends JpaRepository<Usuario2, Long>{
	Usuario2 findByUsername (String user);
	
	

}
