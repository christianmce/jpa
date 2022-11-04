package com.app.seminario.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_categoria")
public class Categoria {
	@Id   
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idcat")
	private int idCat;
	
	@Column(name = "nomprecatego")
	private String nombreCat;
	
	@Column(name = "nivel")
	private int nivel;
	
	public int getNivel() {
		return nivel;
	}
	public void setNivel(int nivel) {
		this.nivel = nivel;
	}
	
	protected Categoria() {
    }
 
    public Categoria(String nombreCat, int nivel) {
        this.nombreCat = nombreCat;
        this.nivel = nivel;
    } 
	
	public int getIdCat() {
		return idCat;
	}
	public void setIdCat(int idCat) {
		this.idCat = idCat;
	}
	public String getNombreCat() {
		return nombreCat;
	}
	public void setNombreCat(String nombreCat) {
		this.nombreCat = nombreCat;
	}
	
	
}
