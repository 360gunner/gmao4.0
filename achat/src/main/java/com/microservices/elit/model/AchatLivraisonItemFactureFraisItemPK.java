package com.microservices.elit.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the achat_livraison_item_facture_frais_item database table.
 * 
 */
@Embeddable
public class AchatLivraisonItemFactureFraisItemPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="id_livraison_facture_frais")
	private Long idLivraisonFactureFrais;

	@Column(name="id_ligne_facture")
	private Long idLigneFacture;

	@Column(name="id_livraison_item", insertable=false, updatable=false)
	private Long idLivraisonItem;

	public AchatLivraisonItemFactureFraisItemPK() {
	}
	public Long getIdLivraisonFactureFrais() {
		return this.idLivraisonFactureFrais;
	}
	public void setIdLivraisonFactureFrais(Long idLivraisonFactureFrais) {
		this.idLivraisonFactureFrais = idLivraisonFactureFrais;
	}
	public Long getIdLigneFacture() {
		return this.idLigneFacture;
	}
	public void setIdLigneFacture(Long idLigneFacture) {
		this.idLigneFacture = idLigneFacture;
	}
	public Long getIdLivraisonItem() {
		return this.idLivraisonItem;
	}
	public void setIdLivraisonItem(Long idLivraisonItem) {
		this.idLivraisonItem = idLivraisonItem;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof AchatLivraisonItemFactureFraisItemPK)) {
			return false;
		}
		AchatLivraisonItemFactureFraisItemPK castOther = (AchatLivraisonItemFactureFraisItemPK)other;
		return 
			this.idLivraisonFactureFrais.equals(castOther.idLivraisonFactureFrais)
			&& this.idLigneFacture.equals(castOther.idLigneFacture)
			&& this.idLivraisonItem.equals(castOther.idLivraisonItem);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.idLivraisonFactureFrais.hashCode();
		hash = hash * prime + this.idLigneFacture.hashCode();
		hash = hash * prime + this.idLivraisonItem.hashCode();
		
		return hash;
	}
}