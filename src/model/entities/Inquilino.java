package model.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the inquilino database table.
 * 
 */
@Entity
@NamedQuery(name="Inquilino.findAll", query="SELECT i FROM Inquilino i")
public class Inquilino implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private InquilinoPK id;

	@Temporal(TemporalType.DATE)
	private Date fechafin;

	private int responsable;

	//bi-directional many-to-one association to Persona
	@ManyToOne
	@JoinColumn(name="persona", insertable = false, updatable = false)
	private Persona personaBean;

	//bi-directional many-to-one association to Vivienda
	@ManyToOne
	@JoinColumn(name="vivienda", insertable = false, updatable = false)
	private Vivienda viviendaBean;

	public Inquilino() {
	}

	public InquilinoPK getId() {
		return this.id;
	}

	public void setId(InquilinoPK id) {
		this.id = id;
	}

	public Date getFechafin() {
		return this.fechafin;
	}

	public void setFechafin(Date fechafin) {
		this.fechafin = fechafin;
	}

	public int getResponsable() {
		return this.responsable;
	}

	public void setResponsable(int responsable) {
		this.responsable = responsable;
	}

	public Persona getPersonaBean() {
		return this.personaBean;
	}

	public void setPersonaBean(Persona personaBean) {
		this.personaBean = personaBean;
	}

	public Vivienda getViviendaBean() {
		return this.viviendaBean;
	}

	public void setViviendaBean(Vivienda viviendaBean) {
		this.viviendaBean = viviendaBean;
	}

}