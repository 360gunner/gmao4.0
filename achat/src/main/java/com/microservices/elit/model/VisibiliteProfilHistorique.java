package com.microservices.elit.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the visibilite_profil_historique database table.
 * 
 */
@Entity
@Table(name="visibilite_profil_historique")
@NamedQuery(name="VisibiliteProfilHistorique.findAll", query="SELECT v FROM VisibiliteProfilHistorique v")
public class VisibiliteProfilHistorique implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private VisibiliteProfilHistoriquePK id;

	public VisibiliteProfilHistorique() {
	}

	public VisibiliteProfilHistoriquePK getId() {
		return this.id;
	}

	public void setId(VisibiliteProfilHistoriquePK id) {
		this.id = id;
	}

}