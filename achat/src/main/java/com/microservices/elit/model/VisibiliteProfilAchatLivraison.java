package com.microservices.elit.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the visibilite_profil_achat_livraison database table.
 * 
 */
@Entity
@Table(name="visibilite_profil_achat_livraison")
@NamedQuery(name="VisibiliteProfilAchatLivraison.findAll", query="SELECT v FROM VisibiliteProfilAchatLivraison v")
public class VisibiliteProfilAchatLivraison implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private VisibiliteProfilAchatLivraisonPK id;

	//bi-directional many-to-one association to AchatLivraison
	@ManyToOne
	@JoinColumn(name="id_objet", insertable=false, updatable=false)
	private AchatLivraison achatLivraison;

	public VisibiliteProfilAchatLivraison() {
	}

	public VisibiliteProfilAchatLivraisonPK getId() {
		return this.id;
	}

	public void setId(VisibiliteProfilAchatLivraisonPK id) {
		this.id = id;
	}

	public AchatLivraison getAchatLivraison() {
		return this.achatLivraison;
	}

	public void setAchatLivraison(AchatLivraison achatLivraison) {
		this.achatLivraison = achatLivraison;
	}

}