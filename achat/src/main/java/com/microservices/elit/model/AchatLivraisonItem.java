package com.microservices.elit.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the achat_livraison_item database table.
 * 
 */
@Entity
@Table(name="achat_livraison_item")
@NamedQuery(name="AchatLivraisonItem.findAll", query="SELECT a FROM AchatLivraisonItem a")
public class AchatLivraisonItem implements Serializable {
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

	@Column(name="id_reference_fournisseur")
	private Long idReferenceFournisseur;

	@Column(name="id_unite_organisationnelle_createur")
	private Long idUniteOrganisationnelleCreateur;

	@Column(name="modifier_le")
	private Timestamp modifierLe;

	@Column(name="modifier_par")
	private Long modifierPar;

	private BigDecimal prix;

	private BigDecimal quantite;

	@Column(name="quantite_restante_phy")
	private BigDecimal quantiteRestantePhy;

	@Column(name="quantite_restante_tho")
	private BigDecimal quantiteRestanteTho;

	private Timestamp version;

	//bi-directional many-to-one association to AchatLivraison
	@ManyToOne
	@JoinColumn(name="id_livraison", insertable=false, updatable=false)
	private AchatLivraison achatLivraison;

	//bi-directional many-to-one association to AchatLivraisonItemFactureFraisItem
	@OneToMany(mappedBy="achatLivraisonItem")
	private List<AchatLivraisonItemFactureFraisItem> achatLivraisonItemFactureFraisItems;

	public AchatLivraisonItem() {
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

	public Long getIdReferenceFournisseur() {
		return this.idReferenceFournisseur;
	}

	public void setIdReferenceFournisseur(Long idReferenceFournisseur) {
		this.idReferenceFournisseur = idReferenceFournisseur;
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

	public BigDecimal getPrix() {
		return this.prix;
	}

	public void setPrix(BigDecimal prix) {
		this.prix = prix;
	}

	public BigDecimal getQuantite() {
		return this.quantite;
	}

	public void setQuantite(BigDecimal quantite) {
		this.quantite = quantite;
	}

	public BigDecimal getQuantiteRestantePhy() {
		return this.quantiteRestantePhy;
	}

	public void setQuantiteRestantePhy(BigDecimal quantiteRestantePhy) {
		this.quantiteRestantePhy = quantiteRestantePhy;
	}

	public BigDecimal getQuantiteRestanteTho() {
		return this.quantiteRestanteTho;
	}

	public void setQuantiteRestanteTho(BigDecimal quantiteRestanteTho) {
		this.quantiteRestanteTho = quantiteRestanteTho;
	}

	public Timestamp getVersion() {
		return this.version;
	}

	public void setVersion(Timestamp version) {
		this.version = version;
	}

	public AchatLivraison getAchatLivraison() {
		return this.achatLivraison;
	}

	public void setAchatLivraison(AchatLivraison achatLivraison) {
		this.achatLivraison = achatLivraison;
	}

	public List<AchatLivraisonItemFactureFraisItem> getAchatLivraisonItemFactureFraisItems() {
		return this.achatLivraisonItemFactureFraisItems;
	}

	public void setAchatLivraisonItemFactureFraisItems(List<AchatLivraisonItemFactureFraisItem> achatLivraisonItemFactureFraisItems) {
		this.achatLivraisonItemFactureFraisItems = achatLivraisonItemFactureFraisItems;
	}

	public AchatLivraisonItemFactureFraisItem addAchatLivraisonItemFactureFraisItem(AchatLivraisonItemFactureFraisItem achatLivraisonItemFactureFraisItem) {
		getAchatLivraisonItemFactureFraisItems().add(achatLivraisonItemFactureFraisItem);
		achatLivraisonItemFactureFraisItem.setAchatLivraisonItem(this);

		return achatLivraisonItemFactureFraisItem;
	}

	public AchatLivraisonItemFactureFraisItem removeAchatLivraisonItemFactureFraisItem(AchatLivraisonItemFactureFraisItem achatLivraisonItemFactureFraisItem) {
		getAchatLivraisonItemFactureFraisItems().remove(achatLivraisonItemFactureFraisItem);
		achatLivraisonItemFactureFraisItem.setAchatLivraisonItem(null);

		return achatLivraisonItemFactureFraisItem;
	}

}