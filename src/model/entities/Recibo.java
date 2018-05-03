package model.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the recibo database table.
 * 
 */
@Entity
@NamedQuery(name="Recibo.findAll", query="SELECT r FROM Recibo r")
public class Recibo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int numero;

	@Temporal(TemporalType.DATE)
	private Date fecha;

	private String responsable;

	private String usuario;

	private BigDecimal valor;

	private int vivienda;

	//bi-directional many-to-one association to Detallerecibo
	@OneToMany(mappedBy="reciboBean")
	private List<Detallerecibo> detallerecibos;

	public Recibo() {
	}

	public int getNumero() {
		return this.numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Date getFecha() {
		return this.fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getResponsable() {
		return this.responsable;
	}

	public void setResponsable(String responsable) {
		this.responsable = responsable;
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

	public int getVivienda() {
		return this.vivienda;
	}

	public void setVivienda(int vivienda) {
		this.vivienda = vivienda;
	}

	public List<Detallerecibo> getDetallerecibos() {
		return this.detallerecibos;
	}

	public void setDetallerecibos(List<Detallerecibo> detallerecibos) {
		this.detallerecibos = detallerecibos;
	}

	public Detallerecibo addDetallerecibo(Detallerecibo detallerecibo) {
		getDetallerecibos().add(detallerecibo);
		detallerecibo.setReciboBean(this);

		return detallerecibo;
	}

	public Detallerecibo removeDetallerecibo(Detallerecibo detallerecibo) {
		getDetallerecibos().remove(detallerecibo);
		detallerecibo.setReciboBean(null);

		return detallerecibo;
	}

}