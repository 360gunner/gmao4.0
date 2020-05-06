package com.microservices.elit.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the achat_engagement_demande_achat database table.
 * 
 */
@Embeddable
public class AchatEngagementDemandeAchatPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="id_engagement", insertable=false, updatable=false)
	private Long idEngagement;

	@Column(name="id_demande_achat")
	private Long idDemandeAchat;

	public AchatEngagementDemandeAchatPK() {
	}
	public Long getIdEngagement() {
		return this.idEngagement;
	}
	public void setIdEngagement(Long idEngagement) {
		this.idEngagement = idEngagement;
	}
	public Long getIdDemandeAchat() {
		return this.idDemandeAchat;
	}
	public void setIdDemandeAchat(Long idDemandeAchat) {
		this.idDemandeAchat = idDemandeAchat;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof AchatEngagementDemandeAchatPK)) {
			return false;
		}
		AchatEngagementDemandeAchatPK castOther = (AchatEngagementDemandeAchatPK)other;
		return 
			this.idEngagement.equals(castOther.idEngagement)
			&& this.idDemandeAchat.equals(castOther.idDemandeAchat);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.idEngagement.hashCode();
		hash = hash * prime + this.idDemandeAchat.hashCode();
		
		return hash;
	}
}