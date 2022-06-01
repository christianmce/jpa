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


#------------------------- Query using named parameters
	@Query("select u from User u where u.firstname = :firstname or u.lastname = :lastname")
	User findByLastnameOrFirstname(@Param("lastname") String lastname, @Param("firstname") String firstname);



#------------------------- NamedQuery using HQL 
@Entity
@NamedQuery(name = "Author.findByFirstName", query = "FROM Author WHERE firstName = ?1")
@NamedQuery(name = "Author.findByFirstNameAndLastName", query = "SELECT a FROM Author a WHERE a.firstName = ?1 AND a.lastName = ?2")
public class Author { ... }


#-------------------------- NamedQuery using nativeSQL
@Entity
@NamedNativeQuery(name = "Author.findByFirstName", query = "SELECT * FROM author WHERE first_name = ?", resultClass = Author.class)
@NamedNativeQuery(name = "Author.findByFirstNameAndLastName", query = "SELECT * FROM author WHERE first_name = ? AND last_name = ?", resultClass = Author.class)
public class Author { ... }
