package model.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the detallerecibo database table.
 * 
 */
@Entity
@NamedQuery(name="Detallerecibo.findAll", query="SELECT d FROM Detallerecibo d")
public class Detallerecibo implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private DetallereciboPK id;

	private String observacion;

	private String usuario;

	private BigDecimal valor;

	//bi-directional many-to-one association to Concepto
	@ManyToOne
	@JoinColumn(name="concepto", insertable = false, updatable = false)
	private Concepto conceptoBean;

	//bi-directional many-to-one association to Recibo
	@ManyToOne
	@JoinColumn(name="recibo", insertable = false, updatable = false)
	private Recibo reciboBean;

	public Detallerecibo() {
	}

	public DetallereciboPK getId() {
		return this.id;
	}

	public void setId(DetallereciboPK id) {
		this.id = id;
	}

	public String getObservacion() {
		return this.observacion;
	}

	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}

	public String getUsuario() {
		return this.usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public BigDecimal getValor() {
		return this.valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public Concepto getConceptoBean() {
		return this.conceptoBean;
	}

	public void setConceptoBean(Concepto conceptoBean) {
		this.conceptoBean = conceptoBean;
	}

	public Recibo getReciboBean() {
		return this.reciboBean;
	}

	public void setReciboBean(Recibo reciboBean) {
		this.reciboBean = reciboBean;
	}

}