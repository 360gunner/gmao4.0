package com.microservices.elit.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the visibilite_module_engagement database table.
 * 
 */
@Entity
@Table(name="visibilite_module_engagement")
@NamedQuery(name="VisibiliteModuleEngagement.findAll", query="SELECT v FROM VisibiliteModuleEngagement v")
public class VisibiliteModuleEngagement implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private VisibiliteModuleEngagementPK id;

	//bi-directional many-to-one association to AchatEngagement
	@ManyToOne
	@JoinColumn(name="id_objet", insertable=false, updatable=false)
	private AchatEngagement achatEngagement;

	public VisibiliteModuleEngagement() {
	}

	public VisibiliteModuleEngagementPK getId() {
		return this.id;
	}

	public void setId(VisibiliteModuleEngagementPK id) {
		this.id = id;
	}

	public AchatEngagement getAchatEngagement() {
		return this.achatEngagement;
	}

	public void setAchatEngagement(AchatEngagement achatEngagement) {
		this.achatEngagement = achatEngagement;
	}

}