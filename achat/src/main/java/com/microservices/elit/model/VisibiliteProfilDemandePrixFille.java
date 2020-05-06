package com.microservices.elit.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the visibilite_profil_demande_prix_fille database table.
 * 
 */
@Entity
@Table(name="visibilite_profil_demande_prix_fille")
@NamedQuery(name="VisibiliteProfilDemandePrixFille.findAll", query="SELECT v FROM VisibiliteProfilDemandePrixFille v")
public class VisibiliteProfilDemandePrixFille implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private VisibiliteProfilDemandePrixFillePK id;

	//bi-directional many-to-one association to AchatDemandePrixFille
	@ManyToOne
	@JoinColumn(name="id_objet", insertable=false, updatable=false)
	private AchatDemandePrixFille achatDemandePrixFille;

	public VisibiliteProfilDemandePrixFille() {
	}

	public VisibiliteProfilDemandePrixFillePK getId() {
		return this.id;
	}

	public void setId(VisibiliteProfilDemandePrixFillePK id) {
		this.id = id;
	}

	public AchatDemandePrixFille getAchatDemandePrixFille() {
		return this.achatDemandePrixFille;
	}

	public void setAchatDemandePrixFille(AchatDemandePrixFille achatDemandePrixFille) {
		this.achatDemandePrixFille = achatDemandePrixFille;
	}

}