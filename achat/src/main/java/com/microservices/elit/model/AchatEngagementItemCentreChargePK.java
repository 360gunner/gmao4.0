package com.microservices.elit.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the achat_engagement_item_centre_charge database table.
 * 
 */
@Embeddable
public class AchatEngagementItemCentreChargePK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="id_engagement_item", insertable=false, updatable=false)
	private Long idEngagementItem;

	@Column(name="id_centre_charge")
	private Long idCentreCharge;

	public AchatEngagementItemCentreChargePK() {
	}
	public Long getIdEngagementItem() {
		return this.idEngagementItem;
	}
	public void setIdEngagementItem(Long idEngagementItem) {
		this.idEngagementItem = idEngagementItem;
	}
	public Long getIdCentreCharge() {
		return this.idCentreCharge;
	}
	public void setIdCentreCharge(Long idCentreCharge) {
		this.idCentreCharge = idCentreCharge;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof AchatEngagementItemCentreChargePK)) {
			return false;
		}
		AchatEngagementItemCentreChargePK castOther = (AchatEngagementItemCentreChargePK)other;
		return 
			this.idEngagementItem.equals(castOther.idEngagementItem)
			&& this.idCentreCharge.equals(castOther.idCentreCharge);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.idEngagementItem.hashCode();
		hash = hash * prime + this.idCentreCharge.hashCode();
		
		return hash;
	}
}