package com.microservices.elit.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the achat_demande_prix_fille_item_centre_charge database table.
 * 
 */
@Embeddable
public class AchatDemandePrixFilleItemCentreChargePK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="id_demande_prix_fille_item", insertable=false, updatable=false)
	private Long idDemandePrixFilleItem;

	@Column(name="id_centre_charge")
	private Long idCentreCharge;

	public AchatDemandePrixFilleItemCentreChargePK() {
	}
	public Long getIdDemandePrixFilleItem() {
		return this.idDemandePrixFilleItem;
	}
	public void setIdDemandePrixFilleItem(Long idDemandePrixFilleItem) {
		this.idDemandePrixFilleItem = idDemandePrixFilleItem;
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
		if (!(other instanceof AchatDemandePrixFilleItemCentreChargePK)) {
			return false;
		}
		AchatDemandePrixFilleItemCentreChargePK castOther = (AchatDemandePrixFilleItemCentreChargePK)other;
		return 
			this.idDemandePrixFilleItem.equals(castOther.idDemandePrixFilleItem)
			&& this.idCentreCharge.equals(castOther.idCentreCharge);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.idDemandePrixFilleItem.hashCode();
		hash = hash * prime + this.idCentreCharge.hashCode();
		
		return hash;
	}
}