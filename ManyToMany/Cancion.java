package com.app.seminario.entity;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tb_cancion")
public class Cancion {
	@Id   
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idtrack")
	private int idTrack;
	
	@Column(name = "nombretrack")
	private String nombreTrack;
	
	@ManyToMany(mappedBy = "canciones")
	private List<Album> albums;
		
	public Cancion() {
		super();
	}

	public Cancion(int idTrack, String nombreTrack, List<Album> albums) {
		super();
		this.idTrack = idTrack;
		this.nombreTrack = nombreTrack;
		this.albums = albums;
	}

	public int getIdTrack() {
		return idTrack;
	}

	public void setIdTrack(int idTrack) {
		this.idTrack = idTrack;
	}

	public String getNombreTrack() {
		return nombreTrack;
	}

	public void setNombreTrack(String nombreTrack) {
		this.nombreTrack = nombreTrack;
	}
	
	
}
