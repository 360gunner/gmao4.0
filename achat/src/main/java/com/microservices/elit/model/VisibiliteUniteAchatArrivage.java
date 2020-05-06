package com.microservices.elit.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the visibilite_unite_achat_arrivage database table.
 * 
 */
@Entity
@Table(name="visibilite_unite_achat_arrivage")
@NamedQuery(name="VisibiliteUniteAchatArrivage.findAll", query="SELECT v FROM VisibiliteUniteAchatArrivage v")
public class VisibiliteUniteAchatArrivage implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private VisibiliteUniteAchatArrivagePK id;

	//bi-directional many-to-one association to AchatArrivage
	@ManyToOne
	@JoinColumn(name="id_objet", insertable=false, updatable=false)
	private AchatArrivage achatArrivage;

	public VisibiliteUniteAchatArrivage() {
	}

	public VisibiliteUniteAchatArrivagePK getId() {
		return this.id;
	}

	public void setId(VisibiliteUniteAchatArrivagePK id) {
		this.id = id;
	}

	public AchatArrivage getAchatArrivage() {
		return this.achatArrivage;
	}

	public void setAchatArrivage(AchatArrivage achatArrivage) {
		this.achatArrivage = achatArrivage;
	}

}