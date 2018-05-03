package model.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the parentesco database table.
 * 
 */
@Entity
@NamedQuery(name="Parentesco.findAll", query="SELECT p FROM Parentesco p")
public class Parentesco implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private String descripcion;

	//bi-directional many-to-one association to Grupofamiliar
	@OneToMany(mappedBy="parentescoBean")
	private List<Grupofamiliar> grupofamiliars;

	public Parentesco() {
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

	public List<Grupofamiliar> getGrupofamiliars() {
		return this.grupofamiliars;
	}

	public void setGrupofamiliars(List<Grupofamiliar> grupofamiliars) {
		this.grupofamiliars = grupofamiliars;
	}

	public Grupofamiliar addGrupofamiliar(Grupofamiliar grupofamiliar) {
		getGrupofamiliars().add(grupofamiliar);
		grupofamiliar.setParentescoBean(this);

		return grupofamiliar;
	}

	public Grupofamiliar removeGrupofamiliar(Grupofamiliar grupofamiliar) {
		getGrupofamiliars().remove(grupofamiliar);
		grupofamiliar.setParentescoBean(null);

		return grupofamiliar;
	}

}