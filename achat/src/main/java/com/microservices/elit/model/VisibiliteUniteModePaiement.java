package com.microservices.elit.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the visibilite_unite_mode_paiement database table.
 * 
 */
@Entity
@Table(name="visibilite_unite_mode_paiement")
@NamedQuery(name="VisibiliteUniteModePaiement.findAll", query="SELECT v FROM VisibiliteUniteModePaiement v")
public class VisibiliteUniteModePaiement implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private VisibiliteUniteModePaiementPK id;

	//bi-directional many-to-one association to DbaModePaiement
	@ManyToOne
	@JoinColumn(name="id_objet", insertable=false, updatable=false)
	private DbaModePaiement dbaModePaiement;

	public VisibiliteUniteModePaiement() {
	}

	public VisibiliteUniteModePaiementPK getId() {
		return this.id;
	}

	public void setId(VisibiliteUniteModePaiementPK id) {
		this.id = id;
	}

	public DbaModePaiement getDbaModePaiement() {
		return this.dbaModePaiement;
	}

	public void setDbaModePaiement(DbaModePaiement dbaModePaiement) {
		this.dbaModePaiement = dbaModePaiement;
	}

}