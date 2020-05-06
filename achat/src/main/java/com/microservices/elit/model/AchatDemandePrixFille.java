package com.microservices.elit.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the achat_demande_prix_fille database table.
 * 
 */
@Entity
@Table(name="achat_demande_prix_fille")
@NamedQuery(name="AchatDemandePrixFille.findAll", query="SELECT a FROM AchatDemandePrixFille a")
public class AchatDemandePrixFille implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;

	private String code;

	@Column(name="creer_le")
	private Timestamp creerLe;

	@Column(name="creer_par")
	private Long creerPar;

	@Column(name="date_commande")
	private Timestamp dateCommande;

	@Column(name="date_confirmation")
	private Timestamp dateConfirmation;

	@Column(name="date_demande_prix")
	private Timestamp dateDemandePrix;

	@Column(name="date_offre")
	private Timestamp dateOffre;

	@Column(name="date_validite_offre")
	private Timestamp dateValiditeOffre;

	@Column(name="delai_execution")
	private Integer delaiExecution;

	private String etat;

	@Column(name="id_correction")
	private Integer idCorrection;

	@Column(name="id_fournisseur")
	private Long idFournisseur;

	@Column(name="id_frais_autre_charge")
	private Long idFraisAutreCharge;

	@Column(name="id_monnaie")
	private Long idMonnaie;

	@Column(name="id_taxe1")
	private Long idTaxe1;

	@Column(name="id_taxe2")
	private Long idTaxe2;

	@Column(name="id_unite_delais_exec")
	private Long idUniteDelaisExec;

	@Column(name="id_unite_organisationnelle_appartenance")
	private Long idUniteOrganisationnelleAppartenance;

	@Column(name="id_unite_organisationnelle_createur")
	private Long idUniteOrganisationnelleCreateur;

	@Column(name="is_calcul_avec_remise")
	private Boolean isCalculAvecRemise;

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

	@Column(name="montant_ttc")
	private BigDecimal montantTtc;

	@Column(name="motif_annulation")
	private String motifAnnulation;

	private String objet;

	private String observation;

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

	//bi-directional many-to-one association to AchatDemandePrixMere
	@ManyToOne
	@JoinColumn(name="id_demande_prix_mere", insertable=false, updatable=false)
	private AchatDemandePrixMere achatDemandePrixMere;

	//bi-directional many-to-one association to AchatEngagement
	@ManyToOne
	@JoinColumn(name="id_commande", insertable=false, updatable=false)
	private AchatEngagement achatEngagement;

	//bi-directional many-to-one association to DbaModePaiement
	@ManyToOne
	@JoinColumn(name="id_mode_paiement", insertable=false, updatable=false)
	private DbaModePaiement dbaModePaiement;

	//bi-directional many-to-one association to AchatDemandePrixFilleCentreCharge
	@OneToMany(mappedBy="achatDemandePrixFille")
	private List<AchatDemandePrixFilleCentreCharge> achatDemandePrixFilleCentreCharges;

	//bi-directional many-to-one association to AchatDemandePrixFilleItem
	@OneToMany(mappedBy="achatDemandePrixFille")
	private List<AchatDemandePrixFilleItem> achatDemandePrixFilleItems;

	//bi-directional many-to-one association to AchatDemandePrixFilleMagasin
	@OneToMany(mappedBy="achatDemandePrixFille")
	private List<AchatDemandePrixFilleMagasin> achatDemandePrixFilleMagasins;

	//bi-directional many-to-one association to AchatEngagement
	@OneToMany(mappedBy="achatDemandePrixFille")
	private List<AchatEngagement> achatEngagements;

	//bi-directional many-to-one association to VisibiliteModuleDemandePrixFille
	@OneToMany(mappedBy="achatDemandePrixFille")
	private List<VisibiliteModuleDemandePrixFille> visibiliteModuleDemandePrixFilles;

	//bi-directional many-to-one association to VisibiliteProfilDemandePrixFille
	@OneToMany(mappedBy="achatDemandePrixFille")
	private List<VisibiliteProfilDemandePrixFille> visibiliteProfilDemandePrixFilles;

	//bi-directional many-to-one association to VisibiliteUniteDemandePrixFille
	@OneToMany(mappedBy="achatDemandePrixFille")
	private List<VisibiliteUniteDemandePrixFille> visibiliteUniteDemandePrixFilles;

	public AchatDemandePrixFille() {
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

	public Timestamp getDateCommande() {
		return this.dateCommande;
	}

	public void setDateCommande(Timestamp dateCommande) {
		this.dateCommande = dateCommande;
	}

	public Timestamp getDateConfirmation() {
		return this.dateConfirmation;
	}

	public void setDateConfirmation(Timestamp dateConfirmation) {
		this.dateConfirmation = dateConfirmation;
	}

	public Timestamp getDateDemandePrix() {
		return this.dateDemandePrix;
	}

	public void setDateDemandePrix(Timestamp dateDemandePrix) {
		this.dateDemandePrix = dateDemandePrix;
	}

	public Timestamp getDateOffre() {
		return this.dateOffre;
	}

	public void setDateOffre(Timestamp dateOffre) {
		this.dateOffre = dateOffre;
	}

	public Timestamp getDateValiditeOffre() {
		return this.dateValiditeOffre;
	}

	public void setDateValiditeOffre(Timestamp dateValiditeOffre) {
		this.dateValiditeOffre = dateValiditeOffre;
	}

	public Integer getDelaiExecution() {
		return this.delaiExecution;
	}

	public void setDelaiExecution(Integer delaiExecution) {
		this.delaiExecution = delaiExecution;
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

	public Long getIdMonnaie() {
		return this.idMonnaie;
	}

	public void setIdMonnaie(Long idMonnaie) {
		this.idMonnaie = idMonnaie;
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

	public Boolean getIsCalculAvecRemise() {
		return this.isCalculAvecRemise;
	}

	public void setIsCalculAvecRemise(Boolean isCalculAvecRemise) {
		this.isCalculAvecRemise = isCalculAvecRemise;
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

	public AchatDemandePrixMere getAchatDemandePrixMere() {
		return this.achatDemandePrixMere;
	}

	public void setAchatDemandePrixMere(AchatDemandePrixMere achatDemandePrixMere) {
		this.achatDemandePrixMere = achatDemandePrixMere;
	}

	public AchatEngagement getAchatEngagement() {
		return this.achatEngagement;
	}

	public void setAchatEngagement(AchatEngagement achatEngagement) {
		this.achatEngagement = achatEngagement;
	}

	public DbaModePaiement getDbaModePaiement() {
		return this.dbaModePaiement;
	}

	public void setDbaModePaiement(DbaModePaiement dbaModePaiement) {
		this.dbaModePaiement = dbaModePaiement;
	}

	public List<AchatDemandePrixFilleCentreCharge> getAchatDemandePrixFilleCentreCharges() {
		return this.achatDemandePrixFilleCentreCharges;
	}

	public void setAchatDemandePrixFilleCentreCharges(List<AchatDemandePrixFilleCentreCharge> achatDemandePrixFilleCentreCharges) {
		this.achatDemandePrixFilleCentreCharges = achatDemandePrixFilleCentreCharges;
	}

	public AchatDemandePrixFilleCentreCharge addAchatDemandePrixFilleCentreCharge(AchatDemandePrixFilleCentreCharge achatDemandePrixFilleCentreCharge) {
		getAchatDemandePrixFilleCentreCharges().add(achatDemandePrixFilleCentreCharge);
		achatDemandePrixFilleCentreCharge.setAchatDemandePrixFille(this);

		return achatDemandePrixFilleCentreCharge;
	}

	public AchatDemandePrixFilleCentreCharge removeAchatDemandePrixFilleCentreCharge(AchatDemandePrixFilleCentreCharge achatDemandePrixFilleCentreCharge) {
		getAchatDemandePrixFilleCentreCharges().remove(achatDemandePrixFilleCentreCharge);
		achatDemandePrixFilleCentreCharge.setAchatDemandePrixFille(null);

		return achatDemandePrixFilleCentreCharge;
	}

	public List<AchatDemandePrixFilleItem> getAchatDemandePrixFilleItems() {
		return this.achatDemandePrixFilleItems;
	}

	public void setAchatDemandePrixFilleItems(List<AchatDemandePrixFilleItem> achatDemandePrixFilleItems) {
		this.achatDemandePrixFilleItems = achatDemandePrixFilleItems;
	}

	public AchatDemandePrixFilleItem addAchatDemandePrixFilleItem(AchatDemandePrixFilleItem achatDemandePrixFilleItem) {
		getAchatDemandePrixFilleItems().add(achatDemandePrixFilleItem);
		achatDemandePrixFilleItem.setAchatDemandePrixFille(this);

		return achatDemandePrixFilleItem;
	}

	public AchatDemandePrixFilleItem removeAchatDemandePrixFilleItem(AchatDemandePrixFilleItem achatDemandePrixFilleItem) {
		getAchatDemandePrixFilleItems().remove(achatDemandePrixFilleItem);
		achatDemandePrixFilleItem.setAchatDemandePrixFille(null);

		return achatDemandePrixFilleItem;
	}

	public List<AchatDemandePrixFilleMagasin> getAchatDemandePrixFilleMagasins() {
		return this.achatDemandePrixFilleMagasins;
	}

	public void setAchatDemandePrixFilleMagasins(List<AchatDemandePrixFilleMagasin> achatDemandePrixFilleMagasins) {
		this.achatDemandePrixFilleMagasins = achatDemandePrixFilleMagasins;
	}

	public AchatDemandePrixFilleMagasin addAchatDemandePrixFilleMagasin(AchatDemandePrixFilleMagasin achatDemandePrixFilleMagasin) {
		getAchatDemandePrixFilleMagasins().add(achatDemandePrixFilleMagasin);
		achatDemandePrixFilleMagasin.setAchatDemandePrixFille(this);

		return achatDemandePrixFilleMagasin;
	}

	public AchatDemandePrixFilleMagasin removeAchatDemandePrixFilleMagasin(AchatDemandePrixFilleMagasin achatDemandePrixFilleMagasin) {
		getAchatDemandePrixFilleMagasins().remove(achatDemandePrixFilleMagasin);
		achatDemandePrixFilleMagasin.setAchatDemandePrixFille(null);

		return achatDemandePrixFilleMagasin;
	}

	public List<AchatEngagement> getAchatEngagements() {
		return this.achatEngagements;
	}

	public void setAchatEngagements(List<AchatEngagement> achatEngagements) {
		this.achatEngagements = achatEngagements;
	}

	public AchatEngagement addAchatEngagement(AchatEngagement achatEngagement) {
		getAchatEngagements().add(achatEngagement);
		achatEngagement.setAchatDemandePrixFille(this);

		return achatEngagement;
	}

	public AchatEngagement removeAchatEngagement(AchatEngagement achatEngagement) {
		getAchatEngagements().remove(achatEngagement);
		achatEngagement.setAchatDemandePrixFille(null);

		return achatEngagement;
	}

	public List<VisibiliteModuleDemandePrixFille> getVisibiliteModuleDemandePrixFilles() {
		return this.visibiliteModuleDemandePrixFilles;
	}

	public void setVisibiliteModuleDemandePrixFilles(List<VisibiliteModuleDemandePrixFille> visibiliteModuleDemandePrixFilles) {
		this.visibiliteModuleDemandePrixFilles = visibiliteModuleDemandePrixFilles;
	}

	public VisibiliteModuleDemandePrixFille addVisibiliteModuleDemandePrixFille(VisibiliteModuleDemandePrixFille visibiliteModuleDemandePrixFille) {
		getVisibiliteModuleDemandePrixFilles().add(visibiliteModuleDemandePrixFille);
		visibiliteModuleDemandePrixFille.setAchatDemandePrixFille(this);

		return visibiliteModuleDemandePrixFille;
	}

	public VisibiliteModuleDemandePrixFille removeVisibiliteModuleDemandePrixFille(VisibiliteModuleDemandePrixFille visibiliteModuleDemandePrixFille) {
		getVisibiliteModuleDemandePrixFilles().remove(visibiliteModuleDemandePrixFille);
		visibiliteModuleDemandePrixFille.setAchatDemandePrixFille(null);

		return visibiliteModuleDemandePrixFille;
	}

	public List<VisibiliteProfilDemandePrixFille> getVisibiliteProfilDemandePrixFilles() {
		return this.visibiliteProfilDemandePrixFilles;
	}

	public void setVisibiliteProfilDemandePrixFilles(List<VisibiliteProfilDemandePrixFille> visibiliteProfilDemandePrixFilles) {
		this.visibiliteProfilDemandePrixFilles = visibiliteProfilDemandePrixFilles;
	}

	public VisibiliteProfilDemandePrixFille addVisibiliteProfilDemandePrixFille(VisibiliteProfilDemandePrixFille visibiliteProfilDemandePrixFille) {
		getVisibiliteProfilDemandePrixFilles().add(visibiliteProfilDemandePrixFille);
		visibiliteProfilDemandePrixFille.setAchatDemandePrixFille(this);

		return visibiliteProfilDemandePrixFille;
	}

	public VisibiliteProfilDemandePrixFille removeVisibiliteProfilDemandePrixFille(VisibiliteProfilDemandePrixFille visibiliteProfilDemandePrixFille) {
		getVisibiliteProfilDemandePrixFilles().remove(visibiliteProfilDemandePrixFille);
		visibiliteProfilDemandePrixFille.setAchatDemandePrixFille(null);

		return visibiliteProfilDemandePrixFille;
	}

	public List<VisibiliteUniteDemandePrixFille> getVisibiliteUniteDemandePrixFilles() {
		return this.visibiliteUniteDemandePrixFilles;
	}

	public void setVisibiliteUniteDemandePrixFilles(List<VisibiliteUniteDemandePrixFille> visibiliteUniteDemandePrixFilles) {
		this.visibiliteUniteDemandePrixFilles = visibiliteUniteDemandePrixFilles;
	}

	public VisibiliteUniteDemandePrixFille addVisibiliteUniteDemandePrixFille(VisibiliteUniteDemandePrixFille visibiliteUniteDemandePrixFille) {
		getVisibiliteUniteDemandePrixFilles().add(visibiliteUniteDemandePrixFille);
		visibiliteUniteDemandePrixFille.setAchatDemandePrixFille(this);

		return visibiliteUniteDemandePrixFille;
	}

	public VisibiliteUniteDemandePrixFille removeVisibiliteUniteDemandePrixFille(VisibiliteUniteDemandePrixFille visibiliteUniteDemandePrixFille) {
		getVisibiliteUniteDemandePrixFilles().remove(visibiliteUniteDemandePrixFille);
		visibiliteUniteDemandePrixFille.setAchatDemandePrixFille(null);

		return visibiliteUniteDemandePrixFille;
	}

}