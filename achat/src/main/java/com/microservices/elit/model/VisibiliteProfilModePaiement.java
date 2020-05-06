package com.microservices.elit.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the visibilite_profil_mode_paiement database table.
 * 
 */
@Entity
@Table(name="visibilite_profil_mode_paiement")
@NamedQuery(name="VisibiliteProfilModePaiement.findAll", query="SELECT v FROM VisibiliteProfilModePaiement v")
public class VisibiliteProfilModePaiement implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private VisibiliteProfilModePaiementPK id;

	//bi-directional many-to-one association to DbaModePaiement
	@ManyToOne
	@JoinColumn(name="id_objet", insertable=false, updatable=false)
	private DbaModePaiement dbaModePaiement;

	public VisibiliteProfilModePaiement() {
	}

	public VisibiliteProfilModePaiementPK getId() {
		return this.id;
	}

	public void setId(VisibiliteProfilModePaiementPK id) {
		this.id = id;
	}

	public DbaModePaiement getDbaModePaiement() {
		return this.dbaModePaiement;
	}

	public void setDbaModePaiement(DbaModePaiement dbaModePaiement) {
		this.dbaModePaiement = dbaModePaiement;
	}

}