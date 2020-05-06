package com.microservices.elit.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the visibilite_module_mode_paiement database table.
 * 
 */
@Entity
@Table(name="visibilite_module_mode_paiement")
@NamedQuery(name="VisibiliteModuleModePaiement.findAll", query="SELECT v FROM VisibiliteModuleModePaiement v")
public class VisibiliteModuleModePaiement implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private VisibiliteModuleModePaiementPK id;

	//bi-directional many-to-one association to DbaModePaiement
	@ManyToOne
	@JoinColumn(name="id_objet", insertable=false, updatable=false)
	private DbaModePaiement dbaModePaiement;

	public VisibiliteModuleModePaiement() {
	}

	public VisibiliteModuleModePaiementPK getId() {
		return this.id;
	}

	public void setId(VisibiliteModuleModePaiementPK id) {
		this.id = id;
	}

	public DbaModePaiement getDbaModePaiement() {
		return this.dbaModePaiement;
	}

	public void setDbaModePaiement(DbaModePaiement dbaModePaiement) {
		this.dbaModePaiement = dbaModePaiement;
	}

}