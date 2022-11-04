package com.app.seminario.servicejpa;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import com.app.seminario.entity.Categoria;
import com.app.seminario.service.CategoriaRepository;
import com.app.seminario.service.ICategoriaService;
import org.springframework.stereotype.Service;
import com.app.seminario.exception.ResourceNotFoundException;

//LOGICA DE NEGOCIO
@Service
public class CategoriaService implements ICategoriaService{
	
	@Autowired
	private CategoriaRepository repoCategoria;
	
	@Override
	public List<Categoria> consultarTodasCategorias() {
		
		List<Categoria> result = repoCategoria.findAll();
		if(result.isEmpty())
			throw new ResourceNotFoundException("No existe categorías registradas en la BD");
		
		return repoCategoria.findAll();
	}
	
	@Override
	public List<Categoria> consultarPorNivel(int niv) { //3
		
		List<Categoria> result = repoCategoria.buscarXNivel(niv); //3
		if(result.isEmpty())
			throw new ResourceNotFoundException("No existe categorías asociadas a ese Nivel: " + niv);
		
		return repoCategoria.buscarXNivel(niv);
	}
	
	@Override
	public ResponseEntity<Categoria> consultarUno(int idCat) {
		Categoria obj = repoCategoria.findById(idCat).orElseThrow(() -> new ResourceNotFoundException("No existe categoría con el Id :" + idCat));
		return ResponseEntity.ok(obj);
	}

	@Override
	public ResponseEntity<Categoria> consultarbyNombre(String nombre) {		
		Categoria objcat = repoCategoria.findByNombre(nombre);
		if (objcat==null) 
			throw new ResourceNotFoundException("No existe una categoría con el nombre :" + nombre);
					
		return ResponseEntity.ok(objcat);
	}

	@Override
	public ResponseEntity<Map<String, String>> insertarCategoria(Categoria obj) {
		Map<String, String> okResponse = new HashMap<>();
		okResponse.put("message", "La Categoría se ha registrado correctamente");
	    okResponse.put("status", HttpStatus.CREATED.toString());
	    repoCategoria.save(obj);
		return new ResponseEntity<>(okResponse,HttpStatus.CREATED);
	}
	
	@Override
	public ResponseEntity<Map<String, String>> actualizarCategoria(Categoria obj, int idCat) {
		Map<String, String> okResponse = new HashMap<>();
			okResponse.put("message", "Los datos de la categoría se actualizaron correctamente");
			okResponse.put("status", HttpStatus.OK.toString());
	    
		Map<String, String> errorResponse = new HashMap<>();
			errorResponse.put("message", "No existe Categoría con el Id: " + idCat);
			errorResponse.put("status", HttpStatus.NOT_FOUND.toString());
		
		return repoCategoria.findById(idCat).map( p -> {				
				obj.setIdCat(idCat);		
				repoCategoria.save(obj); 
			return new ResponseEntity<>(okResponse, HttpStatus.OK);
		})
		.orElse(new ResponseEntity<>(errorResponse, HttpStatus.NOT_FOUND));

	}

	@Override
	public ResponseEntity<Map<String, String>> eliminarCategoria(int idCat) {		

		Map<String, String> errorResponse = new HashMap<>();
		errorResponse.put("message", "Ese articulo no fue encontrado");
	    errorResponse.put("status", HttpStatus.NOT_FOUND.toString());
	    
	    Map<String, String> okResponse = new HashMap<>();
	    okResponse.put("message", "El articulo fue eliminado correctamente");
	    okResponse.put("status", HttpStatus.OK.toString());
	    
		return repoCategoria.findById(idCat).map( p -> {
					repoCategoria.deleteById(idCat);
					return new ResponseEntity<>(okResponse, HttpStatus.OK);
				})
				.orElse(new ResponseEntity<>(errorResponse, HttpStatus.NOT_FOUND));
		
	}	

}
