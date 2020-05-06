package com.microservices.elit.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the visibilite_unite_commune database table.
 * 
 */
@Embeddable
public class VisibiliteUniteCommunePK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="id_objet")
	private String idObjet;

	@Column(name="id_unite", insertable=false, updatable=false)
	private Integer idUnite;

	public VisibiliteUniteCommunePK() {
	}
	public String getIdObjet() {
		return this.idObjet;
	}
	public void setIdObjet(String idObjet) {
		this.idObjet = idObjet;
	}
	public Integer getIdUnite() {
		return this.idUnite;
	}
	public void setIdUnite(Integer idUnite) {
		this.idUnite = idUnite;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof VisibiliteUniteCommunePK)) {
			return false;
		}
		VisibiliteUniteCommunePK castOther = (VisibiliteUniteCommunePK)other;
		return 
			this.idObjet.equals(castOther.idObjet)
			&& this.idUnite.equals(castOther.idUnite);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.idObjet.hashCode();
		hash = hash * prime + this.idUnite.hashCode();
		
		return hash;
	}
}