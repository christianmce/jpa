package com.app.prac1.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@Table(name = "tb_horarios")
@IdClass(SuperKey.class)
public class Horarios {
	@Id	
	@Column(name = "idsuc")
	private String id;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cns")
	private int cns;
	@Column(name = "day")
    private String day; 
	@Column(name = "open")
    private String open;
	@Column(name = "close")
    private String close;
           
	public Horarios() {
		super();
	}
	
	public Horarios(String id, int cns, String day, String open, String close) {
		super();
		this.id = id;
		this.cns = cns;
		this.day = day;
		this.open = open;
		this.close = close;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getCns() {
		return cns;
	}
	public void setCns(int cns) {
		this.cns = cns;
	}
	public String getDay() {
		return day;
	}
	public void setDay(String day) {
		this.day = day;
	}
	public String getOpen() {
		return open;
	}
	public void setOpen(String open) {
		this.open = open;
	}
	public String getClose() {
		return close;
	}
	public void setClose(String close) {
		this.close = close;
	}
    
    
}
