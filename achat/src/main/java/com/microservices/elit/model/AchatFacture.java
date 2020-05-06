package com.microservices.elit.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the achat_facture database table.
 * 
 */
@Entity
@Table(name="achat_facture")
@NamedQuery(name="AchatFacture.findAll", query="SELECT a FROM AchatFacture a")
public class AchatFacture implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;

	private Boolean active;

	private String code;

	@Column(name="code_filiale_engagement")
	private String codeFilialeEngagement;

	@Column(name="creer_le")
	private Timestamp creerLe;

	@Column(name="creer_par")
	private Long creerPar;

	@Column(name="date_confirmation")
	private Timestamp dateConfirmation;

	@Temporal(TemporalType.DATE)
	@Column(name="date_facture")
	private Date dateFacture;

	@Temporal(TemporalType.DATE)
	@Column(name="date_facture_reception")
	private Date dateFactureReception;

	@Column(name="delai_paiement")
	private Integer delaiPaiement;

	private String etat;

	@Column(name="formule_calcul_penalite")
	private String formuleCalculPenalite;

	@Column(name="id_correction")
	private Integer idCorrection;

	@Column(name="id_devise")
	private Long idDevise;

	@Column(name="id_fournisseur")
	private Long idFournisseur;

	@Column(name="id_frais_autre_charge")
	private Long idFraisAutreCharge;

	@Column(name="id_from_engagement")
	private String idFromEngagement;

	@Column(name="id_taxe1")
	private Long idTaxe1;

	@Column(name="id_taxe2")
	private Long idTaxe2;

	@Column(name="id_unite_organisationnelle_appartenance")
	private Long idUniteOrganisationnelleAppartenance;

	@Column(name="id_unite_organisationnelle_createur")
	private Long idUniteOrganisationnelleCreateur;

	private Boolean integre;

	@Column(name="is_calcul_avec_remise")
	private Boolean isCalculAvecRemise;

	@Column(name="is_from_engagement")
	private Boolean isFromEngagement;

	@Column(name="is_repartition_remise_equitable")
	private Boolean isRepartitionRemiseEquitable;

	@Column(name="mode_calcul_charge")
	private String modeCalculCharge;

	@Column(name="mode_calcul_taxe")
	private String modeCalculTaxe;

	@Column(name="modifier_le")
	private Timestamp modifierLe;

	@Column(name="modifier_par")
	private Long modifierPar;

	private BigDecimal montant;

	@Column(name="montant_brut_restant")
	private BigDecimal montantBrutRestant;

	@Column(name="montant_ttc")
	private BigDecimal montantTtc;

	@Column(name="motif_annulation")
	private String motifAnnulation;

	private String objet;

	private String observation;

	@Column(name="pourcentage_restant")
	private BigDecimal pourcentageRestant;

	private Long seq;

	@Column(name="taux_change")
	private BigDecimal tauxChange;

	@Column(name="taux_charges")
	private BigDecimal tauxCharges;

	@Column(name="taux_realisation")
	private BigDecimal tauxRealisation;

	@Column(name="taux_reception")
	private BigDecimal tauxReception;

	@Column(name="taux_remise")
	private BigDecimal tauxRemise;

	@Column(name="taux_taxe1")
	private BigDecimal tauxTaxe1;

	@Column(name="taux_taxe2")
	private BigDecimal tauxTaxe2;

	@Column(name="type_facture")
	private String typeFacture;

	@Column(name="unite_delai_paiement")
	private Long uniteDelaiPaiement;

	@Column(name="valeur_autre_retenue")
	private BigDecimal valeurAutreRetenue;

	@Column(name="valeur_charges")
	private BigDecimal valeurCharges;

	@Column(name="valeur_penalite")
	private BigDecimal valeurPenalite;

	@Column(name="valeur_remise")
	private BigDecimal valeurRemise;

	@Column(name="valeur_taxe1")
	private BigDecimal valeurTaxe1;

	@Column(name="valeur_taxe2")
	private BigDecimal valeurTaxe2;

	private Timestamp version;

	//bi-directional many-to-one association to AchatArrivageFactureFrai
	@OneToMany(mappedBy="achatFacture")
	private List<AchatArrivageFactureFrai> achatArrivageFactureFrais;

	//bi-directional many-to-one association to AchatEngagementFactureFrai
	@OneToMany(mappedBy="achatFacture")
	private List<AchatEngagementFactureFrai> achatEngagementFactureFrais;

	//bi-directional many-to-many association to AchatArrivage
	@ManyToMany
	@JoinTable(
		name="achat_arrivage_facture_achat"
		, joinColumns={
			@JoinColumn(name="id_facture_achat")
			}
		, inverseJoinColumns={
			@JoinColumn(name="id_arrivage")
			}
		)
	private List<AchatArrivage> achatArrivages1;

	//bi-directional many-to-many association to AchatArrivage
	@ManyToMany
	@JoinTable(
		name="achat_arrivage_facture_achat_engagement"
		, joinColumns={
			@JoinColumn(name="id_facture_achat")
			}
		, inverseJoinColumns={
			@JoinColumn(name="id_arrivage")
			}
		)
	private List<AchatArrivage> achatArrivages2;

	//bi-directional many-to-one association to AchatEngagement
	@ManyToOne
	@JoinColumn(name="id_engagement", insertable=false, updatable=false)
	private AchatEngagement achatEngagement;

	//bi-directional many-to-many association to AchatEngagement
	@ManyToMany
	@JoinTable(
		name="achat_facture_achat_commande"
		, joinColumns={
			@JoinColumn(name="id_facture")
			}
		, inverseJoinColumns={
			@JoinColumn(name="id_commande")
			}
		)
	private List<AchatEngagement> achatEngagements1;

	//bi-directional many-to-many association to AchatEngagement
	@ManyToMany
	@JoinTable(
		name="achat_facture_commande"
		, joinColumns={
			@JoinColumn(name="id_facture")
			}
		, inverseJoinColumns={
			@JoinColumn(name="id_commande")
			}
		)
	private List<AchatEngagement> achatEngagements2;

	//bi-directional many-to-one association to DbaModePaiement
	@ManyToOne
	@JoinColumn(name="id_mode_paiement", insertable=false, updatable=false)
	private DbaModePaiement dbaModePaiement;

	//bi-directional many-to-one association to AchatFactureCentreCharge
	@OneToMany(mappedBy="achatFacture")
	private List<AchatFactureCentreCharge> achatFactureCentreCharges;

	//bi-directional many-to-one association to AchatFactureCommandeItem
	@OneToMany(mappedBy="achatFacture")
	private List<AchatFactureCommandeItem> achatFactureCommandeItems;

	//bi-directional many-to-one association to AchatFactureLigne
	@OneToMany(mappedBy="achatFacture")
	private List<AchatFactureLigne> achatFactureLignes;

	//bi-directional many-to-many association to AchatLivraison
	@ManyToMany(mappedBy="achatFactures")
	private List<AchatLivraison> achatLivraisons;

	//bi-directional many-to-one association to AchatLivraisonFactureFrai
	@OneToMany(mappedBy="achatFacture")
	private List<AchatLivraisonFactureFrai> achatLivraisonFactureFrais;

	//bi-directional many-to-one association to VisibiliteModuleAchatFacture
	@OneToMany(mappedBy="achatFacture")
	private List<VisibiliteModuleAchatFacture> visibiliteModuleAchatFactures;

	//bi-directional many-to-one association to VisibiliteProfilAchatFacture
	@OneToMany(mappedBy="achatFacture")
	private List<VisibiliteProfilAchatFacture> visibiliteProfilAchatFactures;

	//bi-directional many-to-one association to VisibiliteUniteAchatFacture
	@OneToMany(mappedBy="achatFacture")
	private List<VisibiliteUniteAchatFacture> visibiliteUniteAchatFactures;

	public AchatFacture() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Boolean getActive() {
		return this.active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getCodeFilialeEngagement() {
		return this.codeFilialeEngagement;
	}

	public void setCodeFilialeEngagement(String codeFilialeEngagement) {
		this.codeFilialeEngagement = codeFilialeEngagement;
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

	public Timestamp getDateConfirmation() {
		return this.dateConfirmation;
	}

	public void setDateConfirmation(Timestamp dateConfirmation) {
		this.dateConfirmation = dateConfirmation;
	}

	public Date getDateFacture() {
		return this.dateFacture;
	}

	public void setDateFacture(Date dateFacture) {
		this.dateFacture = dateFacture;
	}

	public Date getDateFactureReception() {
		return this.dateFactureReception;
	}

	public void setDateFactureReception(Date dateFactureReception) {
		this.dateFactureReception = dateFactureReception;
	}

	public Integer getDelaiPaiement() {
		return this.delaiPaiement;
	}

	public void setDelaiPaiement(Integer delaiPaiement) {
		this.delaiPaiement = delaiPaiement;
	}

	public String getEtat() {
		return this.etat;
	}

	public void setEtat(String etat) {
		this.etat = etat;
	}

	public String getFormuleCalculPenalite() {
		return this.formuleCalculPenalite;
	}

	public void setFormuleCalculPenalite(String formuleCalculPenalite) {
		this.formuleCalculPenalite = formuleCalculPenalite;
	}

	public Integer getIdCorrection() {
		return this.idCorrection;
	}

	public void setIdCorrection(Integer idCorrection) {
		this.idCorrection = idCorrection;
	}

	public Long getIdDevise() {
		return this.idDevise;
	}

	public void setIdDevise(Long idDevise) {
		this.idDevise = idDevise;
	}

	public Long getIdFournisseur() {
		return this.idFournisseur;
	}

	public void setIdFournisseur(Long idFournisseur) {
		this.idFournisseur = idFournisseur;
	}

	public Long getIdFraisAutreCharge() {
		return this.idFraisAutreCharge;
	}

	public void setIdFraisAutreCharge(Long idFraisAutreCharge) {
		this.idFraisAutreCharge = idFraisAutreCharge;
	}

	public String getIdFromEngagement() {
		return this.idFromEngagement;
	}

	public void setIdFromEngagement(String idFromEngagement) {
		this.idFromEngagement = idFromEngagement;
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

	public Long getIdUniteOrganisationnelleAppartenance() {
		return this.idUniteOrganisationnelleAppartenance;
	}

	public void setIdUniteOrganisationnelleAppartenance(Long idUniteOrganisationnelleAppartenance) {
		this.idUniteOrganisationnelleAppartenance = idUniteOrganisationnelleAppartenance;
	}

	public Long getIdUniteOrganisationnelleCreateur() {
		return this.idUniteOrganisationnelleCreateur;
	}

	public void setIdUniteOrganisationnelleCreateur(Long idUniteOrganisationnelleCreateur) {
		this.idUniteOrganisationnelleCreateur = idUniteOrganisationnelleCreateur;
	}

	public Boolean getIntegre() {
		return this.integre;
	}

	public void setIntegre(Boolean integre) {
		this.integre = integre;
	}

	public Boolean getIsCalculAvecRemise() {
		return this.isCalculAvecRemise;
	}

	public void setIsCalculAvecRemise(Boolean isCalculAvecRemise) {
		this.isCalculAvecRemise = isCalculAvecRemise;
	}

	public Boolean getIsFromEngagement() {
		return this.isFromEngagement;
	}

	public void setIsFromEngagement(Boolean isFromEngagement) {
		this.isFromEngagement = isFromEngagement;
	}

	public Boolean getIsRepartitionRemiseEquitable() {
		return this.isRepartitionRemiseEquitable;
	}

	public void setIsRepartitionRemiseEquitable(Boolean isRepartitionRemiseEquitable) {
		this.isRepartitionRemiseEquitable = isRepartitionRemiseEquitable;
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

	public BigDecimal getMontantBrutRestant() {
		return this.montantBrutRestant;
	}

	public void setMontantBrutRestant(BigDecimal montantBrutRestant) {
		this.montantBrutRestant = montantBrutRestant;
	}

	public BigDecimal getMontantTtc() {
		return this.montantTtc;
	}

	public void setMontantTtc(BigDecimal montantTtc) {
		this.montantTtc = montantTtc;
	}

	public String getMotifAnnulation() {
		return this.motifAnnulation;
	}

	public void setMotifAnnulation(String motifAnnulation) {
		this.motifAnnulation = motifAnnulation;
	}

	public String getObjet() {
		return this.objet;
	}

	public void setObjet(String objet) {
		this.objet = objet;
	}

	public String getObservation() {
		return this.observation;
	}

	public void setObservation(String observation) {
		this.observation = observation;
	}

	public BigDecimal getPourcentageRestant() {
		return this.pourcentageRestant;
	}

	public void setPourcentageRestant(BigDecimal pourcentageRestant) {
		this.pourcentageRestant = pourcentageRestant;
	}

	public Long getSeq() {
		return this.seq;
	}

	public void setSeq(Long seq) {
		this.seq = seq;
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

	public BigDecimal getTauxRealisation() {
		return this.tauxRealisation;
	}

	public void setTauxRealisation(BigDecimal tauxRealisation) {
		this.tauxRealisation = tauxRealisation;
	}

	public BigDecimal getTauxReception() {
		return this.tauxReception;
	}

	public void setTauxReception(BigDecimal tauxReception) {
		this.tauxReception = tauxReception;
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

	public String getTypeFacture() {
		return this.typeFacture;
	}

	public void setTypeFacture(String typeFacture) {
		this.typeFacture = typeFacture;
	}

	public Long getUniteDelaiPaiement() {
		return this.uniteDelaiPaiement;
	}

	public void setUniteDelaiPaiement(Long uniteDelaiPaiement) {
		this.uniteDelaiPaiement = uniteDelaiPaiement;
	}

	public BigDecimal getValeurAutreRetenue() {
		return this.valeurAutreRetenue;
	}

	public void setValeurAutreRetenue(BigDecimal valeurAutreRetenue) {
		this.valeurAutreRetenue = valeurAutreRetenue;
	}

	public BigDecimal getValeurCharges() {
		return this.valeurCharges;
	}

	public void setValeurCharges(BigDecimal valeurCharges) {
		this.valeurCharges = valeurCharges;
	}

	public BigDecimal getValeurPenalite() {
		return this.valeurPenalite;
	}

	public void setValeurPenalite(BigDecimal valeurPenalite) {
		this.valeurPenalite = valeurPenalite;
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

	public List<AchatArrivageFactureFrai> getAchatArrivageFactureFrais() {
		return this.achatArrivageFactureFrais;
	}

	public void setAchatArrivageFactureFrais(List<AchatArrivageFactureFrai> achatArrivageFactureFrais) {
		this.achatArrivageFactureFrais = achatArrivageFactureFrais;
	}

	public AchatArrivageFactureFrai addAchatArrivageFactureFrai(AchatArrivageFactureFrai achatArrivageFactureFrai) {
		getAchatArrivageFactureFrais().add(achatArrivageFactureFrai);
		achatArrivageFactureFrai.setAchatFacture(this);

		return achatArrivageFactureFrai;
	}

	public AchatArrivageFactureFrai removeAchatArrivageFactureFrai(AchatArrivageFactureFrai achatArrivageFactureFrai) {
		getAchatArrivageFactureFrais().remove(achatArrivageFactureFrai);
		achatArrivageFactureFrai.setAchatFacture(null);

		return achatArrivageFactureFrai;
	}

	public List<AchatEngagementFactureFrai> getAchatEngagementFactureFrais() {
		return this.achatEngagementFactureFrais;
	}

	public void setAchatEngagementFactureFrais(List<AchatEngagementFactureFrai> achatEngagementFactureFrais) {
		this.achatEngagementFactureFrais = achatEngagementFactureFrais;
	}

	public AchatEngagementFactureFrai addAchatEngagementFactureFrai(AchatEngagementFactureFrai achatEngagementFactureFrai) {
		getAchatEngagementFactureFrais().add(achatEngagementFactureFrai);
		achatEngagementFactureFrai.setAchatFacture(this);

		return achatEngagementFactureFrai;
	}

	public AchatEngagementFactureFrai removeAchatEngagementFactureFrai(AchatEngagementFactureFrai achatEngagementFactureFrai) {
		getAchatEngagementFactureFrais().remove(achatEngagementFactureFrai);
		achatEngagementFactureFrai.setAchatFacture(null);

		return achatEngagementFactureFrai;
	}

	public List<AchatArrivage> getAchatArrivages1() {
		return this.achatArrivages1;
	}

	public void setAchatArrivages1(List<AchatArrivage> achatArrivages1) {
		this.achatArrivages1 = achatArrivages1;
	}

	public List<AchatArrivage> getAchatArrivages2() {
		return this.achatArrivages2;
	}

	public void setAchatArrivages2(List<AchatArrivage> achatArrivages2) {
		this.achatArrivages2 = achatArrivages2;
	}

	public AchatEngagement getAchatEngagement() {
		return this.achatEngagement;
	}

	public void setAchatEngagement(AchatEngagement achatEngagement) {
		this.achatEngagement = achatEngagement;
	}

	public List<AchatEngagement> getAchatEngagements1() {
		return this.achatEngagements1;
	}

	public void setAchatEngagements1(List<AchatEngagement> achatEngagements1) {
		this.achatEngagements1 = achatEngagements1;
	}

	public List<AchatEngagement> getAchatEngagements2() {
		return this.achatEngagements2;
	}

	public void setAchatEngagements2(List<AchatEngagement> achatEngagements2) {
		this.achatEngagements2 = achatEngagements2;
	}

	public DbaModePaiement getDbaModePaiement() {
		return this.dbaModePaiement;
	}

	public void setDbaModePaiement(DbaModePaiement dbaModePaiement) {
		this.dbaModePaiement = dbaModePaiement;
	}

	public List<AchatFactureCentreCharge> getAchatFactureCentreCharges() {
		return this.achatFactureCentreCharges;
	}

	public void setAchatFactureCentreCharges(List<AchatFactureCentreCharge> achatFactureCentreCharges) {
		this.achatFactureCentreCharges = achatFactureCentreCharges;
	}

	public AchatFactureCentreCharge addAchatFactureCentreCharge(AchatFactureCentreCharge achatFactureCentreCharge) {
		getAchatFactureCentreCharges().add(achatFactureCentreCharge);
		achatFactureCentreCharge.setAchatFacture(this);

		return achatFactureCentreCharge;
	}

	public AchatFactureCentreCharge removeAchatFactureCentreCharge(AchatFactureCentreCharge achatFactureCentreCharge) {
		getAchatFactureCentreCharges().remove(achatFactureCentreCharge);
		achatFactureCentreCharge.setAchatFacture(null);

		return achatFactureCentreCharge;
	}

	public List<AchatFactureCommandeItem> getAchatFactureCommandeItems() {
		return this.achatFactureCommandeItems;
	}

	public void setAchatFactureCommandeItems(List<AchatFactureCommandeItem> achatFactureCommandeItems) {
		this.achatFactureCommandeItems = achatFactureCommandeItems;
	}

	public AchatFactureCommandeItem addAchatFactureCommandeItem(AchatFactureCommandeItem achatFactureCommandeItem) {
		getAchatFactureCommandeItems().add(achatFactureCommandeItem);
		achatFactureCommandeItem.setAchatFacture(this);

		return achatFactureCommandeItem;
	}

	public AchatFactureCommandeItem removeAchatFactureCommandeItem(AchatFactureCommandeItem achatFactureCommandeItem) {
		getAchatFactureCommandeItems().remove(achatFactureCommandeItem);
		achatFactureCommandeItem.setAchatFacture(null);

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
		achatFactureLigne.setAchatFacture(this);

		return achatFactureLigne;
	}

	public AchatFactureLigne removeAchatFactureLigne(AchatFactureLigne achatFactureLigne) {
		getAchatFactureLignes().remove(achatFactureLigne);
		achatFactureLigne.setAchatFacture(null);

		return achatFactureLigne;
	}

	public List<AchatLivraison> getAchatLivraisons() {
		return this.achatLivraisons;
	}

	public void setAchatLivraisons(List<AchatLivraison> achatLivraisons) {
		this.achatLivraisons = achatLivraisons;
	}

	public List<AchatLivraisonFactureFrai> getAchatLivraisonFactureFrais() {
		return this.achatLivraisonFactureFrais;
	}

	public void setAchatLivraisonFactureFrais(List<AchatLivraisonFactureFrai> achatLivraisonFactureFrais) {
		this.achatLivraisonFactureFrais = achatLivraisonFactureFrais;
	}

	public AchatLivraisonFactureFrai addAchatLivraisonFactureFrai(AchatLivraisonFactureFrai achatLivraisonFactureFrai) {
		getAchatLivraisonFactureFrais().add(achatLivraisonFactureFrai);
		achatLivraisonFactureFrai.setAchatFacture(this);

		return achatLivraisonFactureFrai;
	}

	public AchatLivraisonFactureFrai removeAchatLivraisonFactureFrai(AchatLivraisonFactureFrai achatLivraisonFactureFrai) {
		getAchatLivraisonFactureFrais().remove(achatLivraisonFactureFrai);
		achatLivraisonFactureFrai.setAchatFacture(null);

		return achatLivraisonFactureFrai;
	}

	public List<VisibiliteModuleAchatFacture> getVisibiliteModuleAchatFactures() {
		return this.visibiliteModuleAchatFactures;
	}

	public void setVisibiliteModuleAchatFactures(List<VisibiliteModuleAchatFacture> visibiliteModuleAchatFactures) {
		this.visibiliteModuleAchatFactures = visibiliteModuleAchatFactures;
	}

	public VisibiliteModuleAchatFacture addVisibiliteModuleAchatFacture(VisibiliteModuleAchatFacture visibiliteModuleAchatFacture) {
		getVisibiliteModuleAchatFactures().add(visibiliteModuleAchatFacture);
		visibiliteModuleAchatFacture.setAchatFacture(this);

		return visibiliteModuleAchatFacture;
	}

	public VisibiliteModuleAchatFacture removeVisibiliteModuleAchatFacture(VisibiliteModuleAchatFacture visibiliteModuleAchatFacture) {
		getVisibiliteModuleAchatFactures().remove(visibiliteModuleAchatFacture);
		visibiliteModuleAchatFacture.setAchatFacture(null);

		return visibiliteModuleAchatFacture;
	}

	public List<VisibiliteProfilAchatFacture> getVisibiliteProfilAchatFactures() {
		return this.visibiliteProfilAchatFactures;
	}

	public void setVisibiliteProfilAchatFactures(List<VisibiliteProfilAchatFacture> visibiliteProfilAchatFactures) {
		this.visibiliteProfilAchatFactures = visibiliteProfilAchatFactures;
	}

	public VisibiliteProfilAchatFacture addVisibiliteProfilAchatFacture(VisibiliteProfilAchatFacture visibiliteProfilAchatFacture) {
		getVisibiliteProfilAchatFactures().add(visibiliteProfilAchatFacture);
		visibiliteProfilAchatFacture.setAchatFacture(this);

		return visibiliteProfilAchatFacture;
	}

	public VisibiliteProfilAchatFacture removeVisibiliteProfilAchatFacture(VisibiliteProfilAchatFacture visibiliteProfilAchatFacture) {
		getVisibiliteProfilAchatFactures().remove(visibiliteProfilAchatFacture);
		visibiliteProfilAchatFacture.setAchatFacture(null);

		return visibiliteProfilAchatFacture;
	}

	public List<VisibiliteUniteAchatFacture> getVisibiliteUniteAchatFactures() {
		return this.visibiliteUniteAchatFactures;
	}

	public void setVisibiliteUniteAchatFactures(List<VisibiliteUniteAchatFacture> visibiliteUniteAchatFactures) {
		this.visibiliteUniteAchatFactures = visibiliteUniteAchatFactures;
	}

	public VisibiliteUniteAchatFacture addVisibiliteUniteAchatFacture(VisibiliteUniteAchatFacture visibiliteUniteAchatFacture) {
		getVisibiliteUniteAchatFactures().add(visibiliteUniteAchatFacture);
		visibiliteUniteAchatFacture.setAchatFacture(this);

		return visibiliteUniteAchatFacture;
	}

	public VisibiliteUniteAchatFacture removeVisibiliteUniteAchatFacture(VisibiliteUniteAchatFacture visibiliteUniteAchatFacture) {
		getVisibiliteUniteAchatFactures().remove(visibiliteUniteAchatFacture);
		visibiliteUniteAchatFacture.setAchatFacture(null);

		return visibiliteUniteAchatFacture;
	}

}