package com.microservices.elit.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the achat_demande_prix_centre_charge database table.
 * 
 */
@Embeddable
public class AchatDemandePrixCentreChargePK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="id_demande_prix", insertable=false, updatable=false)
	private Long idDemandePrix;

	@Column(name="id_centre_charge")
	private Long idCentreCharge;

	public AchatDemandePrixCentreChargePK() {
	}
	public Long getIdDemandePrix() {
		return this.idDemandePrix;
	}
	public void setIdDemandePrix(Long idDemandePrix) {
		this.idDemandePrix = idDemandePrix;
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
		if (!(other instanceof AchatDemandePrixCentreChargePK)) {
			return false;
		}
		AchatDemandePrixCentreChargePK castOther = (AchatDemandePrixCentreChargePK)other;
		return 
			this.idDemandePrix.equals(castOther.idDemandePrix)
			&& this.idCentreCharge.equals(castOther.idCentreCharge);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.idDemandePrix.hashCode();
		hash = hash * prime + this.idCentreCharge.hashCode();
		
		return hash;
	}
}