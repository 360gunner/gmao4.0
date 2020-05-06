package com.microservices.elit.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the visibilite_profil_critere_selection database table.
 * 
 */
@Entity
@Table(name="visibilite_profil_critere_selection")
@NamedQuery(name="VisibiliteProfilCritereSelection.findAll", query="SELECT v FROM VisibiliteProfilCritereSelection v")
public class VisibiliteProfilCritereSelection implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private VisibiliteProfilCritereSelectionPK id;

	//bi-directional many-to-one association to DbaCritereSelection
	@ManyToOne
	@JoinColumn(name="id_objet", insertable=false, updatable=false)
	private DbaCritereSelection dbaCritereSelection;

	public VisibiliteProfilCritereSelection() {
	}

	public VisibiliteProfilCritereSelectionPK getId() {
		return this.id;
	}

	public void setId(VisibiliteProfilCritereSelectionPK id) {
		this.id = id;
	}

	public DbaCritereSelection getDbaCritereSelection() {
		return this.dbaCritereSelection;
	}

	public void setDbaCritereSelection(DbaCritereSelection dbaCritereSelection) {
		this.dbaCritereSelection = dbaCritereSelection;
	}

}