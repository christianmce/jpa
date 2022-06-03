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


//************************* Información complementaria como resultado de ejecutar el código -----------------
// Hibernate: create table tb_ofertas (fecha date not null, id_art integer not null, por_desc integer, primary key (fecha, id_art)) engine=MyISAM
// Hibernate: create table tb_productos (id_art integer not null auto_increment, descripcion varchar(255), precio float, primary key (id_art)) engine=MyISAM
// Hibernate: alter table tb_empleado add constraint FKpc587h901fmu4hil9fo73hpv0 foreign key (id_depto) references tb_departamento (id_depto)

