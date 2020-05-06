package com.microservices.elit.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the achat_demande_prix_fille_item database table.
 * 
 */
@Entity
@Table(name="achat_demande_prix_fille_item")
@NamedQuery(name="AchatDemandePrixFilleItem.findAll", query="SELECT a FROM AchatDemandePrixFilleItem a")
public class AchatDemandePrixFilleItem implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;

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

	@Column(name="id_reference_fournisseur")
	private Long idReferenceFournisseur;

	@Column(name="id_taxe1")
	private Long idTaxe1;

	@Column(name="id_taxe2")
	private Long idTaxe2;

	@Column(name="id_unite_delais_exec")
	private Long idUniteDelaisExec;

	@Column(name="id_unite_organisationnelle_createur")
	private Long idUniteOrganisationnelleCreateur;

	@Column(name="is_disponible")
	private Boolean isDisponible;

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

	//bi-directional many-to-one association to AchatDemandePrixFille
	@ManyToOne
	@JoinColumn(name="id_demande_prix", insertable=false, updatable=false)
	private AchatDemandePrixFille achatDemandePrixFille;

	//bi-directional many-to-one association to AchatDemandePrixFilleItemCentreCharge
	@OneToMany(mappedBy="achatDemandePrixFilleItem")
	private List<AchatDemandePrixFilleItemCentreCharge> achatDemandePrixFilleItemCentreCharges;

	//bi-directional many-to-one association to AchatDemandePrixFilleItemMagasin
	@OneToMany(mappedBy="achatDemandePrixFilleItem")
	private List<AchatDemandePrixFilleItemMagasin> achatDemandePrixFilleItemMagasins;

	public AchatDemandePrixFilleItem() {
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

	public Long getIdUniteDelaisExec() {
		return this.idUniteDelaisExec;
	}

	public void setIdUniteDelaisExec(Long idUniteDelaisExec) {
		this.idUniteDelaisExec = idUniteDelaisExec;
	}

	public Long getIdUniteOrganisationnelleCreateur() {
		return this.idUniteOrganisationnelleCreateur;
	}

	public void setIdUniteOrganisationnelleCreateur(Long idUniteOrganisationnelleCreateur) {
		this.idUniteOrganisationnelleCreateur = idUniteOrganisationnelleCreateur;
	}

	public Boolean getIsDisponible() {
		return this.isDisponible;
	}

	public void setIsDisponible(Boolean isDisponible) {
		this.isDisponible = isDisponible;
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

	public AchatDemandePrixFille getAchatDemandePrixFille() {
		return this.achatDemandePrixFille;
	}

	public void setAchatDemandePrixFille(AchatDemandePrixFille achatDemandePrixFille) {
		this.achatDemandePrixFille = achatDemandePrixFille;
	}

	public List<AchatDemandePrixFilleItemCentreCharge> getAchatDemandePrixFilleItemCentreCharges() {
		return this.achatDemandePrixFilleItemCentreCharges;
	}

	public void setAchatDemandePrixFilleItemCentreCharges(List<AchatDemandePrixFilleItemCentreCharge> achatDemandePrixFilleItemCentreCharges) {
		this.achatDemandePrixFilleItemCentreCharges = achatDemandePrixFilleItemCentreCharges;
	}

	public AchatDemandePrixFilleItemCentreCharge addAchatDemandePrixFilleItemCentreCharge(AchatDemandePrixFilleItemCentreCharge achatDemandePrixFilleItemCentreCharge) {
		getAchatDemandePrixFilleItemCentreCharges().add(achatDemandePrixFilleItemCentreCharge);
		achatDemandePrixFilleItemCentreCharge.setAchatDemandePrixFilleItem(this);

		return achatDemandePrixFilleItemCentreCharge;
	}

	public AchatDemandePrixFilleItemCentreCharge removeAchatDemandePrixFilleItemCentreCharge(AchatDemandePrixFilleItemCentreCharge achatDemandePrixFilleItemCentreCharge) {
		getAchatDemandePrixFilleItemCentreCharges().remove(achatDemandePrixFilleItemCentreCharge);
		achatDemandePrixFilleItemCentreCharge.setAchatDemandePrixFilleItem(null);

		return achatDemandePrixFilleItemCentreCharge;
	}

	public List<AchatDemandePrixFilleItemMagasin> getAchatDemandePrixFilleItemMagasins() {
		return this.achatDemandePrixFilleItemMagasins;
	}

	public void setAchatDemandePrixFilleItemMagasins(List<AchatDemandePrixFilleItemMagasin> achatDemandePrixFilleItemMagasins) {
		this.achatDemandePrixFilleItemMagasins = achatDemandePrixFilleItemMagasins;
	}

	public AchatDemandePrixFilleItemMagasin addAchatDemandePrixFilleItemMagasin(AchatDemandePrixFilleItemMagasin achatDemandePrixFilleItemMagasin) {
		getAchatDemandePrixFilleItemMagasins().add(achatDemandePrixFilleItemMagasin);
		achatDemandePrixFilleItemMagasin.setAchatDemandePrixFilleItem(this);

		return achatDemandePrixFilleItemMagasin;
	}

	public AchatDemandePrixFilleItemMagasin removeAchatDemandePrixFilleItemMagasin(AchatDemandePrixFilleItemMagasin achatDemandePrixFilleItemMagasin) {
		getAchatDemandePrixFilleItemMagasins().remove(achatDemandePrixFilleItemMagasin);
		achatDemandePrixFilleItemMagasin.setAchatDemandePrixFilleItem(null);

		return achatDemandePrixFilleItemMagasin;
	}

}