package com.microservices.elit.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the demande database table.
 * 
 */
@Entity
@NamedQuery(name="Demande.findAll", query="SELECT d FROM Demande d")
public class Demande implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;

	private Boolean approbation;

	private String code;

	@Column(name="creer_le")
	private Timestamp creerLe;

	@Column(name="creer_par")
	private Integer creerPar;

	@Column(name="date_annulation")
	private Timestamp dateAnnulation;

	@Column(name="date_approbation")
	private Timestamp dateApprobation;

	@Column(name="date_autorisation")
	private Timestamp dateAutorisation;

	@Column(name="date_bon_commande")
	private Timestamp dateBonCommande;

	@Column(name="date_cloture")
	private Timestamp dateCloture;

	@Column(name="date_confirmation")
	private Timestamp dateConfirmation;

	@Column(name="date_emission")
	private Timestamp dateEmission;

	@Column(name="date_livraison_souhaitee")
	private Timestamp dateLivraisonSouhaitee;

	@Column(name="date_rejet")
	private Timestamp dateRejet;

	private String etat;

	@Column(name="etat_stf")
	private String etatStf;

	@Column(name="etat_utilisateur")
	private Integer etatUtilisateur;

	@Column(name="id_affaire")
	private Integer idAffaire;

	@Column(name="id_ap")
	private Integer idAp;

	@Column(name="id_centre_charge")
	private Integer idCentreCharge;

	@Column(name="id_client")
	private Integer idClient;

	@Column(name="id_correction")
	private Integer idCorrection;

	@Column(name="id_demandeur")
	private Integer idDemandeur;

	@Column(name="id_fournisseur")
	private Integer idFournisseur;

	@Column(name="id_imputation")
	private Integer idImputation;

	@Column(name="id_magasin_demandeur")
	private Integer idMagasinDemandeur;

	@Column(name="id_magasin_fournisseur")
	private Integer idMagasinFournisseur;

	@Column(name="id_ordre_travail")
	private Long idOrdreTravail;

	@Column(name="id_processus")
	private Integer idProcessus;

	@Column(name="id_type_stock_1")
	private Integer idTypeStock1;

	@Column(name="id_type_stock_2")
	private Integer idTypeStock2;

	@Column(name="id_unite_approbatrice")
	private Integer idUniteApprobatrice;

	@Column(name="id_unite_destinatrice")
	private Integer idUniteDestinatrice;

	@Column(name="id_unite_organisationnelle_appartenance")
	private Integer idUniteOrganisationnelleAppartenance;

	@Column(name="id_unite_organisationnelle_createur")
	private Integer idUniteOrganisationnelleCreateur;

	@Column(name="id_util_annulation")
	private Integer idUtilAnnulation;

	@Column(name="id_util_approbateur")
	private Integer idUtilApprobateur;

	@Column(name="id_util_autorisateur")
	private Integer idUtilAutorisateur;

	@Column(name="id_util_cloture")
	private Integer idUtilCloture;

	@Column(name="id_util_confirmateur")
	private Integer idUtilConfirmateur;

	@Column(name="id_util_rejet")
	private Integer idUtilRejet;

	@Column(name="modifier_le")
	private Timestamp modifierLe;

	@Column(name="modifier_par")
	private Integer modifierPar;

	private double montant;

	@Column(name="motif_annulation")
	private String motifAnnulation;

	@Column(name="motif_cloture")
	private String motifCloture;

	@Column(name="motif_rejet")
	private String motifRejet;

	@Column(name="nature_demande")
	private String natureDemande;

	@Column(name="num_commande")
	private String numCommande;

	private String objet;

	@Column(name="taux_stf")
	private BigDecimal tauxStf;

	@Column(name="taux_stf_dp")
	private double tauxStfDp;

	@Column(name="taux_stf_engagement")
	private double tauxStfEngagement;

	private String type;

	@Column(name="type_codification")
	private String typeCodification;

	private Timestamp version;

	//bi-directional many-to-many association to AchatArrivage
	@ManyToMany
	@JoinTable(
		name="achat_arrivage_demande_achat"
		, joinColumns={
			@JoinColumn(name="id_demande_achat")
			}
		, inverseJoinColumns={
			@JoinColumn(name="id_arrivage")
			}
		)
	private List<AchatArrivage> achatArrivages;

	public Demande() {
	}

	public Demande(int id2, String string) {
		// TODO Auto-generated constructor stub
		this.id=id2;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Boolean getApprobation() {
		return this.approbation;
	}

	public void setApprobation(Boolean approbation) {
		this.approbation = approbation;
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

	public Integer getCreerPar() {
		return this.creerPar;
	}

	public void setCreerPar(Integer creerPar) {
		this.creerPar = creerPar;
	}

	public Timestamp getDateAnnulation() {
		return this.dateAnnulation;
	}

	public void setDateAnnulation(Timestamp dateAnnulation) {
		this.dateAnnulation = dateAnnulation;
	}

	public Timestamp getDateApprobation() {
		return this.dateApprobation;
	}

	public void setDateApprobation(Timestamp dateApprobation) {
		this.dateApprobation = dateApprobation;
	}

	public Timestamp getDateAutorisation() {
		return this.dateAutorisation;
	}

	public void setDateAutorisation(Timestamp dateAutorisation) {
		this.dateAutorisation = dateAutorisation;
	}

	public Timestamp getDateBonCommande() {
		return this.dateBonCommande;
	}

	public void setDateBonCommande(Timestamp dateBonCommande) {
		this.dateBonCommande = dateBonCommande;
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

	public Timestamp getDateEmission() {
		return this.dateEmission;
	}

	public void setDateEmission(Timestamp dateEmission) {
		this.dateEmission = dateEmission;
	}

	public Timestamp getDateLivraisonSouhaitee() {
		return this.dateLivraisonSouhaitee;
	}

	public void setDateLivraisonSouhaitee(Timestamp dateLivraisonSouhaitee) {
		this.dateLivraisonSouhaitee = dateLivraisonSouhaitee;
	}

	public Timestamp getDateRejet() {
		return this.dateRejet;
	}

	public void setDateRejet(Timestamp dateRejet) {
		this.dateRejet = dateRejet;
	}

	public String getEtat() {
		return this.etat;
	}

	public void setEtat(String etat) {
		this.etat = etat;
	}

	public String getEtatStf() {
		return this.etatStf;
	}

	public void setEtatStf(String etatStf) {
		this.etatStf = etatStf;
	}

	public Integer getEtatUtilisateur() {
		return this.etatUtilisateur;
	}

	public void setEtatUtilisateur(Integer etatUtilisateur) {
		this.etatUtilisateur = etatUtilisateur;
	}

	public Integer getIdAffaire() {
		return this.idAffaire;
	}

	public void setIdAffaire(Integer idAffaire) {
		this.idAffaire = idAffaire;
	}

	public Integer getIdAp() {
		return this.idAp;
	}

	public void setIdAp(Integer idAp) {
		this.idAp = idAp;
	}

	public Integer getIdCentreCharge() {
		return this.idCentreCharge;
	}

	public void setIdCentreCharge(Integer idCentreCharge) {
		this.idCentreCharge = idCentreCharge;
	}

	public Integer getIdClient() {
		return this.idClient;
	}

	public void setIdClient(Integer idClient) {
		this.idClient = idClient;
	}

	public Integer getIdCorrection() {
		return this.idCorrection;
	}

	public void setIdCorrection(Integer idCorrection) {
		this.idCorrection = idCorrection;
	}

	public Integer getIdDemandeur() {
		return this.idDemandeur;
	}

	public void setIdDemandeur(Integer idDemandeur) {
		this.idDemandeur = idDemandeur;
	}

	public Integer getIdFournisseur() {
		return this.idFournisseur;
	}

	public void setIdFournisseur(Integer idFournisseur) {
		this.idFournisseur = idFournisseur;
	}

	public Integer getIdImputation() {
		return this.idImputation;
	}

	public void setIdImputation(Integer idImputation) {
		this.idImputation = idImputation;
	}

	public Integer getIdMagasinDemandeur() {
		return this.idMagasinDemandeur;
	}

	public void setIdMagasinDemandeur(Integer idMagasinDemandeur) {
		this.idMagasinDemandeur = idMagasinDemandeur;
	}

	public Integer getIdMagasinFournisseur() {
		return this.idMagasinFournisseur;
	}

	public void setIdMagasinFournisseur(Integer idMagasinFournisseur) {
		this.idMagasinFournisseur = idMagasinFournisseur;
	}

	public Long getIdOrdreTravail() {
		return this.idOrdreTravail;
	}

	public void setIdOrdreTravail(Long idOrdreTravail) {
		this.idOrdreTravail = idOrdreTravail;
	}

	public Integer getIdProcessus() {
		return this.idProcessus;
	}

	public void setIdProcessus(Integer idProcessus) {
		this.idProcessus = idProcessus;
	}

	public Integer getIdTypeStock1() {
		return this.idTypeStock1;
	}

	public void setIdTypeStock1(Integer idTypeStock1) {
		this.idTypeStock1 = idTypeStock1;
	}

	public Integer getIdTypeStock2() {
		return this.idTypeStock2;
	}

	public void setIdTypeStock2(Integer idTypeStock2) {
		this.idTypeStock2 = idTypeStock2;
	}

	public Integer getIdUniteApprobatrice() {
		return this.idUniteApprobatrice;
	}

	public void setIdUniteApprobatrice(Integer idUniteApprobatrice) {
		this.idUniteApprobatrice = idUniteApprobatrice;
	}

	public Integer getIdUniteDestinatrice() {
		return this.idUniteDestinatrice;
	}

	public void setIdUniteDestinatrice(Integer idUniteDestinatrice) {
		this.idUniteDestinatrice = idUniteDestinatrice;
	}

	public Integer getIdUniteOrganisationnelleAppartenance() {
		return this.idUniteOrganisationnelleAppartenance;
	}

	public void setIdUniteOrganisationnelleAppartenance(Integer idUniteOrganisationnelleAppartenance) {
		this.idUniteOrganisationnelleAppartenance = idUniteOrganisationnelleAppartenance;
	}

	public Integer getIdUniteOrganisationnelleCreateur() {
		return this.idUniteOrganisationnelleCreateur;
	}

	public void setIdUniteOrganisationnelleCreateur(Integer idUniteOrganisationnelleCreateur) {
		this.idUniteOrganisationnelleCreateur = idUniteOrganisationnelleCreateur;
	}

	public Integer getIdUtilAnnulation() {
		return this.idUtilAnnulation;
	}

	public void setIdUtilAnnulation(Integer idUtilAnnulation) {
		this.idUtilAnnulation = idUtilAnnulation;
	}

	public Integer getIdUtilApprobateur() {
		return this.idUtilApprobateur;
	}

	public void setIdUtilApprobateur(Integer idUtilApprobateur) {
		this.idUtilApprobateur = idUtilApprobateur;
	}

	public Integer getIdUtilAutorisateur() {
		return this.idUtilAutorisateur;
	}

	public void setIdUtilAutorisateur(Integer idUtilAutorisateur) {
		this.idUtilAutorisateur = idUtilAutorisateur;
	}

	public Integer getIdUtilCloture() {
		return this.idUtilCloture;
	}

	public void setIdUtilCloture(Integer idUtilCloture) {
		this.idUtilCloture = idUtilCloture;
	}

	public Integer getIdUtilConfirmateur() {
		return this.idUtilConfirmateur;
	}

	public void setIdUtilConfirmateur(Integer idUtilConfirmateur) {
		this.idUtilConfirmateur = idUtilConfirmateur;
	}

	public Integer getIdUtilRejet() {
		return this.idUtilRejet;
	}

	public void setIdUtilRejet(Integer idUtilRejet) {
		this.idUtilRejet = idUtilRejet;
	}

	public Timestamp getModifierLe() {
		return this.modifierLe;
	}

	public void setModifierLe(Timestamp modifierLe) {
		this.modifierLe = modifierLe;
	}

	public Integer getModifierPar() {
		return this.modifierPar;
	}

	public void setModifierPar(Integer modifierPar) {
		this.modifierPar = modifierPar;
	}

	public double getMontant() {
		return this.montant;
	}

	public void setMontant(double montant) {
		this.montant = montant;
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

	public String getMotifRejet() {
		return this.motifRejet;
	}

	public void setMotifRejet(String motifRejet) {
		this.motifRejet = motifRejet;
	}

	public String getNatureDemande() {
		return this.natureDemande;
	}

	public void setNatureDemande(String natureDemande) {
		this.natureDemande = natureDemande;
	}

	public String getNumCommande() {
		return this.numCommande;
	}

	public void setNumCommande(String numCommande) {
		this.numCommande = numCommande;
	}

	public String getObjet() {
		return this.objet;
	}

	public void setObjet(String objet) {
		this.objet = objet;
	}

	public BigDecimal getTauxStf() {
		return this.tauxStf;
	}

	public void setTauxStf(BigDecimal tauxStf) {
		this.tauxStf = tauxStf;
	}

	public double getTauxStfDp() {
		return this.tauxStfDp;
	}

	public void setTauxStfDp(double tauxStfDp) {
		this.tauxStfDp = tauxStfDp;
	}

	public double getTauxStfEngagement() {
		return this.tauxStfEngagement;
	}

	public void setTauxStfEngagement(double tauxStfEngagement) {
		this.tauxStfEngagement = tauxStfEngagement;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
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

	public List<AchatArrivage> getAchatArrivages() {
		return this.achatArrivages;
	}

	public void setAchatArrivages(List<AchatArrivage> achatArrivages) {
		this.achatArrivages = achatArrivages;
	}

}