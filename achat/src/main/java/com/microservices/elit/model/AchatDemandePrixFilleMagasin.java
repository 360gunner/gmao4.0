package com.microservices.elit.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the achat_demande_prix_fille_magasin database table.
 * 
 */
@Entity
@Table(name="achat_demande_prix_fille_magasin")
@NamedQuery(name="AchatDemandePrixFilleMagasin.findAll", query="SELECT a FROM AchatDemandePrixFilleMagasin a")
public class AchatDemandePrixFilleMagasin implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private AchatDemandePrixFilleMagasinPK id;

	//bi-directional many-to-one association to AchatDemandePrixFille
	@ManyToOne
	@JoinColumn(name="id_demande_prix_fille", insertable=false, updatable=false)
	private AchatDemandePrixFille achatDemandePrixFille;

	public AchatDemandePrixFilleMagasin() {
	}

	public AchatDemandePrixFilleMagasinPK getId() {
		return this.id;
	}

	public void setId(AchatDemandePrixFilleMagasinPK id) {
		this.id = id;
	}

	public AchatDemandePrixFille getAchatDemandePrixFille() {
		return this.achatDemandePrixFille;
	}

	public void setAchatDemandePrixFille(AchatDemandePrixFille achatDemandePrixFille) {
		this.achatDemandePrixFille = achatDemandePrixFille;
	}

}