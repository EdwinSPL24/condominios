package model.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the concepto database table.
 * 
 */
@Entity
@NamedQuery(name="Concepto.findAll", query="SELECT c FROM Concepto c")
public class Concepto implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private String descripcion;

	private byte estado;

	//bi-directional many-to-one association to Detallerecibo
	@OneToMany(mappedBy="conceptoBean")
	private List<Detallerecibo> detallerecibos;

	public Concepto() {
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

	public byte getEstado() {
		return this.estado;
	}

	public void setEstado(byte estado) {
		this.estado = estado;
	}

	public List<Detallerecibo> getDetallerecibos() {
		return this.detallerecibos;
	}

	public void setDetallerecibos(List<Detallerecibo> detallerecibos) {
		this.detallerecibos = detallerecibos;
	}

	public Detallerecibo addDetallerecibo(Detallerecibo detallerecibo) {
		getDetallerecibos().add(detallerecibo);
		detallerecibo.setConceptoBean(this);

		return detallerecibo;
	}

	public Detallerecibo removeDetallerecibo(Detallerecibo detallerecibo) {
		getDetallerecibos().remove(detallerecibo);
		detallerecibo.setConceptoBean(null);

		return detallerecibo;
	}

}