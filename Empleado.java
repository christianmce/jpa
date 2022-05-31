package com.app.taller.entity;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_empleado")
public class Empleado {
	
	@Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idemp")
	private int idEmp;    
	
	@Column(name = "nombre")
	private String Nombre;
	
	@Column(name = "apellidos")
	private String Apellidos;
	
	@Column(name = "email")
	private String Email;
	
	@Column(name = "edad", nullable = false)
	private int Edad;	
    
	@ManyToOne(cascade = CascadeType.REMOVE)
    @JoinColumn(name = "id_depto",referencedColumnName = "id_depto")
    private Departamento depto;
		
	public Empleado() {
		super();
	}
	public Empleado(String nombre, String apellidos, String email, Departamento depto) {
		super();		
		Nombre = nombre;
		Apellidos = apellidos;
		Email = email;
		this.depto = depto;
	}
	public Departamento getDepto() {
		return depto;
	}
	public void setDepto(Departamento depto) {
		this.depto = depto;
	}
	public int getIdEmp() {
		return idEmp;
	}
	public void setIdEmp(int idEmp) {
		this.idEmp = idEmp;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getApellidos() {
		return Apellidos;
	}
	public void setApellidos(String apellidos) {
		Apellidos = apellidos;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}

}
