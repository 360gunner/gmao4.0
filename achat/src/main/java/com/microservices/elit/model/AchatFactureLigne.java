package com.microservices.elit.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the achat_facture_ligne database table.
 * 
 */
@Entity
@Table(name="achat_facture_ligne")
@NamedQuery(name="AchatFactureLigne.findAll", query="SELECT a FROM AchatFactureLigne a")
public class AchatFactureLigne implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;

	@Column(name="creer_le")
	private Timestamp creerLe;

	@Column(name="creer_par")
	private Long creerPar;

	@Column(name="id_article")
	private Long idArticle;

	@Column(name="id_charge")
	private Long idCharge;

	@Column(name="id_frais_autre_charge")
	private Long idFraisAutreCharge;

	@Column(name="id_reference_fournisseur")
	private Long idReferenceFournisseur;

	@Column(name="id_taxe1")
	private Long idTaxe1;

	@Column(name="id_taxe2")
	private Long idTaxe2;

	@Column(name="id_unite_organisationnelle_createur")
	private Long idUniteOrganisationnelleCreateur;

	@Column(name="mode_calcul_charge")
	private String modeCalculCharge;

	@Column(name="mode_calcul_taxe")
	private String modeCalculTaxe;

	@Column(name="modifier_le")
	private Timestamp modifierLe;

	@Column(name="modifier_par")
	private Long modifierPar;

	private BigDecimal montant;

	@Column(name="pourcentage_restant")
	private BigDecimal pourcentageRestant;

	private BigDecimal prix;

	@Column(name="prix_final")
	private BigDecimal prixFinal;

	@Column(name="prix_ttc")
	private BigDecimal prixTtc;

	private BigDecimal quantite;

	@Column(name="quantite_restante_phy")
	private BigDecimal quantiteRestantePhy;

	@Column(name="quantite_restante_theo")
	private BigDecimal quantiteRestanteTheo;

	@Column(name="taux_change")
	private BigDecimal tauxChange;

	@Column(name="taux_charges")
	private BigDecimal tauxCharges;

	@Column(name="taux_remise")
	private BigDecimal tauxRemise;

	@Column(name="taux_taxe1")
	private BigDecimal tauxTaxe1;

	@Column(name="taux_taxe2")
	private BigDecimal tauxTaxe2;

	@Column(name="type_facture_ligne")
	private String typeFactureLigne;

	@Column(name="valeur_charges")
	private BigDecimal valeurCharges;

	@Column(name="valeur_remise")
	private BigDecimal valeurRemise;

	@Column(name="valeur_taxe1")
	private BigDecimal valeurTaxe1;

	@Column(name="valeur_taxe2")
	private BigDecimal valeurTaxe2;

	private Timestamp version;

	//bi-directional many-to-one association to AchatArrivageFactureAchatItem
	@OneToMany(mappedBy="achatFactureLigne")
	private List<AchatArrivageFactureAchatItem> achatArrivageFactureAchatItems;

	//bi-directional many-to-one association to AchatArrivageFactureFraisItem
	@OneToMany(mappedBy="achatFactureLigne")
	private List<AchatArrivageFactureFraisItem> achatArrivageFactureFraisItems;

	//bi-directional many-to-one association to AchatEngagementFactureFraisItem
	@OneToMany(mappedBy="achatFactureLigne")
	private List<AchatEngagementFactureFraisItem> achatEngagementFactureFraisItems;

	//bi-directional many-to-one association to AchatEngagementItem
	@ManyToOne
	@JoinColumn(name="id_engagement_item", insertable=false, updatable=false)
	private AchatEngagementItem achatEngagementItem;

	//bi-directional many-to-one association to AchatFacture
	@ManyToOne
	@JoinColumn(name="id_facture", insertable=false, updatable=false)
	private AchatFacture achatFacture;

	//bi-directional many-to-one association to AchatFactureLigneCentreCharge
	@OneToMany(mappedBy="achatFactureLigne")
	private List<AchatFactureLigneCentreCharge> achatFactureLigneCentreCharges;

	//bi-directional many-to-one association to AchatLivraisonFactureFraisItem
	@OneToMany(mappedBy="achatFactureLigne")
	private List<AchatLivraisonFactureFraisItem> achatLivraisonFactureFraisItems;

	//bi-directional many-to-one association to AchatLivraisonItemFactureAchat
	@OneToMany(mappedBy="achatFactureLigne")
	private List<AchatLivraisonItemFactureAchat> achatLivraisonItemFactureAchats;

	public AchatFactureLigne() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public Long getIdCharge() {
		return this.idCharge;
	}

	public void setIdCharge(Long idCharge) {
		this.idCharge = idCharge;
	}

	public Long getIdFraisAutreCharge() {
		return this.idFraisAutreCharge;
	}

	public void setIdFraisAutreCharge(Long idFraisAutreCharge) {
		this.idFraisAutreCharge = idFraisAutreCharge;
	}

	public Long getIdReferenceFournisseur() {
		return this.idReferenceFournisseur;
	}

	public void setIdReferenceFournisseur(Long idReferenceFournisseur) {
		this.idReferenceFournisseur = idReferenceFournisseur;
	}

	public Long getIdTaxe1() {
		return this.idTaxe1;
	}

	public void setIdTaxe1(Long idTaxe1) {
		this.idTaxe1 = idTaxe1;
	}

	public Long getIdTaxe2() {
		return this.idTaxe2;
	}

	public void setIdTaxe2(Long idTaxe2) {
		this.idTaxe2 = idTaxe2;
	}

	public Long getIdUniteOrganisationnelleCreateur() {
		return this.idUniteOrganisationnelleCreateur;
	}

	public void setIdUniteOrganisationnelleCreateur(Long idUniteOrganisationnelleCreateur) {
		this.idUniteOrganisationnelleCreateur = idUniteOrganisationnelleCreateur;
	}

	public String getModeCalculCharge() {
		return this.modeCalculCharge;
	}

	public void setModeCalculCharge(String modeCalculCharge) {
		this.modeCalculCharge = modeCalculCharge;
	}

	public String getModeCalculTaxe() {
		return this.modeCalculTaxe;
	}

	public void setModeCalculTaxe(String modeCalculTaxe) {
		this.modeCalculTaxe = modeCalculTaxe;
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

	public BigDecimal getPourcentageRestant() {
		return this.pourcentageRestant;
	}

	public void setPourcentageRestant(BigDecimal pourcentageRestant) {
		this.pourcentageRestant = pourcentageRestant;
	}

	public BigDecimal getPrix() {
		return this.prix;
	}

	public void setPrix(BigDecimal prix) {
		this.prix = prix;
	}

	public BigDecimal getPrixFinal() {
		return this.prixFinal;
	}

	public void setPrixFinal(BigDecimal prixFinal) {
		this.prixFinal = prixFinal;
	}

	public BigDecimal getPrixTtc() {
		return this.prixTtc;
	}

	public void setPrixTtc(BigDecimal prixTtc) {
		this.prixTtc = prixTtc;
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

	public BigDecimal getQuantiteRestanteTheo() {
		return this.quantiteRestanteTheo;
	}

	public void setQuantiteRestanteTheo(BigDecimal quantiteRestanteTheo) {
		this.quantiteRestanteTheo = quantiteRestanteTheo;
	}

	public BigDecimal getTauxChange() {
		return this.tauxChange;
	}

	public void setTauxChange(BigDecimal tauxChange) {
		this.tauxChange = tauxChange;
	}

	public BigDecimal getTauxCharges() {
		return this.tauxCharges;
	}

	public void setTauxCharges(BigDecimal tauxCharges) {
		this.tauxCharges = tauxCharges;
	}

	public BigDecimal getTauxRemise() {
		return this.tauxRemise;
	}

	public void setTauxRemise(BigDecimal tauxRemise) {
		this.tauxRemise = tauxRemise;
	}

	public BigDecimal getTauxTaxe1() {
		return this.tauxTaxe1;
	}

	public void setTauxTaxe1(BigDecimal tauxTaxe1) {
		this.tauxTaxe1 = tauxTaxe1;
	}

	public BigDecimal getTauxTaxe2() {
		return this.tauxTaxe2;
	}

	public void setTauxTaxe2(BigDecimal tauxTaxe2) {
		this.tauxTaxe2 = tauxTaxe2;
	}

	public String getTypeFactureLigne() {
		return this.typeFactureLigne;
	}

	public void setTypeFactureLigne(String typeFactureLigne) {
		this.typeFactureLigne = typeFactureLigne;
	}

	public BigDecimal getValeurCharges() {
		return this.valeurCharges;
	}

	public void setValeurCharges(BigDecimal valeurCharges) {
		this.valeurCharges = valeurCharges;
	}

	public BigDecimal getValeurRemise() {
		return this.valeurRemise;
	}

	public void setValeurRemise(BigDecimal valeurRemise) {
		this.valeurRemise = valeurRemise;
	}

	public BigDecimal getValeurTaxe1() {
		return this.valeurTaxe1;
	}

	public void setValeurTaxe1(BigDecimal valeurTaxe1) {
		this.valeurTaxe1 = valeurTaxe1;
	}

	public BigDecimal getValeurTaxe2() {
		return this.valeurTaxe2;
	}

	public void setValeurTaxe2(BigDecimal valeurTaxe2) {
		this.valeurTaxe2 = valeurTaxe2;
	}

	public Timestamp getVersion() {
		return this.version;
	}

	public void setVersion(Timestamp version) {
		this.version = version;
	}

	public List<AchatArrivageFactureAchatItem> getAchatArrivageFactureAchatItems() {
		return this.achatArrivageFactureAchatItems;
	}

	public void setAchatArrivageFactureAchatItems(List<AchatArrivageFactureAchatItem> achatArrivageFactureAchatItems) {
		this.achatArrivageFactureAchatItems = achatArrivageFactureAchatItems;
	}

	public AchatArrivageFactureAchatItem addAchatArrivageFactureAchatItem(AchatArrivageFactureAchatItem achatArrivageFactureAchatItem) {
		getAchatArrivageFactureAchatItems().add(achatArrivageFactureAchatItem);
		achatArrivageFactureAchatItem.setAchatFactureLigne(this);

		return achatArrivageFactureAchatItem;
	}

	public AchatArrivageFactureAchatItem removeAchatArrivageFactureAchatItem(AchatArrivageFactureAchatItem achatArrivageFactureAchatItem) {
		getAchatArrivageFactureAchatItems().remove(achatArrivageFactureAchatItem);
		achatArrivageFactureAchatItem.setAchatFactureLigne(null);

		return achatArrivageFactureAchatItem;
	}

	public List<AchatArrivageFactureFraisItem> getAchatArrivageFactureFraisItems() {
		return this.achatArrivageFactureFraisItems;
	}

	public void setAchatArrivageFactureFraisItems(List<AchatArrivageFactureFraisItem> achatArrivageFactureFraisItems) {
		this.achatArrivageFactureFraisItems = achatArrivageFactureFraisItems;
	}

	public AchatArrivageFactureFraisItem addAchatArrivageFactureFraisItem(AchatArrivageFactureFraisItem achatArrivageFactureFraisItem) {
		getAchatArrivageFactureFraisItems().add(achatArrivageFactureFraisItem);
		achatArrivageFactureFraisItem.setAchatFactureLigne(this);

		return achatArrivageFactureFraisItem;
	}

	public AchatArrivageFactureFraisItem removeAchatArrivageFactureFraisItem(AchatArrivageFactureFraisItem achatArrivageFactureFraisItem) {
		getAchatArrivageFactureFraisItems().remove(achatArrivageFactureFraisItem);
		achatArrivageFactureFraisItem.setAchatFactureLigne(null);

		return achatArrivageFactureFraisItem;
	}

	public List<AchatEngagementFactureFraisItem> getAchatEngagementFactureFraisItems() {
		return this.achatEngagementFactureFraisItems;
	}

	public void setAchatEngagementFactureFraisItems(List<AchatEngagementFactureFraisItem> achatEngagementFactureFraisItems) {
		this.achatEngagementFactureFraisItems = achatEngagementFactureFraisItems;
	}

	public AchatEngagementFactureFraisItem addAchatEngagementFactureFraisItem(AchatEngagementFactureFraisItem achatEngagementFactureFraisItem) {
		getAchatEngagementFactureFraisItems().add(achatEngagementFactureFraisItem);
		achatEngagementFactureFraisItem.setAchatFactureLigne(this);

		return achatEngagementFactureFraisItem;
	}

	public AchatEngagementFactureFraisItem removeAchatEngagementFactureFraisItem(AchatEngagementFactureFraisItem achatEngagementFactureFraisItem) {
		getAchatEngagementFactureFraisItems().remove(achatEngagementFactureFraisItem);
		achatEngagementFactureFraisItem.setAchatFactureLigne(null);

		return achatEngagementFactureFraisItem;
	}

	public AchatEngagementItem getAchatEngagementItem() {
		return this.achatEngagementItem;
	}

	public void setAchatEngagementItem(AchatEngagementItem achatEngagementItem) {
		this.achatEngagementItem = achatEngagementItem;
	}

	public AchatFacture getAchatFacture() {
		return this.achatFacture;
	}

	public void setAchatFacture(AchatFacture achatFacture) {
		this.achatFacture = achatFacture;
	}

	public List<AchatFactureLigneCentreCharge> getAchatFactureLigneCentreCharges() {
		return this.achatFactureLigneCentreCharges;
	}

	public void setAchatFactureLigneCentreCharges(List<AchatFactureLigneCentreCharge> achatFactureLigneCentreCharges) {
		this.achatFactureLigneCentreCharges = achatFactureLigneCentreCharges;
	}

	public AchatFactureLigneCentreCharge addAchatFactureLigneCentreCharge(AchatFactureLigneCentreCharge achatFactureLigneCentreCharge) {
		getAchatFactureLigneCentreCharges().add(achatFactureLigneCentreCharge);
		achatFactureLigneCentreCharge.setAchatFactureLigne(this);

		return achatFactureLigneCentreCharge;
	}

	public AchatFactureLigneCentreCharge removeAchatFactureLigneCentreCharge(AchatFactureLigneCentreCharge achatFactureLigneCentreCharge) {
		getAchatFactureLigneCentreCharges().remove(achatFactureLigneCentreCharge);
		achatFactureLigneCentreCharge.setAchatFactureLigne(null);

		return achatFactureLigneCentreCharge;
	}

	public List<AchatLivraisonFactureFraisItem> getAchatLivraisonFactureFraisItems() {
		return this.achatLivraisonFactureFraisItems;
	}

	public void setAchatLivraisonFactureFraisItems(List<AchatLivraisonFactureFraisItem> achatLivraisonFactureFraisItems) {
		this.achatLivraisonFactureFraisItems = achatLivraisonFactureFraisItems;
	}

	public AchatLivraisonFactureFraisItem addAchatLivraisonFactureFraisItem(AchatLivraisonFactureFraisItem achatLivraisonFactureFraisItem) {
		getAchatLivraisonFactureFraisItems().add(achatLivraisonFactureFraisItem);
		achatLivraisonFactureFraisItem.setAchatFactureLigne(this);

		return achatLivraisonFactureFraisItem;
	}

	public AchatLivraisonFactureFraisItem removeAchatLivraisonFactureFraisItem(AchatLivraisonFactureFraisItem achatLivraisonFactureFraisItem) {
		getAchatLivraisonFactureFraisItems().remove(achatLivraisonFactureFraisItem);
		achatLivraisonFactureFraisItem.setAchatFactureLigne(null);

		return achatLivraisonFactureFraisItem;
	}

	public List<AchatLivraisonItemFactureAchat> getAchatLivraisonItemFactureAchats() {
		return this.achatLivraisonItemFactureAchats;
	}

	public void setAchatLivraisonItemFactureAchats(List<AchatLivraisonItemFactureAchat> achatLivraisonItemFactureAchats) {
		this.achatLivraisonItemFactureAchats = achatLivraisonItemFactureAchats;
	}

	public AchatLivraisonItemFactureAchat addAchatLivraisonItemFactureAchat(AchatLivraisonItemFactureAchat achatLivraisonItemFactureAchat) {
		getAchatLivraisonItemFactureAchats().add(achatLivraisonItemFactureAchat);
		achatLivraisonItemFactureAchat.setAchatFactureLigne(this);

		return achatLivraisonItemFactureAchat;
	}

	public AchatLivraisonItemFactureAchat removeAchatLivraisonItemFactureAchat(AchatLivraisonItemFactureAchat achatLivraisonItemFactureAchat) {
		getAchatLivraisonItemFactureAchats().remove(achatLivraisonItemFactureAchat);
		achatLivraisonItemFactureAchat.setAchatFactureLigne(null);

		return achatLivraisonItemFactureAchat;
	}

}