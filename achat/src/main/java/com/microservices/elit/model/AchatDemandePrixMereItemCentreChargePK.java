package com.microservices.elit.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the achat_demande_prix_mere_item_centre_charge database table.
 * 
 */
@Embeddable
public class AchatDemandePrixMereItemCentreChargePK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="id_demande_prix_item", insertable=false, updatable=false)
	private Long idDemandePrixItem;

	@Column(name="id_centre_charge")
	private Long idCentreCharge;

	public AchatDemandePrixMereItemCentreChargePK() {
	}
	public Long getIdDemandePrixItem() {
		return this.idDemandePrixItem;
	}
	public void setIdDemandePrixItem(Long idDemandePrixItem) {
		this.idDemandePrixItem = idDemandePrixItem;
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
		if (!(other instanceof AchatDemandePrixMereItemCentreChargePK)) {
			return false;
		}
		AchatDemandePrixMereItemCentreChargePK castOther = (AchatDemandePrixMereItemCentreChargePK)other;
		return 
			this.idDemandePrixItem.equals(castOther.idDemandePrixItem)
			&& this.idCentreCharge.equals(castOther.idCentreCharge);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.idDemandePrixItem.hashCode();
		hash = hash * prime + this.idCentreCharge.hashCode();
		
		return hash;
	}
}