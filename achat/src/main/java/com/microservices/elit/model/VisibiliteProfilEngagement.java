package com.microservices.elit.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the visibilite_profil_engagement database table.
 * 
 */
@Entity
@Table(name="visibilite_profil_engagement")
@NamedQuery(name="VisibiliteProfilEngagement.findAll", query="SELECT v FROM VisibiliteProfilEngagement v")
public class VisibiliteProfilEngagement implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private VisibiliteProfilEngagementPK id;

	//bi-directional many-to-one association to AchatEngagement
	@ManyToOne
	@JoinColumn(name="id_objet", insertable=false, updatable=false)
	private AchatEngagement achatEngagement;

	public VisibiliteProfilEngagement() {
	}

	public VisibiliteProfilEngagementPK getId() {
		return this.id;
	}

	public void setId(VisibiliteProfilEngagementPK id) {
		this.id = id;
	}

	public AchatEngagement getAchatEngagement() {
		return this.achatEngagement;
	}

	public void setAchatEngagement(AchatEngagement achatEngagement) {
		this.achatEngagement = achatEngagement;
	}

}