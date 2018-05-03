package model.entities;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the propietario database table.
 * 
 */
@Embeddable
public class PropietarioPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	private int vivienda;

	private String persona;

	@Temporal(TemporalType.DATE)
	private java.util.Date fechainicio;

	public PropietarioPK() {
	}
	public int getVivienda() {
		return this.vivienda;
	}
	public void setVivienda(int vivienda) {
		this.vivienda = vivienda;
	}
	public String getPersona() {
		return this.persona;
	}
	public void setPersona(String persona) {
		this.persona = persona;
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
		if (!(other instanceof PropietarioPK)) {
			return false;
		}
		PropietarioPK castOther = (PropietarioPK)other;
		return 
			(this.vivienda == castOther.vivienda)
			&& this.persona.equals(castOther.persona)
			&& this.fechainicio.equals(castOther.fechainicio);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.vivienda;
		hash = hash * prime + this.persona.hashCode();
		hash = hash * prime + this.fechainicio.hashCode();
		
		return hash;
	}
}