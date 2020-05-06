package com.microservices.elit.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the dba_societe database table.
 * 
 */
@Entity
@Table(name="dba_societe")
@NamedQuery(name="DbaSociete.findAll", query="SELECT d FROM DbaSociete d")
public class DbaSociete implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;

	private Boolean active;

	private String adresse;

	private BigDecimal capital;

	private String code;

	@Column(name="code_postal")
	private String codePostal;

	private String compte;

	@Column(name="compte_bancaire")
	private String compteBancaire;

	@Column(name="creer_le")
	private Timestamp creerLe;

	@Column(name="creer_par")
	private Integer creerPar;

	@Column(name="denom_abreg")
	private String denomAbreg;

	@Column(name="denom_complete")
	private String denomComplete;

	private String email;

	private String etat;

	private String fax;

	@Column(name="id_banque")
	private Integer idBanque;

	@Column(name="id_monnaie")
	private Integer idMonnaie;

	@Column(name="id_parent")
	private Integer idParent;

	@Column(name="id_ref_type_societe")
	private Integer idRefTypeSociete;

	@Column(name="id_unite_organisationnelle_appartenance")
	private Integer idUniteOrganisationnelleAppartenance;

	@Column(name="id_unite_organisationnelle_createur")
	private Integer idUniteOrganisationnelleCreateur;

	@Column(name="is_certifiant")
	private Boolean isCertifiant;

	@Column(name="is_from_engagement")
	private Boolean isFromEngagement;

	private String mobile;

	@Column(name="modifier_le")
	private Timestamp modifierLe;

	@Column(name="modifier_par")
	private Integer modifierPar;

	private String nif;

	private String nis;

	private String nom;

	@Column(name="num_imposition")
	private String numImposition;

	private Integer pays;

	@Column(name="peut_etre_client")
	private String peutEtreClient;

	@Column(name="peut_etre_constructeur")
	private String peutEtreConstructeur;

	@Column(name="peut_etre_fournisseur")
	private String peutEtreFournisseur;

	private String prenom;

	private String rc;

	@Column(name="secteur_activite")
	private String secteurActivite;

	@Column(name="site_web")
	private String siteWeb;

	@Column(name="statut_juridique")
	private Integer statutJuridique;

	private String tel;

	@Column(name="type_capital")
	private String typeCapital;

	@Column(name="type_client")
	private Integer typeClient;

	@Column(name="type_constructeur")
	private Integer typeConstructeur;

	@Column(name="type_fournisseur")
	private Integer typeFournisseur;

	@Column(name="type_societe")
	private String typeSociete;

	//bi-directional many-to-one association to AchatArrivage
	@OneToMany(mappedBy="dbaSociete")
	private List<AchatArrivage> achatArrivages;

	public DbaSociete() {
	}

	public DbaSociete(int id2, String string) {
		// TODO Auto-generated constructor stub
		this.id=id2;
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

	public String getAdresse() {
		return this.adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public BigDecimal getCapital() {
		return this.capital;
	}

	public void setCapital(BigDecimal capital) {
		this.capital = capital;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getCodePostal() {
		return this.codePostal;
	}

	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}

	public String getCompte() {
		return this.compte;
	}

	public void setCompte(String compte) {
		this.compte = compte;
	}

	public String getCompteBancaire() {
		return this.compteBancaire;
	}

	public void setCompteBancaire(String compteBancaire) {
		this.compteBancaire = compteBancaire;
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

	public String getDenomAbreg() {
		return this.denomAbreg;
	}

	public void setDenomAbreg(String denomAbreg) {
		this.denomAbreg = denomAbreg;
	}

	public String getDenomComplete() {
		return this.denomComplete;
	}

	public void setDenomComplete(String denomComplete) {
		this.denomComplete = denomComplete;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEtat() {
		return this.etat;
	}

	public void setEtat(String etat) {
		this.etat = etat;
	}

	public String getFax() {
		return this.fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public Integer getIdBanque() {
		return this.idBanque;
	}

	public void setIdBanque(Integer idBanque) {
		this.idBanque = idBanque;
	}

	public Integer getIdMonnaie() {
		return this.idMonnaie;
	}

	public void setIdMonnaie(Integer idMonnaie) {
		this.idMonnaie = idMonnaie;
	}

	public Integer getIdParent() {
		return this.idParent;
	}

	public void setIdParent(Integer idParent) {
		this.idParent = idParent;
	}

	public Integer getIdRefTypeSociete() {
		return this.idRefTypeSociete;
	}

	public void setIdRefTypeSociete(Integer idRefTypeSociete) {
		this.idRefTypeSociete = idRefTypeSociete;
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

	public Boolean getIsCertifiant() {
		return this.isCertifiant;
	}

	public void setIsCertifiant(Boolean isCertifiant) {
		this.isCertifiant = isCertifiant;
	}

	public Boolean getIsFromEngagement() {
		return this.isFromEngagement;
	}

	public void setIsFromEngagement(Boolean isFromEngagement) {
		this.isFromEngagement = isFromEngagement;
	}

	public String getMobile() {
		return this.mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
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

	public String getNif() {
		return this.nif;
	}

	public void setNif(String nif) {
		this.nif = nif;
	}

	public String getNis() {
		return this.nis;
	}

	public void setNis(String nis) {
		this.nis = nis;
	}

	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getNumImposition() {
		return this.numImposition;
	}

	public void setNumImposition(String numImposition) {
		this.numImposition = numImposition;
	}

	public Integer getPays() {
		return this.pays;
	}

	public void setPays(Integer pays) {
		this.pays = pays;
	}

	public String getPeutEtreClient() {
		return this.peutEtreClient;
	}

	public void setPeutEtreClient(String peutEtreClient) {
		this.peutEtreClient = peutEtreClient;
	}

	public String getPeutEtreConstructeur() {
		return this.peutEtreConstructeur;
	}

	public void setPeutEtreConstructeur(String peutEtreConstructeur) {
		this.peutEtreConstructeur = peutEtreConstructeur;
	}

	public String getPeutEtreFournisseur() {
		return this.peutEtreFournisseur;
	}

	public void setPeutEtreFournisseur(String peutEtreFournisseur) {
		this.peutEtreFournisseur = peutEtreFournisseur;
	}

	public String getPrenom() {
		return this.prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getRc() {
		return this.rc;
	}

	public void setRc(String rc) {
		this.rc = rc;
	}

	public String getSecteurActivite() {
		return this.secteurActivite;
	}

	public void setSecteurActivite(String secteurActivite) {
		this.secteurActivite = secteurActivite;
	}

	public String getSiteWeb() {
		return this.siteWeb;
	}

	public void setSiteWeb(String siteWeb) {
		this.siteWeb = siteWeb;
	}

	public Integer getStatutJuridique() {
		return this.statutJuridique;
	}

	public void setStatutJuridique(Integer statutJuridique) {
		this.statutJuridique = statutJuridique;
	}

	public String getTel() {
		return this.tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getTypeCapital() {
		return this.typeCapital;
	}

	public void setTypeCapital(String typeCapital) {
		this.typeCapital = typeCapital;
	}

	public Integer getTypeClient() {
		return this.typeClient;
	}

	public void setTypeClient(Integer typeClient) {
		this.typeClient = typeClient;
	}

	public Integer getTypeConstructeur() {
		return this.typeConstructeur;
	}

	public void setTypeConstructeur(Integer typeConstructeur) {
		this.typeConstructeur = typeConstructeur;
	}

	public Integer getTypeFournisseur() {
		return this.typeFournisseur;
	}

	public void setTypeFournisseur(Integer typeFournisseur) {
		this.typeFournisseur = typeFournisseur;
	}

	public String getTypeSociete() {
		return this.typeSociete;
	}

	public void setTypeSociete(String typeSociete) {
		this.typeSociete = typeSociete;
	}

	public List<AchatArrivage> getAchatArrivages() {
		return this.achatArrivages;
	}

	public void setAchatArrivages(List<AchatArrivage> achatArrivages) {
		this.achatArrivages = achatArrivages;
	}

	public AchatArrivage addAchatArrivage(AchatArrivage achatArrivage) {
		getAchatArrivages().add(achatArrivage);
		achatArrivage.setDbaSociete(this);

		return achatArrivage;
	}

	public AchatArrivage removeAchatArrivage(AchatArrivage achatArrivage) {
		getAchatArrivages().remove(achatArrivage);
		achatArrivage.setDbaSociete(null);

		return achatArrivage;
	}

}