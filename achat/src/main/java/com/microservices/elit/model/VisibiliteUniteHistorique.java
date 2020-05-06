package com.microservices.elit.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the visibilite_unite_historique database table.
 * 
 */
@Entity
@Table(name="visibilite_unite_historique")
@NamedQuery(name="VisibiliteUniteHistorique.findAll", query="SELECT v FROM VisibiliteUniteHistorique v")
public class VisibiliteUniteHistorique implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private VisibiliteUniteHistoriquePK id;

	public VisibiliteUniteHistorique() {
	}

	public VisibiliteUniteHistoriquePK getId() {
		return this.id;
	}

	public void setId(VisibiliteUniteHistoriquePK id) {
		this.id = id;
	}

}