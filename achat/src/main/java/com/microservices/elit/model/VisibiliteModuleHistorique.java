package com.microservices.elit.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the visibilite_module_historique database table.
 * 
 */
@Entity
@Table(name="visibilite_module_historique")
@NamedQuery(name="VisibiliteModuleHistorique.findAll", query="SELECT v FROM VisibiliteModuleHistorique v")
public class VisibiliteModuleHistorique implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private VisibiliteModuleHistoriquePK id;

	public VisibiliteModuleHistorique() {
	}

	public VisibiliteModuleHistoriquePK getId() {
		return this.id;
	}

	public void setId(VisibiliteModuleHistoriquePK id) {
		this.id = id;
	}

}