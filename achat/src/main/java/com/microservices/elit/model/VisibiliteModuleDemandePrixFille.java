package com.microservices.elit.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the visibilite_module_demande_prix_fille database table.
 * 
 */
@Entity
@Table(name="visibilite_module_demande_prix_fille")
@NamedQuery(name="VisibiliteModuleDemandePrixFille.findAll", query="SELECT v FROM VisibiliteModuleDemandePrixFille v")
public class VisibiliteModuleDemandePrixFille implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private VisibiliteModuleDemandePrixFillePK id;

	//bi-directional many-to-one association to AchatDemandePrixFille
	@ManyToOne
	@JoinColumn(name="id_objet", insertable=false, updatable=false)
	private AchatDemandePrixFille achatDemandePrixFille;

	public VisibiliteModuleDemandePrixFille() {
	}

	public VisibiliteModuleDemandePrixFillePK getId() {
		return this.id;
	}

	public void setId(VisibiliteModuleDemandePrixFillePK id) {
		this.id = id;
	}

	public AchatDemandePrixFille getAchatDemandePrixFille() {
		return this.achatDemandePrixFille;
	}

	public void setAchatDemandePrixFille(AchatDemandePrixFille achatDemandePrixFille) {
		this.achatDemandePrixFille = achatDemandePrixFille;
	}

}