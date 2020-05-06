package com.microservices.elit.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the achat_arrivage_demande_achat database table.
 * 
 */
@Entity
@Table(name="achat_arrivage_demande_achat")
@NamedQuery(name="AchatArrivageDemandeAchat.findAll", query="SELECT a FROM AchatArrivageDemandeAchat a")
public class AchatArrivageDemandeAchat implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private AchatArrivageDemandeAchatPK id;

	//bi-directional many-to-one association to AchatArrivage
	@ManyToOne
	@JoinColumn(name="id_arrivage", insertable=false, updatable=false)
	private AchatArrivage achatArrivage;

	public AchatArrivageDemandeAchat() {
	}

	public AchatArrivageDemandeAchatPK getId() {
		return this.id;
	}

	public void setId(AchatArrivageDemandeAchatPK id) {
		this.id = id;
	}

	public AchatArrivage getAchatArrivage() {
		return this.achatArrivage;
	}

	public void setAchatArrivage(AchatArrivage achatArrivage) {
		this.achatArrivage = achatArrivage;
	}

}