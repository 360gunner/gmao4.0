package com.microservices.elit.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the visibilite_unite_critere_selection database table.
 * 
 */
@Entity
@Table(name="visibilite_unite_critere_selection")
@NamedQuery(name="VisibiliteUniteCritereSelection.findAll", query="SELECT v FROM VisibiliteUniteCritereSelection v")
public class VisibiliteUniteCritereSelection implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private VisibiliteUniteCritereSelectionPK id;

	//bi-directional many-to-one association to DbaCritereSelection
	@ManyToOne
	@JoinColumn(name="id_objet", insertable=false, updatable=false)
	private DbaCritereSelection dbaCritereSelection;

	public VisibiliteUniteCritereSelection() {
	}

	public VisibiliteUniteCritereSelectionPK getId() {
		return this.id;
	}

	public void setId(VisibiliteUniteCritereSelectionPK id) {
		this.id = id;
	}

	public DbaCritereSelection getDbaCritereSelection() {
		return this.dbaCritereSelection;
	}

	public void setDbaCritereSelection(DbaCritereSelection dbaCritereSelection) {
		this.dbaCritereSelection = dbaCritereSelection;
	}

}