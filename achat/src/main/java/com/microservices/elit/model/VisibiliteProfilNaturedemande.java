package com.microservices.elit.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the visibilite_profil_naturedemande database table.
 * 
 */
@Entity
@Table(name="visibilite_profil_naturedemande")
@NamedQuery(name="VisibiliteProfilNaturedemande.findAll", query="SELECT v FROM VisibiliteProfilNaturedemande v")
public class VisibiliteProfilNaturedemande implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private VisibiliteProfilNaturedemandePK id;

	//bi-directional many-to-one association to DbaNatureDemande
	@ManyToOne
	@JoinColumn(name="id_objet", insertable=false, updatable=false)
	private DbaNatureDemande dbaNatureDemande;

	public VisibiliteProfilNaturedemande() {
	}

	public VisibiliteProfilNaturedemandePK getId() {
		return this.id;
	}

	public void setId(VisibiliteProfilNaturedemandePK id) {
		this.id = id;
	}

	public DbaNatureDemande getDbaNatureDemande() {
		return this.dbaNatureDemande;
	}

	public void setDbaNatureDemande(DbaNatureDemande dbaNatureDemande) {
		this.dbaNatureDemande = dbaNatureDemande;
	}

}