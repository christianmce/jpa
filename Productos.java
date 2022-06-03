package com.app.taller.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tb_productos")
public class Productos {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_art")
	private int idarticulo;
	
	@Column(name="descripcion")	
	private String descPro;
	
	@Column(name="precio")
	private float precioPro;
	
		
	public Productos() {
		super();
	}

	public Productos(int idarticulo, String descPro, float precioPro) {
		super();
		this.idarticulo = idarticulo;
		this.descPro = descPro;
		this.precioPro = precioPro;
	}

	public int getIdarticulo() {
		return idarticulo;
	}

	public void setIdarticulo(int idarticulo) {
		this.idarticulo = idarticulo;
	}

	public String getDescPro() {
		return descPro;
	}

	public void setDescPro(String descPro) {
		this.descPro = descPro;
	}

	public float getPrecioPro() {
		return precioPro;
	}

	public void setPrecioPro(float precioPro) {
		this.precioPro = precioPro;
	}
}


