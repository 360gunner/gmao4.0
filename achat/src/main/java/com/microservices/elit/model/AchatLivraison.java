package com.microservices.elit.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the achat_livraison database table.
 * 
 */
@Entity
@Table(name="achat_livraison")
@NamedQuery(name="AchatLivraison.findAll", query="SELECT a FROM AchatLivraison a")
public class AchatLivraison implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;

	private Boolean active;

	@Column(name="aeroport_debarquement")
	private String aeroportDebarquement;

	@Column(name="aeroport_embarquement")
	private String aeroportEmbarquement;

	private String chauffeur;

	private String code;

	@Column(name="compagnie_maritime")
	private String compagnieMaritime;

	@Column(name="creer_le")
	private Timestamp creerLe;

	@Column(name="creer_par")
	private Long creerPar;

	@Temporal(TemporalType.DATE)
	@Column(name="date_bon_livraison")
	private Date dateBonLivraison;

	@Column(name="date_cloture")
	private Timestamp dateCloture;

	@Column(name="date_confirmation")
	private Timestamp dateConfirmation;

	@Temporal(TemporalType.DATE)
	@Column(name="date_connaisement")
	private Date dateConnaisement;

	@Temporal(TemporalType.DATE)
	@Column(name="date_depart")
	private Date dateDepart;

	@Column(name="date_livraison_prevue")
	private Timestamp dateLivraisonPrevue;

	@Temporal(TemporalType.DATE)
	@Column(name="date_vol")
	private Date dateVol;

	private String etat;

	@Column(name="id_correction")
	private Integer idCorrection;

	@Column(name="id_monnaie")
	private Long idMonnaie;

	@Column(name="id_unite_organisationnelle_appartenance")
	private Long idUniteOrganisationnelleAppartenance;

	@Column(name="id_unite_organisationnelle_createur")
	private Long idUniteOrganisationnelleCreateur;

	@Column(name="lieu_chargement")
	private String lieuChargement;

	@Column(name="lieu_dechargement")
	private String lieuDechargement;

	@Column(name="matricule_remorque")
	private String matriculeRemorque;

	@Column(name="matricule_tracteur")
	private String matriculeTracteur;

	@Column(name="mode_transport")
	private Integer modeTransport;

	@Column(name="modifier_le")
	private Timestamp modifierLe;

	@Column(name="modifier_par")
	private Long modifierPar;

	private BigDecimal montant;

	@Column(name="motif_annulation")
	private String motifAnnulation;

	@Column(name="motif_cloture")
	private String motifCloture;

	@Column(name="nom_navire")
	private String nomNavire;

	@Column(name="numero_avion")
	private String numeroAvion;

	@Column(name="numero_connaisement")
	private String numeroConnaisement;

	@Column(name="numero_vol")
	private String numeroVol;

	private String numerobon;

	private String observation;

	private BigDecimal parite;

	@Column(name="port_debarquement")
	private String portDebarquement;

	@Column(name="port_embarquement")
	private String portEmbarquement;

	@Column(name="taux_change")
	private BigDecimal tauxChange;

	@Column(name="taux_stf")
	private BigDecimal tauxStf;

	@Column(name="type_codification")
	private String typeCodification;

	private Timestamp version;

	//bi-directional many-to-one association to AchatEngagement
	@ManyToOne
	@JoinColumn(name="id_contrat", insertable=false, updatable=false)
	private AchatEngagement achatEngagement;

	//bi-directional many-to-many association to AchatFacture
	@ManyToMany
	@JoinTable(
		name="achat_livraison_facture_achat"
		, joinColumns={
			@JoinColumn(name="id_livraison")
			}
		, inverseJoinColumns={
			@JoinColumn(name="id_facture_achat")
			}
		)
	private List<AchatFacture> achatFactures;

	//bi-directional many-to-one association to AchatLivraison
	@ManyToOne
	@JoinColumn(name="id_livraison_source", insertable=false, updatable=false)
	private AchatLivraison achatLivraison;

	//bi-directional many-to-one association to AchatLivraison
	@OneToMany(mappedBy="achatLivraison")
	private List<AchatLivraison> achatLivraisons;

	//bi-directional many-to-one association to AchatLivraisonFactureFrai
	@OneToMany(mappedBy="achatLivraison")
	private List<AchatLivraisonFactureFrai> achatLivraisonFactureFrais;

	//bi-directional many-to-one association to AchatLivraisonItem
	@OneToMany(mappedBy="achatLivraison")
	private List<AchatLivraisonItem> achatLivraisonItems;

	//bi-directional many-to-one association to AchatLivraisonItemFactureAchat
	@OneToMany(mappedBy="achatLivraison")
	private List<AchatLivraisonItemFactureAchat> achatLivraisonItemFactureAchats;

	//bi-directional many-to-one association to AchatLivraisonMagasin
	@OneToMany(mappedBy="achatLivraison")
	private List<AchatLivraisonMagasin> achatLivraisonMagasins;

	//bi-directional many-to-one association to VisibiliteModuleAchatLivraison
	@OneToMany(mappedBy="achatLivraison")
	private List<VisibiliteModuleAchatLivraison> visibiliteModuleAchatLivraisons;

	//bi-directional many-to-one association to VisibiliteProfilAchatLivraison
	@OneToMany(mappedBy="achatLivraison")
	private List<VisibiliteProfilAchatLivraison> visibiliteProfilAchatLivraisons;

	//bi-directional many-to-one association to VisibiliteUniteAchatLivraison
	@OneToMany(mappedBy="achatLivraison")
	private List<VisibiliteUniteAchatLivraison> visibiliteUniteAchatLivraisons;

	public AchatLivraison() {
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

	public String getAeroportDebarquement() {
		return this.aeroportDebarquement;
	}

	public void setAeroportDebarquement(String aeroportDebarquement) {
		this.aeroportDebarquement = aeroportDebarquement;
	}

	public String getAeroportEmbarquement() {
		return this.aeroportEmbarquement;
	}

	public void setAeroportEmbarquement(String aeroportEmbarquement) {
		this.aeroportEmbarquement = aeroportEmbarquement;
	}

	public String getChauffeur() {
		return this.chauffeur;
	}

	public void setChauffeur(String chauffeur) {
		this.chauffeur = chauffeur;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getCompagnieMaritime() {
		return this.compagnieMaritime;
	}

	public void setCompagnieMaritime(String compagnieMaritime) {
		this.compagnieMaritime = compagnieMaritime;
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

	public Date getDateBonLivraison() {
		return this.dateBonLivraison;
	}

	public void setDateBonLivraison(Date dateBonLivraison) {
		this.dateBonLivraison = dateBonLivraison;
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

	public Date getDateConnaisement() {
		return this.dateConnaisement;
	}

	public void setDateConnaisement(Date dateConnaisement) {
		this.dateConnaisement = dateConnaisement;
	}

	public Date getDateDepart() {
		return this.dateDepart;
	}

	public void setDateDepart(Date dateDepart) {
		this.dateDepart = dateDepart;
	}

	public Timestamp getDateLivraisonPrevue() {
		return this.dateLivraisonPrevue;
	}

	public void setDateLivraisonPrevue(Timestamp dateLivraisonPrevue) {
		this.dateLivraisonPrevue = dateLivraisonPrevue;
	}

	public Date getDateVol() {
		return this.dateVol;
	}

	public void setDateVol(Date dateVol) {
		this.dateVol = dateVol;
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

	public Long getIdMonnaie() {
		return this.idMonnaie;
	}

	public void setIdMonnaie(Long idMonnaie) {
		this.idMonnaie = idMonnaie;
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

	public String getLieuChargement() {
		return this.lieuChargement;
	}

	public void setLieuChargement(String lieuChargement) {
		this.lieuChargement = lieuChargement;
	}

	public String getLieuDechargement() {
		return this.lieuDechargement;
	}

	public void setLieuDechargement(String lieuDechargement) {
		this.lieuDechargement = lieuDechargement;
	}

	public String getMatriculeRemorque() {
		return this.matriculeRemorque;
	}

	public void setMatriculeRemorque(String matriculeRemorque) {
		this.matriculeRemorque = matriculeRemorque;
	}

	public String getMatriculeTracteur() {
		return this.matriculeTracteur;
	}

	public void setMatriculeTracteur(String matriculeTracteur) {
		this.matriculeTracteur = matriculeTracteur;
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

	public String getNomNavire() {
		return this.nomNavire;
	}

	public void setNomNavire(String nomNavire) {
		this.nomNavire = nomNavire;
	}

	public String getNumeroAvion() {
		return this.numeroAvion;
	}

	public void setNumeroAvion(String numeroAvion) {
		this.numeroAvion = numeroAvion;
	}

	public String getNumeroConnaisement() {
		return this.numeroConnaisement;
	}

	public void setNumeroConnaisement(String numeroConnaisement) {
		this.numeroConnaisement = numeroConnaisement;
	}

	public String getNumeroVol() {
		return this.numeroVol;
	}

	public void setNumeroVol(String numeroVol) {
		this.numeroVol = numeroVol;
	}

	public String getNumerobon() {
		return this.numerobon;
	}

	public void setNumerobon(String numerobon) {
		this.numerobon = numerobon;
	}

	public String getObservation() {
		return this.observation;
	}

	public void setObservation(String observation) {
		this.observation = observation;
	}

	public BigDecimal getParite() {
		return this.parite;
	}

	public void setParite(BigDecimal parite) {
		this.parite = parite;
	}

	public String getPortDebarquement() {
		return this.portDebarquement;
	}

	public void setPortDebarquement(String portDebarquement) {
		this.portDebarquement = portDebarquement;
	}

	public String getPortEmbarquement() {
		return this.portEmbarquement;
	}

	public void setPortEmbarquement(String portEmbarquement) {
		this.portEmbarquement = portEmbarquement;
	}

	public BigDecimal getTauxChange() {
		return this.tauxChange;
	}

	public void setTauxChange(BigDecimal tauxChange) {
		this.tauxChange = tauxChange;
	}

	public BigDecimal getTauxStf() {
		return this.tauxStf;
	}

	public void setTauxStf(BigDecimal tauxStf) {
		this.tauxStf = tauxStf;
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

	public AchatEngagement getAchatEngagement() {
		return this.achatEngagement;
	}

	public void setAchatEngagement(AchatEngagement achatEngagement) {
		this.achatEngagement = achatEngagement;
	}

	public List<AchatFacture> getAchatFactures() {
		return this.achatFactures;
	}

	public void setAchatFactures(List<AchatFacture> achatFactures) {
		this.achatFactures = achatFactures;
	}

	public AchatLivraison getAchatLivraison() {
		return this.achatLivraison;
	}

	public void setAchatLivraison(AchatLivraison achatLivraison) {
		this.achatLivraison = achatLivraison;
	}

	public List<AchatLivraison> getAchatLivraisons() {
		return this.achatLivraisons;
	}

	public void setAchatLivraisons(List<AchatLivraison> achatLivraisons) {
		this.achatLivraisons = achatLivraisons;
	}

	public AchatLivraison addAchatLivraison(AchatLivraison achatLivraison) {
		getAchatLivraisons().add(achatLivraison);
		achatLivraison.setAchatLivraison(this);

		return achatLivraison;
	}

	public AchatLivraison removeAchatLivraison(AchatLivraison achatLivraison) {
		getAchatLivraisons().remove(achatLivraison);
		achatLivraison.setAchatLivraison(null);

		return achatLivraison;
	}

	public List<AchatLivraisonFactureFrai> getAchatLivraisonFactureFrais() {
		return this.achatLivraisonFactureFrais;
	}

	public void setAchatLivraisonFactureFrais(List<AchatLivraisonFactureFrai> achatLivraisonFactureFrais) {
		this.achatLivraisonFactureFrais = achatLivraisonFactureFrais;
	}

	public AchatLivraisonFactureFrai addAchatLivraisonFactureFrai(AchatLivraisonFactureFrai achatLivraisonFactureFrai) {
		getAchatLivraisonFactureFrais().add(achatLivraisonFactureFrai);
		achatLivraisonFactureFrai.setAchatLivraison(this);

		return achatLivraisonFactureFrai;
	}

	public AchatLivraisonFactureFrai removeAchatLivraisonFactureFrai(AchatLivraisonFactureFrai achatLivraisonFactureFrai) {
		getAchatLivraisonFactureFrais().remove(achatLivraisonFactureFrai);
		achatLivraisonFactureFrai.setAchatLivraison(null);

		return achatLivraisonFactureFrai;
	}

	public List<AchatLivraisonItem> getAchatLivraisonItems() {
		return this.achatLivraisonItems;
	}

	public void setAchatLivraisonItems(List<AchatLivraisonItem> achatLivraisonItems) {
		this.achatLivraisonItems = achatLivraisonItems;
	}

	public AchatLivraisonItem addAchatLivraisonItem(AchatLivraisonItem achatLivraisonItem) {
		getAchatLivraisonItems().add(achatLivraisonItem);
		achatLivraisonItem.setAchatLivraison(this);

		return achatLivraisonItem;
	}

	public AchatLivraisonItem removeAchatLivraisonItem(AchatLivraisonItem achatLivraisonItem) {
		getAchatLivraisonItems().remove(achatLivraisonItem);
		achatLivraisonItem.setAchatLivraison(null);

		return achatLivraisonItem;
	}

	public List<AchatLivraisonItemFactureAchat> getAchatLivraisonItemFactureAchats() {
		return this.achatLivraisonItemFactureAchats;
	}

	public void setAchatLivraisonItemFactureAchats(List<AchatLivraisonItemFactureAchat> achatLivraisonItemFactureAchats) {
		this.achatLivraisonItemFactureAchats = achatLivraisonItemFactureAchats;
	}

	public AchatLivraisonItemFactureAchat addAchatLivraisonItemFactureAchat(AchatLivraisonItemFactureAchat achatLivraisonItemFactureAchat) {
		getAchatLivraisonItemFactureAchats().add(achatLivraisonItemFactureAchat);
		achatLivraisonItemFactureAchat.setAchatLivraison(this);

		return achatLivraisonItemFactureAchat;
	}

	public AchatLivraisonItemFactureAchat removeAchatLivraisonItemFactureAchat(AchatLivraisonItemFactureAchat achatLivraisonItemFactureAchat) {
		getAchatLivraisonItemFactureAchats().remove(achatLivraisonItemFactureAchat);
		achatLivraisonItemFactureAchat.setAchatLivraison(null);

		return achatLivraisonItemFactureAchat;
	}

	public List<AchatLivraisonMagasin> getAchatLivraisonMagasins() {
		return this.achatLivraisonMagasins;
	}

	public void setAchatLivraisonMagasins(List<AchatLivraisonMagasin> achatLivraisonMagasins) {
		this.achatLivraisonMagasins = achatLivraisonMagasins;
	}

	public AchatLivraisonMagasin addAchatLivraisonMagasin(AchatLivraisonMagasin achatLivraisonMagasin) {
		getAchatLivraisonMagasins().add(achatLivraisonMagasin);
		achatLivraisonMagasin.setAchatLivraison(this);

		return achatLivraisonMagasin;
	}

	public AchatLivraisonMagasin removeAchatLivraisonMagasin(AchatLivraisonMagasin achatLivraisonMagasin) {
		getAchatLivraisonMagasins().remove(achatLivraisonMagasin);
		achatLivraisonMagasin.setAchatLivraison(null);

		return achatLivraisonMagasin;
	}

	public List<VisibiliteModuleAchatLivraison> getVisibiliteModuleAchatLivraisons() {
		return this.visibiliteModuleAchatLivraisons;
	}

	public void setVisibiliteModuleAchatLivraisons(List<VisibiliteModuleAchatLivraison> visibiliteModuleAchatLivraisons) {
		this.visibiliteModuleAchatLivraisons = visibiliteModuleAchatLivraisons;
	}

	public VisibiliteModuleAchatLivraison addVisibiliteModuleAchatLivraison(VisibiliteModuleAchatLivraison visibiliteModuleAchatLivraison) {
		getVisibiliteModuleAchatLivraisons().add(visibiliteModuleAchatLivraison);
		visibiliteModuleAchatLivraison.setAchatLivraison(this);

		return visibiliteModuleAchatLivraison;
	}

	public VisibiliteModuleAchatLivraison removeVisibiliteModuleAchatLivraison(VisibiliteModuleAchatLivraison visibiliteModuleAchatLivraison) {
		getVisibiliteModuleAchatLivraisons().remove(visibiliteModuleAchatLivraison);
		visibiliteModuleAchatLivraison.setAchatLivraison(null);

		return visibiliteModuleAchatLivraison;
	}

	public List<VisibiliteProfilAchatLivraison> getVisibiliteProfilAchatLivraisons() {
		return this.visibiliteProfilAchatLivraisons;
	}

	public void setVisibiliteProfilAchatLivraisons(List<VisibiliteProfilAchatLivraison> visibiliteProfilAchatLivraisons) {
		this.visibiliteProfilAchatLivraisons = visibiliteProfilAchatLivraisons;
	}

	public VisibiliteProfilAchatLivraison addVisibiliteProfilAchatLivraison(VisibiliteProfilAchatLivraison visibiliteProfilAchatLivraison) {
		getVisibiliteProfilAchatLivraisons().add(visibiliteProfilAchatLivraison);
		visibiliteProfilAchatLivraison.setAchatLivraison(this);

		return visibiliteProfilAchatLivraison;
	}

	public VisibiliteProfilAchatLivraison removeVisibiliteProfilAchatLivraison(VisibiliteProfilAchatLivraison visibiliteProfilAchatLivraison) {
		getVisibiliteProfilAchatLivraisons().remove(visibiliteProfilAchatLivraison);
		visibiliteProfilAchatLivraison.setAchatLivraison(null);

		return visibiliteProfilAchatLivraison;
	}

	public List<VisibiliteUniteAchatLivraison> getVisibiliteUniteAchatLivraisons() {
		return this.visibiliteUniteAchatLivraisons;
	}

	public void setVisibiliteUniteAchatLivraisons(List<VisibiliteUniteAchatLivraison> visibiliteUniteAchatLivraisons) {
		this.visibiliteUniteAchatLivraisons = visibiliteUniteAchatLivraisons;
	}

	public VisibiliteUniteAchatLivraison addVisibiliteUniteAchatLivraison(VisibiliteUniteAchatLivraison visibiliteUniteAchatLivraison) {
		getVisibiliteUniteAchatLivraisons().add(visibiliteUniteAchatLivraison);
		visibiliteUniteAchatLivraison.setAchatLivraison(this);

		return visibiliteUniteAchatLivraison;
	}

	public VisibiliteUniteAchatLivraison removeVisibiliteUniteAchatLivraison(VisibiliteUniteAchatLivraison visibiliteUniteAchatLivraison) {
		getVisibiliteUniteAchatLivraisons().remove(visibiliteUniteAchatLivraison);
		visibiliteUniteAchatLivraison.setAchatLivraison(null);

		return visibiliteUniteAchatLivraison;
	}

}