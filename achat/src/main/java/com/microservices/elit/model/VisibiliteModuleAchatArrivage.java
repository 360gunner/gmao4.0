package com.microservices.elit.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the visibilite_module_achat_arrivage database table.
 * 
 */
@Entity
@Table(name="visibilite_module_achat_arrivage")
@NamedQuery(name="VisibiliteModuleAchatArrivage.findAll", query="SELECT v FROM VisibiliteModuleAchatArrivage v")
public class VisibiliteModuleAchatArrivage implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private VisibiliteModuleAchatArrivagePK id;

	//bi-directional many-to-one association to AchatArrivage
	@ManyToOne
	@JoinColumn(name="id_objet", insertable=false, updatable=false)
	private AchatArrivage achatArrivage;

	public VisibiliteModuleAchatArrivage() {
	}

	public VisibiliteModuleAchatArrivagePK getId() {
		return this.id;
	}

	public void setId(VisibiliteModuleAchatArrivagePK id) {
		this.id = id;
	}

	public AchatArrivage getAchatArrivage() {
		return this.achatArrivage;
	}

	public void setAchatArrivage(AchatArrivage achatArrivage) {
		this.achatArrivage = achatArrivage;
	}

}