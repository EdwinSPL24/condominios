package model.entities;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the consejo database table.
 * 
 */
@Embeddable
public class ConsejoPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(insertable=false, updatable=false)
	private String persona;

	@Column(insertable=false, updatable=false)
	private int cargo;

	@Temporal(TemporalType.DATE)
	private java.util.Date fechainicio;

	public ConsejoPK() {
	}
	public String getPersona() {
		return this.persona;
	}
	public void setPersona(String persona) {
		this.persona = persona;
	}
	public int getCargo() {
		return this.cargo;
	}
	public void setCargo(int cargo) {
		this.cargo = cargo;
	}
	public java.util.Date getFechainicio() {
		return this.fechainicio;
	}
	public void setFechainicio(java.util.Date fechainicio) {
		this.fechainicio = fechainicio;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof ConsejoPK)) {
			return false;
		}
		ConsejoPK castOther = (ConsejoPK)other;
		return 
			this.persona.equals(castOther.persona)
			&& (this.cargo == castOther.cargo)
			&& this.fechainicio.equals(castOther.fechainicio);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.persona.hashCode();
		hash = hash * prime + this.cargo;
		hash = hash * prime + this.fechainicio.hashCode();
		
		return hash;
	}
}