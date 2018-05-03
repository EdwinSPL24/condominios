package model.entities;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the asistencia database table.
 * 
 */
@Embeddable
public class AsistenciaPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(insertable=false, updatable=false)
	private int asamblea;

	@Column(insertable=false, updatable=false)
	private int vivienda;

	public AsistenciaPK() {
	}
	public int getAsamblea() {
		return this.asamblea;
	}
	public void setAsamblea(int asamblea) {
		this.asamblea = asamblea;
	}
	public int getVivienda() {
		return this.vivienda;
	}
	public void setVivienda(int vivienda) {
		this.vivienda = vivienda;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof AsistenciaPK)) {
			return false;
		}
		AsistenciaPK castOther = (AsistenciaPK)other;
		return 
			(this.asamblea == castOther.asamblea)
			&& (this.vivienda == castOther.vivienda);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.asamblea;
		hash = hash * prime + this.vivienda;
		
		return hash;
	}
}