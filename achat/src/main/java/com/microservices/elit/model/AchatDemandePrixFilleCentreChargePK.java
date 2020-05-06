package com.microservices.elit.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the achat_demande_prix_fille_centre_charge database table.
 * 
 */
@Embeddable
public class AchatDemandePrixFilleCentreChargePK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="id_demande_prix_fille", insertable=false, updatable=false)
	private Long idDemandePrixFille;

	@Column(name="id_centre_charge")
	private Long idCentreCharge;

	public AchatDemandePrixFilleCentreChargePK() {
	}
	public Long getIdDemandePrixFille() {
		return this.idDemandePrixFille;
	}
	public void setIdDemandePrixFille(Long idDemandePrixFille) {
		this.idDemandePrixFille = idDemandePrixFille;
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
		if (!(other instanceof AchatDemandePrixFilleCentreChargePK)) {
			return false;
		}
		AchatDemandePrixFilleCentreChargePK castOther = (AchatDemandePrixFilleCentreChargePK)other;
		return 
			this.idDemandePrixFille.equals(castOther.idDemandePrixFille)
			&& this.idCentreCharge.equals(castOther.idCentreCharge);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.idDemandePrixFille.hashCode();
		hash = hash * prime + this.idCentreCharge.hashCode();
		
		return hash;
	}
}