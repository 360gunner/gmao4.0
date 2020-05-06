package com.microservices.elit.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the visibilite_unite_achat_livraison database table.
 * 
 */
@Entity
@Table(name="visibilite_unite_achat_livraison")
@NamedQuery(name="VisibiliteUniteAchatLivraison.findAll", query="SELECT v FROM VisibiliteUniteAchatLivraison v")
public class VisibiliteUniteAchatLivraison implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private VisibiliteUniteAchatLivraisonPK id;

	//bi-directional many-to-one association to AchatLivraison
	@ManyToOne
	@JoinColumn(name="id_objet", insertable=false, updatable=false)
	private AchatLivraison achatLivraison;

	public VisibiliteUniteAchatLivraison() {
	}

	public VisibiliteUniteAchatLivraisonPK getId() {
		return this.id;
	}

	public void setId(VisibiliteUniteAchatLivraisonPK id) {
		this.id = id;
	}

	public AchatLivraison getAchatLivraison() {
		return this.achatLivraison;
	}

	public void setAchatLivraison(AchatLivraison achatLivraison) {
		this.achatLivraison = achatLivraison;
	}

}