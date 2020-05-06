package com.microservices.elit.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the achat_engagement_demande_achat database table.
 * 
 */
@Entity
@Table(name="achat_engagement_demande_achat")
@NamedQuery(name="AchatEngagementDemandeAchat.findAll", query="SELECT a FROM AchatEngagementDemandeAchat a")
public class AchatEngagementDemandeAchat implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private AchatEngagementDemandeAchatPK id;

	//bi-directional many-to-one association to AchatEngagement
	@ManyToOne
	@JoinColumn(name="id_engagement", insertable=false, updatable=false)
	private AchatEngagement achatEngagement;

	public AchatEngagementDemandeAchat() {
	}

	public AchatEngagementDemandeAchatPK getId() {
		return this.id;
	}

	public void setId(AchatEngagementDemandeAchatPK id) {
		this.id = id;
	}

	public AchatEngagement getAchatEngagement() {
		return this.achatEngagement;
	}

	public void setAchatEngagement(AchatEngagement achatEngagement) {
		this.achatEngagement = achatEngagement;
	}

}