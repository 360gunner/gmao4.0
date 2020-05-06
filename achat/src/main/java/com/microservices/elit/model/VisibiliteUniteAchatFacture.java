package com.microservices.elit.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the visibilite_unite_achat_facture database table.
 * 
 */
@Entity
@Table(name="visibilite_unite_achat_facture")
@NamedQuery(name="VisibiliteUniteAchatFacture.findAll", query="SELECT v FROM VisibiliteUniteAchatFacture v")
public class VisibiliteUniteAchatFacture implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private VisibiliteUniteAchatFacturePK id;

	//bi-directional many-to-one association to AchatFacture
	@ManyToOne
	@JoinColumn(name="id_objet", insertable=false, updatable=false)
	private AchatFacture achatFacture;

	public VisibiliteUniteAchatFacture() {
	}

	public VisibiliteUniteAchatFacturePK getId() {
		return this.id;
	}

	public void setId(VisibiliteUniteAchatFacturePK id) {
		this.id = id;
	}

	public AchatFacture getAchatFacture() {
		return this.achatFacture;
	}

	public void setAchatFacture(AchatFacture achatFacture) {
		this.achatFacture = achatFacture;
	}

}