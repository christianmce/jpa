package com.app.taller.entity;
import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;

@Entity
@Table(name="ofertas")
@IdClass(SuperLlave.class)
public class Ofertas {
	@Id
	@Column(name="id_art")
	private int idarticulo;
	
	@Id
	@Column(name="fecha")
	@JsonFormat(shape = Shape.STRING, pattern = "yyy-MM-dd" )
	private LocalDate fecha;
	
	@Column(name="por_desc")
	private int porcentajedescuento;

	public int getIdarticulo() {
		return idarticulo;
	}
	
	public void setIdarticulo(int idarticulo) {
		this.idarticulo = idarticulo;
	}
	
	public LocalDate getFecha() {
		return fecha; 
	}
	
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	
	public int getPorcentajedescuento() {
		return porcentajedescuento;
	}
	
	public void setPorcentajede(int porcentajedescuento) {
		this.porcentajedescuento = porcentajedescuento;
	}

}
