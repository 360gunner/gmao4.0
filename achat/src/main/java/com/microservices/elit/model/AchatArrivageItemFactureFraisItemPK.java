package com.microservices.elit.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the achat_arrivage_item_facture_frais_item database table.
 * 
 */
@Embeddable
public class AchatArrivageItemFactureFraisItemPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="id_arrivage_facture_frais")
	private Long idArrivageFactureFrais;

	@Column(name="id_ligne_facture")
	private Long idLigneFacture;

	@Column(name="id_arrivage_item", insertable=false, updatable=false)
	private Long idArrivageItem;

	public AchatArrivageItemFactureFraisItemPK() {
	}
	public Long getIdArrivageFactureFrais() {
		return this.idArrivageFactureFrais;
	}
	public void setIdArrivageFactureFrais(Long idArrivageFactureFrais) {
		this.idArrivageFactureFrais = idArrivageFactureFrais;
	}
	public Long getIdLigneFacture() {
		return this.idLigneFacture;
	}
	public void setIdLigneFacture(Long idLigneFacture) {
		this.idLigneFacture = idLigneFacture;
	}
	public Long getIdArrivageItem() {
		return this.idArrivageItem;
	}
	public void setIdArrivageItem(Long idArrivageItem) {
		this.idArrivageItem = idArrivageItem;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof AchatArrivageItemFactureFraisItemPK)) {
			return false;
		}
		AchatArrivageItemFactureFraisItemPK castOther = (AchatArrivageItemFactureFraisItemPK)other;
		return 
			this.idArrivageFactureFrais.equals(castOther.idArrivageFactureFrais)
			&& this.idLigneFacture.equals(castOther.idLigneFacture)
			&& this.idArrivageItem.equals(castOther.idArrivageItem);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.idArrivageFactureFrais.hashCode();
		hash = hash * prime + this.idLigneFacture.hashCode();
		hash = hash * prime + this.idArrivageItem.hashCode();
		
		return hash;
	}
}