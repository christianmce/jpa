package com.app.taller.entity;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tb_departamento")
public class Departamento {
	
	@Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_depto")
	private int idDepartmento;	

	@Column(name = "nombre")
	private String NombreDepto;

  @OneToMany(mappedBy = "depto")
  private List<Empleado> empleados;
        
	public Departamento() {
		super();
	}

	public Departamento(String nombreDepto) {
		super();		
		NombreDepto = nombreDepto;		
	}

	public int getIdDepartmento() {
		return idDepartmento;
	}

	public void setIdDepartmento(int idDepartmento) {
		this.idDepartmento = idDepartmento;
	}

	public String getNombreDepto() {
		return NombreDepto;
	}

	public void setNombreDepto(String nombreDepto) {
		NombreDepto = nombreDepto;
	}

	public List<Empleado> getEmpleados() {
		return empleados;
	}

	public void setEmpleados(List<Empleado> empleados) {
		this.empleados = empleados;
	}
	
}
