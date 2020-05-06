package com.microservices.elit.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the visibilite_module_achat_bordereau database table.
 * 
 */
@Entity
@Table(name="visibilite_module_achat_bordereau")
@NamedQuery(name="VisibiliteModuleAchatBordereau.findAll", query="SELECT v FROM VisibiliteModuleAchatBordereau v")
public class VisibiliteModuleAchatBordereau implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private VisibiliteModuleAchatBordereauPK id;

	//bi-directional many-to-one association to AchatBordereau
	@ManyToOne
	@JoinColumn(name="id_objet", insertable=false, updatable=false)
	private AchatBordereau achatBordereau;

	public VisibiliteModuleAchatBordereau() {
	}

	public VisibiliteModuleAchatBordereauPK getId() {
		return this.id;
	}

	public void setId(VisibiliteModuleAchatBordereauPK id) {
		this.id = id;
	}

	public AchatBordereau getAchatBordereau() {
		return this.achatBordereau;
	}

	public void setAchatBordereau(AchatBordereau achatBordereau) {
		this.achatBordereau = achatBordereau;
	}

}