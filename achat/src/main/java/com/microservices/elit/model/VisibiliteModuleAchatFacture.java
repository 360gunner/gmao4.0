package com.microservices.elit.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the visibilite_module_achat_facture database table.
 * 
 */
@Entity
@Table(name="visibilite_module_achat_facture")
@NamedQuery(name="VisibiliteModuleAchatFacture.findAll", query="SELECT v FROM VisibiliteModuleAchatFacture v")
public class VisibiliteModuleAchatFacture implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private VisibiliteModuleAchatFacturePK id;

	//bi-directional many-to-one association to AchatFacture
	@ManyToOne
	@JoinColumn(name="id_objet", insertable=false, updatable=false)
	private AchatFacture achatFacture;

	public VisibiliteModuleAchatFacture() {
	}

	public VisibiliteModuleAchatFacturePK getId() {
		return this.id;
	}

	public void setId(VisibiliteModuleAchatFacturePK id) {
		this.id = id;
	}

	public AchatFacture getAchatFacture() {
		return this.achatFacture;
	}

	public void setAchatFacture(AchatFacture achatFacture) {
		this.achatFacture = achatFacture;
	}

}