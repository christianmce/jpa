package com.app.prac1.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@Table(name = "tb_location")
@IdClass(SuperKey.class)
public class Location {
	@Id	
	@Column(name = "idsuc")
	private String id;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cns")
	private int cns;	
	
	@Column(name = "address_line")
	private String address_line; 
	@Column(name = "reference")
    private String reference;
	@Column(name = "latitude")
    private Double latitude;
	@Column(name = "longitude")
    private Double longitude;	    
       
	public Location() {
		super();
	}
	
	public Location(String id, int cns, String address_line, String reference, Double latitude, Double longitude) {
		super();
		this.id = id;
		this.cns = cns;
		this.address_line = address_line;
		this.reference = reference;
		this.latitude = latitude;
		this.longitude = longitude;
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
	public String getAddress_line() {
		return address_line;
	}
	public void setAddress_line(String address_line) {
		this.address_line = address_line;
	}
	public String getReference() {
		return reference;
	}
	public void setReference(String reference) {
		this.reference = reference;
	}
	public Double getLatitude() {
		return latitude;
	}
	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}
	public Double getLongitude() {
		return longitude;
	}
	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}

}
