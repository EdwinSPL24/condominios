package model.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the multa database table.
 * 
 */
@Entity
@NamedQuery(name="Multa.findAll", query="SELECT m FROM Multa m")
public class Multa implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int numero;

	@Temporal(TemporalType.DATE)
	private Date fecha;

	private String observacion;

	private int recibo;

	private String usuario;

	private int vivienda;

	public Multa() {
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

	public String getObservacion() {
		return this.observacion;
	}

	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}

	public int getRecibo() {
		return this.recibo;
	}

	public void setRecibo(int recibo) {
		this.recibo = recibo;
	}

	public String getUsuario() {
		return this.usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public int getVivienda() {
		return this.vivienda;
	}

	public void setVivienda(int vivienda) {
		this.vivienda = vivienda;
	}

}