package com.microservices.elit.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the visibilite_unite_demande_prix_fille database table.
 * 
 */
@Entity
@Table(name="visibilite_unite_demande_prix_fille")
@NamedQuery(name="VisibiliteUniteDemandePrixFille.findAll", query="SELECT v FROM VisibiliteUniteDemandePrixFille v")
public class VisibiliteUniteDemandePrixFille implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private VisibiliteUniteDemandePrixFillePK id;

	//bi-directional many-to-one association to AchatDemandePrixFille
	@ManyToOne
	@JoinColumn(name="id_objet", insertable=false, updatable=false)
	private AchatDemandePrixFille achatDemandePrixFille;

	public VisibiliteUniteDemandePrixFille() {
	}

	public VisibiliteUniteDemandePrixFillePK getId() {
		return this.id;
	}

	public void setId(VisibiliteUniteDemandePrixFillePK id) {
		this.id = id;
	}

	public AchatDemandePrixFille getAchatDemandePrixFille() {
		return this.achatDemandePrixFille;
	}

	public void setAchatDemandePrixFille(AchatDemandePrixFille achatDemandePrixFille) {
		this.achatDemandePrixFille = achatDemandePrixFille;
	}

}