package com.microservices.elit.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the achat_arrivage_demande_achat database table.
 * 
 */
@Embeddable
public class AchatArrivageDemandeAchatPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="id_arrivage", insertable=false, updatable=false)
	private Long idArrivage;

	@Column(name="id_demande_achat", insertable=false, updatable=false)
	private Long idDemandeAchat;

	public AchatArrivageDemandeAchatPK() {
	}
	public Long getIdArrivage() {
		return this.idArrivage;
	}
	public void setIdArrivage(Long idArrivage) {
		this.idArrivage = idArrivage;
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
		if (!(other instanceof AchatArrivageDemandeAchatPK)) {
			return false;
		}
		AchatArrivageDemandeAchatPK castOther = (AchatArrivageDemandeAchatPK)other;
		return 
			this.idArrivage.equals(castOther.idArrivage)
			&& this.idDemandeAchat.equals(castOther.idDemandeAchat);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.idArrivage.hashCode();
		hash = hash * prime + this.idDemandeAchat.hashCode();
		
		return hash;
	}
}