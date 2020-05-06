package com.microservices.elit.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the visibilite_module_achat_livraison database table.
 * 
 */
@Entity
@Table(name="visibilite_module_achat_livraison")
@NamedQuery(name="VisibiliteModuleAchatLivraison.findAll", query="SELECT v FROM VisibiliteModuleAchatLivraison v")
public class VisibiliteModuleAchatLivraison implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private VisibiliteModuleAchatLivraisonPK id;

	//bi-directional many-to-one association to AchatLivraison
	@ManyToOne
	@JoinColumn(name="id_objet", insertable=false, updatable=false)
	private AchatLivraison achatLivraison;

	public VisibiliteModuleAchatLivraison() {
	}

	public VisibiliteModuleAchatLivraisonPK getId() {
		return this.id;
	}

	public void setId(VisibiliteModuleAchatLivraisonPK id) {
		this.id = id;
	}

	public AchatLivraison getAchatLivraison() {
		return this.achatLivraison;
	}

	public void setAchatLivraison(AchatLivraison achatLivraison) {
		this.achatLivraison = achatLivraison;
	}

}