package com.microservices.elit.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the visibilite_module_historique database table.
 * 
 */
@Embeddable
public class VisibiliteModuleHistoriquePK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="id_objet")
	private String idObjet;

	@Column(name="id_module")
	private Integer idModule;

	public VisibiliteModuleHistoriquePK() {
	}
	public String getIdObjet() {
		return this.idObjet;
	}
	public void setIdObjet(String idObjet) {
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
		if (!(other instanceof VisibiliteModuleHistoriquePK)) {
			return false;
		}
		VisibiliteModuleHistoriquePK castOther = (VisibiliteModuleHistoriquePK)other;
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