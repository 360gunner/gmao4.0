package com.microservices.elit.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the achat_engagement database table.
 * 
 */
@Entity
@Table(name="achat_engagement")
@NamedQuery(name="AchatEngagement.findAll", query="SELECT a FROM AchatEngagement a")
public class AchatEngagement implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;

	private String code;

	@Column(name="code_filiale_engagement")
	private String codeFilialeEngagement;

	@Column(name="codification_auto")
	private Boolean codificationAuto;

	@Column(name="creer_le")
	private Timestamp creerLe;

	@Column(name="creer_par")
	private Long creerPar;

	@Column(name="date_cloture")
	private Timestamp dateCloture;

	@Column(name="date_confirmation")
	private Timestamp dateConfirmation;

	@Temporal(TemporalType.DATE)
	@Column(name="date_fin")
	private Date dateFin;

	@Temporal(TemporalType.DATE)
	@Column(name="date_livraison_souhaitee")
	private Date dateLivraisonSouhaitee;

	@Temporal(TemporalType.DATE)
	@Column(name="date_mise_vigueur")
	private Date dateMiseVigueur;

	@Temporal(TemporalType.DATE)
	@Column(name="date_ouv_ldc")
	private Date dateOuvLdc;

	@Temporal(TemporalType.DATE)
	@Column(name="date_signature")
	private Date dateSignature;

	@Column(name="delai_execution")
	private Integer delaiExecution;

	@Column(name="delai_paiement")
	private Integer delaiPaiement;

	private String etat;

	@Column(name="id_correction")
	private Integer idCorrection;

	@Column(name="id_demandeur")
	private Long idDemandeur;

	@Column(name="id_devise1")
	private Long idDevise1;

	@Column(name="id_devise2")
	private Long idDevise2;

	@Column(name="id_fournisseur")
	private Long idFournisseur;

	@Column(name="id_frais_autre_charge")
	private Long idFraisAutreCharge;

	@Column(name="id_monnaie_local")
	private Long idMonnaieLocal;

	@Column(name="id_ordre_travail")
	private Long idOrdreTravail;

	@Column(name="id_pays")
	private Long idPays;

	@Column(name="id_taxe1")
	private Long idTaxe1;

	@Column(name="id_taxe2")
	private Long idTaxe2;

	@Column(name="id_unite_delai_paiement")
	private Long idUniteDelaiPaiement;

	@Column(name="id_unite_delais_exec")
	private Long idUniteDelaisExec;

	@Column(name="id_unite_organisationnelle_appartenance")
	private Long idUniteOrganisationnelleAppartenance;

	@Column(name="id_unite_organisationnelle_createur")
	private Long idUniteOrganisationnelleCreateur;

	@Column(name="include_monnaie_local")
	private Boolean includeMonnaieLocal;

	@Column(name="is_bordereau_obilgatoire")
	private Boolean isBordereauObilgatoire;

	@Column(name="is_calcul_avec_remise")
	private Boolean isCalculAvecRemise;

	@Column(name="is_demande_achat_obligatoire")
	private Boolean isDemandeAchatObligatoire;

	@Column(name="is_from_engagement")
	private Boolean isFromEngagement;

	@Column(name="is_repartition_remise_equitable")
	private Boolean isRepartitionRemiseEquitable;

	@Column(name="is_solde")
	private Boolean isSolde;

	@Column(name="mode_calcul_charge")
	private String modeCalculCharge;

	@Column(name="mode_calcul_taxe")
	private String modeCalculTaxe;

	@Column(name="mode_transport")
	private Integer modeTransport;

	@Column(name="modifier_le")
	private Timestamp modifierLe;

	@Column(name="modifier_par")
	private Long modifierPar;

	private BigDecimal montant;

	@Column(name="montant_autres_charge")
	private BigDecimal montantAutresCharge;

	@Column(name="montant_devise1")
	private BigDecimal montantDevise1;

	@Column(name="montant_devise2")
	private BigDecimal montantDevise2;

	@Column(name="montant_ttc")
	private BigDecimal montantTtc;

	@Column(name="motif_annulation")
	private String motifAnnulation;

	@Column(name="motif_cloture")
	private String motifCloture;

	@Column(name="multiple_devise")
	private Boolean multipleDevise;

	@Column(name="numero_convention")
	private String numeroConvention;

	private String objet;

	private String observation;

	@Column(name="origine_contrat")
	private String origineContrat;

	@Column(name="partie_da")
	private BigDecimal partieDa;

	@Column(name="reference_passation")
	private String referencePassation;

	private String statut;

	@Column(name="taux_change_devise1")
	private BigDecimal tauxChangeDevise1;

	@Column(name="taux_change_devise2")
	private BigDecimal tauxChangeDevise2;

	@Column(name="taux_charges")
	private BigDecimal tauxCharges;

	@Column(name="taux_livraison")
	private BigDecimal tauxLivraison;

	@Column(name="taux_rabais")
	private BigDecimal tauxRabais;

	@Column(name="taux_realisation")
	private BigDecimal tauxRealisation;

	@Column(name="taux_remise")
	private BigDecimal tauxRemise;

	@Column(name="taux_stf")
	private BigDecimal tauxStf;

	@Column(name="taux_taxe1")
	private BigDecimal tauxTaxe1;

	@Column(name="taux_taxe2")
	private BigDecimal tauxTaxe2;

	@Column(name="type_codification")
	private String typeCodification;

	@Column(name="type_commande")
	private String typeCommande;

	@Column(name="type_contrat")
	private String typeContrat;

	@Column(name="type_engagement")
	private String typeEngagement;

	@Column(name="valeur_charges")
	private BigDecimal valeurCharges;

	@Column(name="valeur_rabais")
	private BigDecimal valeurRabais;

	@Column(name="valeur_remise")
	private BigDecimal valeurRemise;

	@Column(name="valeur_taxe1")
	private BigDecimal valeurTaxe1;

	@Column(name="valeur_taxe2")
	private BigDecimal valeurTaxe2;

	private Timestamp version;

	//bi-directional many-to-one association to AchatArrivage
	@OneToMany(mappedBy="achatEngagement")
	private List<AchatArrivage> achatArrivages;

	//bi-directional many-to-one association to AchatBordereau
	@OneToMany(mappedBy="achatEngagement")
	private List<AchatBordereau> achatBordereaus;

	//bi-directional many-to-one association to AchatDemandePrixFille
	@OneToMany(mappedBy="achatEngagement")
	private List<AchatDemandePrixFille> achatDemandePrixFilles;

	//bi-directional many-to-one association to AchatDemandePrixMere
	@OneToMany(mappedBy="achatEngagement")
	private List<AchatDemandePrixMere> achatDemandePrixMeres;

	//bi-directional many-to-one association to AchatDemandePrixFille
	@ManyToOne
	@JoinColumn(name="id_demande_prix", insertable=false, updatable=false)
	private AchatDemandePrixFille achatDemandePrixFille;

	//bi-directional many-to-one association to AchatEngagement
	@ManyToOne
	@JoinColumn(name="id_engagement_source", insertable=false, updatable=false)
	private AchatEngagement achatEngagement;

	//bi-directional many-to-one association to AchatEngagement
	@OneToMany(mappedBy="achatEngagement")
	private List<AchatEngagement> achatEngagements;

	//bi-directional many-to-one association to DbaCritereSelection
	@ManyToOne
	@JoinColumn(name="id_critere_selection", insertable=false, updatable=false)
	private DbaCritereSelection dbaCritereSelection;

	//bi-directional many-to-one association to DbaIncoterm
	@ManyToOne
	@JoinColumn(name="id_incoterm", insertable=false, updatable=false)
	private DbaIncoterm dbaIncoterm;

	//bi-directional many-to-one association to DbaModePaiement
	@ManyToOne
	@JoinColumn(name="id_mode_paiement", insertable=false, updatable=false)
	private DbaModePaiement dbaModePaiement;

	//bi-directional many-to-one association to DbaModePassation
	@ManyToOne
	@JoinColumn(name="id_mode_passation", insertable=false, updatable=false)
	private DbaModePassation dbaModePassation;

	//bi-directional many-to-one association to DbaModeTransport
	@ManyToOne
	@JoinColumn(name="id_mode_transport", insertable=false, updatable=false)
	private DbaModeTransport dbaModeTransport;

	//bi-directional many-to-one association to AchatEngagementCentreCharge
	@OneToMany(mappedBy="achatEngagement")
	private List<AchatEngagementCentreCharge> achatEngagementCentreCharges;

	//bi-directional many-to-one association to AchatEngagementDemandeAchat
	@OneToMany(mappedBy="achatEngagement")
	private List<AchatEngagementDemandeAchat> achatEngagementDemandeAchats;

	//bi-directional many-to-one association to AchatEngagementFactureFrai
	@OneToMany(mappedBy="achatEngagement")
	private List<AchatEngagementFactureFrai> achatEngagementFactureFrais;

	//bi-directional many-to-one association to AchatEngagementItem
	@OneToMany(mappedBy="achatEngagement")
	private List<AchatEngagementItem> achatEngagementItems;

	//bi-directional many-to-one association to AchatEngagementItemDemandeAchat
	@OneToMany(mappedBy="achatEngagement")
	private List<AchatEngagementItemDemandeAchat> achatEngagementItemDemandeAchats;

	//bi-directional many-to-one association to AchatEngagementMagasin
	@OneToMany(mappedBy="achatEngagement")
	private List<AchatEngagementMagasin> achatEngagementMagasins;

	//bi-directional many-to-one association to AchatFacture
	@OneToMany(mappedBy="achatEngagement")
	private List<AchatFacture> achatFactures1;

	//bi-directional many-to-many association to AchatFacture
	@ManyToMany(mappedBy="achatEngagements1")
	private List<AchatFacture> achatFactures2;

	//bi-directional many-to-many association to AchatFacture
	@ManyToMany(mappedBy="achatEngagements2")
	private List<AchatFacture> achatFactures3;

	//bi-directional many-to-one association to AchatLivraison
	@OneToMany(mappedBy="achatEngagement")
	private List<AchatLivraison> achatLivraisons;

	//bi-directional many-to-one association to VisibiliteModuleEngagement
	@OneToMany(mappedBy="achatEngagement")
	private List<VisibiliteModuleEngagement> visibiliteModuleEngagements;

	//bi-directional many-to-one association to VisibiliteProfilEngagement
	@OneToMany(mappedBy="achatEngagement")
	private List<VisibiliteProfilEngagement> visibiliteProfilEngagements;

	//bi-directional many-to-one association to VisibiliteUniteEngagement
	@OneToMany(mappedBy="achatEngagement")
	private List<VisibiliteUniteEngagement> visibiliteUniteEngagements;

	public AchatEngagement() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public Boolean getCodificationAuto() {
		return this.codificationAuto;
	}

	public void setCodificationAuto(Boolean codificationAuto) {
		this.codificationAuto = codificationAuto;
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

	public Timestamp getDateCloture() {
		return this.dateCloture;
	}

	public void setDateCloture(Timestamp dateCloture) {
		this.dateCloture = dateCloture;
	}

	public Timestamp getDateConfirmation() {
		return this.dateConfirmation;
	}

	public void setDateConfirmation(Timestamp dateConfirmation) {
		this.dateConfirmation = dateConfirmation;
	}

	public Date getDateFin() {
		return this.dateFin;
	}

	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}

	public Date getDateLivraisonSouhaitee() {
		return this.dateLivraisonSouhaitee;
	}

	public void setDateLivraisonSouhaitee(Date dateLivraisonSouhaitee) {
		this.dateLivraisonSouhaitee = dateLivraisonSouhaitee;
	}

	public Date getDateMiseVigueur() {
		return this.dateMiseVigueur;
	}

	public void setDateMiseVigueur(Date dateMiseVigueur) {
		this.dateMiseVigueur = dateMiseVigueur;
	}

	public Date getDateOuvLdc() {
		return this.dateOuvLdc;
	}

	public void setDateOuvLdc(Date dateOuvLdc) {
		this.dateOuvLdc = dateOuvLdc;
	}

	public Date getDateSignature() {
		return this.dateSignature;
	}

	public void setDateSignature(Date dateSignature) {
		this.dateSignature = dateSignature;
	}

	public Integer getDelaiExecution() {
		return this.delaiExecution;
	}

	public void setDelaiExecution(Integer delaiExecution) {
		this.delaiExecution = delaiExecution;
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

	public Integer getIdCorrection() {
		return this.idCorrection;
	}

	public void setIdCorrection(Integer idCorrection) {
		this.idCorrection = idCorrection;
	}

	public Long getIdDemandeur() {
		return this.idDemandeur;
	}

	public void setIdDemandeur(Long idDemandeur) {
		this.idDemandeur = idDemandeur;
	}

	public Long getIdDevise1() {
		return this.idDevise1;
	}

	public void setIdDevise1(Long idDevise1) {
		this.idDevise1 = idDevise1;
	}

	public Long getIdDevise2() {
		return this.idDevise2;
	}

	public void setIdDevise2(Long idDevise2) {
		this.idDevise2 = idDevise2;
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

	public Long getIdMonnaieLocal() {
		return this.idMonnaieLocal;
	}

	public void setIdMonnaieLocal(Long idMonnaieLocal) {
		this.idMonnaieLocal = idMonnaieLocal;
	}

	public Long getIdOrdreTravail() {
		return this.idOrdreTravail;
	}

	public void setIdOrdreTravail(Long idOrdreTravail) {
		this.idOrdreTravail = idOrdreTravail;
	}

	public Long getIdPays() {
		return this.idPays;
	}

	public void setIdPays(Long idPays) {
		this.idPays = idPays;
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

	public Long getIdUniteDelaiPaiement() {
		return this.idUniteDelaiPaiement;
	}

	public void setIdUniteDelaiPaiement(Long idUniteDelaiPaiement) {
		this.idUniteDelaiPaiement = idUniteDelaiPaiement;
	}

	public Long getIdUniteDelaisExec() {
		return this.idUniteDelaisExec;
	}

	public void setIdUniteDelaisExec(Long idUniteDelaisExec) {
		this.idUniteDelaisExec = idUniteDelaisExec;
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

	public Boolean getIncludeMonnaieLocal() {
		return this.includeMonnaieLocal;
	}

	public void setIncludeMonnaieLocal(Boolean includeMonnaieLocal) {
		this.includeMonnaieLocal = includeMonnaieLocal;
	}

	public Boolean getIsBordereauObilgatoire() {
		return this.isBordereauObilgatoire;
	}

	public void setIsBordereauObilgatoire(Boolean isBordereauObilgatoire) {
		this.isBordereauObilgatoire = isBordereauObilgatoire;
	}

	public Boolean getIsCalculAvecRemise() {
		return this.isCalculAvecRemise;
	}

	public void setIsCalculAvecRemise(Boolean isCalculAvecRemise) {
		this.isCalculAvecRemise = isCalculAvecRemise;
	}

	public Boolean getIsDemandeAchatObligatoire() {
		return this.isDemandeAchatObligatoire;
	}

	public void setIsDemandeAchatObligatoire(Boolean isDemandeAchatObligatoire) {
		this.isDemandeAchatObligatoire = isDemandeAchatObligatoire;
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

	public Boolean getIsSolde() {
		return this.isSolde;
	}

	public void setIsSolde(Boolean isSolde) {
		this.isSolde = isSolde;
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

	public Integer getModeTransport() {
		return this.modeTransport;
	}

	public void setModeTransport(Integer modeTransport) {
		this.modeTransport = modeTransport;
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

	public BigDecimal getMontantAutresCharge() {
		return this.montantAutresCharge;
	}

	public void setMontantAutresCharge(BigDecimal montantAutresCharge) {
		this.montantAutresCharge = montantAutresCharge;
	}

	public BigDecimal getMontantDevise1() {
		return this.montantDevise1;
	}

	public void setMontantDevise1(BigDecimal montantDevise1) {
		this.montantDevise1 = montantDevise1;
	}

	public BigDecimal getMontantDevise2() {
		return this.montantDevise2;
	}

	public void setMontantDevise2(BigDecimal montantDevise2) {
		this.montantDevise2 = montantDevise2;
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

	public String getMotifCloture() {
		return this.motifCloture;
	}

	public void setMotifCloture(String motifCloture) {
		this.motifCloture = motifCloture;
	}

	public Boolean getMultipleDevise() {
		return this.multipleDevise;
	}

	public void setMultipleDevise(Boolean multipleDevise) {
		this.multipleDevise = multipleDevise;
	}

	public String getNumeroConvention() {
		return this.numeroConvention;
	}

	public void setNumeroConvention(String numeroConvention) {
		this.numeroConvention = numeroConvention;
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

	public String getOrigineContrat() {
		return this.origineContrat;
	}

	public void setOrigineContrat(String origineContrat) {
		this.origineContrat = origineContrat;
	}

	public BigDecimal getPartieDa() {
		return this.partieDa;
	}

	public void setPartieDa(BigDecimal partieDa) {
		this.partieDa = partieDa;
	}

	public String getReferencePassation() {
		return this.referencePassation;
	}

	public void setReferencePassation(String referencePassation) {
		this.referencePassation = referencePassation;
	}

	public String getStatut() {
		return this.statut;
	}

	public void setStatut(String statut) {
		this.statut = statut;
	}

	public BigDecimal getTauxChangeDevise1() {
		return this.tauxChangeDevise1;
	}

	public void setTauxChangeDevise1(BigDecimal tauxChangeDevise1) {
		this.tauxChangeDevise1 = tauxChangeDevise1;
	}

	public BigDecimal getTauxChangeDevise2() {
		return this.tauxChangeDevise2;
	}

	public void setTauxChangeDevise2(BigDecimal tauxChangeDevise2) {
		this.tauxChangeDevise2 = tauxChangeDevise2;
	}

	public BigDecimal getTauxCharges() {
		return this.tauxCharges;
	}

	public void setTauxCharges(BigDecimal tauxCharges) {
		this.tauxCharges = tauxCharges;
	}

	public BigDecimal getTauxLivraison() {
		return this.tauxLivraison;
	}

	public void setTauxLivraison(BigDecimal tauxLivraison) {
		this.tauxLivraison = tauxLivraison;
	}

	public BigDecimal getTauxRabais() {
		return this.tauxRabais;
	}

	public void setTauxRabais(BigDecimal tauxRabais) {
		this.tauxRabais = tauxRabais;
	}

	public BigDecimal getTauxRealisation() {
		return this.tauxRealisation;
	}

	public void setTauxRealisation(BigDecimal tauxRealisation) {
		this.tauxRealisation = tauxRealisation;
	}

	public BigDecimal getTauxRemise() {
		return this.tauxRemise;
	}

	public void setTauxRemise(BigDecimal tauxRemise) {
		this.tauxRemise = tauxRemise;
	}

	public BigDecimal getTauxStf() {
		return this.tauxStf;
	}

	public void setTauxStf(BigDecimal tauxStf) {
		this.tauxStf = tauxStf;
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

	public String getTypeCodification() {
		return this.typeCodification;
	}

	public void setTypeCodification(String typeCodification) {
		this.typeCodification = typeCodification;
	}

	public String getTypeCommande() {
		return this.typeCommande;
	}

	public void setTypeCommande(String typeCommande) {
		this.typeCommande = typeCommande;
	}

	public String getTypeContrat() {
		return this.typeContrat;
	}

	public void setTypeContrat(String typeContrat) {
		this.typeContrat = typeContrat;
	}

	public String getTypeEngagement() {
		return this.typeEngagement;
	}

	public void setTypeEngagement(String typeEngagement) {
		this.typeEngagement = typeEngagement;
	}

	public BigDecimal getValeurCharges() {
		return this.valeurCharges;
	}

	public void setValeurCharges(BigDecimal valeurCharges) {
		this.valeurCharges = valeurCharges;
	}

	public BigDecimal getValeurRabais() {
		return this.valeurRabais;
	}

	public void setValeurRabais(BigDecimal valeurRabais) {
		this.valeurRabais = valeurRabais;
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

	public List<AchatArrivage> getAchatArrivages() {
		return this.achatArrivages;
	}

	public void setAchatArrivages(List<AchatArrivage> achatArrivages) {
		this.achatArrivages = achatArrivages;
	}

	public AchatArrivage addAchatArrivage(AchatArrivage achatArrivage) {
		getAchatArrivages().add(achatArrivage);
		achatArrivage.setAchatEngagement(this);

		return achatArrivage;
	}

	public AchatArrivage removeAchatArrivage(AchatArrivage achatArrivage) {
		getAchatArrivages().remove(achatArrivage);
		achatArrivage.setAchatEngagement(null);

		return achatArrivage;
	}

	public List<AchatBordereau> getAchatBordereaus() {
		return this.achatBordereaus;
	}

	public void setAchatBordereaus(List<AchatBordereau> achatBordereaus) {
		this.achatBordereaus = achatBordereaus;
	}

	public AchatBordereau addAchatBordereaus(AchatBordereau achatBordereaus) {
		getAchatBordereaus().add(achatBordereaus);
		achatBordereaus.setAchatEngagement(this);

		return achatBordereaus;
	}

	public AchatBordereau removeAchatBordereaus(AchatBordereau achatBordereaus) {
		getAchatBordereaus().remove(achatBordereaus);
		achatBordereaus.setAchatEngagement(null);

		return achatBordereaus;
	}

	public List<AchatDemandePrixFille> getAchatDemandePrixFilles() {
		return this.achatDemandePrixFilles;
	}

	public void setAchatDemandePrixFilles(List<AchatDemandePrixFille> achatDemandePrixFilles) {
		this.achatDemandePrixFilles = achatDemandePrixFilles;
	}

	public AchatDemandePrixFille addAchatDemandePrixFille(AchatDemandePrixFille achatDemandePrixFille) {
		getAchatDemandePrixFilles().add(achatDemandePrixFille);
		achatDemandePrixFille.setAchatEngagement(this);

		return achatDemandePrixFille;
	}

	public AchatDemandePrixFille removeAchatDemandePrixFille(AchatDemandePrixFille achatDemandePrixFille) {
		getAchatDemandePrixFilles().remove(achatDemandePrixFille);
		achatDemandePrixFille.setAchatEngagement(null);

		return achatDemandePrixFille;
	}

	public List<AchatDemandePrixMere> getAchatDemandePrixMeres() {
		return this.achatDemandePrixMeres;
	}

	public void setAchatDemandePrixMeres(List<AchatDemandePrixMere> achatDemandePrixMeres) {
		this.achatDemandePrixMeres = achatDemandePrixMeres;
	}

	public AchatDemandePrixMere addAchatDemandePrixMere(AchatDemandePrixMere achatDemandePrixMere) {
		getAchatDemandePrixMeres().add(achatDemandePrixMere);
		achatDemandePrixMere.setAchatEngagement(this);

		return achatDemandePrixMere;
	}

	public AchatDemandePrixMere removeAchatDemandePrixMere(AchatDemandePrixMere achatDemandePrixMere) {
		getAchatDemandePrixMeres().remove(achatDemandePrixMere);
		achatDemandePrixMere.setAchatEngagement(null);

		return achatDemandePrixMere;
	}

	public AchatDemandePrixFille getAchatDemandePrixFille() {
		return this.achatDemandePrixFille;
	}

	public void setAchatDemandePrixFille(AchatDemandePrixFille achatDemandePrixFille) {
		this.achatDemandePrixFille = achatDemandePrixFille;
	}

	public AchatEngagement getAchatEngagement() {
		return this.achatEngagement;
	}

	public void setAchatEngagement(AchatEngagement achatEngagement) {
		this.achatEngagement = achatEngagement;
	}

	public List<AchatEngagement> getAchatEngagements() {
		return this.achatEngagements;
	}

	public void setAchatEngagements(List<AchatEngagement> achatEngagements) {
		this.achatEngagements = achatEngagements;
	}

	public AchatEngagement addAchatEngagement(AchatEngagement achatEngagement) {
		getAchatEngagements().add(achatEngagement);
		achatEngagement.setAchatEngagement(this);

		return achatEngagement;
	}

	public AchatEngagement removeAchatEngagement(AchatEngagement achatEngagement) {
		getAchatEngagements().remove(achatEngagement);
		achatEngagement.setAchatEngagement(null);

		return achatEngagement;
	}

	public DbaCritereSelection getDbaCritereSelection() {
		return this.dbaCritereSelection;
	}

	public void setDbaCritereSelection(DbaCritereSelection dbaCritereSelection) {
		this.dbaCritereSelection = dbaCritereSelection;
	}

	public DbaIncoterm getDbaIncoterm() {
		return this.dbaIncoterm;
	}

	public void setDbaIncoterm(DbaIncoterm dbaIncoterm) {
		this.dbaIncoterm = dbaIncoterm;
	}

	public DbaModePaiement getDbaModePaiement() {
		return this.dbaModePaiement;
	}

	public void setDbaModePaiement(DbaModePaiement dbaModePaiement) {
		this.dbaModePaiement = dbaModePaiement;
	}

	public DbaModePassation getDbaModePassation() {
		return this.dbaModePassation;
	}

	public void setDbaModePassation(DbaModePassation dbaModePassation) {
		this.dbaModePassation = dbaModePassation;
	}

	public DbaModeTransport getDbaModeTransport() {
		return this.dbaModeTransport;
	}

	public void setDbaModeTransport(DbaModeTransport dbaModeTransport) {
		this.dbaModeTransport = dbaModeTransport;
	}

	public List<AchatEngagementCentreCharge> getAchatEngagementCentreCharges() {
		return this.achatEngagementCentreCharges;
	}

	public void setAchatEngagementCentreCharges(List<AchatEngagementCentreCharge> achatEngagementCentreCharges) {
		this.achatEngagementCentreCharges = achatEngagementCentreCharges;
	}

	public AchatEngagementCentreCharge addAchatEngagementCentreCharge(AchatEngagementCentreCharge achatEngagementCentreCharge) {
		getAchatEngagementCentreCharges().add(achatEngagementCentreCharge);
		achatEngagementCentreCharge.setAchatEngagement(this);

		return achatEngagementCentreCharge;
	}

	public AchatEngagementCentreCharge removeAchatEngagementCentreCharge(AchatEngagementCentreCharge achatEngagementCentreCharge) {
		getAchatEngagementCentreCharges().remove(achatEngagementCentreCharge);
		achatEngagementCentreCharge.setAchatEngagement(null);

		return achatEngagementCentreCharge;
	}

	public List<AchatEngagementDemandeAchat> getAchatEngagementDemandeAchats() {
		return this.achatEngagementDemandeAchats;
	}

	public void setAchatEngagementDemandeAchats(List<AchatEngagementDemandeAchat> achatEngagementDemandeAchats) {
		this.achatEngagementDemandeAchats = achatEngagementDemandeAchats;
	}

	public AchatEngagementDemandeAchat addAchatEngagementDemandeAchat(AchatEngagementDemandeAchat achatEngagementDemandeAchat) {
		getAchatEngagementDemandeAchats().add(achatEngagementDemandeAchat);
		achatEngagementDemandeAchat.setAchatEngagement(this);

		return achatEngagementDemandeAchat;
	}

	public AchatEngagementDemandeAchat removeAchatEngagementDemandeAchat(AchatEngagementDemandeAchat achatEngagementDemandeAchat) {
		getAchatEngagementDemandeAchats().remove(achatEngagementDemandeAchat);
		achatEngagementDemandeAchat.setAchatEngagement(null);

		return achatEngagementDemandeAchat;
	}

	public List<AchatEngagementFactureFrai> getAchatEngagementFactureFrais() {
		return this.achatEngagementFactureFrais;
	}

	public void setAchatEngagementFactureFrais(List<AchatEngagementFactureFrai> achatEngagementFactureFrais) {
		this.achatEngagementFactureFrais = achatEngagementFactureFrais;
	}

	public AchatEngagementFactureFrai addAchatEngagementFactureFrai(AchatEngagementFactureFrai achatEngagementFactureFrai) {
		getAchatEngagementFactureFrais().add(achatEngagementFactureFrai);
		achatEngagementFactureFrai.setAchatEngagement(this);

		return achatEngagementFactureFrai;
	}

	public AchatEngagementFactureFrai removeAchatEngagementFactureFrai(AchatEngagementFactureFrai achatEngagementFactureFrai) {
		getAchatEngagementFactureFrais().remove(achatEngagementFactureFrai);
		achatEngagementFactureFrai.setAchatEngagement(null);

		return achatEngagementFactureFrai;
	}

	public List<AchatEngagementItem> getAchatEngagementItems() {
		return this.achatEngagementItems;
	}

	public void setAchatEngagementItems(List<AchatEngagementItem> achatEngagementItems) {
		this.achatEngagementItems = achatEngagementItems;
	}

	public AchatEngagementItem addAchatEngagementItem(AchatEngagementItem achatEngagementItem) {
		getAchatEngagementItems().add(achatEngagementItem);
		achatEngagementItem.setAchatEngagement(this);

		return achatEngagementItem;
	}

	public AchatEngagementItem removeAchatEngagementItem(AchatEngagementItem achatEngagementItem) {
		getAchatEngagementItems().remove(achatEngagementItem);
		achatEngagementItem.setAchatEngagement(null);

		return achatEngagementItem;
	}

	public List<AchatEngagementItemDemandeAchat> getAchatEngagementItemDemandeAchats() {
		return this.achatEngagementItemDemandeAchats;
	}

	public void setAchatEngagementItemDemandeAchats(List<AchatEngagementItemDemandeAchat> achatEngagementItemDemandeAchats) {
		this.achatEngagementItemDemandeAchats = achatEngagementItemDemandeAchats;
	}

	public AchatEngagementItemDemandeAchat addAchatEngagementItemDemandeAchat(AchatEngagementItemDemandeAchat achatEngagementItemDemandeAchat) {
		getAchatEngagementItemDemandeAchats().add(achatEngagementItemDemandeAchat);
		achatEngagementItemDemandeAchat.setAchatEngagement(this);

		return achatEngagementItemDemandeAchat;
	}

	public AchatEngagementItemDemandeAchat removeAchatEngagementItemDemandeAchat(AchatEngagementItemDemandeAchat achatEngagementItemDemandeAchat) {
		getAchatEngagementItemDemandeAchats().remove(achatEngagementItemDemandeAchat);
		achatEngagementItemDemandeAchat.setAchatEngagement(null);

		return achatEngagementItemDemandeAchat;
	}

	public List<AchatEngagementMagasin> getAchatEngagementMagasins() {
		return this.achatEngagementMagasins;
	}

	public void setAchatEngagementMagasins(List<AchatEngagementMagasin> achatEngagementMagasins) {
		this.achatEngagementMagasins = achatEngagementMagasins;
	}

	public AchatEngagementMagasin addAchatEngagementMagasin(AchatEngagementMagasin achatEngagementMagasin) {
		getAchatEngagementMagasins().add(achatEngagementMagasin);
		achatEngagementMagasin.setAchatEngagement(this);

		return achatEngagementMagasin;
	}

	public AchatEngagementMagasin removeAchatEngagementMagasin(AchatEngagementMagasin achatEngagementMagasin) {
		getAchatEngagementMagasins().remove(achatEngagementMagasin);
		achatEngagementMagasin.setAchatEngagement(null);

		return achatEngagementMagasin;
	}

	public List<AchatFacture> getAchatFactures1() {
		return this.achatFactures1;
	}

	public void setAchatFactures1(List<AchatFacture> achatFactures1) {
		this.achatFactures1 = achatFactures1;
	}

	public AchatFacture addAchatFactures1(AchatFacture achatFactures1) {
		getAchatFactures1().add(achatFactures1);
		achatFactures1.setAchatEngagement(this);

		return achatFactures1;
	}

	public AchatFacture removeAchatFactures1(AchatFacture achatFactures1) {
		getAchatFactures1().remove(achatFactures1);
		achatFactures1.setAchatEngagement(null);

		return achatFactures1;
	}

	public List<AchatFacture> getAchatFactures2() {
		return this.achatFactures2;
	}

	public void setAchatFactures2(List<AchatFacture> achatFactures2) {
		this.achatFactures2 = achatFactures2;
	}

	public List<AchatFacture> getAchatFactures3() {
		return this.achatFactures3;
	}

	public void setAchatFactures3(List<AchatFacture> achatFactures3) {
		this.achatFactures3 = achatFactures3;
	}

	public List<AchatLivraison> getAchatLivraisons() {
		return this.achatLivraisons;
	}

	public void setAchatLivraisons(List<AchatLivraison> achatLivraisons) {
		this.achatLivraisons = achatLivraisons;
	}

	public AchatLivraison addAchatLivraison(AchatLivraison achatLivraison) {
		getAchatLivraisons().add(achatLivraison);
		achatLivraison.setAchatEngagement(this);

		return achatLivraison;
	}

	public AchatLivraison removeAchatLivraison(AchatLivraison achatLivraison) {
		getAchatLivraisons().remove(achatLivraison);
		achatLivraison.setAchatEngagement(null);

		return achatLivraison;
	}

	public List<VisibiliteModuleEngagement> getVisibiliteModuleEngagements() {
		return this.visibiliteModuleEngagements;
	}

	public void setVisibiliteModuleEngagements(List<VisibiliteModuleEngagement> visibiliteModuleEngagements) {
		this.visibiliteModuleEngagements = visibiliteModuleEngagements;
	}

	public VisibiliteModuleEngagement addVisibiliteModuleEngagement(VisibiliteModuleEngagement visibiliteModuleEngagement) {
		getVisibiliteModuleEngagements().add(visibiliteModuleEngagement);
		visibiliteModuleEngagement.setAchatEngagement(this);

		return visibiliteModuleEngagement;
	}

	public VisibiliteModuleEngagement removeVisibiliteModuleEngagement(VisibiliteModuleEngagement visibiliteModuleEngagement) {
		getVisibiliteModuleEngagements().remove(visibiliteModuleEngagement);
		visibiliteModuleEngagement.setAchatEngagement(null);

		return visibiliteModuleEngagement;
	}

	public List<VisibiliteProfilEngagement> getVisibiliteProfilEngagements() {
		return this.visibiliteProfilEngagements;
	}

	public void setVisibiliteProfilEngagements(List<VisibiliteProfilEngagement> visibiliteProfilEngagements) {
		this.visibiliteProfilEngagements = visibiliteProfilEngagements;
	}

	public VisibiliteProfilEngagement addVisibiliteProfilEngagement(VisibiliteProfilEngagement visibiliteProfilEngagement) {
		getVisibiliteProfilEngagements().add(visibiliteProfilEngagement);
		visibiliteProfilEngagement.setAchatEngagement(this);

		return visibiliteProfilEngagement;
	}

	public VisibiliteProfilEngagement removeVisibiliteProfilEngagement(VisibiliteProfilEngagement visibiliteProfilEngagement) {
		getVisibiliteProfilEngagements().remove(visibiliteProfilEngagement);
		visibiliteProfilEngagement.setAchatEngagement(null);

		return visibiliteProfilEngagement;
	}

	public List<VisibiliteUniteEngagement> getVisibiliteUniteEngagements() {
		return this.visibiliteUniteEngagements;
	}

	public void setVisibiliteUniteEngagements(List<VisibiliteUniteEngagement> visibiliteUniteEngagements) {
		this.visibiliteUniteEngagements = visibiliteUniteEngagements;
	}

	public VisibiliteUniteEngagement addVisibiliteUniteEngagement(VisibiliteUniteEngagement visibiliteUniteEngagement) {
		getVisibiliteUniteEngagements().add(visibiliteUniteEngagement);
		visibiliteUniteEngagement.setAchatEngagement(this);

		return visibiliteUniteEngagement;
	}

	public VisibiliteUniteEngagement removeVisibiliteUniteEngagement(VisibiliteUniteEngagement visibiliteUniteEngagement) {
		getVisibiliteUniteEngagements().remove(visibiliteUniteEngagement);
		visibiliteUniteEngagement.setAchatEngagement(null);

		return visibiliteUniteEngagement;
	}

}