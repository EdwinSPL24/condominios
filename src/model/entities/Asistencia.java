package model.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the asistencia database table.
 * 
 */
@Entity
@NamedQuery(name="Asistencia.findAll", query="SELECT a FROM Asistencia a")
public class Asistencia implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private AsistenciaPK id;

	private byte asistio;

	private String observacion;

	//bi-directional many-to-one association to Asamblea
	@ManyToOne
	@JoinColumn(name="asamblea", insertable = false, updatable = false)
	private Asamblea asambleaBean;

	//bi-directional many-to-one association to Vivienda
	@ManyToOne
	@JoinColumn(name="vivienda", insertable = false, updatable = false)
	private Vivienda viviendaBean;

	public Asistencia() {
	}

	public AsistenciaPK getId() {
		return this.id;
	}

	public void setId(AsistenciaPK id) {
		this.id = id;
	}

	public byte getAsistio() {
		return this.asistio;
	}

	public void setAsistio(byte asistio) {
		this.asistio = asistio;
	}

	public String getObservacion() {
		return this.observacion;
	}

	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}

	public Asamblea getAsambleaBean() {
		return this.asambleaBean;
	}

	public void setAsambleaBean(Asamblea asambleaBean) {
		this.asambleaBean = asambleaBean;
	}

	public Vivienda getViviendaBean() {
		return this.viviendaBean;
	}

	public void setViviendaBean(Vivienda viviendaBean) {
		this.viviendaBean = viviendaBean;
	}

}