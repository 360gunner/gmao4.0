package com.microservices.elit.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the achat_demande_prix_mere database table.
 * 
 */
@Entity
@Table(name="achat_demande_prix_mere")
@NamedQuery(name="AchatDemandePrixMere.findAll", query="SELECT a FROM AchatDemandePrixMere a")
public class AchatDemandePrixMere implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;

	private String code;

	@Column(name="creer_le")
	private Timestamp creerLe;

	@Column(name="creer_par")
	private Long creerPar;

	@Column(name="date_confirmation")
	private Timestamp dateConfirmation;

	@Column(name="date_demande_prix")
	private Timestamp dateDemandePrix;

	@Temporal(TemporalType.DATE)
	@Column(name="date_retour_prevue")
	private Date dateRetourPrevue;

	@Column(name="delai_execution")
	private Integer delaiExecution;

	private String etat;

	@Column(name="id_correction")
	private Integer idCorrection;

	@Column(name="id_demandeur")
	private Long idDemandeur;

	@Column(name="id_monnaie")
	private Long idMonnaie;

	@Column(name="id_unite_delais_exec")
	private Long idUniteDelaisExec;

	@Column(name="id_unite_organisationnelle_appartenance")
	private Long idUniteOrganisationnelleAppartenance;

	@Column(name="id_unite_organisationnelle_createur")
	private Long idUniteOrganisationnelleCreateur;

	@Column(name="is_demande_achat_obilgatoire")
	private Boolean isDemandeAchatObilgatoire;

	@Column(name="modifier_le")
	private Timestamp modifierLe;

	@Column(name="modifier_par")
	private Long modifierPar;

	@Column(name="motif_annulation")
	private String motifAnnulation;

	private String objet;

	private String observation;

	@Column(name="type_codification")
	private String typeCodification;

	private Timestamp version;

	//bi-directional many-to-one association to AchatDemandePrixCentreCharge
	@OneToMany(mappedBy="achatDemandePrixMere")
	private List<AchatDemandePrixCentreCharge> achatDemandePrixCentreCharges;

	//bi-directional many-to-one association to AchatDemandePrixDemandeAchat
	@OneToMany(mappedBy="achatDemandePrixMere")
	private List<AchatDemandePrixDemandeAchat> achatDemandePrixDemandeAchats;

	//bi-directional many-to-one association to AchatDemandePrixDemandeAchatItem
	@OneToMany(mappedBy="achatDemandePrixMere")
	private List<AchatDemandePrixDemandeAchatItem> achatDemandePrixDemandeAchatItems;

	//bi-directional many-to-one association to AchatDemandePrixFille
	@OneToMany(mappedBy="achatDemandePrixMere")
	private List<AchatDemandePrixFille> achatDemandePrixFilles;

	//bi-directional many-to-one association to AchatDemandePrixFournisseur
	@OneToMany(mappedBy="achatDemandePrixMere")
	private List<AchatDemandePrixFournisseur> achatDemandePrixFournisseurs;

	//bi-directional many-to-one association to AchatDemandePrixMagasin
	@OneToMany(mappedBy="achatDemandePrixMere")
	private List<AchatDemandePrixMagasin> achatDemandePrixMagasins;

	//bi-directional many-to-one association to AchatEngagement
	@ManyToOne
	@JoinColumn(name="id_commande", insertable=false, updatable=false)
	private AchatEngagement achatEngagement;

	//bi-directional many-to-one association to DbaModePaiement
	@ManyToOne
	@JoinColumn(name="id_mode_paiement", insertable=false, updatable=false)
	private DbaModePaiement dbaModePaiement;

	//bi-directional many-to-one association to AchatDemandePrixMereItem
	@OneToMany(mappedBy="achatDemandePrixMere")
	private List<AchatDemandePrixMereItem> achatDemandePrixMereItems;

	//bi-directional many-to-one association to VisibiliteModuleDemandePrixMere
	@OneToMany(mappedBy="achatDemandePrixMere")
	private List<VisibiliteModuleDemandePrixMere> visibiliteModuleDemandePrixMeres;

	//bi-directional many-to-one association to VisibiliteProfilDemandePrixMere
	@OneToMany(mappedBy="achatDemandePrixMere")
	private List<VisibiliteProfilDemandePrixMere> visibiliteProfilDemandePrixMeres;

	//bi-directional many-to-one association to VisibiliteUniteDemandePrixMere
	@OneToMany(mappedBy="achatDemandePrixMere")
	private List<VisibiliteUniteDemandePrixMere> visibiliteUniteDemandePrixMeres;

	public AchatDemandePrixMere() {
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

	public Date getDateRetourPrevue() {
		return this.dateRetourPrevue;
	}

	public void setDateRetourPrevue(Date dateRetourPrevue) {
		this.dateRetourPrevue = dateRetourPrevue;
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

	public Long getIdDemandeur() {
		return this.idDemandeur;
	}

	public void setIdDemandeur(Long idDemandeur) {
		this.idDemandeur = idDemandeur;
	}

	public Long getIdMonnaie() {
		return this.idMonnaie;
	}

	public void setIdMonnaie(Long idMonnaie) {
		this.idMonnaie = idMonnaie;
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

	public Boolean getIsDemandeAchatObilgatoire() {
		return this.isDemandeAchatObilgatoire;
	}

	public void setIsDemandeAchatObilgatoire(Boolean isDemandeAchatObilgatoire) {
		this.isDemandeAchatObilgatoire = isDemandeAchatObilgatoire;
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

	public String getTypeCodification() {
		return this.typeCodification;
	}

	public void setTypeCodification(String typeCodification) {
		this.typeCodification = typeCodification;
	}

	public Timestamp getVersion() {
		return this.version;
	}

	public void setVersion(Timestamp version) {
		this.version = version;
	}

	public List<AchatDemandePrixCentreCharge> getAchatDemandePrixCentreCharges() {
		return this.achatDemandePrixCentreCharges;
	}

	public void setAchatDemandePrixCentreCharges(List<AchatDemandePrixCentreCharge> achatDemandePrixCentreCharges) {
		this.achatDemandePrixCentreCharges = achatDemandePrixCentreCharges;
	}

	public AchatDemandePrixCentreCharge addAchatDemandePrixCentreCharge(AchatDemandePrixCentreCharge achatDemandePrixCentreCharge) {
		getAchatDemandePrixCentreCharges().add(achatDemandePrixCentreCharge);
		achatDemandePrixCentreCharge.setAchatDemandePrixMere(this);

		return achatDemandePrixCentreCharge;
	}

	public AchatDemandePrixCentreCharge removeAchatDemandePrixCentreCharge(AchatDemandePrixCentreCharge achatDemandePrixCentreCharge) {
		getAchatDemandePrixCentreCharges().remove(achatDemandePrixCentreCharge);
		achatDemandePrixCentreCharge.setAchatDemandePrixMere(null);

		return achatDemandePrixCentreCharge;
	}

	public List<AchatDemandePrixDemandeAchat> getAchatDemandePrixDemandeAchats() {
		return this.achatDemandePrixDemandeAchats;
	}

	public void setAchatDemandePrixDemandeAchats(List<AchatDemandePrixDemandeAchat> achatDemandePrixDemandeAchats) {
		this.achatDemandePrixDemandeAchats = achatDemandePrixDemandeAchats;
	}

	public AchatDemandePrixDemandeAchat addAchatDemandePrixDemandeAchat(AchatDemandePrixDemandeAchat achatDemandePrixDemandeAchat) {
		getAchatDemandePrixDemandeAchats().add(achatDemandePrixDemandeAchat);
		achatDemandePrixDemandeAchat.setAchatDemandePrixMere(this);

		return achatDemandePrixDemandeAchat;
	}

	public AchatDemandePrixDemandeAchat removeAchatDemandePrixDemandeAchat(AchatDemandePrixDemandeAchat achatDemandePrixDemandeAchat) {
		getAchatDemandePrixDemandeAchats().remove(achatDemandePrixDemandeAchat);
		achatDemandePrixDemandeAchat.setAchatDemandePrixMere(null);

		return achatDemandePrixDemandeAchat;
	}

	public List<AchatDemandePrixDemandeAchatItem> getAchatDemandePrixDemandeAchatItems() {
		return this.achatDemandePrixDemandeAchatItems;
	}

	public void setAchatDemandePrixDemandeAchatItems(List<AchatDemandePrixDemandeAchatItem> achatDemandePrixDemandeAchatItems) {
		this.achatDemandePrixDemandeAchatItems = achatDemandePrixDemandeAchatItems;
	}

	public AchatDemandePrixDemandeAchatItem addAchatDemandePrixDemandeAchatItem(AchatDemandePrixDemandeAchatItem achatDemandePrixDemandeAchatItem) {
		getAchatDemandePrixDemandeAchatItems().add(achatDemandePrixDemandeAchatItem);
		achatDemandePrixDemandeAchatItem.setAchatDemandePrixMere(this);

		return achatDemandePrixDemandeAchatItem;
	}

	public AchatDemandePrixDemandeAchatItem removeAchatDemandePrixDemandeAchatItem(AchatDemandePrixDemandeAchatItem achatDemandePrixDemandeAchatItem) {
		getAchatDemandePrixDemandeAchatItems().remove(achatDemandePrixDemandeAchatItem);
		achatDemandePrixDemandeAchatItem.setAchatDemandePrixMere(null);

		return achatDemandePrixDemandeAchatItem;
	}

	public List<AchatDemandePrixFille> getAchatDemandePrixFilles() {
		return this.achatDemandePrixFilles;
	}

	public void setAchatDemandePrixFilles(List<AchatDemandePrixFille> achatDemandePrixFilles) {
		this.achatDemandePrixFilles = achatDemandePrixFilles;
	}

	public AchatDemandePrixFille addAchatDemandePrixFille(AchatDemandePrixFille achatDemandePrixFille) {
		getAchatDemandePrixFilles().add(achatDemandePrixFille);
		achatDemandePrixFille.setAchatDemandePrixMere(this);

		return achatDemandePrixFille;
	}

	public AchatDemandePrixFille removeAchatDemandePrixFille(AchatDemandePrixFille achatDemandePrixFille) {
		getAchatDemandePrixFilles().remove(achatDemandePrixFille);
		achatDemandePrixFille.setAchatDemandePrixMere(null);

		return achatDemandePrixFille;
	}

	public List<AchatDemandePrixFournisseur> getAchatDemandePrixFournisseurs() {
		return this.achatDemandePrixFournisseurs;
	}

	public void setAchatDemandePrixFournisseurs(List<AchatDemandePrixFournisseur> achatDemandePrixFournisseurs) {
		this.achatDemandePrixFournisseurs = achatDemandePrixFournisseurs;
	}

	public AchatDemandePrixFournisseur addAchatDemandePrixFournisseur(AchatDemandePrixFournisseur achatDemandePrixFournisseur) {
		getAchatDemandePrixFournisseurs().add(achatDemandePrixFournisseur);
		achatDemandePrixFournisseur.setAchatDemandePrixMere(this);

		return achatDemandePrixFournisseur;
	}

	public AchatDemandePrixFournisseur removeAchatDemandePrixFournisseur(AchatDemandePrixFournisseur achatDemandePrixFournisseur) {
		getAchatDemandePrixFournisseurs().remove(achatDemandePrixFournisseur);
		achatDemandePrixFournisseur.setAchatDemandePrixMere(null);

		return achatDemandePrixFournisseur;
	}

	public List<AchatDemandePrixMagasin> getAchatDemandePrixMagasins() {
		return this.achatDemandePrixMagasins;
	}

	public void setAchatDemandePrixMagasins(List<AchatDemandePrixMagasin> achatDemandePrixMagasins) {
		this.achatDemandePrixMagasins = achatDemandePrixMagasins;
	}

	public AchatDemandePrixMagasin addAchatDemandePrixMagasin(AchatDemandePrixMagasin achatDemandePrixMagasin) {
		getAchatDemandePrixMagasins().add(achatDemandePrixMagasin);
		achatDemandePrixMagasin.setAchatDemandePrixMere(this);

		return achatDemandePrixMagasin;
	}

	public AchatDemandePrixMagasin removeAchatDemandePrixMagasin(AchatDemandePrixMagasin achatDemandePrixMagasin) {
		getAchatDemandePrixMagasins().remove(achatDemandePrixMagasin);
		achatDemandePrixMagasin.setAchatDemandePrixMere(null);

		return achatDemandePrixMagasin;
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

	public List<AchatDemandePrixMereItem> getAchatDemandePrixMereItems() {
		return this.achatDemandePrixMereItems;
	}

	public void setAchatDemandePrixMereItems(List<AchatDemandePrixMereItem> achatDemandePrixMereItems) {
		this.achatDemandePrixMereItems = achatDemandePrixMereItems;
	}

	public AchatDemandePrixMereItem addAchatDemandePrixMereItem(AchatDemandePrixMereItem achatDemandePrixMereItem) {
		getAchatDemandePrixMereItems().add(achatDemandePrixMereItem);
		achatDemandePrixMereItem.setAchatDemandePrixMere(this);

		return achatDemandePrixMereItem;
	}

	public AchatDemandePrixMereItem removeAchatDemandePrixMereItem(AchatDemandePrixMereItem achatDemandePrixMereItem) {
		getAchatDemandePrixMereItems().remove(achatDemandePrixMereItem);
		achatDemandePrixMereItem.setAchatDemandePrixMere(null);

		return achatDemandePrixMereItem;
	}

	public List<VisibiliteModuleDemandePrixMere> getVisibiliteModuleDemandePrixMeres() {
		return this.visibiliteModuleDemandePrixMeres;
	}

	public void setVisibiliteModuleDemandePrixMeres(List<VisibiliteModuleDemandePrixMere> visibiliteModuleDemandePrixMeres) {
		this.visibiliteModuleDemandePrixMeres = visibiliteModuleDemandePrixMeres;
	}

	public VisibiliteModuleDemandePrixMere addVisibiliteModuleDemandePrixMere(VisibiliteModuleDemandePrixMere visibiliteModuleDemandePrixMere) {
		getVisibiliteModuleDemandePrixMeres().add(visibiliteModuleDemandePrixMere);
		visibiliteModuleDemandePrixMere.setAchatDemandePrixMere(this);

		return visibiliteModuleDemandePrixMere;
	}

	public VisibiliteModuleDemandePrixMere removeVisibiliteModuleDemandePrixMere(VisibiliteModuleDemandePrixMere visibiliteModuleDemandePrixMere) {
		getVisibiliteModuleDemandePrixMeres().remove(visibiliteModuleDemandePrixMere);
		visibiliteModuleDemandePrixMere.setAchatDemandePrixMere(null);

		return visibiliteModuleDemandePrixMere;
	}

	public List<VisibiliteProfilDemandePrixMere> getVisibiliteProfilDemandePrixMeres() {
		return this.visibiliteProfilDemandePrixMeres;
	}

	public void setVisibiliteProfilDemandePrixMeres(List<VisibiliteProfilDemandePrixMere> visibiliteProfilDemandePrixMeres) {
		this.visibiliteProfilDemandePrixMeres = visibiliteProfilDemandePrixMeres;
	}

	public VisibiliteProfilDemandePrixMere addVisibiliteProfilDemandePrixMere(VisibiliteProfilDemandePrixMere visibiliteProfilDemandePrixMere) {
		getVisibiliteProfilDemandePrixMeres().add(visibiliteProfilDemandePrixMere);
		visibiliteProfilDemandePrixMere.setAchatDemandePrixMere(this);

		return visibiliteProfilDemandePrixMere;
	}

	public VisibiliteProfilDemandePrixMere removeVisibiliteProfilDemandePrixMere(VisibiliteProfilDemandePrixMere visibiliteProfilDemandePrixMere) {
		getVisibiliteProfilDemandePrixMeres().remove(visibiliteProfilDemandePrixMere);
		visibiliteProfilDemandePrixMere.setAchatDemandePrixMere(null);

		return visibiliteProfilDemandePrixMere;
	}

	public List<VisibiliteUniteDemandePrixMere> getVisibiliteUniteDemandePrixMeres() {
		return this.visibiliteUniteDemandePrixMeres;
	}

	public void setVisibiliteUniteDemandePrixMeres(List<VisibiliteUniteDemandePrixMere> visibiliteUniteDemandePrixMeres) {
		this.visibiliteUniteDemandePrixMeres = visibiliteUniteDemandePrixMeres;
	}

	public VisibiliteUniteDemandePrixMere addVisibiliteUniteDemandePrixMere(VisibiliteUniteDemandePrixMere visibiliteUniteDemandePrixMere) {
		getVisibiliteUniteDemandePrixMeres().add(visibiliteUniteDemandePrixMere);
		visibiliteUniteDemandePrixMere.setAchatDemandePrixMere(this);

		return visibiliteUniteDemandePrixMere;
	}

	public VisibiliteUniteDemandePrixMere removeVisibiliteUniteDemandePrixMere(VisibiliteUniteDemandePrixMere visibiliteUniteDemandePrixMere) {
		getVisibiliteUniteDemandePrixMeres().remove(visibiliteUniteDemandePrixMere);
		visibiliteUniteDemandePrixMere.setAchatDemandePrixMere(null);

		return visibiliteUniteDemandePrixMere;
	}

}