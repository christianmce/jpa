package com.app.prac1.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_sucursal")
public class Sucursal {
	@Id	
	@Column(name = "idsuc")
	private String id;
	@Column(name = "name")
	private String name;
	@Column(name = "date_creation")
	private String date_creation;
	@Column(name = "external_id")
	private String external_id;
	
	public Sucursal() {
		super();
	}
	public Sucursal(String id, String name, String date_creation, String external_id) {
		super();
		this.id = id;
		this.name = name;
		this.date_creation = date_creation;
		this.external_id = external_id;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDate_creation() {
		return date_creation;
	}
	public void setDate_creation(String date_creation) {
		this.date_creation = date_creation;
	}
	public String getExternal_id() {
		return external_id;
	}
	public void setExternal_id(String external_id) {
		this.external_id = external_id;
	}

}
