package com.microservices.elit.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the achat_engagement_item_facture_frais_item database table.
 * 
 */
@Embeddable
public class AchatEngagementItemFactureFraisItemPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="id_engagement_facture_frais")
	private Long idEngagementFactureFrais;

	@Column(name="id_ligne_facture")
	private Long idLigneFacture;

	@Column(name="id_engagement_item", insertable=false, updatable=false)
	private Long idEngagementItem;

	public AchatEngagementItemFactureFraisItemPK() {
	}
	public Long getIdEngagementFactureFrais() {
		return this.idEngagementFactureFrais;
	}
	public void setIdEngagementFactureFrais(Long idEngagementFactureFrais) {
		this.idEngagementFactureFrais = idEngagementFactureFrais;
	}
	public Long getIdLigneFacture() {
		return this.idLigneFacture;
	}
	public void setIdLigneFacture(Long idLigneFacture) {
		this.idLigneFacture = idLigneFacture;
	}
	public Long getIdEngagementItem() {
		return this.idEngagementItem;
	}
	public void setIdEngagementItem(Long idEngagementItem) {
		this.idEngagementItem = idEngagementItem;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof AchatEngagementItemFactureFraisItemPK)) {
			return false;
		}
		AchatEngagementItemFactureFraisItemPK castOther = (AchatEngagementItemFactureFraisItemPK)other;
		return 
			this.idEngagementFactureFrais.equals(castOther.idEngagementFactureFrais)
			&& this.idLigneFacture.equals(castOther.idLigneFacture)
			&& this.idEngagementItem.equals(castOther.idEngagementItem);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.idEngagementFactureFrais.hashCode();
		hash = hash * prime + this.idLigneFacture.hashCode();
		hash = hash * prime + this.idEngagementItem.hashCode();
		
		return hash;
	}
}