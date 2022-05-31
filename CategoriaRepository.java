package com.app.taller.service;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.app.taller.entity.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Integer>  {
	@Query ("select o from Categoria o where o.nombreCat like %?1")
	Categoria findByNombre(String nombre);
	
	@Query ("select x from Categoria x where x.nivel = ?1") 
	List<Categoria> buscarXNivel(int niv);
}


	@Query ("select x from Empleado x where x.Edad >= ?1 and x.Depto = ?2") 
	List<Empleado> findByEdad(int Edad, Departamento obj);
