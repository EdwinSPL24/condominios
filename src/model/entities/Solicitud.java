package model.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the solicitud database table.
 * 
 */
@Entity
@NamedQuery(name="Solicitud.findAll", query="SELECT s FROM Solicitud s")
public class Solicitud implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int numero;

	private String estado;

	@Temporal(TemporalType.DATE)
	private Date fechanecesidad;

	@Temporal(TemporalType.DATE)
	private Date fechasolicitud;

	private int recibo;

	private String usuario;

	private int vivienda;

	//bi-directional many-to-many association to Servicio
	@ManyToMany
	@JoinTable(
		name="detallesolicitud"
		, joinColumns={
			@JoinColumn(name="solicitud")
			}
		, inverseJoinColumns={
			@JoinColumn(name="servicio")
			}
		)
	private List<Servicio> servicios;

	public Solicitud() {
	}

	public int getNumero() {
		return this.numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getEstado() {
		return this.estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Date getFechanecesidad() {
		return this.fechanecesidad;
	}

	public void setFechanecesidad(Date fechanecesidad) {
		this.fechanecesidad = fechanecesidad;
	}

	public Date getFechasolicitud() {
		return this.fechasolicitud;
	}

	public void setFechasolicitud(Date fechasolicitud) {
		this.fechasolicitud = fechasolicitud;
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

	public List<Servicio> getServicios() {
		return this.servicios;
	}

	public void setServicios(List<Servicio> servicios) {
		this.servicios = servicios;
	}

}