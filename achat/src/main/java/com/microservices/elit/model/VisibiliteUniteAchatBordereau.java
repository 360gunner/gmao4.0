package com.microservices.elit.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the visibilite_unite_achat_bordereau database table.
 * 
 */
@Entity
@Table(name="visibilite_unite_achat_bordereau")
@NamedQuery(name="VisibiliteUniteAchatBordereau.findAll", query="SELECT v FROM VisibiliteUniteAchatBordereau v")
public class VisibiliteUniteAchatBordereau implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private VisibiliteUniteAchatBordereauPK id;

	//bi-directional many-to-one association to AchatBordereau
	@ManyToOne
	@JoinColumn(name="id_objet", insertable=false, updatable=false)
	private AchatBordereau achatBordereau;

	public VisibiliteUniteAchatBordereau() {
	}

	public VisibiliteUniteAchatBordereauPK getId() {
		return this.id;
	}

	public void setId(VisibiliteUniteAchatBordereauPK id) {
		this.id = id;
	}

	public AchatBordereau getAchatBordereau() {
		return this.achatBordereau;
	}

	public void setAchatBordereau(AchatBordereau achatBordereau) {
		this.achatBordereau = achatBordereau;
	}

}