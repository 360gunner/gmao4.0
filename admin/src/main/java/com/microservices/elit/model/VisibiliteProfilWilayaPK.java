package com.microservices.elit.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the visibilite_profil_wilaya database table.
 * 
 */
@Embeddable
public class VisibiliteProfilWilayaPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="id_objet")
	private Long idObjet;

	@Column(name="id_profil", insertable=false, updatable=false)
	private Long idProfil;

	public VisibiliteProfilWilayaPK() {
	}
	public Long getIdObjet() {
		return this.idObjet;
	}
	public void setIdObjet(Long idObjet) {
		this.idObjet = idObjet;
	}
	public Long getIdProfil() {
		return this.idProfil;
	}
	public void setIdProfil(Long idProfil) {
		this.idProfil = idProfil;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof VisibiliteProfilWilayaPK)) {
			return false;
		}
		VisibiliteProfilWilayaPK castOther = (VisibiliteProfilWilayaPK)other;
		return 
			this.idObjet.equals(castOther.idObjet)
			&& this.idProfil.equals(castOther.idProfil);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.idObjet.hashCode();
		hash = hash * prime + this.idProfil.hashCode();
		
		return hash;
	}
}