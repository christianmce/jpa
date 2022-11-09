//Autor: Dr. Christian Mauricio Castillo Estrada
//Facultad de Negocios Campus IV de la UNACH
//Este codigo es para efectuar pruebas de JPA en modo terminal, sin implementar la capa Controller
//El archivo AppTallerRunner.java debe ser guardado en el paquete principal del proyecto

@Component
public class AppTallerRunner implements ApplicationRunner{

	@Autowired
	private AlbumRepository repoAlbum;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		Cancion track1 = new Cancion();
		track1.setNombreTrack("Paradise");	
		
		Cancion track2 = new Cancion();
		track2.setNombreTrack("Charlie Brown");
		
		Album album1 = new Album();
		album1.setNombreAlbum("Mylo Xyloto ColdPlay");
		album1.addCancion(track1);
		album1.addCancion(track2);
	
		repoAlbum.save(album1);
		
	}

}
