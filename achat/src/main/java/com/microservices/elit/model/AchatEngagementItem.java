package com.microservices.elit.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the achat_engagement_item database table.
 * 
 */
@Entity
@Table(name="achat_engagement_item")
@NamedQuery(name="AchatEngagementItem.findAll", query="SELECT a FROM AchatEngagementItem a")
public class AchatEngagementItem implements Serializable {
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

	@Column(name="delai_execution")
	private Integer delaiExecution;

	@Column(name="id_correction")
	private Integer idCorrection;

	@Column(name="id_frais_autre_charge")
	private Long idFraisAutreCharge;

	@Column(name="id_item")
	private Long idItem;

	@Column(name="id_monnaie")
	private Long idMonnaie;

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

	private BigDecimal prix;

	@Column(name="prix_final")
	private BigDecimal prixFinal;

	@Column(name="prix_ttc")
	private BigDecimal prixTtc;

	private BigDecimal quantite;

	@Column(name="quantite_restante_facturee_phy")
	private BigDecimal quantiteRestanteFactureePhy;

	@Column(name="quantite_restante_facturee_theo")
	private BigDecimal quantiteRestanteFactureeTheo;

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

	@Column(name="valeur_charges")
	private BigDecimal valeurCharges;

	@Column(name="valeur_remise")
	private BigDecimal valeurRemise;

	@Column(name="valeur_taxe1")
	private BigDecimal valeurTaxe1;

	@Column(name="valeur_taxe2")
	private BigDecimal valeurTaxe2;

	private Timestamp version;

	//bi-directional many-to-one association to AchatBordereau
	@ManyToOne
	@JoinColumn(name="id_bordereau", insertable=false, updatable=false)
	private AchatBordereau achatBordereau;

	//bi-directional many-to-one association to AchatEngagement
	@ManyToOne
	@JoinColumn(name="id_engagement", insertable=false, updatable=false)
	private AchatEngagement achatEngagement;

	//bi-directional many-to-one association to AchatEngagementItemCentreCharge
	@OneToMany(mappedBy="achatEngagementItem")
	private List<AchatEngagementItemCentreCharge> achatEngagementItemCentreCharges;

	//bi-directional many-to-one association to AchatEngagementItemFactureFraisItem
	@OneToMany(mappedBy="achatEngagementItem")
	private List<AchatEngagementItemFactureFraisItem> achatEngagementItemFactureFraisItems;

	//bi-directional many-to-one association to AchatEngagementItemMagasin
	@OneToMany(mappedBy="achatEngagementItem")
	private List<AchatEngagementItemMagasin> achatEngagementItemMagasins;

	//bi-directional many-to-one association to AchatFactureCommandeItem
	@OneToMany(mappedBy="achatEngagementItem")
	private List<AchatFactureCommandeItem> achatFactureCommandeItems;

	//bi-directional many-to-one association to AchatFactureLigne
	@OneToMany(mappedBy="achatEngagementItem")
	private List<AchatFactureLigne> achatFactureLignes;

	public AchatEngagementItem() {
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

	public Integer getDelaiExecution() {
		return this.delaiExecution;
	}

	public void setDelaiExecution(Integer delaiExecution) {
		this.delaiExecution = delaiExecution;
	}

	public Integer getIdCorrection() {
		return this.idCorrection;
	}

	public void setIdCorrection(Integer idCorrection) {
		this.idCorrection = idCorrection;
	}

	public Long getIdFraisAutreCharge() {
		return this.idFraisAutreCharge;
	}

	public void setIdFraisAutreCharge(Long idFraisAutreCharge) {
		this.idFraisAutreCharge = idFraisAutreCharge;
	}

	public Long getIdItem() {
		return this.idItem;
	}

	public void setIdItem(Long idItem) {
		this.idItem = idItem;
	}

	public Long getIdMonnaie() {
		return this.idMonnaie;
	}

	public void setIdMonnaie(Long idMonnaie) {
		this.idMonnaie = idMonnaie;
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

	public BigDecimal getQuantiteRestanteFactureePhy() {
		return this.quantiteRestanteFactureePhy;
	}

	public void setQuantiteRestanteFactureePhy(BigDecimal quantiteRestanteFactureePhy) {
		this.quantiteRestanteFactureePhy = quantiteRestanteFactureePhy;
	}

	public BigDecimal getQuantiteRestanteFactureeTheo() {
		return this.quantiteRestanteFactureeTheo;
	}

	public void setQuantiteRestanteFactureeTheo(BigDecimal quantiteRestanteFactureeTheo) {
		this.quantiteRestanteFactureeTheo = quantiteRestanteFactureeTheo;
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

	public AchatBordereau getAchatBordereau() {
		return this.achatBordereau;
	}

	public void setAchatBordereau(AchatBordereau achatBordereau) {
		this.achatBordereau = achatBordereau;
	}

	public AchatEngagement getAchatEngagement() {
		return this.achatEngagement;
	}

	public void setAchatEngagement(AchatEngagement achatEngagement) {
		this.achatEngagement = achatEngagement;
	}

	public List<AchatEngagementItemCentreCharge> getAchatEngagementItemCentreCharges() {
		return this.achatEngagementItemCentreCharges;
	}

	public void setAchatEngagementItemCentreCharges(List<AchatEngagementItemCentreCharge> achatEngagementItemCentreCharges) {
		this.achatEngagementItemCentreCharges = achatEngagementItemCentreCharges;
	}

	public AchatEngagementItemCentreCharge addAchatEngagementItemCentreCharge(AchatEngagementItemCentreCharge achatEngagementItemCentreCharge) {
		getAchatEngagementItemCentreCharges().add(achatEngagementItemCentreCharge);
		achatEngagementItemCentreCharge.setAchatEngagementItem(this);

		return achatEngagementItemCentreCharge;
	}

	public AchatEngagementItemCentreCharge removeAchatEngagementItemCentreCharge(AchatEngagementItemCentreCharge achatEngagementItemCentreCharge) {
		getAchatEngagementItemCentreCharges().remove(achatEngagementItemCentreCharge);
		achatEngagementItemCentreCharge.setAchatEngagementItem(null);

		return achatEngagementItemCentreCharge;
	}

	public List<AchatEngagementItemFactureFraisItem> getAchatEngagementItemFactureFraisItems() {
		return this.achatEngagementItemFactureFraisItems;
	}

	public void setAchatEngagementItemFactureFraisItems(List<AchatEngagementItemFactureFraisItem> achatEngagementItemFactureFraisItems) {
		this.achatEngagementItemFactureFraisItems = achatEngagementItemFactureFraisItems;
	}

	public AchatEngagementItemFactureFraisItem addAchatEngagementItemFactureFraisItem(AchatEngagementItemFactureFraisItem achatEngagementItemFactureFraisItem) {
		getAchatEngagementItemFactureFraisItems().add(achatEngagementItemFactureFraisItem);
		achatEngagementItemFactureFraisItem.setAchatEngagementItem(this);

		return achatEngagementItemFactureFraisItem;
	}

	public AchatEngagementItemFactureFraisItem removeAchatEngagementItemFactureFraisItem(AchatEngagementItemFactureFraisItem achatEngagementItemFactureFraisItem) {
		getAchatEngagementItemFactureFraisItems().remove(achatEngagementItemFactureFraisItem);
		achatEngagementItemFactureFraisItem.setAchatEngagementItem(null);

		return achatEngagementItemFactureFraisItem;
	}

	public List<AchatEngagementItemMagasin> getAchatEngagementItemMagasins() {
		return this.achatEngagementItemMagasins;
	}

	public void setAchatEngagementItemMagasins(List<AchatEngagementItemMagasin> achatEngagementItemMagasins) {
		this.achatEngagementItemMagasins = achatEngagementItemMagasins;
	}

	public AchatEngagementItemMagasin addAchatEngagementItemMagasin(AchatEngagementItemMagasin achatEngagementItemMagasin) {
		getAchatEngagementItemMagasins().add(achatEngagementItemMagasin);
		achatEngagementItemMagasin.setAchatEngagementItem(this);

		return achatEngagementItemMagasin;
	}

	public AchatEngagementItemMagasin removeAchatEngagementItemMagasin(AchatEngagementItemMagasin achatEngagementItemMagasin) {
		getAchatEngagementItemMagasins().remove(achatEngagementItemMagasin);
		achatEngagementItemMagasin.setAchatEngagementItem(null);

		return achatEngagementItemMagasin;
	}

	public List<AchatFactureCommandeItem> getAchatFactureCommandeItems() {
		return this.achatFactureCommandeItems;
	}

	public void setAchatFactureCommandeItems(List<AchatFactureCommandeItem> achatFactureCommandeItems) {
		this.achatFactureCommandeItems = achatFactureCommandeItems;
	}

	public AchatFactureCommandeItem addAchatFactureCommandeItem(AchatFactureCommandeItem achatFactureCommandeItem) {
		getAchatFactureCommandeItems().add(achatFactureCommandeItem);
		achatFactureCommandeItem.setAchatEngagementItem(this);

		return achatFactureCommandeItem;
	}

	public AchatFactureCommandeItem removeAchatFactureCommandeItem(AchatFactureCommandeItem achatFactureCommandeItem) {
		getAchatFactureCommandeItems().remove(achatFactureCommandeItem);
		achatFactureCommandeItem.setAchatEngagementItem(null);

		return achatFactureCommandeItem;
	}

	public List<AchatFactureLigne> getAchatFactureLignes() {
		return this.achatFactureLignes;
	}

	public void setAchatFactureLignes(List<AchatFactureLigne> achatFactureLignes) {
		this.achatFactureLignes = achatFactureLignes;
	}

	public AchatFactureLigne addAchatFactureLigne(AchatFactureLigne achatFactureLigne) {
		getAchatFactureLignes().add(achatFactureLigne);
		achatFactureLigne.setAchatEngagementItem(this);

		return achatFactureLigne;
	}

	public AchatFactureLigne removeAchatFactureLigne(AchatFactureLigne achatFactureLigne) {
		getAchatFactureLignes().remove(achatFactureLigne);
		achatFactureLigne.setAchatEngagementItem(null);

		return achatFactureLigne;
	}

}