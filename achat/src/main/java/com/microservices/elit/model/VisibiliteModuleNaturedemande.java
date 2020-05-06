package com.microservices.elit.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the visibilite_module_naturedemande database table.
 * 
 */
@Entity
@Table(name="visibilite_module_naturedemande")
@NamedQuery(name="VisibiliteModuleNaturedemande.findAll", query="SELECT v FROM VisibiliteModuleNaturedemande v")
public class VisibiliteModuleNaturedemande implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private VisibiliteModuleNaturedemandePK id;

	//bi-directional many-to-one association to DbaNatureDemande
	@ManyToOne
	@JoinColumn(name="id_objet", insertable=false, updatable=false)
	private DbaNatureDemande dbaNatureDemande;

	public VisibiliteModuleNaturedemande() {
	}

	public VisibiliteModuleNaturedemandePK getId() {
		return this.id;
	}

	public void setId(VisibiliteModuleNaturedemandePK id) {
		this.id = id;
	}

	public DbaNatureDemande getDbaNatureDemande() {
		return this.dbaNatureDemande;
	}

	public void setDbaNatureDemande(DbaNatureDemande dbaNatureDemande) {
		this.dbaNatureDemande = dbaNatureDemande;
	}

}