package model.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the grupofamiliar database table.
 * 
 */
@Entity
@NamedQuery(name="Grupofamiliar.findAll", query="SELECT g FROM Grupofamiliar g")
public class Grupofamiliar implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private String celular;

	private String documento;

	@Temporal(TemporalType.DATE)
	private Date fechanacimiento;

	private String nombre;

	//bi-directional many-to-one association to Parentesco
	@ManyToOne
	@JoinColumn(name="parentesco")
	private Parentesco parentescoBean;

	//bi-directional many-to-one association to Persona
	@ManyToOne
	@JoinColumn(name="cabeza")
	private Persona persona;

	public Grupofamiliar() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCelular() {
		return this.celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getDocumento() {
		return this.documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public Date getFechanacimiento() {
		return this.fechanacimiento;
	}

	public void setFechanacimiento(Date fechanacimiento) {
		this.fechanacimiento = fechanacimiento;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Parentesco getParentescoBean() {
		return this.parentescoBean;
	}

	public void setParentescoBean(Parentesco parentescoBean) {
		this.parentescoBean = parentescoBean;
	}

	public Persona getPersona() {
		return this.persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

}