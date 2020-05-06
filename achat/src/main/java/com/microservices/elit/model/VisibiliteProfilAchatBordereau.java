package com.microservices.elit.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the visibilite_profil_achat_bordereau database table.
 * 
 */
@Entity
@Table(name="visibilite_profil_achat_bordereau")
@NamedQuery(name="VisibiliteProfilAchatBordereau.findAll", query="SELECT v FROM VisibiliteProfilAchatBordereau v")
public class VisibiliteProfilAchatBordereau implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private VisibiliteProfilAchatBordereauPK id;

	//bi-directional many-to-one association to AchatBordereau
	@ManyToOne
	@JoinColumn(name="id_objet", insertable=false, updatable=false)
	private AchatBordereau achatBordereau;

	public VisibiliteProfilAchatBordereau() {
	}

	public VisibiliteProfilAchatBordereauPK getId() {
		return this.id;
	}

	public void setId(VisibiliteProfilAchatBordereauPK id) {
		this.id = id;
	}

	public AchatBordereau getAchatBordereau() {
		return this.achatBordereau;
	}

	public void setAchatBordereau(AchatBordereau achatBordereau) {
		this.achatBordereau = achatBordereau;
	}

}