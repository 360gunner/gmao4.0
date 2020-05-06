package com.microservices.elit.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the achat_livraison_magasin database table.
 * 
 */
@Embeddable
public class AchatLivraisonMagasinPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="id_livraison", insertable=false, updatable=false)
	private Long idLivraison;

	@Column(name="id_magasin")
	private Long idMagasin;

	public AchatLivraisonMagasinPK() {
	}
	public Long getIdLivraison() {
		return this.idLivraison;
	}
	public void setIdLivraison(Long idLivraison) {
		this.idLivraison = idLivraison;
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
		if (!(other instanceof AchatLivraisonMagasinPK)) {
			return false;
		}
		AchatLivraisonMagasinPK castOther = (AchatLivraisonMagasinPK)other;
		return 
			this.idLivraison.equals(castOther.idLivraison)
			&& this.idMagasin.equals(castOther.idMagasin);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.idLivraison.hashCode();
		hash = hash * prime + this.idMagasin.hashCode();
		
		return hash;
	}
}