package com.app.taller.entity;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

public class SuperLlave implements Serializable {
	
	private int idarticulo;  //ForeignKey
	private LocalDate fecha; //LocalKey
	
	public SuperLlave() {
		
	}
	
	public SuperLlave(int idarticulo,LocalDate fecha) {
		this.idarticulo=idarticulo;
		this.fecha=fecha;
	}

}
