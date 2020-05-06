package com.microservices.elit.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the visibilite_unite_engagement database table.
 * 
 */
@Entity
@Table(name="visibilite_unite_engagement")
@NamedQuery(name="VisibiliteUniteEngagement.findAll", query="SELECT v FROM VisibiliteUniteEngagement v")
public class VisibiliteUniteEngagement implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private VisibiliteUniteEngagementPK id;

	//bi-directional many-to-one association to AchatEngagement
	@ManyToOne
	@JoinColumn(name="id_objet", insertable=false, updatable=false)
	private AchatEngagement achatEngagement;

	public VisibiliteUniteEngagement() {
	}

	public VisibiliteUniteEngagementPK getId() {
		return this.id;
	}

	public void setId(VisibiliteUniteEngagementPK id) {
		this.id = id;
	}

	public AchatEngagement getAchatEngagement() {
		return this.achatEngagement;
	}

	public void setAchatEngagement(AchatEngagement achatEngagement) {
		this.achatEngagement = achatEngagement;
	}

}