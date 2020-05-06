package com.microservices.elit.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the achat_engagement_item_demande_achat database table.
 * 
 */
@Embeddable
public class AchatEngagementItemDemandeAchatPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="id_demande_achat_item")
	private Long idDemandeAchatItem;

	@Column(name="id_engagement", insertable=false, updatable=false)
	private Long idEngagement;

	public AchatEngagementItemDemandeAchatPK() {
	}
	public Long getIdDemandeAchatItem() {
		return this.idDemandeAchatItem;
	}
	public void setIdDemandeAchatItem(Long idDemandeAchatItem) {
		this.idDemandeAchatItem = idDemandeAchatItem;
	}
	public Long getIdEngagement() {
		return this.idEngagement;
	}
	public void setIdEngagement(Long idEngagement) {
		this.idEngagement = idEngagement;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof AchatEngagementItemDemandeAchatPK)) {
			return false;
		}
		AchatEngagementItemDemandeAchatPK castOther = (AchatEngagementItemDemandeAchatPK)other;
		return 
			this.idDemandeAchatItem.equals(castOther.idDemandeAchatItem)
			&& this.idEngagement.equals(castOther.idEngagement);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.idDemandeAchatItem.hashCode();
		hash = hash * prime + this.idEngagement.hashCode();
		
		return hash;
	}
}