package com.app.taller.Repository;
import org.springframework.data.repository.CrudRepository;
import com.app.taller.Entity.DetalleFactura;
import com.app.taller.Entity.SuperLlave;

public interface DetalleRepo extends CrudRepository<DetalleFactura,SuperLlave>{

}

//Se hereda desde la superclase CrudRepository indicando el nombre de la Entidad Subordinada y el archivo de SuperLLave


//---------------------------------------------------- SuperLLave.java ---------------------------------------------------
package com.app.taller.Entity;
import java.io.Serializable;

public class SuperLlave implements Serializable {
	String Folio; 
	int Cns; 
	
	public SuperLlave() {
		super();
	}
	public SuperLlave(String folio, int cns) {
		super();
		Folio = folio;
		Cns = cns;
	}	
}



//---------------------------------------------------- DetalleFactura.java ---------------------------------------------------
package com.app.taller.Entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.IdClass;

@Entity
@Table(name="tb_detallefactura")
@IdClass(SuperLlave.class)
public class DetalleFactura {
	@Id
	@Column(name="foliofact",length = 64)
	private String Folio;
	
	@Id
	@Column(name="cns")	
	private int Cns;
	
	@Column(name="cantidad")
	private int Cant;
	
	public DetalleFactura() {
		super();
	}
	public DetalleFactura(String folio, int cns, int cantidad) {
		super();		
		Folio = folio;
		Cns = cns;
		Cant = cantidad;
	}
	
	public String getFolio() {
		return Folio;
	}
  //-->----------public Getters and Setters () ------------------
