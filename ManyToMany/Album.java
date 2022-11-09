package com.app.seminario.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tb_album")
public class Album {
	@Id   
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idalbum")
	private int idAlbum;
	
	@Column(name = "nombrealbum")
	private String nombreAlbum;
	
	@JoinTable(
	        name = "rel_album_cancion",
	        joinColumns = @JoinColumn(name = "FK_Album", nullable = false),
	        inverseJoinColumns = @JoinColumn(name="FK_Cancion", nullable = false)
	    )
	@ManyToMany(cascade = CascadeType.ALL)
	private List<Cancion> canciones;
	
	public void addCancion(Cancion track){
        if(this.canciones == null){
            this.canciones = new ArrayList<>();
        }
        
        this.canciones.add(track);
    }
	
	public Album() {
		super();
	}

	public Album(int idAlbum, String nombreAlbum, List<Cancion> canciones) {
		super();
		this.idAlbum = idAlbum;
		this.nombreAlbum = nombreAlbum;
		this.canciones = canciones;
	}

	public int getIdAlbum() {
		return idAlbum;
	}

	public void setIdAlbum(int idAlbum) {
		this.idAlbum = idAlbum;
	}

	public String getNombreAlbum() {
		return nombreAlbum;
	}

	public void setNombreAlbum(String nombreAlbum) {
		this.nombreAlbum = nombreAlbum;
	}
	
	public List<Cancion> getCanciones() {
		return canciones;
	}

	public void setCanciones(List<Cancion> canciones) {
		this.canciones = canciones;
	}	
	
}
