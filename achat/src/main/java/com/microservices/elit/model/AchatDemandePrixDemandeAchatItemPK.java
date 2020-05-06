package com.microservices.elit.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the achat_demande_prix_demande_achat_item database table.
 * 
 */
@Embeddable
public class AchatDemandePrixDemandeAchatItemPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="id_demande_prix", insertable=false, updatable=false)
	private Long idDemandePrix;

	@Column(name="id_demande_achat_item")
	private Long idDemandeAchatItem;

	public AchatDemandePrixDemandeAchatItemPK() {
	}
	public Long getIdDemandePrix() {
		return this.idDemandePrix;
	}
	public void setIdDemandePrix(Long idDemandePrix) {
		this.idDemandePrix = idDemandePrix;
	}
	public Long getIdDemandeAchatItem() {
		return this.idDemandeAchatItem;
	}
	public void setIdDemandeAchatItem(Long idDemandeAchatItem) {
		this.idDemandeAchatItem = idDemandeAchatItem;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof AchatDemandePrixDemandeAchatItemPK)) {
			return false;
		}
		AchatDemandePrixDemandeAchatItemPK castOther = (AchatDemandePrixDemandeAchatItemPK)other;
		return 
			this.idDemandePrix.equals(castOther.idDemandePrix)
			&& this.idDemandeAchatItem.equals(castOther.idDemandeAchatItem);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.idDemandePrix.hashCode();
		hash = hash * prime + this.idDemandeAchatItem.hashCode();
		
		return hash;
	}
}