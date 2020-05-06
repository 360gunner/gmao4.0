package com.microservices.elit.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the achat_demande_prix_magasin database table.
 * 
 */
@Embeddable
public class AchatDemandePrixMagasinPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="id_demande_prix", insertable=false, updatable=false)
	private Long idDemandePrix;

	@Column(name="id_magasin")
	private Long idMagasin;

	public AchatDemandePrixMagasinPK() {
	}
	public Long getIdDemandePrix() {
		return this.idDemandePrix;
	}
	public void setIdDemandePrix(Long idDemandePrix) {
		this.idDemandePrix = idDemandePrix;
	}
	public Long getIdMagasin() {
		return this.idMagasin;
	}
	public void setIdMagasin(Long idMagasin) {
		this.idMagasin = idMagasin;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof AchatDemandePrixMagasinPK)) {
			return false;
		}
		AchatDemandePrixMagasinPK castOther = (AchatDemandePrixMagasinPK)other;
		return 
			this.idDemandePrix.equals(castOther.idDemandePrix)
			&& this.idMagasin.equals(castOther.idMagasin);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.idDemandePrix.hashCode();
		hash = hash * prime + this.idMagasin.hashCode();
		
		return hash;
	}
}