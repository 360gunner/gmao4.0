package com.microservices.elit.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the visibilite_profil_achat_arrivage database table.
 * 
 */
@Entity
@Table(name="visibilite_profil_achat_arrivage")
@NamedQuery(name="VisibiliteProfilAchatArrivage.findAll", query="SELECT v FROM VisibiliteProfilAchatArrivage v")
public class VisibiliteProfilAchatArrivage implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private VisibiliteProfilAchatArrivagePK id;

	//bi-directional many-to-one association to AchatArrivage
	@ManyToOne
	@JoinColumn(name="id_objet", insertable=false, updatable=false)
	private AchatArrivage achatArrivage;

	public VisibiliteProfilAchatArrivage() {
	}

	public VisibiliteProfilAchatArrivagePK getId() {
		return this.id;
	}

	public void setId(VisibiliteProfilAchatArrivagePK id) {
		this.id = id;
	}

	public AchatArrivage getAchatArrivage() {
		return this.achatArrivage;
	}

	public void setAchatArrivage(AchatArrivage achatArrivage) {
		this.achatArrivage = achatArrivage;
	}

}