package com.microservices.elit.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the visibilite_unite_historique database table.
 * 
 */
@Embeddable
public class VisibiliteUniteHistoriquePK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="id_objet")
	private String idObjet;

	@Column(name="id_unite")
	private Long idUnite;

	public VisibiliteUniteHistoriquePK() {
	}
	public String getIdObjet() {
		return this.idObjet;
	}
	public void setIdObjet(String idObjet) {
		this.idObjet = idObjet;
	}
	public Long getIdUnite() {
		return this.idUnite;
	}
	public void setIdUnite(Long idUnite) {
		this.idUnite = idUnite;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof VisibiliteUniteHistoriquePK)) {
			return false;
		}
		VisibiliteUniteHistoriquePK castOther = (VisibiliteUniteHistoriquePK)other;
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