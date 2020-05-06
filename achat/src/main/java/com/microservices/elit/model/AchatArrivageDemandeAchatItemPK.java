package com.microservices.elit.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the achat_arrivage_demande_achat_item database table.
 * 
 */
@Embeddable
public class AchatArrivageDemandeAchatItemPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="id_arrivage", insertable=false, updatable=false)
	private Long idArrivage;

	@Column(name="id_demande_achat_item", insertable=false, updatable=false)
	private Long idDemandeAchatItem;

	public AchatArrivageDemandeAchatItemPK() {
	}
	public Long getIdArrivage() {
		return this.idArrivage;
	}
	public void setIdArrivage(Long idArrivage) {
		this.idArrivage = idArrivage;
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
		if (!(other instanceof AchatArrivageDemandeAchatItemPK)) {
			return false;
		}
		AchatArrivageDemandeAchatItemPK castOther = (AchatArrivageDemandeAchatItemPK)other;
		return 
			this.idArrivage.equals(castOther.idArrivage)
			&& this.idDemandeAchatItem.equals(castOther.idDemandeAchatItem);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.idArrivage.hashCode();
		hash = hash * prime + this.idDemandeAchatItem.hashCode();
		
		return hash;
	}
}