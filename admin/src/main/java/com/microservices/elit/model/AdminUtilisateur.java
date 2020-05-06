package com.microservices.elit.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.sql.Timestamp;
import java.util.List;
import java.util.Set;


/**
 * The persistent class for the admin_utilisateur database table.
 * 
 */
@Entity
@Table(name="admin_utilisateur")
@NamedQuery(name="AdminUtilisateur.findAll", query="SELECT a FROM AdminUtilisateur a")
public class AdminUtilisateur implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;

	private Boolean active;

	private String adresse1;

	private String adresse2;

	private Boolean changepassword;

	@Column(name="creer_le")
	private Timestamp creerLe;

	@Temporal(TemporalType.DATE)
	@Column(name="date_activation")
	private Date dateActivation;

	@Temporal(TemporalType.DATE)
	@Column(name="date_expiration")
	private Date dateExpiration;

	private String email;

	private String fax;

	private String login;

	@Column(name="modifier_le")
	private Timestamp modifierLe;

	private String nom;

	private String nomutilisateurged;

	private String passwordutilisateurged;

	private String prenom;

	private String pwd;

	@Column(name="tel_bureau")
	private String telBureau;

	@Column(name="tel_mobile")
	private String telMobile;

	private String theme;

	//bi-directional many-to-one association to AdminCertification
	@OneToMany(mappedBy="adminUtilisateur")
	private List<AdminCertification> adminCertifications;

	//bi-directional many-to-one association to AdminCommune
	@OneToMany(mappedBy="adminUtilisateur")
	private List<AdminCommune> adminCommunes;

	//bi-directional many-to-one association to AdminDroitVisibilite
	@OneToMany(mappedBy="adminUtilisateur")
	private List<AdminDroitVisibilite> adminDroitVisibilites;

	//bi-directional many-to-many association to AdminGroupe
	@ManyToMany
	@JoinTable(
		name="admin_groupe_utilisateur"
		, joinColumns={
			@JoinColumn(name="utilisateur")
			}
		, inverseJoinColumns={
			@JoinColumn(name="groupe")
			}
		)
	private List<AdminGroupe> adminGroupes;

	//bi-directional many-to-one association to AdminHistorique
	@OneToMany(mappedBy="adminUtilisateur")
	private List<AdminHistorique> adminHistoriques;

	//bi-directional many-to-one association to AdminMessage
	@OneToMany(mappedBy="adminUtilisateur")
	private List<AdminMessage> adminMessages;

	//bi-directional many-to-one association to AdminNorme
	@OneToMany(mappedBy="adminUtilisateur")
	private List<AdminNorme> adminNormes;

	//bi-directional many-to-one association to AdminPrivilege
	@OneToMany(mappedBy="adminUtilisateur")
	private List<AdminPrivilege> adminPrivileges;

	//bi-directional many-to-one association to AdminUniteOrganisationnelle
	@OneToMany(mappedBy="adminUtilisateur1")
	private List<AdminUniteOrganisationnelle> adminUniteOrganisationnelles1;

	//bi-directional many-to-one association to AdminUniteOrganisationnelle
	@OneToMany(mappedBy="adminUtilisateur2")
	private List<AdminUniteOrganisationnelle> adminUniteOrganisationnelles2;

	//bi-directional many-to-one association to AdminUniteOrganisationnelle
	@ManyToOne
	@JoinColumn(name="id_default_unite_connection", insertable=false, updatable=false)
	private AdminUniteOrganisationnelle adminUniteOrganisationnelle1;

	//bi-directional many-to-one association to AdminUniteOrganisationnelle
	@ManyToOne
	@JoinColumn(name="id_default_unite_connection", insertable=false, updatable=false)
	private AdminUniteOrganisationnelle adminUniteOrganisationnelle2;

	//bi-directional many-to-one association to AdminUniteOrganisationnelle
	@ManyToOne
	@JoinColumn(name="id_unite_organisationnelle_appartenance", insertable=false, updatable=false)
	private AdminUniteOrganisationnelle adminUniteOrganisationnelle3;

	//bi-directional many-to-one association to AdminUniteOrganisationnelle
	@ManyToOne
	@JoinColumn(name="id_unite_organisationnelle_createur", insertable=false, updatable=false)
	private AdminUniteOrganisationnelle adminUniteOrganisationnelle4;

	//bi-directional many-to-one association to AdminUtilisateur
	@ManyToOne
	@JoinColumn(name="creer_par", insertable=false, updatable=false)
	private AdminUtilisateur adminUtilisateur1;

	//bi-directional many-to-one association to AdminUtilisateur
	@OneToMany(mappedBy="adminUtilisateur1")
	private List<AdminUtilisateur> adminUtilisateurs1;

	//bi-directional many-to-one association to AdminUtilisateur
	@ManyToOne
	@JoinColumn(name="modifier_par", insertable=false, updatable=false)
	private AdminUtilisateur adminUtilisateur2;

	//bi-directional many-to-one association to AdminUtilisateur
	@OneToMany(mappedBy="adminUtilisateur2")
	private List<AdminUtilisateur> adminUtilisateurs2;

	//bi-directional many-to-one association to AdminUtilisateurFavori
	@OneToMany(mappedBy="adminUtilisateur")
	private List<AdminUtilisateurFavori> adminUtilisateurFavoris;

	//bi-directional many-to-many association to AdminProfil
	@ManyToMany
	@JoinTable(
		name="admin_utilisateur_profil"
		, joinColumns={
			@JoinColumn(name="id_utilisateur")
			}
		, inverseJoinColumns={
			@JoinColumn(name="id_profil")
			}
		)
	private List<AdminProfil> adminProfils1;

	//bi-directional many-to-one association to AdminWilaya
	@OneToMany(mappedBy="adminUtilisateur")
	private List<AdminWilaya> adminWilayas;

	//bi-directional many-to-many association to AdminModule
	@ManyToMany
	@JoinTable(
		name="visibilite_module_utilisateur"
		, joinColumns={
			@JoinColumn(name="id_objet")
			}
		, inverseJoinColumns={
			@JoinColumn(name="id_module")
			}
		)
	private List<AdminModule> adminModules;

	//bi-directional many-to-many association to AdminProfil
	@ManyToMany
	@JoinTable(
		name="visibilite_profil_utilisateur"
		, joinColumns={
			@JoinColumn(name="id_objet")
			}
		, inverseJoinColumns={
			@JoinColumn(name="id_profil")
			}
		)
	private List<AdminProfil> adminProfils2;

	//bi-directional many-to-many association to AdminUniteOrganisationnelle
	@ManyToMany
	@JoinTable(
		name="visibilite_unite_utilisateur"
		, joinColumns={
			@JoinColumn(name="id_objet")
			}
		, inverseJoinColumns={
			@JoinColumn(name="id_unite")
			}
		)
	private List<AdminUniteOrganisationnelle> adminUniteOrganisationnelles3;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinTable(name = "admin_user_role", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "role_id"))
    	private Set<AdminRole> roles;

	public AdminUtilisateur() {
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

	public String getAdresse1() {
		return this.adresse1;
	}

	public void setAdresse1(String adresse1) {
		this.adresse1 = adresse1;
	}

	public String getAdresse2() {
		return this.adresse2;
	}

	public void setAdresse2(String adresse2) {
		this.adresse2 = adresse2;
	}

	public Boolean getChangepassword() {
		return this.changepassword;
	}

	public void setChangepassword(Boolean changepassword) {
		this.changepassword = changepassword;
	}

	public Timestamp getCreerLe() {
		return this.creerLe;
	}

	public void setCreerLe(Timestamp creerLe) {
		this.creerLe = creerLe;
	}

	public Date getDateActivation() {
		return this.dateActivation;
	}

	public void setDateActivation(Date dateActivation) {
		this.dateActivation = dateActivation;
	}

	public Date getDateExpiration() {
		return this.dateExpiration;
	}

	public void setDateExpiration(Date dateExpiration) {
		this.dateExpiration = dateExpiration;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFax() {
		return this.fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getLogin() {
		return this.login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public Timestamp getModifierLe() {
		return this.modifierLe;
	}

	public void setModifierLe(Timestamp modifierLe) {
		this.modifierLe = modifierLe;
	}

	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getNomutilisateurged() {
		return this.nomutilisateurged;
	}

	public void setNomutilisateurged(String nomutilisateurged) {
		this.nomutilisateurged = nomutilisateurged;
	}

	public String getPasswordutilisateurged() {
		return this.passwordutilisateurged;
	}

	public void setPasswordutilisateurged(String passwordutilisateurged) {
		this.passwordutilisateurged = passwordutilisateurged;
	}

	public String getPrenom() {
		return this.prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getPwd() {
		return this.pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getTelBureau() {
		return this.telBureau;
	}

	public void setTelBureau(String telBureau) {
		this.telBureau = telBureau;
	}

	public String getTelMobile() {
		return this.telMobile;
	}

	public void setTelMobile(String telMobile) {
		this.telMobile = telMobile;
	}

	public String getTheme() {
		return this.theme;
	}

	public void setTheme(String theme) {
		this.theme = theme;
	}

	public List<AdminCertification> getAdminCertifications() {
		return this.adminCertifications;
	}

	public void setAdminCertifications(List<AdminCertification> adminCertifications) {
		this.adminCertifications = adminCertifications;
	}

	public AdminCertification addAdminCertification(AdminCertification adminCertification) {
		getAdminCertifications().add(adminCertification);
		adminCertification.setAdminUtilisateur(this);

		return adminCertification;
	}

	public AdminCertification removeAdminCertification(AdminCertification adminCertification) {
		getAdminCertifications().remove(adminCertification);
		adminCertification.setAdminUtilisateur(null);

		return adminCertification;
	}

	public List<AdminCommune> getAdminCommunes() {
		return this.adminCommunes;
	}

	public void setAdminCommunes(List<AdminCommune> adminCommunes) {
		this.adminCommunes = adminCommunes;
	}

	public AdminCommune addAdminCommune(AdminCommune adminCommune) {
		getAdminCommunes().add(adminCommune);
		adminCommune.setAdminUtilisateur(this);

		return adminCommune;
	}

	public AdminCommune removeAdminCommune(AdminCommune adminCommune) {
		getAdminCommunes().remove(adminCommune);
		adminCommune.setAdminUtilisateur(null);

		return adminCommune;
	}

	public List<AdminDroitVisibilite> getAdminDroitVisibilites() {
		return this.adminDroitVisibilites;
	}

	public void setAdminDroitVisibilites(List<AdminDroitVisibilite> adminDroitVisibilites) {
		this.adminDroitVisibilites = adminDroitVisibilites;
	}

	public AdminDroitVisibilite addAdminDroitVisibilite(AdminDroitVisibilite adminDroitVisibilite) {
		getAdminDroitVisibilites().add(adminDroitVisibilite);
		adminDroitVisibilite.setAdminUtilisateur(this);

		return adminDroitVisibilite;
	}

	public AdminDroitVisibilite removeAdminDroitVisibilite(AdminDroitVisibilite adminDroitVisibilite) {
		getAdminDroitVisibilites().remove(adminDroitVisibilite);
		adminDroitVisibilite.setAdminUtilisateur(null);

		return adminDroitVisibilite;
	}

	public List<AdminGroupe> getAdminGroupes() {
		return this.adminGroupes;
	}

	public void setAdminGroupes(List<AdminGroupe> adminGroupes) {
		this.adminGroupes = adminGroupes;
	}

	public List<AdminHistorique> getAdminHistoriques() {
		return this.adminHistoriques;
	}

	public void setAdminHistoriques(List<AdminHistorique> adminHistoriques) {
		this.adminHistoriques = adminHistoriques;
	}

	public AdminHistorique addAdminHistorique(AdminHistorique adminHistorique) {
		getAdminHistoriques().add(adminHistorique);
		adminHistorique.setAdminUtilisateur(this);

		return adminHistorique;
	}

	public AdminHistorique removeAdminHistorique(AdminHistorique adminHistorique) {
		getAdminHistoriques().remove(adminHistorique);
		adminHistorique.setAdminUtilisateur(null);

		return adminHistorique;
	}

	public List<AdminMessage> getAdminMessages() {
		return this.adminMessages;
	}

	public void setAdminMessages(List<AdminMessage> adminMessages) {
		this.adminMessages = adminMessages;
	}

	public AdminMessage addAdminMessage(AdminMessage adminMessage) {
		getAdminMessages().add(adminMessage);
		adminMessage.setAdminUtilisateur(this);

		return adminMessage;
	}

	public AdminMessage removeAdminMessage(AdminMessage adminMessage) {
		getAdminMessages().remove(adminMessage);
		adminMessage.setAdminUtilisateur(null);

		return adminMessage;
	}

	public List<AdminNorme> getAdminNormes() {
		return this.adminNormes;
	}

	public void setAdminNormes(List<AdminNorme> adminNormes) {
		this.adminNormes = adminNormes;
	}

	public AdminNorme addAdminNorme(AdminNorme adminNorme) {
		getAdminNormes().add(adminNorme);
		adminNorme.setAdminUtilisateur(this);

		return adminNorme;
	}

	public AdminNorme removeAdminNorme(AdminNorme adminNorme) {
		getAdminNormes().remove(adminNorme);
		adminNorme.setAdminUtilisateur(null);

		return adminNorme;
	}

	public List<AdminPrivilege> getAdminPrivileges() {
		return this.adminPrivileges;
	}

	public void setAdminPrivileges(List<AdminPrivilege> adminPrivileges) {
		this.adminPrivileges = adminPrivileges;
	}

	public AdminPrivilege addAdminPrivilege(AdminPrivilege adminPrivilege) {
		getAdminPrivileges().add(adminPrivilege);
		adminPrivilege.setAdminUtilisateur(this);

		return adminPrivilege;
	}

	public AdminPrivilege removeAdminPrivilege(AdminPrivilege adminPrivilege) {
		getAdminPrivileges().remove(adminPrivilege);
		adminPrivilege.setAdminUtilisateur(null);

		return adminPrivilege;
	}

	public List<AdminUniteOrganisationnelle> getAdminUniteOrganisationnelles1() {
		return this.adminUniteOrganisationnelles1;
	}

	public void setAdminUniteOrganisationnelles1(List<AdminUniteOrganisationnelle> adminUniteOrganisationnelles1) {
		this.adminUniteOrganisationnelles1 = adminUniteOrganisationnelles1;
	}

	public AdminUniteOrganisationnelle addAdminUniteOrganisationnelles1(AdminUniteOrganisationnelle adminUniteOrganisationnelles1) {
		getAdminUniteOrganisationnelles1().add(adminUniteOrganisationnelles1);
		adminUniteOrganisationnelles1.setAdminUtilisateur1(this);

		return adminUniteOrganisationnelles1;
	}

	public AdminUniteOrganisationnelle removeAdminUniteOrganisationnelles1(AdminUniteOrganisationnelle adminUniteOrganisationnelles1) {
		getAdminUniteOrganisationnelles1().remove(adminUniteOrganisationnelles1);
		adminUniteOrganisationnelles1.setAdminUtilisateur1(null);

		return adminUniteOrganisationnelles1;
	}

	public List<AdminUniteOrganisationnelle> getAdminUniteOrganisationnelles2() {
		return this.adminUniteOrganisationnelles2;
	}

	public void setAdminUniteOrganisationnelles2(List<AdminUniteOrganisationnelle> adminUniteOrganisationnelles2) {
		this.adminUniteOrganisationnelles2 = adminUniteOrganisationnelles2;
	}

	public AdminUniteOrganisationnelle addAdminUniteOrganisationnelles2(AdminUniteOrganisationnelle adminUniteOrganisationnelles2) {
		getAdminUniteOrganisationnelles2().add(adminUniteOrganisationnelles2);
		adminUniteOrganisationnelles2.setAdminUtilisateur2(this);

		return adminUniteOrganisationnelles2;
	}

	public AdminUniteOrganisationnelle removeAdminUniteOrganisationnelles2(AdminUniteOrganisationnelle adminUniteOrganisationnelles2) {
		getAdminUniteOrganisationnelles2().remove(adminUniteOrganisationnelles2);
		adminUniteOrganisationnelles2.setAdminUtilisateur2(null);

		return adminUniteOrganisationnelles2;
	}

	public AdminUniteOrganisationnelle getAdminUniteOrganisationnelle1() {
		return this.adminUniteOrganisationnelle1;
	}

	public void setAdminUniteOrganisationnelle1(AdminUniteOrganisationnelle adminUniteOrganisationnelle1) {
		this.adminUniteOrganisationnelle1 = adminUniteOrganisationnelle1;
	}

	public AdminUniteOrganisationnelle getAdminUniteOrganisationnelle2() {
		return this.adminUniteOrganisationnelle2;
	}

	public void setAdminUniteOrganisationnelle2(AdminUniteOrganisationnelle adminUniteOrganisationnelle2) {
		this.adminUniteOrganisationnelle2 = adminUniteOrganisationnelle2;
	}

	public AdminUniteOrganisationnelle getAdminUniteOrganisationnelle3() {
		return this.adminUniteOrganisationnelle3;
	}

	public void setAdminUniteOrganisationnelle3(AdminUniteOrganisationnelle adminUniteOrganisationnelle3) {
		this.adminUniteOrganisationnelle3 = adminUniteOrganisationnelle3;
	}

	public AdminUniteOrganisationnelle getAdminUniteOrganisationnelle4() {
		return this.adminUniteOrganisationnelle4;
	}

	public void setAdminUniteOrganisationnelle4(AdminUniteOrganisationnelle adminUniteOrganisationnelle4) {
		this.adminUniteOrganisationnelle4 = adminUniteOrganisationnelle4;
	}

	public AdminUtilisateur getAdminUtilisateur1() {
		return this.adminUtilisateur1;
	}

	public void setAdminUtilisateur1(AdminUtilisateur adminUtilisateur1) {
		this.adminUtilisateur1 = adminUtilisateur1;
	}

	public List<AdminUtilisateur> getAdminUtilisateurs1() {
		return this.adminUtilisateurs1;
	}

	public void setAdminUtilisateurs1(List<AdminUtilisateur> adminUtilisateurs1) {
		this.adminUtilisateurs1 = adminUtilisateurs1;
	}

	public AdminUtilisateur addAdminUtilisateurs1(AdminUtilisateur adminUtilisateurs1) {
		getAdminUtilisateurs1().add(adminUtilisateurs1);
		adminUtilisateurs1.setAdminUtilisateur1(this);

		return adminUtilisateurs1;
	}

	public AdminUtilisateur removeAdminUtilisateurs1(AdminUtilisateur adminUtilisateurs1) {
		getAdminUtilisateurs1().remove(adminUtilisateurs1);
		adminUtilisateurs1.setAdminUtilisateur1(null);

		return adminUtilisateurs1;
	}

	public AdminUtilisateur getAdminUtilisateur2() {
		return this.adminUtilisateur2;
	}

	public void setAdminUtilisateur2(AdminUtilisateur adminUtilisateur2) {
		this.adminUtilisateur2 = adminUtilisateur2;
	}

	public List<AdminUtilisateur> getAdminUtilisateurs2() {
		return this.adminUtilisateurs2;
	}

	public void setAdminUtilisateurs2(List<AdminUtilisateur> adminUtilisateurs2) {
		this.adminUtilisateurs2 = adminUtilisateurs2;
	}

	public AdminUtilisateur addAdminUtilisateurs2(AdminUtilisateur adminUtilisateurs2) {
		getAdminUtilisateurs2().add(adminUtilisateurs2);
		adminUtilisateurs2.setAdminUtilisateur2(this);

		return adminUtilisateurs2;
	}

	public AdminUtilisateur removeAdminUtilisateurs2(AdminUtilisateur adminUtilisateurs2) {
		getAdminUtilisateurs2().remove(adminUtilisateurs2);
		adminUtilisateurs2.setAdminUtilisateur2(null);

		return adminUtilisateurs2;
	}

	public List<AdminUtilisateurFavori> getAdminUtilisateurFavoris() {
		return this.adminUtilisateurFavoris;
	}

	public void setAdminUtilisateurFavoris(List<AdminUtilisateurFavori> adminUtilisateurFavoris) {
		this.adminUtilisateurFavoris = adminUtilisateurFavoris;
	}

	public AdminUtilisateurFavori addAdminUtilisateurFavori(AdminUtilisateurFavori adminUtilisateurFavori) {
		getAdminUtilisateurFavoris().add(adminUtilisateurFavori);
		adminUtilisateurFavori.setAdminUtilisateur(this);

		return adminUtilisateurFavori;
	}

	public AdminUtilisateurFavori removeAdminUtilisateurFavori(AdminUtilisateurFavori adminUtilisateurFavori) {
		getAdminUtilisateurFavoris().remove(adminUtilisateurFavori);
		adminUtilisateurFavori.setAdminUtilisateur(null);

		return adminUtilisateurFavori;
	}

	public List<AdminProfil> getAdminProfils1() {
		return this.adminProfils1;
	}

	public void setAdminProfils1(List<AdminProfil> adminProfils1) {
		this.adminProfils1 = adminProfils1;
	}

	public List<AdminWilaya> getAdminWilayas() {
		return this.adminWilayas;
	}

	public void setAdminWilayas(List<AdminWilaya> adminWilayas) {
		this.adminWilayas = adminWilayas;
	}

	public AdminWilaya addAdminWilaya(AdminWilaya adminWilaya) {
		getAdminWilayas().add(adminWilaya);
		adminWilaya.setAdminUtilisateur(this);

		return adminWilaya;
	}

	public AdminWilaya removeAdminWilaya(AdminWilaya adminWilaya) {
		getAdminWilayas().remove(adminWilaya);
		adminWilaya.setAdminUtilisateur(null);

		return adminWilaya;
	}

	public List<AdminModule> getAdminModules() {
		return this.adminModules;
	}

	public void setAdminModules(List<AdminModule> adminModules) {
		this.adminModules = adminModules;
	}

	public List<AdminProfil> getAdminProfils2() {
		return this.adminProfils2;
	}

	public void setAdminProfils2(List<AdminProfil> adminProfils2) {
		this.adminProfils2 = adminProfils2;
	}

	public List<AdminUniteOrganisationnelle> getAdminUniteOrganisationnelles3() {
		return this.adminUniteOrganisationnelles3;
	}

	public void setAdminUniteOrganisationnelles3(List<AdminUniteOrganisationnelle> adminUniteOrganisationnelles3) {
		this.adminUniteOrganisationnelles3 = adminUniteOrganisationnelles3;
	}

    	public Set<AdminRole> getRoles() {
     		return roles;
   	}

    	public void setRoles(Set<AdminRole> roles) {
        	this.roles = roles;
   	}

}