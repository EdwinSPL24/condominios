package model.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the vivienda database table.
 * 
 */
@Entity
@NamedQuery(name="Vivienda.findAll", query="SELECT v FROM Vivienda v")
public class Vivienda implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int numero;

	private String observacion;

	private String responsable;

	private int tipo;

	//bi-directional many-to-one association to Asistencia
	@OneToMany(mappedBy="viviendaBean")
	private List<Asistencia> asistencias;

	//bi-directional many-to-one association to Inquilino
	@OneToMany(mappedBy="viviendaBean")
	private List<Inquilino> inquilinos;

	public Vivienda() {
	}

	public int getNumero() {
		return this.numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getObservacion() {
		return this.observacion;
	}

	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}

	public String getResponsable() {
		return this.responsable;
	}

	public void setResponsable(String responsable) {
		this.responsable = responsable;
	}

	public int getTipo() {
		return this.tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public List<Asistencia> getAsistencias() {
		return this.asistencias;
	}

	public void setAsistencias(List<Asistencia> asistencias) {
		this.asistencias = asistencias;
	}

	public Asistencia addAsistencia(Asistencia asistencia) {
		getAsistencias().add(asistencia);
		asistencia.setViviendaBean(this);

		return asistencia;
	}

	public Asistencia removeAsistencia(Asistencia asistencia) {
		getAsistencias().remove(asistencia);
		asistencia.setViviendaBean(null);

		return asistencia;
	}

	public List<Inquilino> getInquilinos() {
		return this.inquilinos;
	}

	public void setInquilinos(List<Inquilino> inquilinos) {
		this.inquilinos = inquilinos;
	}

	public Inquilino addInquilino(Inquilino inquilino) {
		getInquilinos().add(inquilino);
		inquilino.setViviendaBean(this);

		return inquilino;
	}

	public Inquilino removeInquilino(Inquilino inquilino) {
		getInquilinos().remove(inquilino);
		inquilino.setViviendaBean(null);

		return inquilino;
	}

}