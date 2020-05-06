package com.microservices.elit.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the achat_demande_prix_demande_achat database table.
 * 
 */
@Entity
@Table(name="achat_demande_prix_demande_achat")
@NamedQuery(name="AchatDemandePrixDemandeAchat.findAll", query="SELECT a FROM AchatDemandePrixDemandeAchat a")
public class AchatDemandePrixDemandeAchat implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private AchatDemandePrixDemandeAchatPK id;

	//bi-directional many-to-one association to AchatDemandePrixMere
	@ManyToOne
	@JoinColumn(name="id_demande_prix", insertable=false, updatable=false)
	private AchatDemandePrixMere achatDemandePrixMere;

	public AchatDemandePrixDemandeAchat() {
	}

	public AchatDemandePrixDemandeAchatPK getId() {
		return this.id;
	}

	public void setId(AchatDemandePrixDemandeAchatPK id) {
		this.id = id;
	}

	public AchatDemandePrixMere getAchatDemandePrixMere() {
		return this.achatDemandePrixMere;
	}

	public void setAchatDemandePrixMere(AchatDemandePrixMere achatDemandePrixMere) {
		this.achatDemandePrixMere = achatDemandePrixMere;
	}

}