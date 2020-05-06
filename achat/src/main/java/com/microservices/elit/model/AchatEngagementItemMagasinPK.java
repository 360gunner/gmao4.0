package com.microservices.elit.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the achat_engagement_item_magasin database table.
 * 
 */
@Embeddable
public class AchatEngagementItemMagasinPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="id_engagement_item", insertable=false, updatable=false)
	private Long idEngagementItem;

	@Column(name="id_magasin")
	private Long idMagasin;

	public AchatEngagementItemMagasinPK() {
	}
	public Long getIdEngagementItem() {
		return this.idEngagementItem;
	}
	public void setIdEngagementItem(Long idEngagementItem) {
		this.idEngagementItem = idEngagementItem;
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
		if (!(other instanceof AchatEngagementItemMagasinPK)) {
			return false;
		}
		AchatEngagementItemMagasinPK castOther = (AchatEngagementItemMagasinPK)other;
		return 
			this.idEngagementItem.equals(castOther.idEngagementItem)
			&& this.idMagasin.equals(castOther.idMagasin);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.idEngagementItem.hashCode();
		hash = hash * prime + this.idMagasin.hashCode();
		
		return hash;
	}
}