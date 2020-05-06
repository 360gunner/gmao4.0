package com.microservices.elit.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the visibilite_unite_naturedemande database table.
 * 
 */
@Entity
@Table(name="visibilite_unite_naturedemande")
@NamedQuery(name="VisibiliteUniteNaturedemande.findAll", query="SELECT v FROM VisibiliteUniteNaturedemande v")
public class VisibiliteUniteNaturedemande implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private VisibiliteUniteNaturedemandePK id;

	//bi-directional many-to-one association to DbaNatureDemande
	@ManyToOne
	@JoinColumn(name="id_objet", insertable=false, updatable=false)
	private DbaNatureDemande dbaNatureDemande;

	public VisibiliteUniteNaturedemande() {
	}

	public VisibiliteUniteNaturedemandePK getId() {
		return this.id;
	}

	public void setId(VisibiliteUniteNaturedemandePK id) {
		this.id = id;
	}

	public DbaNatureDemande getDbaNatureDemande() {
		return this.dbaNatureDemande;
	}

	public void setDbaNatureDemande(DbaNatureDemande dbaNatureDemande) {
		this.dbaNatureDemande = dbaNatureDemande;
	}

}