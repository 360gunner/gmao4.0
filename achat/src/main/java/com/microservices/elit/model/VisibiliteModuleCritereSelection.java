package com.microservices.elit.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the visibilite_module_critere_selection database table.
 * 
 */
@Entity
@Table(name="visibilite_module_critere_selection")
@NamedQuery(name="VisibiliteModuleCritereSelection.findAll", query="SELECT v FROM VisibiliteModuleCritereSelection v")
public class VisibiliteModuleCritereSelection implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private VisibiliteModuleCritereSelectionPK id;

	//bi-directional many-to-one association to DbaCritereSelection
	@ManyToOne
	@JoinColumn(name="id_objet", insertable=false, updatable=false)
	private DbaCritereSelection dbaCritereSelection;

	public VisibiliteModuleCritereSelection() {
	}

	public VisibiliteModuleCritereSelectionPK getId() {
		return this.id;
	}

	public void setId(VisibiliteModuleCritereSelectionPK id) {
		this.id = id;
	}

	public DbaCritereSelection getDbaCritereSelection() {
		return this.dbaCritereSelection;
	}

	public void setDbaCritereSelection(DbaCritereSelection dbaCritereSelection) {
		this.dbaCritereSelection = dbaCritereSelection;
	}

}