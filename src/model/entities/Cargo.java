package model.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the cargo database table.
 * 
 */
@Entity
@NamedQuery(name="Cargo.findAll", query="SELECT c FROM Cargo c")
public class Cargo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private String descripcion;

	//bi-directional many-to-one association to Consejo
	@OneToMany(mappedBy="cargoBean")
	private List<Consejo> consejos;

	public Cargo() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public List<Consejo> getConsejos() {
		return this.consejos;
	}

	public void setConsejos(List<Consejo> consejos) {
		this.consejos = consejos;
	}

	public Consejo addConsejo(Consejo consejo) {
		getConsejos().add(consejo);
		consejo.setCargoBean(this);

		return consejo;
	}

	public Consejo removeConsejo(Consejo consejo) {
		getConsejos().remove(consejo);
		consejo.setCargoBean(null);

		return consejo;
	}

}