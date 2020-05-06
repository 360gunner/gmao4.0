package com.microservices.elit.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the visibilite_module_naturedemande database table.
 * 
 */
@Embeddable
public class VisibiliteModuleNaturedemandePK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="id_objet", insertable=false, updatable=false)
	private Long idObjet;

	@Column(name="id_module")
	private Integer idModule;

	public VisibiliteModuleNaturedemandePK() {
	}
	public Long getIdObjet() {
		return this.idObjet;
	}
	public void setIdObjet(Long idObjet) {
		this.idObjet = idObjet;
	}
	public Integer getIdModule() {
		return this.idModule;
	}
	public void setIdModule(Integer idModule) {
		this.idModule = idModule;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof VisibiliteModuleNaturedemandePK)) {
			return false;
		}
		VisibiliteModuleNaturedemandePK castOther = (VisibiliteModuleNaturedemandePK)other;
		return 
			this.idObjet.equals(castOther.idObjet)
			&& this.idModule.equals(castOther.idModule);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.idObjet.hashCode();
		hash = hash * prime + this.idModule.hashCode();
		
		return hash;
	}
}