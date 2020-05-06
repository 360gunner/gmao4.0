package com.microservices.elit.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the achat_arrivage database table.
 * 
 */
@Entity
@Table(name="achat_arrivage")
@NamedQuery(name="AchatArrivage.findAll", query="SELECT a FROM AchatArrivage a")
public class AchatArrivage implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;

	private String code;

	@Column(name="creer_le")
	private Timestamp creerLe;

	@Column(name="creer_par")
	private Long creerPar;

	@Temporal(TemporalType.DATE)
	private Date date;

	@Column(name="date_confirmation")
	private Timestamp dateConfirmation;

	@Column(name="demande_achat_obligatoire")
	private Boolean demandeAchatObligatoire;

	private String etat;

	@Column(name="id_unite_organisationnelle_appartenance")
	private Long idUniteOrganisationnelleAppartenance;

	@Column(name="id_unite_organisationnelle_createur")
	private Long idUniteOrganisationnelleCreateur;

	@Column(name="id_utilisateur_confirmateur")
	private Long idUtilisateurConfirmateur;

	@Column(name="modifier_le")
	private Timestamp modifierLe;

	@Column(name="modifier_par")
	private Long modifierPar;

	private BigDecimal montant;

	@Column(name="motif_annulation")
	private String motifAnnulation;

	private String observation;

	@Column(name="type_codification")
	private String typeCodification;

	//bi-directional many-to-one association to AchatEngagement
	@ManyToOne
	@JoinColumn(name="id_engagement", insertable=false, updatable=false)
	private AchatEngagement achatEngagement;

	//bi-directional many-to-one association to AchatArrivageDemandeAchat
	@OneToMany(mappedBy="achatArrivage")
	private List<AchatArrivageDemandeAchat> achatArrivageDemandeAchats;

	//bi-directional many-to-one association to AchatArrivageDemandeAchatItem
	@OneToMany(mappedBy="achatArrivage")
	private List<AchatArrivageDemandeAchatItem> achatArrivageDemandeAchatItems;

	//bi-directional many-to-one association to AchatArrivageFactureAchatItem
	@OneToMany(mappedBy="achatArrivage")
	private List<AchatArrivageFactureAchatItem> achatArrivageFactureAchatItems;

	//bi-directional many-to-one association to AchatArrivageFactureFrai
	@OneToMany(mappedBy="achatArrivage")
	private List<AchatArrivageFactureFrai> achatArrivageFactureFrais;

	//bi-directional many-to-one association to AchatArrivageItem
	@OneToMany(mappedBy="achatArrivage")
	private List<AchatArrivageItem> achatArrivageItems;

	//bi-directional many-to-many association to AchatFacture
	@ManyToMany(mappedBy="achatArrivages1")
	private List<AchatFacture> achatFactures1;

	//bi-directional many-to-many association to AchatFacture
	@ManyToMany(mappedBy="achatArrivages2")
	private List<AchatFacture> achatFactures2;

	//bi-directional many-to-one association to VisibiliteModuleAchatArrivage
	@OneToMany(mappedBy="achatArrivage")
	private List<VisibiliteModuleAchatArrivage> visibiliteModuleAchatArrivages;

	//bi-directional many-to-one association to VisibiliteProfilAchatArrivage
	@OneToMany(mappedBy="achatArrivage")
	private List<VisibiliteProfilAchatArrivage> visibiliteProfilAchatArrivages;

	//bi-directional many-to-one association to VisibiliteUniteAchatArrivage
	@OneToMany(mappedBy="achatArrivage")
	private List<VisibiliteUniteAchatArrivage> visibiliteUniteAchatArrivages;

	//bi-directional many-to-one association to Correction
	@ManyToOne
	@JoinColumn(name="id_correction", insertable=false, updatable=false)
	private Correction correction;

	//bi-directional many-to-one association to DbaCentreCharge
	@ManyToOne
	@JoinColumn(name="id_centre_charge", insertable=false, updatable=false)
	private DbaCentreCharge dbaCentreCharge;

	//bi-directional many-to-one association to DbaSociete
	@ManyToOne
	@JoinColumn(name="id_fournisseur", insertable=false, updatable=false)
	private DbaSociete dbaSociete;

	//bi-directional many-to-many association to Demande
	@ManyToMany(mappedBy="achatArrivages")
	private List<Demande> demandes;

	public AchatArrivage() {
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

	public Date getDate() {
		return this.date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Timestamp getDateConfirmation() {
		return this.dateConfirmation;
	}

	public void setDateConfirmation(Timestamp dateConfirmation) {
		this.dateConfirmation = dateConfirmation;
	}

	public Boolean getDemandeAchatObligatoire() {
		return this.demandeAchatObligatoire;
	}

	public void setDemandeAchatObligatoire(Boolean demandeAchatObligatoire) {
		this.demandeAchatObligatoire = demandeAchatObligatoire;
	}

	public String getEtat() {
		return this.etat;
	}

	public void setEtat(String etat) {
		this.etat = etat;
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

	public Long getIdUtilisateurConfirmateur() {
		return this.idUtilisateurConfirmateur;
	}

	public void setIdUtilisateurConfirmateur(Long idUtilisateurConfirmateur) {
		this.idUtilisateurConfirmateur = idUtilisateurConfirmateur;
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

	public String getMotifAnnulation() {
		return this.motifAnnulation;
	}

	public void setMotifAnnulation(String motifAnnulation) {
		this.motifAnnulation = motifAnnulation;
	}

	public String getObservation() {
		return this.observation;
	}

	public void setObservation(String observation) {
		this.observation = observation;
	}

	public String getTypeCodification() {
		return this.typeCodification;
	}

	public void setTypeCodification(String typeCodification) {
		this.typeCodification = typeCodification;
	}

	public AchatEngagement getAchatEngagement() {
		return this.achatEngagement;
	}

	public void setAchatEngagement(AchatEngagement achatEngagement) {
		this.achatEngagement = achatEngagement;
	}

	public List<AchatArrivageDemandeAchat> getAchatArrivageDemandeAchats() {
		return this.achatArrivageDemandeAchats;
	}

	public void setAchatArrivageDemandeAchats(List<AchatArrivageDemandeAchat> achatArrivageDemandeAchats) {
		this.achatArrivageDemandeAchats = achatArrivageDemandeAchats;
	}

	public AchatArrivageDemandeAchat addAchatArrivageDemandeAchat(AchatArrivageDemandeAchat achatArrivageDemandeAchat) {
		getAchatArrivageDemandeAchats().add(achatArrivageDemandeAchat);
		achatArrivageDemandeAchat.setAchatArrivage(this);

		return achatArrivageDemandeAchat;
	}

	public AchatArrivageDemandeAchat removeAchatArrivageDemandeAchat(AchatArrivageDemandeAchat achatArrivageDemandeAchat) {
		getAchatArrivageDemandeAchats().remove(achatArrivageDemandeAchat);
		achatArrivageDemandeAchat.setAchatArrivage(null);

		return achatArrivageDemandeAchat;
	}

	public List<AchatArrivageDemandeAchatItem> getAchatArrivageDemandeAchatItems() {
		return this.achatArrivageDemandeAchatItems;
	}

	public void setAchatArrivageDemandeAchatItems(List<AchatArrivageDemandeAchatItem> achatArrivageDemandeAchatItems) {
		this.achatArrivageDemandeAchatItems = achatArrivageDemandeAchatItems;
	}

	public AchatArrivageDemandeAchatItem addAchatArrivageDemandeAchatItem(AchatArrivageDemandeAchatItem achatArrivageDemandeAchatItem) {
		getAchatArrivageDemandeAchatItems().add(achatArrivageDemandeAchatItem);
		achatArrivageDemandeAchatItem.setAchatArrivage(this);

		return achatArrivageDemandeAchatItem;
	}

	public AchatArrivageDemandeAchatItem removeAchatArrivageDemandeAchatItem(AchatArrivageDemandeAchatItem achatArrivageDemandeAchatItem) {
		getAchatArrivageDemandeAchatItems().remove(achatArrivageDemandeAchatItem);
		achatArrivageDemandeAchatItem.setAchatArrivage(null);

		return achatArrivageDemandeAchatItem;
	}

	public List<AchatArrivageFactureAchatItem> getAchatArrivageFactureAchatItems() {
		return this.achatArrivageFactureAchatItems;
	}

	public void setAchatArrivageFactureAchatItems(List<AchatArrivageFactureAchatItem> achatArrivageFactureAchatItems) {
		this.achatArrivageFactureAchatItems = achatArrivageFactureAchatItems;
	}

	public AchatArrivageFactureAchatItem addAchatArrivageFactureAchatItem(AchatArrivageFactureAchatItem achatArrivageFactureAchatItem) {
		getAchatArrivageFactureAchatItems().add(achatArrivageFactureAchatItem);
		achatArrivageFactureAchatItem.setAchatArrivage(this);

		return achatArrivageFactureAchatItem;
	}

	public AchatArrivageFactureAchatItem removeAchatArrivageFactureAchatItem(AchatArrivageFactureAchatItem achatArrivageFactureAchatItem) {
		getAchatArrivageFactureAchatItems().remove(achatArrivageFactureAchatItem);
		achatArrivageFactureAchatItem.setAchatArrivage(null);

		return achatArrivageFactureAchatItem;
	}

	public List<AchatArrivageFactureFrai> getAchatArrivageFactureFrais() {
		return this.achatArrivageFactureFrais;
	}

	public void setAchatArrivageFactureFrais(List<AchatArrivageFactureFrai> achatArrivageFactureFrais) {
		this.achatArrivageFactureFrais = achatArrivageFactureFrais;
	}

	public AchatArrivageFactureFrai addAchatArrivageFactureFrai(AchatArrivageFactureFrai achatArrivageFactureFrai) {
		getAchatArrivageFactureFrais().add(achatArrivageFactureFrai);
		achatArrivageFactureFrai.setAchatArrivage(this);

		return achatArrivageFactureFrai;
	}

	public AchatArrivageFactureFrai removeAchatArrivageFactureFrai(AchatArrivageFactureFrai achatArrivageFactureFrai) {
		getAchatArrivageFactureFrais().remove(achatArrivageFactureFrai);
		achatArrivageFactureFrai.setAchatArrivage(null);

		return achatArrivageFactureFrai;
	}

	public List<AchatArrivageItem> getAchatArrivageItems() {
		return this.achatArrivageItems;
	}

	public void setAchatArrivageItems(List<AchatArrivageItem> achatArrivageItems) {
		this.achatArrivageItems = achatArrivageItems;
	}

	public AchatArrivageItem addAchatArrivageItem(AchatArrivageItem achatArrivageItem) {
		getAchatArrivageItems().add(achatArrivageItem);
		achatArrivageItem.setAchatArrivage(this);

		return achatArrivageItem;
	}

	public AchatArrivageItem removeAchatArrivageItem(AchatArrivageItem achatArrivageItem) {
		getAchatArrivageItems().remove(achatArrivageItem);
		achatArrivageItem.setAchatArrivage(null);

		return achatArrivageItem;
	}

	public List<AchatFacture> getAchatFactures1() {
		return this.achatFactures1;
	}

	public void setAchatFactures1(List<AchatFacture> achatFactures1) {
		this.achatFactures1 = achatFactures1;
	}

	public List<AchatFacture> getAchatFactures2() {
		return this.achatFactures2;
	}

	public void setAchatFactures2(List<AchatFacture> achatFactures2) {
		this.achatFactures2 = achatFactures2;
	}

	public List<VisibiliteModuleAchatArrivage> getVisibiliteModuleAchatArrivages() {
		return this.visibiliteModuleAchatArrivages;
	}

	public void setVisibiliteModuleAchatArrivages(List<VisibiliteModuleAchatArrivage> visibiliteModuleAchatArrivages) {
		this.visibiliteModuleAchatArrivages = visibiliteModuleAchatArrivages;
	}

	public VisibiliteModuleAchatArrivage addVisibiliteModuleAchatArrivage(VisibiliteModuleAchatArrivage visibiliteModuleAchatArrivage) {
		getVisibiliteModuleAchatArrivages().add(visibiliteModuleAchatArrivage);
		visibiliteModuleAchatArrivage.setAchatArrivage(this);

		return visibiliteModuleAchatArrivage;
	}

	public VisibiliteModuleAchatArrivage removeVisibiliteModuleAchatArrivage(VisibiliteModuleAchatArrivage visibiliteModuleAchatArrivage) {
		getVisibiliteModuleAchatArrivages().remove(visibiliteModuleAchatArrivage);
		visibiliteModuleAchatArrivage.setAchatArrivage(null);

		return visibiliteModuleAchatArrivage;
	}

	public List<VisibiliteProfilAchatArrivage> getVisibiliteProfilAchatArrivages() {
		return this.visibiliteProfilAchatArrivages;
	}

	public void setVisibiliteProfilAchatArrivages(List<VisibiliteProfilAchatArrivage> visibiliteProfilAchatArrivages) {
		this.visibiliteProfilAchatArrivages = visibiliteProfilAchatArrivages;
	}

	public VisibiliteProfilAchatArrivage addVisibiliteProfilAchatArrivage(VisibiliteProfilAchatArrivage visibiliteProfilAchatArrivage) {
		getVisibiliteProfilAchatArrivages().add(visibiliteProfilAchatArrivage);
		visibiliteProfilAchatArrivage.setAchatArrivage(this);

		return visibiliteProfilAchatArrivage;
	}

	public VisibiliteProfilAchatArrivage removeVisibiliteProfilAchatArrivage(VisibiliteProfilAchatArrivage visibiliteProfilAchatArrivage) {
		getVisibiliteProfilAchatArrivages().remove(visibiliteProfilAchatArrivage);
		visibiliteProfilAchatArrivage.setAchatArrivage(null);

		return visibiliteProfilAchatArrivage;
	}

	public List<VisibiliteUniteAchatArrivage> getVisibiliteUniteAchatArrivages() {
		return this.visibiliteUniteAchatArrivages;
	}

	public void setVisibiliteUniteAchatArrivages(List<VisibiliteUniteAchatArrivage> visibiliteUniteAchatArrivages) {
		this.visibiliteUniteAchatArrivages = visibiliteUniteAchatArrivages;
	}

	public VisibiliteUniteAchatArrivage addVisibiliteUniteAchatArrivage(VisibiliteUniteAchatArrivage visibiliteUniteAchatArrivage) {
		getVisibiliteUniteAchatArrivages().add(visibiliteUniteAchatArrivage);
		visibiliteUniteAchatArrivage.setAchatArrivage(this);

		return visibiliteUniteAchatArrivage;
	}

	public VisibiliteUniteAchatArrivage removeVisibiliteUniteAchatArrivage(VisibiliteUniteAchatArrivage visibiliteUniteAchatArrivage) {
		getVisibiliteUniteAchatArrivages().remove(visibiliteUniteAchatArrivage);
		visibiliteUniteAchatArrivage.setAchatArrivage(null);

		return visibiliteUniteAchatArrivage;
	}

	public Correction getCorrection() {
		return this.correction;
	}

	public void setCorrection(Correction correction) {
		this.correction = correction;
	}

	public DbaCentreCharge getDbaCentreCharge() {
		return this.dbaCentreCharge;
	}

	public void setDbaCentreCharge(DbaCentreCharge dbaCentreCharge) {
		this.dbaCentreCharge = dbaCentreCharge;
	}

	public DbaSociete getDbaSociete() {
		return this.dbaSociete;
	}

	public void setDbaSociete(DbaSociete dbaSociete) {
		this.dbaSociete = dbaSociete;
	}

	public List<Demande> getDemandes() {
		return this.demandes;
	}

	public void setDemandes(List<Demande> demandes) {
		this.demandes = demandes;
	}

}