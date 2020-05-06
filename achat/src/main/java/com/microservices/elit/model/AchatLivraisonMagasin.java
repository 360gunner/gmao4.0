package com.microservices.elit.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the achat_livraison_magasin database table.
 * 
 */
@Entity
@Table(name="achat_livraison_magasin")
@NamedQuery(name="AchatLivraisonMagasin.findAll", query="SELECT a FROM AchatLivraisonMagasin a")
public class AchatLivraisonMagasin implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private AchatLivraisonMagasinPK id;

	//bi-directional many-to-one association to AchatLivraison
	@ManyToOne
	@JoinColumn(name="id_livraison", insertable=false, updatable=false)
	private AchatLivraison achatLivraison;

	public AchatLivraisonMagasin() {
	}

	public AchatLivraisonMagasinPK getId() {
		return this.id;
	}

	public void setId(AchatLivraisonMagasinPK id) {
		this.id = id;
	}

	public AchatLivraison getAchatLivraison() {
		return this.achatLivraison;
	}

	public void setAchatLivraison(AchatLivraison achatLivraison) {
		this.achatLivraison = achatLivraison;
	}

}