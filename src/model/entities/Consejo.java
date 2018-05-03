package model.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the consejo database table.
 * 
 */
@Entity
@NamedQuery(name="Consejo.findAll", query="SELECT c FROM Consejo c")
public class Consejo implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private ConsejoPK id;

	@Temporal(TemporalType.DATE)
	private Date fechafin;

	//bi-directional many-to-one association to Cargo
	@ManyToOne
	@JoinColumn(name="cargo", insertable = false, updatable = false)
	private Cargo cargoBean;

	//bi-directional many-to-one association to Persona
	@ManyToOne
	@JoinColumn(name="persona", insertable = false, updatable = false)
	private Persona personaBean;

	public Consejo() {
	}

	public ConsejoPK getId() {
		return this.id;
	}

	public void setId(ConsejoPK id) {
		this.id = id;
	}

	public Date getFechafin() {
		return this.fechafin;
	}

	public void setFechafin(Date fechafin) {
		this.fechafin = fechafin;
	}

	public Cargo getCargoBean() {
		return this.cargoBean;
	}

	public void setCargoBean(Cargo cargoBean) {
		this.cargoBean = cargoBean;
	}

	public Persona getPersonaBean() {
		return this.personaBean;
	}

	public void setPersonaBean(Persona personaBean) {
		this.personaBean = personaBean;
	}

}