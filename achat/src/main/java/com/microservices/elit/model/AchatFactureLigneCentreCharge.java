package com.microservices.elit.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the achat_facture_ligne_centre_charge database table.
 * 
 */
@Entity
@Table(name="achat_facture_ligne_centre_charge")
@NamedQuery(name="AchatFactureLigneCentreCharge.findAll", query="SELECT a FROM AchatFactureLigneCentreCharge a")
public class AchatFactureLigneCentreCharge implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private AchatFactureLigneCentreChargePK id;

	//bi-directional many-to-one association to AchatFactureLigne
	@ManyToOne
	@JoinColumn(name="id_facture_item", insertable=false, updatable=false)
	private AchatFactureLigne achatFactureLigne;

	public AchatFactureLigneCentreCharge() {
	}

	public AchatFactureLigneCentreChargePK getId() {
		return this.id;
	}

	public void setId(AchatFactureLigneCentreChargePK id) {
		this.id = id;
	}

	public AchatFactureLigne getAchatFactureLigne() {
		return this.achatFactureLigne;
	}

	public void setAchatFactureLigne(AchatFactureLigne achatFactureLigne) {
		this.achatFactureLigne = achatFactureLigne;
	}

}