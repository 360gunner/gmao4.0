package com.microservices.elit.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the achat_demande_prix_fille_magasin database table.
 * 
 */
@Embeddable
public class AchatDemandePrixFilleMagasinPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="id_demande_prix_fille", insertable=false, updatable=false)
	private Long idDemandePrixFille;

	@Column(name="id_magasin")
	private Long idMagasin;

	public AchatDemandePrixFilleMagasinPK() {
	}
	public Long getIdDemandePrixFille() {
		return this.idDemandePrixFille;
	}
	public void setIdDemandePrixFille(Long idDemandePrixFille) {
		this.idDemandePrixFille = idDemandePrixFille;
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
		if (!(other instanceof AchatDemandePrixFilleMagasinPK)) {
			return false;
		}
		AchatDemandePrixFilleMagasinPK castOther = (AchatDemandePrixFilleMagasinPK)other;
		return 
			this.idDemandePrixFille.equals(castOther.idDemandePrixFille)
			&& this.idMagasin.equals(castOther.idMagasin);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.idDemandePrixFille.hashCode();
		hash = hash * prime + this.idMagasin.hashCode();
		
		return hash;
	}
}