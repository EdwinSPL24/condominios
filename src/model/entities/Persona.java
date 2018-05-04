package model.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the persona database table.
 * 
 */
@Entity
@NamedQuery(name="Persona.findAll", query="SELECT p FROM Persona p")
public class Persona implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id 
	@Column(name = "documento")
	private String documento;
	@Column(name = "nombre") 
	private String nombre;
	@Column(name = "email") 
	private String email;
	@Column(name = "celular") 
	private String celular;
	@Column(name = "direccion") 
	private String direccion;
	@Column(name = "clave") 
	private String clave;

	//bi-directional many-to-one association to Consejo
	@OneToMany(mappedBy="personaBean", orphanRemoval=true)
	private List<Consejo> consejos;

	//bi-directional many-to-one association to Grupofamiliar
	@OneToMany(mappedBy="persona", orphanRemoval=true)
	private List<Grupofamiliar> grupofamiliars;

	//bi-directional many-to-one association to Inquilino
	@OneToMany(mappedBy="personaBean", orphanRemoval=true)
	private List<Inquilino> inquilinos;

	public Persona() {
	}

	public String getDocumento() {
		return this.documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public String getCelular() {
		return this.celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getClave() {
		return this.clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public String getDireccion() {
		return this.direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Consejo> getConsejos() {
		return this.consejos;
	}

	public void setConsejos(List<Consejo> consejos) {
		this.consejos = consejos;
	}

	public Consejo addConsejo(Consejo consejo) {
		getConsejos().add(consejo);
		consejo.setPersonaBean(this);

		return consejo;
	}

	public Consejo removeConsejo(Consejo consejo) {
		getConsejos().remove(consejo);
		consejo.setPersonaBean(null);

		return consejo;
	}

	public List<Grupofamiliar> getGrupofamiliars() {
		return this.grupofamiliars;
	}

	public void setGrupofamiliars(List<Grupofamiliar> grupofamiliars) {
		this.grupofamiliars = grupofamiliars;
	}

	public Grupofamiliar addGrupofamiliar(Grupofamiliar grupofamiliar) {
		getGrupofamiliars().add(grupofamiliar);
		grupofamiliar.setPersona(this);

		return grupofamiliar;
	}

	public Grupofamiliar removeGrupofamiliar(Grupofamiliar grupofamiliar) {
		getGrupofamiliars().remove(grupofamiliar);
		grupofamiliar.setPersona(null);

		return grupofamiliar;
	}

	public List<Inquilino> getInquilinos() {
		return this.inquilinos;
	}

	public void setInquilinos(List<Inquilino> inquilinos) {
		this.inquilinos = inquilinos;
	}

	public Inquilino addInquilino(Inquilino inquilino) {
		getInquilinos().add(inquilino);
		inquilino.setPersonaBean(this);

		return inquilino;
	}

	public Inquilino removeInquilino(Inquilino inquilino) {
		getInquilinos().remove(inquilino);
		inquilino.setPersonaBean(null);

		return inquilino;
	}

}