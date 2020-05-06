package com.microservices.elit.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the achat_engagement_magasin database table.
 * 
 */
@Embeddable
public class AchatEngagementMagasinPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="id_engagement", insertable=false, updatable=false)
	private Long idEngagement;

	@Column(name="id_magasin")
	private Long idMagasin;

	public AchatEngagementMagasinPK() {
	}
	public Long getIdEngagement() {
		return this.idEngagement;
	}
	public void setIdEngagement(Long idEngagement) {
		this.idEngagement = idEngagement;
	}
	public Long getIdMagasin() {
		return this.idMagasin;
	}
	public void setIdMagasin(Long idMagasin) {
		this.idMagasin = idMagasin;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof AchatEngagementMagasinPK)) {
			return false;
		}
		AchatEngagementMagasinPK castOther = (AchatEngagementMagasinPK)other;
		return 
			this.idEngagement.equals(castOther.idEngagement)
			&& this.idMagasin.equals(castOther.idMagasin);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.idEngagement.hashCode();
		hash = hash * prime + this.idMagasin.hashCode();
		
		return hash;
	}
}