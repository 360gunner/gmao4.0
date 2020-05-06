package com.microservices.elit.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the achat_facture_ligne_centre_charge database table.
 * 
 */
@Embeddable
public class AchatFactureLigneCentreChargePK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="id_facture_item", insertable=false, updatable=false)
	private Long idFactureItem;

	@Column(name="id_centre_charge")
	private Long idCentreCharge;

	public AchatFactureLigneCentreChargePK() {
	}
	public Long getIdFactureItem() {
		return this.idFactureItem;
	}
	public void setIdFactureItem(Long idFactureItem) {
		this.idFactureItem = idFactureItem;
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
		if (!(other instanceof AchatFactureLigneCentreChargePK)) {
			return false;
		}
		AchatFactureLigneCentreChargePK castOther = (AchatFactureLigneCentreChargePK)other;
		return 
			this.idFactureItem.equals(castOther.idFactureItem)
			&& this.idCentreCharge.equals(castOther.idCentreCharge);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.idFactureItem.hashCode();
		hash = hash * prime + this.idCentreCharge.hashCode();
		
		return hash;
	}
}