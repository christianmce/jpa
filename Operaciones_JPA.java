@Autowired
private CategoriaRepository categoRepo;

public void run(String... args) throws Exception {
        System.out.println("\n Insertar 3 nuevas categorias ...");
        categoRepo.save(new Categoria("Electrónica", 1));
        categoRepo.save(new Categoria("Deportes", 2));
        categoRepo.save(new Categoria("Hogar", 3));
         
        leerRepositorio();
         
        System.out.println("\n Actualizar una categoria...");
        List<Categoria> listado = categoRepo.findByNombre("Deportes");
        Categoria obj = listado.get(0);
        obj.setDescription("Juguetes");
        categoRepo.save(obj);
        
        
        System.out.println("\n Editar la Marca de un producto...");
        Inventario obj = inventRepo.findById("DRT699").orElse(null);
	obj.setMarca("EPSON");
	inventRepo.save(obj);
                
                 
        leerRepositorio();
         
        System.out.println("\n Eliminar una categoria ...");        
        Movie obj2 = listado.get(0);
        movieRepo.delete(obj2);
         
        leerRepositorio();
	
	deptoRepo.save(new Departamento("Ventas"));
		
	Departamento dp1 = deptoRepo.findById(1).orElse(null);
	Empleado emp1 = new Empleado();
	emp1.setNombre("Juan");
	emp1.setApellidos("Ramirez");
	emp1.setEmail("juan@hotmail.com");
	emp1.setDepto(dp1);
	empRepo.save(emp1);	
	
    }
     
    private void leerRepositorio() {
        System.out.println("Visualizando objetos del repositorio ...");
        System.out.printf("%-30.30s  %-30.30s%n", "Nombre", "Nivel");
        for (Categoria tmp : categoRepo.findAll()) {
            System.out.printf("%-30.30s  %-30.30s%n", tmp.getId(), tmp.getNombreCat());
        }       
    }
}
