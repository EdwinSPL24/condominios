package model.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the propietario database table.
 * 
 */
@Entity
@NamedQuery(name="Propietario.findAll", query="SELECT p FROM Propietario p")
public class Propietario implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private PropietarioPK id;

	@Temporal(TemporalType.DATE)
	private Date fechafin;

	private int responsable;

	public Propietario() {
	}

	public PropietarioPK getId() {
		return this.id;
	}

	public void setId(PropietarioPK id) {
		this.id = id;
	}

	public Date getFechafin() {
		return this.fechafin;
	}

	public void setFechafin(Date fechafin) {
		this.fechafin = fechafin;
	}

	public int getResponsable() {
		return this.responsable;
	}

	public void setResponsable(int responsable) {
		this.responsable = responsable;
	}

}