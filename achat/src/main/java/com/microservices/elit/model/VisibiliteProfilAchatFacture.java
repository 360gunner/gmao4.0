package com.microservices.elit.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the visibilite_profil_achat_facture database table.
 * 
 */
@Entity
@Table(name="visibilite_profil_achat_facture")
@NamedQuery(name="VisibiliteProfilAchatFacture.findAll", query="SELECT v FROM VisibiliteProfilAchatFacture v")
public class VisibiliteProfilAchatFacture implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private VisibiliteProfilAchatFacturePK id;

	//bi-directional many-to-one association to AchatFacture
	@ManyToOne
	@JoinColumn(name="id_objet", insertable=false, updatable=false)
	private AchatFacture achatFacture;

	public VisibiliteProfilAchatFacture() {
	}

	public VisibiliteProfilAchatFacturePK getId() {
		return this.id;
	}

	public void setId(VisibiliteProfilAchatFacturePK id) {
		this.id = id;
	}

	public AchatFacture getAchatFacture() {
		return this.achatFacture;
	}

	public void setAchatFacture(AchatFacture achatFacture) {
		this.achatFacture = achatFacture;
	}

}