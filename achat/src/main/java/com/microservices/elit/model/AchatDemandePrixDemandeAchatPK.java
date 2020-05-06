package com.microservices.elit.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the achat_demande_prix_demande_achat database table.
 * 
 */
@Embeddable
public class AchatDemandePrixDemandeAchatPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="id_demande_prix", insertable=false, updatable=false)
	private Long idDemandePrix;

	@Column(name="id_demande_achat")
	private Long idDemandeAchat;

	public AchatDemandePrixDemandeAchatPK() {
	}
	public Long getIdDemandePrix() {
		return this.idDemandePrix;
	}
	public void setIdDemandePrix(Long idDemandePrix) {
		this.idDemandePrix = idDemandePrix;
	}
	public Long getIdDemandeAchat() {
		return this.idDemandeAchat;
	}
	public void setIdDemandeAchat(Long idDemandeAchat) {
		this.idDemandeAchat = idDemandeAchat;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof AchatDemandePrixDemandeAchatPK)) {
			return false;
		}
		AchatDemandePrixDemandeAchatPK castOther = (AchatDemandePrixDemandeAchatPK)other;
		return 
			this.idDemandePrix.equals(castOther.idDemandePrix)
			&& this.idDemandeAchat.equals(castOther.idDemandeAchat);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.idDemandePrix.hashCode();
		hash = hash * prime + this.idDemandeAchat.hashCode();
		
		return hash;
	}
}