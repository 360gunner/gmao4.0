package com.microservices.elit.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the achat_arrivage_item database table.
 * 
 */
@Entity
@Table(name="achat_arrivage_item")
@NamedQuery(name="AchatArrivageItem.findAll", query="SELECT a FROM AchatArrivageItem a")
public class AchatArrivageItem implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;

	@Column(name="cout_achat")
	private BigDecimal coutAchat;

	@Column(name="cout_achat_corrige")
	private BigDecimal coutAchatCorrige;

	@Column(name="creer_le")
	private Timestamp creerLe;

	@Column(name="creer_par")
	private Long creerPar;

	@Column(name="id_article")
	private Long idArticle;

	@Column(name="id_correction")
	private Integer idCorrection;

	@Column(name="id_reference")
	private Long idReference;

	@Column(name="id_unite_organisationnelle_createur")
	private Long idUniteOrganisationnelleCreateur;

	@Column(name="modifier_le")
	private Timestamp modifierLe;

	@Column(name="modifier_par")
	private Long modifierPar;

	private BigDecimal montant;

	private BigDecimal prix;

	@Column(name="quantite_recue")
	private BigDecimal quantiteRecue;

	//bi-directional many-to-one association to AchatArrivage
	@ManyToOne
	@JoinColumn(name="id_arrivage", insertable=false, updatable=false)
	private AchatArrivage achatArrivage;

	//bi-directional many-to-one association to AchatArrivageItemFactureFraisItem
	@OneToMany(mappedBy="achatArrivageItem")
	private List<AchatArrivageItemFactureFraisItem> achatArrivageItemFactureFraisItems;

	public AchatArrivageItem() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public BigDecimal getCoutAchat() {
		return this.coutAchat;
	}

	public void setCoutAchat(BigDecimal coutAchat) {
		this.coutAchat = coutAchat;
	}

	public BigDecimal getCoutAchatCorrige() {
		return this.coutAchatCorrige;
	}

	public void setCoutAchatCorrige(BigDecimal coutAchatCorrige) {
		this.coutAchatCorrige = coutAchatCorrige;
	}

	public Timestamp getCreerLe() {
		return this.creerLe;
	}

	public void setCreerLe(Timestamp creerLe) {
		this.creerLe = creerLe;
	}

	public Long getCreerPar() {
		return this.creerPar;
	}

	public void setCreerPar(Long creerPar) {
		this.creerPar = creerPar;
	}

	public Long getIdArticle() {
		return this.idArticle;
	}

	public void setIdArticle(Long idArticle) {
		this.idArticle = idArticle;
	}

	public Integer getIdCorrection() {
		return this.idCorrection;
	}

	public void setIdCorrection(Integer idCorrection) {
		this.idCorrection = idCorrection;
	}

	public Long getIdReference() {
		return this.idReference;
	}

	public void setIdReference(Long idReference) {
		this.idReference = idReference;
	}

	public Long getIdUniteOrganisationnelleCreateur() {
		return this.idUniteOrganisationnelleCreateur;
	}

	public void setIdUniteOrganisationnelleCreateur(Long idUniteOrganisationnelleCreateur) {
		this.idUniteOrganisationnelleCreateur = idUniteOrganisationnelleCreateur;
	}

	public Timestamp getModifierLe() {
		return this.modifierLe;
	}

	public void setModifierLe(Timestamp modifierLe) {
		this.modifierLe = modifierLe;
	}

	public Long getModifierPar() {
		return this.modifierPar;
	}

	public void setModifierPar(Long modifierPar) {
		this.modifierPar = modifierPar;
	}

	public BigDecimal getMontant() {
		return this.montant;
	}

	public void setMontant(BigDecimal montant) {
		this.montant = montant;
	}

	public BigDecimal getPrix() {
		return this.prix;
	}

	public void setPrix(BigDecimal prix) {
		this.prix = prix;
	}

	public BigDecimal getQuantiteRecue() {
		return this.quantiteRecue;
	}

	public void setQuantiteRecue(BigDecimal quantiteRecue) {
		this.quantiteRecue = quantiteRecue;
	}

	public AchatArrivage getAchatArrivage() {
		return this.achatArrivage;
	}

	public void setAchatArrivage(AchatArrivage achatArrivage) {
		this.achatArrivage = achatArrivage;
	}

	public List<AchatArrivageItemFactureFraisItem> getAchatArrivageItemFactureFraisItems() {
		return this.achatArrivageItemFactureFraisItems;
	}

	public void setAchatArrivageItemFactureFraisItems(List<AchatArrivageItemFactureFraisItem> achatArrivageItemFactureFraisItems) {
		this.achatArrivageItemFactureFraisItems = achatArrivageItemFactureFraisItems;
	}

	public AchatArrivageItemFactureFraisItem addAchatArrivageItemFactureFraisItem(AchatArrivageItemFactureFraisItem achatArrivageItemFactureFraisItem) {
		getAchatArrivageItemFactureFraisItems().add(achatArrivageItemFactureFraisItem);
		achatArrivageItemFactureFraisItem.setAchatArrivageItem(this);

		return achatArrivageItemFactureFraisItem;
	}

	public AchatArrivageItemFactureFraisItem removeAchatArrivageItemFactureFraisItem(AchatArrivageItemFactureFraisItem achatArrivageItemFactureFraisItem) {
		getAchatArrivageItemFactureFraisItems().remove(achatArrivageItemFactureFraisItem);
		achatArrivageItemFactureFraisItem.setAchatArrivageItem(null);

		return achatArrivageItemFactureFraisItem;
	}

}