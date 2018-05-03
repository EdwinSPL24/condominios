package model.entities;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the detallerecibo database table.
 * 
 */
@Embeddable
public class DetallereciboPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(insertable=false, updatable=false)
	private int recibo;

	@Column(insertable=false, updatable=false)
	private int concepto;

	public DetallereciboPK() {
	}
	public int getRecibo() {
		return this.recibo;
	}
	public void setRecibo(int recibo) {
		this.recibo = recibo;
	}
	public int getConcepto() {
		return this.concepto;
	}
	public void setConcepto(int concepto) {
		this.concepto = concepto;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof DetallereciboPK)) {
			return false;
		}
		DetallereciboPK castOther = (DetallereciboPK)other;
		return 
			(this.recibo == castOther.recibo)
			&& (this.concepto == castOther.concepto);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.recibo;
		hash = hash * prime + this.concepto;
		
		return hash;
	}
}