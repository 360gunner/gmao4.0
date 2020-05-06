package com.microservices.elit.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the achat_demande_prix_fournisseur database table.
 * 
 */
@Embeddable
public class AchatDemandePrixFournisseurPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="id_demande_prix", insertable=false, updatable=false)
	private Long idDemandePrix;

	@Column(name="id_societe")
	private Long idSociete;

	public AchatDemandePrixFournisseurPK() {
	}
	public Long getIdDemandePrix() {
		return this.idDemandePrix;
	}
	public void setIdDemandePrix(Long idDemandePrix) {
		this.idDemandePrix = idDemandePrix;
	}
	public Long getIdSociete() {
		return this.idSociete;
	}
	public void setIdSociete(Long idSociete) {
		this.idSociete = idSociete;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof AchatDemandePrixFournisseurPK)) {
			return false;
		}
		AchatDemandePrixFournisseurPK castOther = (AchatDemandePrixFournisseurPK)other;
		return 
			this.idDemandePrix.equals(castOther.idDemandePrix)
			&& this.idSociete.equals(castOther.idSociete);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.idDemandePrix.hashCode();
		hash = hash * prime + this.idSociete.hashCode();
		
		return hash;
	}
}