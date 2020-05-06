package com.microservices.elit.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the achat_engagement_magasin database table.
 * 
 */
@Entity
@Table(name="achat_engagement_magasin")
@NamedQuery(name="AchatEngagementMagasin.findAll", query="SELECT a FROM AchatEngagementMagasin a")
public class AchatEngagementMagasin implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private AchatEngagementMagasinPK id;

	//bi-directional many-to-one association to AchatEngagement
	@ManyToOne
	@JoinColumn(name="id_engagement", insertable=false, updatable=false)
	private AchatEngagement achatEngagement;

	public AchatEngagementMagasin() {
	}

	public AchatEngagementMagasinPK getId() {
		return this.id;
	}

	public void setId(AchatEngagementMagasinPK id) {
		this.id = id;
	}

	public AchatEngagement getAchatEngagement() {
		return this.achatEngagement;
	}

	public void setAchatEngagement(AchatEngagement achatEngagement) {
		this.achatEngagement = achatEngagement;
	}

}