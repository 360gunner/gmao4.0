package com.microservices.elit.model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the admin_unite_organisationnelle database table.
 * 
 */
@Entity
@Table(name="admin_unite_organisationnelle")
@NamedQuery(name="AdminUniteOrganisationnelle.findAll", query="SELECT a FROM AdminUniteOrganisationnelle a")
public class AdminUniteOrganisationnelle implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;

	private Boolean active;

	@Column(name="adresse_raison_sociale")
	private String adresseRaisonSociale;

	@Column(name="adresse_registre_commerce")
	private String adresseRegistreCommerce;

	@Column(name="adresse_securite_sociale")
	private String adresseSecuriteSociale;

	@Column(name="capital_social")
	private Integer capitalSocial;

	private String code;

	@Column(name="code_activite_fiscal")
	private String codeActiviteFiscal;

	@Column(name="code_postal_raison_sociale")
	private String codePostalRaisonSociale;

	@Column(name="code_postal_registre_commerce")
	private String codePostalRegistreCommerce;

	@Column(name="code_postal_securite_sociale")
	private String codePostalSecuriteSociale;

	@Column(name="commune_raison_sociale")
	private String communeRaisonSociale;

	@Column(name="commune_registre_commerce")
	private String communeRegistreCommerce;

	@Column(name="commune_securite_sociale")
	private String communeSecuriteSociale;

	@Column(name="creer_le")
	private Timestamp creerLe;

	@Column(name="date_debut_activite")
	private Timestamp dateDebutActivite;

	@Column(name="date_delivrance")
	private Timestamp dateDelivrance;

	@Column(name="dba_type_unite_org")
	private Integer dbaTypeUniteOrg;

	@Column(name="denomination_ar")
	private String denominationAr;

	@Column(name="denomination_fr")
	private String denominationFr;

	private String email;

	@Column(name="fax_a")
	private String faxA;

	@Column(name="fax_b")
	private String faxB;

	@Column(name="forme_juridique")
	private String formeJuridique;

	@Column(name="id_commune_raison_sociale")
	private Integer idCommuneRaisonSociale;

	@Column(name="id_commune_registre_commerce")
	private Integer idCommuneRegistreCommerce;

	@Column(name="id_commune_securite_sociale")
	private Integer idCommuneSecuriteSociale;

	@Column(name="id_wilaya_raison_sociale")
	private Integer idWilayaRaisonSociale;

	@Column(name="id_wilaya_registre_commerce")
	private Integer idWilayaRegistreCommerce;

	@Column(name="id_wilaya_securite_sociale")
	private Integer idWilayaSecuriteSociale;

	@Column(name="modifier_le")
	private Timestamp modifierLe;

	private String nis;

	private Integer niveau;

	@Column(name="num_article_imposition")
	private String numArticleImposition;

	@Column(name="num_fiscal")
	private String numFiscal;

	@Column(name="num_registre_commerce")
	private String numRegistreCommerce;

	@Column(name="regime_fiscal")
	private String regimeFiscal;

	private String rib;

	@Column(name="site_web")
	private String siteWeb;

	@Column(name="tele_a")
	private String teleA;

	@Column(name="tele_b")
	private String teleB;

	private String trie;

	@Column(name="type_unite")
	private String typeUnite;

	@Column(name="wilaya_raison_sociale")
	private String wilayaRaisonSociale;

	@Column(name="wilaya_registre_commerce")
	private String wilayaRegistreCommerce;

	@Column(name="wilaya_securite_sociale")
	private String wilayaSecuriteSociale;

	//bi-directional many-to-one association to AdminCertification
	@OneToMany(mappedBy="adminUniteOrganisationnelle1")
	private List<AdminCertification> adminCertifications1;

	//bi-directional many-to-one association to AdminCertification
	@OneToMany(mappedBy="adminUniteOrganisationnelle2")
	private List<AdminCertification> adminCertifications2;

	//bi-directional many-to-one association to AdminCommune
	@OneToMany(mappedBy="adminUniteOrganisationnelle1")
	private List<AdminCommune> adminCommunes1;

	//bi-directional many-to-one association to AdminCommune
	@OneToMany(mappedBy="adminUniteOrganisationnelle2")
	private List<AdminCommune> adminCommunes2;

	//bi-directional many-to-one association to AdminDroitVisibilite
	@OneToMany(mappedBy="adminUniteOrganisationnelle")
	private List<AdminDroitVisibilite> adminDroitVisibilites;

	//bi-directional many-to-one association to AdminHistorique
	@OneToMany(mappedBy="adminUniteOrganisationnelle1")
	private List<AdminHistorique> adminHistoriques1;

	//bi-directional many-to-one association to AdminHistorique
	@OneToMany(mappedBy="adminUniteOrganisationnelle2")
	private List<AdminHistorique> adminHistoriques2;

	//bi-directional many-to-one association to AdminMessage
	@OneToMany(mappedBy="adminUniteOrganisationnelle1")
	private List<AdminMessage> adminMessages1;

	//bi-directional many-to-one association to AdminMessage
	@OneToMany(mappedBy="adminUniteOrganisationnelle2")
	private List<AdminMessage> adminMessages2;

	//bi-directional many-to-one association to AdminNorme
	@OneToMany(mappedBy="adminUniteOrganisationnelle1")
	private List<AdminNorme> adminNormes1;

	//bi-directional many-to-one association to AdminNorme
	@OneToMany(mappedBy="adminUniteOrganisationnelle2")
	private List<AdminNorme> adminNormes2;

	//bi-directional many-to-one association to AdminPrivilege
	@OneToMany(mappedBy="adminUniteOrganisationnelle1")
	private List<AdminPrivilege> adminPrivileges1;

	//bi-directional many-to-one association to AdminPrivilege
	@OneToMany(mappedBy="adminUniteOrganisationnelle2")
	private List<AdminPrivilege> adminPrivileges2;

	//bi-directional many-to-one association to AdminProfil
	@OneToMany(mappedBy="adminUniteOrganisationnelle1")
	private List<AdminProfil> adminProfils1;

	//bi-directional many-to-one association to AdminProfil
	@OneToMany(mappedBy="adminUniteOrganisationnelle2")
	private List<AdminProfil> adminProfils2;

	//bi-directional many-to-many association to AdminCertification
	@ManyToMany
	@JoinTable(
		name="admin_unite_organisationnele_certification"
		, joinColumns={
			@JoinColumn(name="id_unite_organisationnelle")
			}
		, inverseJoinColumns={
			@JoinColumn(name="id_certification")
			}
		)
	private List<AdminCertification> adminCertifications3;

	//bi-directional many-to-one association to AdminCertification
	@ManyToOne
	@JoinColumn(name="id_certification", insertable=false, updatable=false)
	private AdminCertification adminCertification;

	//bi-directional many-to-one association to AdminUniteOrganisationnelle
	@ManyToOne
	@JoinColumn(name="id_unite_organisationnelle_createur", insertable=false, updatable=false)
	private AdminUniteOrganisationnelle adminUniteOrganisationnelle1;

	//bi-directional many-to-one association to AdminUniteOrganisationnelle
	@OneToMany(mappedBy="adminUniteOrganisationnelle1")
	private List<AdminUniteOrganisationnelle> adminUniteOrganisationnelles1;

	//bi-directional many-to-one association to AdminUniteOrganisationnelle
	@ManyToOne
	@JoinColumn(name="id_unite_organisationnelle_appartenance", insertable=false, updatable=false)
	private AdminUniteOrganisationnelle adminUniteOrganisationnelle2;

	//bi-directional many-to-one association to AdminUniteOrganisationnelle
	@OneToMany(mappedBy="adminUniteOrganisationnelle2")
	private List<AdminUniteOrganisationnelle> adminUniteOrganisationnelles2;

	//bi-directional many-to-one association to AdminUtilisateur
	@ManyToOne
	@JoinColumn(name="creer_par", insertable=false, updatable=false)
	private AdminUtilisateur adminUtilisateur1;

	//bi-directional many-to-one association to AdminUtilisateur
	@ManyToOne
	@JoinColumn(name="modifier_par", insertable=false, updatable=false)
	private AdminUtilisateur adminUtilisateur2;

	//bi-directional many-to-one association to AdminUtilisateur
	@OneToMany(mappedBy="adminUniteOrganisationnelle1")
	private List<AdminUtilisateur> adminUtilisateurs1;

	//bi-directional many-to-one association to AdminUtilisateur
	@OneToMany(mappedBy="adminUniteOrganisationnelle2")
	private List<AdminUtilisateur> adminUtilisateurs2;

	//bi-directional many-to-one association to AdminUtilisateur
	@OneToMany(mappedBy="adminUniteOrganisationnelle3")
	private List<AdminUtilisateur> adminUtilisateurs3;

	//bi-directional many-to-one association to AdminUtilisateur
	@OneToMany(mappedBy="adminUniteOrganisationnelle4")
	private List<AdminUtilisateur> adminUtilisateurs4;

	//bi-directional many-to-one association to AdminWilaya
	@OneToMany(mappedBy="adminUniteOrganisationnelle1")
	private List<AdminWilaya> adminWilayas1;

	//bi-directional many-to-one association to AdminWilaya
	@OneToMany(mappedBy="adminUniteOrganisationnelle2")
	private List<AdminWilaya> adminWilayas2;

	//bi-directional many-to-many association to AdminUniteOrganisationnelle
	@ManyToMany
	@JoinTable(
		name="approbation_unite_organisationnelle"
		, joinColumns={
			@JoinColumn(name="approver_pour_id")
			}
		, inverseJoinColumns={
			@JoinColumn(name="approbateur_id")
			}
		)
	private List<AdminUniteOrganisationnelle> adminUniteOrganisationnelles3;

	//bi-directional many-to-many association to AdminUniteOrganisationnelle
	@ManyToMany(mappedBy="adminUniteOrganisationnelles3")
	private List<AdminUniteOrganisationnelle> adminUniteOrganisationnelles4;

	//bi-directional many-to-many association to AdminModule
	@ManyToMany
	@JoinTable(
		name="visibilite_module_unite_organisationnelle"
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
		name="visibilite_profil_unite_organisationnelle"
		, joinColumns={
			@JoinColumn(name="id_objet")
			}
		, inverseJoinColumns={
			@JoinColumn(name="id_profil")
			}
		)
	private List<AdminProfil> adminProfils3;

	//bi-directional many-to-many association to AdminCertification
	@ManyToMany
	@JoinTable(
		name="visibilite_unite_certification"
		, joinColumns={
			@JoinColumn(name="id_unite")
			}
		, inverseJoinColumns={
			@JoinColumn(name="id_objet")
			}
		)
	private List<AdminCertification> adminCertifications4;

	//bi-directional many-to-one association to VisibiliteUniteCommune
	@OneToMany(mappedBy="adminUniteOrganisationnelle")
	private List<VisibiliteUniteCommune> visibiliteUniteCommunes;

	//bi-directional many-to-many association to AdminMessage
	@ManyToMany
	@JoinTable(
		name="visibilite_unite_message"
		, joinColumns={
			@JoinColumn(name="id_unite")
			}
		, inverseJoinColumns={
			@JoinColumn(name="id_objet")
			}
		)
	private List<AdminMessage> adminMessages3;

	//bi-directional many-to-many association to AdminNorme
	@ManyToMany
	@JoinTable(
		name="visibilite_unite_norme"
		, joinColumns={
			@JoinColumn(name="id_unite")
			}
		, inverseJoinColumns={
			@JoinColumn(name="id_objet")
			}
		)
	private List<AdminNorme> adminNormes3;

	//bi-directional many-to-many association to AdminPrivilege
	@ManyToMany
	@JoinTable(
		name="visibilite_unite_privilege"
		, joinColumns={
			@JoinColumn(name="id_unite")
			}
		, inverseJoinColumns={
			@JoinColumn(name="id_objet")
			}
		)
	private List<AdminPrivilege> adminPrivileges3;

	//bi-directional many-to-many association to AdminProfil
	@ManyToMany
	@JoinTable(
		name="visibilite_unite_profil"
		, joinColumns={
			@JoinColumn(name="id_unite")
			}
		, inverseJoinColumns={
			@JoinColumn(name="id_objet")
			}
		)
	private List<AdminProfil> adminProfils4;

	//bi-directional many-to-many association to AdminUniteOrganisationnelle
	@ManyToMany
	@JoinTable(
		name="visibilite_unite_unite_organisationnelle"
		, joinColumns={
			@JoinColumn(name="id_unite")
			}
		, inverseJoinColumns={
			@JoinColumn(name="id_objet")
			}
		)
	private List<AdminUniteOrganisationnelle> adminUniteOrganisationnelles5;

	//bi-directional many-to-many association to AdminUniteOrganisationnelle
	@ManyToMany(mappedBy="adminUniteOrganisationnelles5")
	private List<AdminUniteOrganisationnelle> adminUniteOrganisationnelles6;

	//bi-directional many-to-many association to AdminUtilisateur
	@ManyToMany(mappedBy="adminUniteOrganisationnelles3")
	private List<AdminUtilisateur> adminUtilisateurs5;

	//bi-directional many-to-one association to VisibiliteUniteWilaya
	@OneToMany(mappedBy="adminUniteOrganisationnelle")
	private List<VisibiliteUniteWilaya> visibiliteUniteWilayas;

	public AdminUniteOrganisationnelle() {
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

	public String getAdresseRaisonSociale() {
		return this.adresseRaisonSociale;
	}

	public void setAdresseRaisonSociale(String adresseRaisonSociale) {
		this.adresseRaisonSociale = adresseRaisonSociale;
	}

	public String getAdresseRegistreCommerce() {
		return this.adresseRegistreCommerce;
	}

	public void setAdresseRegistreCommerce(String adresseRegistreCommerce) {
		this.adresseRegistreCommerce = adresseRegistreCommerce;
	}

	public String getAdresseSecuriteSociale() {
		return this.adresseSecuriteSociale;
	}

	public void setAdresseSecuriteSociale(String adresseSecuriteSociale) {
		this.adresseSecuriteSociale = adresseSecuriteSociale;
	}

	public Integer getCapitalSocial() {
		return this.capitalSocial;
	}

	public void setCapitalSocial(Integer capitalSocial) {
		this.capitalSocial = capitalSocial;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getCodeActiviteFiscal() {
		return this.codeActiviteFiscal;
	}

	public void setCodeActiviteFiscal(String codeActiviteFiscal) {
		this.codeActiviteFiscal = codeActiviteFiscal;
	}

	public String getCodePostalRaisonSociale() {
		return this.codePostalRaisonSociale;
	}

	public void setCodePostalRaisonSociale(String codePostalRaisonSociale) {
		this.codePostalRaisonSociale = codePostalRaisonSociale;
	}

	public String getCodePostalRegistreCommerce() {
		return this.codePostalRegistreCommerce;
	}

	public void setCodePostalRegistreCommerce(String codePostalRegistreCommerce) {
		this.codePostalRegistreCommerce = codePostalRegistreCommerce;
	}

	public String getCodePostalSecuriteSociale() {
		return this.codePostalSecuriteSociale;
	}

	public void setCodePostalSecuriteSociale(String codePostalSecuriteSociale) {
		this.codePostalSecuriteSociale = codePostalSecuriteSociale;
	}

	public String getCommuneRaisonSociale() {
		return this.communeRaisonSociale;
	}

	public void setCommuneRaisonSociale(String communeRaisonSociale) {
		this.communeRaisonSociale = communeRaisonSociale;
	}

	public String getCommuneRegistreCommerce() {
		return this.communeRegistreCommerce;
	}

	public void setCommuneRegistreCommerce(String communeRegistreCommerce) {
		this.communeRegistreCommerce = communeRegistreCommerce;
	}

	public String getCommuneSecuriteSociale() {
		return this.communeSecuriteSociale;
	}

	public void setCommuneSecuriteSociale(String communeSecuriteSociale) {
		this.communeSecuriteSociale = communeSecuriteSociale;
	}

	public Timestamp getCreerLe() {
		return this.creerLe;
	}

	public void setCreerLe(Timestamp creerLe) {
		this.creerLe = creerLe;
	}

	public Timestamp getDateDebutActivite() {
		return this.dateDebutActivite;
	}

	public void setDateDebutActivite(Timestamp dateDebutActivite) {
		this.dateDebutActivite = dateDebutActivite;
	}

	public Timestamp getDateDelivrance() {
		return this.dateDelivrance;
	}

	public void setDateDelivrance(Timestamp dateDelivrance) {
		this.dateDelivrance = dateDelivrance;
	}

	public Integer getDbaTypeUniteOrg() {
		return this.dbaTypeUniteOrg;
	}

	public void setDbaTypeUniteOrg(Integer dbaTypeUniteOrg) {
		this.dbaTypeUniteOrg = dbaTypeUniteOrg;
	}

	public String getDenominationAr() {
		return this.denominationAr;
	}

	public void setDenominationAr(String denominationAr) {
		this.denominationAr = denominationAr;
	}

	public String getDenominationFr() {
		return this.denominationFr;
	}

	public void setDenominationFr(String denominationFr) {
		this.denominationFr = denominationFr;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFaxA() {
		return this.faxA;
	}

	public void setFaxA(String faxA) {
		this.faxA = faxA;
	}

	public String getFaxB() {
		return this.faxB;
	}

	public void setFaxB(String faxB) {
		this.faxB = faxB;
	}

	public String getFormeJuridique() {
		return this.formeJuridique;
	}

	public void setFormeJuridique(String formeJuridique) {
		this.formeJuridique = formeJuridique;
	}

	public Integer getIdCommuneRaisonSociale() {
		return this.idCommuneRaisonSociale;
	}

	public void setIdCommuneRaisonSociale(Integer idCommuneRaisonSociale) {
		this.idCommuneRaisonSociale = idCommuneRaisonSociale;
	}

	public Integer getIdCommuneRegistreCommerce() {
		return this.idCommuneRegistreCommerce;
	}

	public void setIdCommuneRegistreCommerce(Integer idCommuneRegistreCommerce) {
		this.idCommuneRegistreCommerce = idCommuneRegistreCommerce;
	}

	public Integer getIdCommuneSecuriteSociale() {
		return this.idCommuneSecuriteSociale;
	}

	public void setIdCommuneSecuriteSociale(Integer idCommuneSecuriteSociale) {
		this.idCommuneSecuriteSociale = idCommuneSecuriteSociale;
	}

	public Integer getIdWilayaRaisonSociale() {
		return this.idWilayaRaisonSociale;
	}

	public void setIdWilayaRaisonSociale(Integer idWilayaRaisonSociale) {
		this.idWilayaRaisonSociale = idWilayaRaisonSociale;
	}

	public Integer getIdWilayaRegistreCommerce() {
		return this.idWilayaRegistreCommerce;
	}

	public void setIdWilayaRegistreCommerce(Integer idWilayaRegistreCommerce) {
		this.idWilayaRegistreCommerce = idWilayaRegistreCommerce;
	}

	public Integer getIdWilayaSecuriteSociale() {
		return this.idWilayaSecuriteSociale;
	}

	public void setIdWilayaSecuriteSociale(Integer idWilayaSecuriteSociale) {
		this.idWilayaSecuriteSociale = idWilayaSecuriteSociale;
	}

	public Timestamp getModifierLe() {
		return this.modifierLe;
	}

	public void setModifierLe(Timestamp modifierLe) {
		this.modifierLe = modifierLe;
	}

	public String getNis() {
		return this.nis;
	}

	public void setNis(String nis) {
		this.nis = nis;
	}

	public Integer getNiveau() {
		return this.niveau;
	}

	public void setNiveau(Integer niveau) {
		this.niveau = niveau;
	}

	public String getNumArticleImposition() {
		return this.numArticleImposition;
	}

	public void setNumArticleImposition(String numArticleImposition) {
		this.numArticleImposition = numArticleImposition;
	}

	public String getNumFiscal() {
		return this.numFiscal;
	}

	public void setNumFiscal(String numFiscal) {
		this.numFiscal = numFiscal;
	}

	public String getNumRegistreCommerce() {
		return this.numRegistreCommerce;
	}

	public void setNumRegistreCommerce(String numRegistreCommerce) {
		this.numRegistreCommerce = numRegistreCommerce;
	}

	public String getRegimeFiscal() {
		return this.regimeFiscal;
	}

	public void setRegimeFiscal(String regimeFiscal) {
		this.regimeFiscal = regimeFiscal;
	}

	public String getRib() {
		return this.rib;
	}

	public void setRib(String rib) {
		this.rib = rib;
	}

	public String getSiteWeb() {
		return this.siteWeb;
	}

	public void setSiteWeb(String siteWeb) {
		this.siteWeb = siteWeb;
	}

	public String getTeleA() {
		return this.teleA;
	}

	public void setTeleA(String teleA) {
		this.teleA = teleA;
	}

	public String getTeleB() {
		return this.teleB;
	}

	public void setTeleB(String teleB) {
		this.teleB = teleB;
	}

	public String getTrie() {
		return this.trie;
	}

	public void setTrie(String trie) {
		this.trie = trie;
	}

	public String getTypeUnite() {
		return this.typeUnite;
	}

	public void setTypeUnite(String typeUnite) {
		this.typeUnite = typeUnite;
	}

	public String getWilayaRaisonSociale() {
		return this.wilayaRaisonSociale;
	}

	public void setWilayaRaisonSociale(String wilayaRaisonSociale) {
		this.wilayaRaisonSociale = wilayaRaisonSociale;
	}

	public String getWilayaRegistreCommerce() {
		return this.wilayaRegistreCommerce;
	}

	public void setWilayaRegistreCommerce(String wilayaRegistreCommerce) {
		this.wilayaRegistreCommerce = wilayaRegistreCommerce;
	}

	public String getWilayaSecuriteSociale() {
		return this.wilayaSecuriteSociale;
	}

	public void setWilayaSecuriteSociale(String wilayaSecuriteSociale) {
		this.wilayaSecuriteSociale = wilayaSecuriteSociale;
	}

	public List<AdminCertification> getAdminCertifications1() {
		return this.adminCertifications1;
	}

	public void setAdminCertifications1(List<AdminCertification> adminCertifications1) {
		this.adminCertifications1 = adminCertifications1;
	}

	public AdminCertification addAdminCertifications1(AdminCertification adminCertifications1) {
		getAdminCertifications1().add(adminCertifications1);
		adminCertifications1.setAdminUniteOrganisationnelle1(this);

		return adminCertifications1;
	}

	public AdminCertification removeAdminCertifications1(AdminCertification adminCertifications1) {
		getAdminCertifications1().remove(adminCertifications1);
		adminCertifications1.setAdminUniteOrganisationnelle1(null);

		return adminCertifications1;
	}

	public List<AdminCertification> getAdminCertifications2() {
		return this.adminCertifications2;
	}

	public void setAdminCertifications2(List<AdminCertification> adminCertifications2) {
		this.adminCertifications2 = adminCertifications2;
	}

	public AdminCertification addAdminCertifications2(AdminCertification adminCertifications2) {
		getAdminCertifications2().add(adminCertifications2);
		adminCertifications2.setAdminUniteOrganisationnelle2(this);

		return adminCertifications2;
	}

	public AdminCertification removeAdminCertifications2(AdminCertification adminCertifications2) {
		getAdminCertifications2().remove(adminCertifications2);
		adminCertifications2.setAdminUniteOrganisationnelle2(null);

		return adminCertifications2;
	}

	public List<AdminCommune> getAdminCommunes1() {
		return this.adminCommunes1;
	}

	public void setAdminCommunes1(List<AdminCommune> adminCommunes1) {
		this.adminCommunes1 = adminCommunes1;
	}

	public AdminCommune addAdminCommunes1(AdminCommune adminCommunes1) {
		getAdminCommunes1().add(adminCommunes1);
		adminCommunes1.setAdminUniteOrganisationnelle1(this);

		return adminCommunes1;
	}

	public AdminCommune removeAdminCommunes1(AdminCommune adminCommunes1) {
		getAdminCommunes1().remove(adminCommunes1);
		adminCommunes1.setAdminUniteOrganisationnelle1(null);

		return adminCommunes1;
	}

	public List<AdminCommune> getAdminCommunes2() {
		return this.adminCommunes2;
	}

	public void setAdminCommunes2(List<AdminCommune> adminCommunes2) {
		this.adminCommunes2 = adminCommunes2;
	}

	public AdminCommune addAdminCommunes2(AdminCommune adminCommunes2) {
		getAdminCommunes2().add(adminCommunes2);
		adminCommunes2.setAdminUniteOrganisationnelle2(this);

		return adminCommunes2;
	}

	public AdminCommune removeAdminCommunes2(AdminCommune adminCommunes2) {
		getAdminCommunes2().remove(adminCommunes2);
		adminCommunes2.setAdminUniteOrganisationnelle2(null);

		return adminCommunes2;
	}

	public List<AdminDroitVisibilite> getAdminDroitVisibilites() {
		return this.adminDroitVisibilites;
	}

	public void setAdminDroitVisibilites(List<AdminDroitVisibilite> adminDroitVisibilites) {
		this.adminDroitVisibilites = adminDroitVisibilites;
	}

	public AdminDroitVisibilite addAdminDroitVisibilite(AdminDroitVisibilite adminDroitVisibilite) {
		getAdminDroitVisibilites().add(adminDroitVisibilite);
		adminDroitVisibilite.setAdminUniteOrganisationnelle(this);

		return adminDroitVisibilite;
	}

	public AdminDroitVisibilite removeAdminDroitVisibilite(AdminDroitVisibilite adminDroitVisibilite) {
		getAdminDroitVisibilites().remove(adminDroitVisibilite);
		adminDroitVisibilite.setAdminUniteOrganisationnelle(null);

		return adminDroitVisibilite;
	}

	public List<AdminHistorique> getAdminHistoriques1() {
		return this.adminHistoriques1;
	}

	public void setAdminHistoriques1(List<AdminHistorique> adminHistoriques1) {
		this.adminHistoriques1 = adminHistoriques1;
	}

	public AdminHistorique addAdminHistoriques1(AdminHistorique adminHistoriques1) {
		getAdminHistoriques1().add(adminHistoriques1);
		adminHistoriques1.setAdminUniteOrganisationnelle1(this);

		return adminHistoriques1;
	}

	public AdminHistorique removeAdminHistoriques1(AdminHistorique adminHistoriques1) {
		getAdminHistoriques1().remove(adminHistoriques1);
		adminHistoriques1.setAdminUniteOrganisationnelle1(null);

		return adminHistoriques1;
	}

	public List<AdminHistorique> getAdminHistoriques2() {
		return this.adminHistoriques2;
	}

	public void setAdminHistoriques2(List<AdminHistorique> adminHistoriques2) {
		this.adminHistoriques2 = adminHistoriques2;
	}

	public AdminHistorique addAdminHistoriques2(AdminHistorique adminHistoriques2) {
		getAdminHistoriques2().add(adminHistoriques2);
		adminHistoriques2.setAdminUniteOrganisationnelle2(this);

		return adminHistoriques2;
	}

	public AdminHistorique removeAdminHistoriques2(AdminHistorique adminHistoriques2) {
		getAdminHistoriques2().remove(adminHistoriques2);
		adminHistoriques2.setAdminUniteOrganisationnelle2(null);

		return adminHistoriques2;
	}

	public List<AdminMessage> getAdminMessages1() {
		return this.adminMessages1;
	}

	public void setAdminMessages1(List<AdminMessage> adminMessages1) {
		this.adminMessages1 = adminMessages1;
	}

	public AdminMessage addAdminMessages1(AdminMessage adminMessages1) {
		getAdminMessages1().add(adminMessages1);
		adminMessages1.setAdminUniteOrganisationnelle1(this);

		return adminMessages1;
	}

	public AdminMessage removeAdminMessages1(AdminMessage adminMessages1) {
		getAdminMessages1().remove(adminMessages1);
		adminMessages1.setAdminUniteOrganisationnelle1(null);

		return adminMessages1;
	}

	public List<AdminMessage> getAdminMessages2() {
		return this.adminMessages2;
	}

	public void setAdminMessages2(List<AdminMessage> adminMessages2) {
		this.adminMessages2 = adminMessages2;
	}

	public AdminMessage addAdminMessages2(AdminMessage adminMessages2) {
		getAdminMessages2().add(adminMessages2);
		adminMessages2.setAdminUniteOrganisationnelle2(this);

		return adminMessages2;
	}

	public AdminMessage removeAdminMessages2(AdminMessage adminMessages2) {
		getAdminMessages2().remove(adminMessages2);
		adminMessages2.setAdminUniteOrganisationnelle2(null);

		return adminMessages2;
	}

	public List<AdminNorme> getAdminNormes1() {
		return this.adminNormes1;
	}

	public void setAdminNormes1(List<AdminNorme> adminNormes1) {
		this.adminNormes1 = adminNormes1;
	}

	public AdminNorme addAdminNormes1(AdminNorme adminNormes1) {
		getAdminNormes1().add(adminNormes1);
		adminNormes1.setAdminUniteOrganisationnelle1(this);

		return adminNormes1;
	}

	public AdminNorme removeAdminNormes1(AdminNorme adminNormes1) {
		getAdminNormes1().remove(adminNormes1);
		adminNormes1.setAdminUniteOrganisationnelle1(null);

		return adminNormes1;
	}

	public List<AdminNorme> getAdminNormes2() {
		return this.adminNormes2;
	}

	public void setAdminNormes2(List<AdminNorme> adminNormes2) {
		this.adminNormes2 = adminNormes2;
	}

	public AdminNorme addAdminNormes2(AdminNorme adminNormes2) {
		getAdminNormes2().add(adminNormes2);
		adminNormes2.setAdminUniteOrganisationnelle2(this);

		return adminNormes2;
	}

	public AdminNorme removeAdminNormes2(AdminNorme adminNormes2) {
		getAdminNormes2().remove(adminNormes2);
		adminNormes2.setAdminUniteOrganisationnelle2(null);

		return adminNormes2;
	}

	public List<AdminPrivilege> getAdminPrivileges1() {
		return this.adminPrivileges1;
	}

	public void setAdminPrivileges1(List<AdminPrivilege> adminPrivileges1) {
		this.adminPrivileges1 = adminPrivileges1;
	}

	public AdminPrivilege addAdminPrivileges1(AdminPrivilege adminPrivileges1) {
		getAdminPrivileges1().add(adminPrivileges1);
		adminPrivileges1.setAdminUniteOrganisationnelle1(this);

		return adminPrivileges1;
	}

	public AdminPrivilege removeAdminPrivileges1(AdminPrivilege adminPrivileges1) {
		getAdminPrivileges1().remove(adminPrivileges1);
		adminPrivileges1.setAdminUniteOrganisationnelle1(null);

		return adminPrivileges1;
	}

	public List<AdminPrivilege> getAdminPrivileges2() {
		return this.adminPrivileges2;
	}

	public void setAdminPrivileges2(List<AdminPrivilege> adminPrivileges2) {
		this.adminPrivileges2 = adminPrivileges2;
	}

	public AdminPrivilege addAdminPrivileges2(AdminPrivilege adminPrivileges2) {
		getAdminPrivileges2().add(adminPrivileges2);
		adminPrivileges2.setAdminUniteOrganisationnelle2(this);

		return adminPrivileges2;
	}

	public AdminPrivilege removeAdminPrivileges2(AdminPrivilege adminPrivileges2) {
		getAdminPrivileges2().remove(adminPrivileges2);
		adminPrivileges2.setAdminUniteOrganisationnelle2(null);

		return adminPrivileges2;
	}

	public List<AdminProfil> getAdminProfils1() {
		return this.adminProfils1;
	}

	public void setAdminProfils1(List<AdminProfil> adminProfils1) {
		this.adminProfils1 = adminProfils1;
	}

	public AdminProfil addAdminProfils1(AdminProfil adminProfils1) {
		getAdminProfils1().add(adminProfils1);
		adminProfils1.setAdminUniteOrganisationnelle1(this);

		return adminProfils1;
	}

	public AdminProfil removeAdminProfils1(AdminProfil adminProfils1) {
		getAdminProfils1().remove(adminProfils1);
		adminProfils1.setAdminUniteOrganisationnelle1(null);

		return adminProfils1;
	}

	public List<AdminProfil> getAdminProfils2() {
		return this.adminProfils2;
	}

	public void setAdminProfils2(List<AdminProfil> adminProfils2) {
		this.adminProfils2 = adminProfils2;
	}

	public AdminProfil addAdminProfils2(AdminProfil adminProfils2) {
		getAdminProfils2().add(adminProfils2);
		adminProfils2.setAdminUniteOrganisationnelle2(this);

		return adminProfils2;
	}

	public AdminProfil removeAdminProfils2(AdminProfil adminProfils2) {
		getAdminProfils2().remove(adminProfils2);
		adminProfils2.setAdminUniteOrganisationnelle2(null);

		return adminProfils2;
	}

	public List<AdminCertification> getAdminCertifications3() {
		return this.adminCertifications3;
	}

	public void setAdminCertifications3(List<AdminCertification> adminCertifications3) {
		this.adminCertifications3 = adminCertifications3;
	}

	public AdminCertification getAdminCertification() {
		return this.adminCertification;
	}

	public void setAdminCertification(AdminCertification adminCertification) {
		this.adminCertification = adminCertification;
	}

	public AdminUniteOrganisationnelle getAdminUniteOrganisationnelle1() {
		return this.adminUniteOrganisationnelle1;
	}

	public void setAdminUniteOrganisationnelle1(AdminUniteOrganisationnelle adminUniteOrganisationnelle1) {
		this.adminUniteOrganisationnelle1 = adminUniteOrganisationnelle1;
	}

	public List<AdminUniteOrganisationnelle> getAdminUniteOrganisationnelles1() {
		return this.adminUniteOrganisationnelles1;
	}

	public void setAdminUniteOrganisationnelles1(List<AdminUniteOrganisationnelle> adminUniteOrganisationnelles1) {
		this.adminUniteOrganisationnelles1 = adminUniteOrganisationnelles1;
	}

	public AdminUniteOrganisationnelle addAdminUniteOrganisationnelles1(AdminUniteOrganisationnelle adminUniteOrganisationnelles1) {
		getAdminUniteOrganisationnelles1().add(adminUniteOrganisationnelles1);
		adminUniteOrganisationnelles1.setAdminUniteOrganisationnelle1(this);

		return adminUniteOrganisationnelles1;
	}

	public AdminUniteOrganisationnelle removeAdminUniteOrganisationnelles1(AdminUniteOrganisationnelle adminUniteOrganisationnelles1) {
		getAdminUniteOrganisationnelles1().remove(adminUniteOrganisationnelles1);
		adminUniteOrganisationnelles1.setAdminUniteOrganisationnelle1(null);

		return adminUniteOrganisationnelles1;
	}

	public AdminUniteOrganisationnelle getAdminUniteOrganisationnelle2() {
		return this.adminUniteOrganisationnelle2;
	}

	public void setAdminUniteOrganisationnelle2(AdminUniteOrganisationnelle adminUniteOrganisationnelle2) {
		this.adminUniteOrganisationnelle2 = adminUniteOrganisationnelle2;
	}

	public List<AdminUniteOrganisationnelle> getAdminUniteOrganisationnelles2() {
		return this.adminUniteOrganisationnelles2;
	}

	public void setAdminUniteOrganisationnelles2(List<AdminUniteOrganisationnelle> adminUniteOrganisationnelles2) {
		this.adminUniteOrganisationnelles2 = adminUniteOrganisationnelles2;
	}

	public AdminUniteOrganisationnelle addAdminUniteOrganisationnelles2(AdminUniteOrganisationnelle adminUniteOrganisationnelles2) {
		getAdminUniteOrganisationnelles2().add(adminUniteOrganisationnelles2);
		adminUniteOrganisationnelles2.setAdminUniteOrganisationnelle2(this);

		return adminUniteOrganisationnelles2;
	}

	public AdminUniteOrganisationnelle removeAdminUniteOrganisationnelles2(AdminUniteOrganisationnelle adminUniteOrganisationnelles2) {
		getAdminUniteOrganisationnelles2().remove(adminUniteOrganisationnelles2);
		adminUniteOrganisationnelles2.setAdminUniteOrganisationnelle2(null);

		return adminUniteOrganisationnelles2;
	}

	public AdminUtilisateur getAdminUtilisateur1() {
		return this.adminUtilisateur1;
	}

	public void setAdminUtilisateur1(AdminUtilisateur adminUtilisateur1) {
		this.adminUtilisateur1 = adminUtilisateur1;
	}

	public AdminUtilisateur getAdminUtilisateur2() {
		return this.adminUtilisateur2;
	}

	public void setAdminUtilisateur2(AdminUtilisateur adminUtilisateur2) {
		this.adminUtilisateur2 = adminUtilisateur2;
	}

	public List<AdminUtilisateur> getAdminUtilisateurs1() {
		return this.adminUtilisateurs1;
	}

	public void setAdminUtilisateurs1(List<AdminUtilisateur> adminUtilisateurs1) {
		this.adminUtilisateurs1 = adminUtilisateurs1;
	}

	public AdminUtilisateur addAdminUtilisateurs1(AdminUtilisateur adminUtilisateurs1) {
		getAdminUtilisateurs1().add(adminUtilisateurs1);
		adminUtilisateurs1.setAdminUniteOrganisationnelle1(this);

		return adminUtilisateurs1;
	}

	public AdminUtilisateur removeAdminUtilisateurs1(AdminUtilisateur adminUtilisateurs1) {
		getAdminUtilisateurs1().remove(adminUtilisateurs1);
		adminUtilisateurs1.setAdminUniteOrganisationnelle1(null);

		return adminUtilisateurs1;
	}

	public List<AdminUtilisateur> getAdminUtilisateurs2() {
		return this.adminUtilisateurs2;
	}

	public void setAdminUtilisateurs2(List<AdminUtilisateur> adminUtilisateurs2) {
		this.adminUtilisateurs2 = adminUtilisateurs2;
	}

	public AdminUtilisateur addAdminUtilisateurs2(AdminUtilisateur adminUtilisateurs2) {
		getAdminUtilisateurs2().add(adminUtilisateurs2);
		adminUtilisateurs2.setAdminUniteOrganisationnelle2(this);

		return adminUtilisateurs2;
	}

	public AdminUtilisateur removeAdminUtilisateurs2(AdminUtilisateur adminUtilisateurs2) {
		getAdminUtilisateurs2().remove(adminUtilisateurs2);
		adminUtilisateurs2.setAdminUniteOrganisationnelle2(null);

		return adminUtilisateurs2;
	}

	public List<AdminUtilisateur> getAdminUtilisateurs3() {
		return this.adminUtilisateurs3;
	}

	public void setAdminUtilisateurs3(List<AdminUtilisateur> adminUtilisateurs3) {
		this.adminUtilisateurs3 = adminUtilisateurs3;
	}

	public AdminUtilisateur addAdminUtilisateurs3(AdminUtilisateur adminUtilisateurs3) {
		getAdminUtilisateurs3().add(adminUtilisateurs3);
		adminUtilisateurs3.setAdminUniteOrganisationnelle3(this);

		return adminUtilisateurs3;
	}

	public AdminUtilisateur removeAdminUtilisateurs3(AdminUtilisateur adminUtilisateurs3) {
		getAdminUtilisateurs3().remove(adminUtilisateurs3);
		adminUtilisateurs3.setAdminUniteOrganisationnelle3(null);

		return adminUtilisateurs3;
	}

	public List<AdminUtilisateur> getAdminUtilisateurs4() {
		return this.adminUtilisateurs4;
	}

	public void setAdminUtilisateurs4(List<AdminUtilisateur> adminUtilisateurs4) {
		this.adminUtilisateurs4 = adminUtilisateurs4;
	}

	public AdminUtilisateur addAdminUtilisateurs4(AdminUtilisateur adminUtilisateurs4) {
		getAdminUtilisateurs4().add(adminUtilisateurs4);
		adminUtilisateurs4.setAdminUniteOrganisationnelle4(this);

		return adminUtilisateurs4;
	}

	public AdminUtilisateur removeAdminUtilisateurs4(AdminUtilisateur adminUtilisateurs4) {
		getAdminUtilisateurs4().remove(adminUtilisateurs4);
		adminUtilisateurs4.setAdminUniteOrganisationnelle4(null);

		return adminUtilisateurs4;
	}

	public List<AdminWilaya> getAdminWilayas1() {
		return this.adminWilayas1;
	}

	public void setAdminWilayas1(List<AdminWilaya> adminWilayas1) {
		this.adminWilayas1 = adminWilayas1;
	}

	public AdminWilaya addAdminWilayas1(AdminWilaya adminWilayas1) {
		getAdminWilayas1().add(adminWilayas1);
		adminWilayas1.setAdminUniteOrganisationnelle1(this);

		return adminWilayas1;
	}

	public AdminWilaya removeAdminWilayas1(AdminWilaya adminWilayas1) {
		getAdminWilayas1().remove(adminWilayas1);
		adminWilayas1.setAdminUniteOrganisationnelle1(null);

		return adminWilayas1;
	}

	public List<AdminWilaya> getAdminWilayas2() {
		return this.adminWilayas2;
	}

	public void setAdminWilayas2(List<AdminWilaya> adminWilayas2) {
		this.adminWilayas2 = adminWilayas2;
	}

	public AdminWilaya addAdminWilayas2(AdminWilaya adminWilayas2) {
		getAdminWilayas2().add(adminWilayas2);
		adminWilayas2.setAdminUniteOrganisationnelle2(this);

		return adminWilayas2;
	}

	public AdminWilaya removeAdminWilayas2(AdminWilaya adminWilayas2) {
		getAdminWilayas2().remove(adminWilayas2);
		adminWilayas2.setAdminUniteOrganisationnelle2(null);

		return adminWilayas2;
	}

	public List<AdminUniteOrganisationnelle> getAdminUniteOrganisationnelles3() {
		return this.adminUniteOrganisationnelles3;
	}

	public void setAdminUniteOrganisationnelles3(List<AdminUniteOrganisationnelle> adminUniteOrganisationnelles3) {
		this.adminUniteOrganisationnelles3 = adminUniteOrganisationnelles3;
	}

	public List<AdminUniteOrganisationnelle> getAdminUniteOrganisationnelles4() {
		return this.adminUniteOrganisationnelles4;
	}

	public void setAdminUniteOrganisationnelles4(List<AdminUniteOrganisationnelle> adminUniteOrganisationnelles4) {
		this.adminUniteOrganisationnelles4 = adminUniteOrganisationnelles4;
	}

	public List<AdminModule> getAdminModules() {
		return this.adminModules;
	}

	public void setAdminModules(List<AdminModule> adminModules) {
		this.adminModules = adminModules;
	}

	public List<AdminProfil> getAdminProfils3() {
		return this.adminProfils3;
	}

	public void setAdminProfils3(List<AdminProfil> adminProfils3) {
		this.adminProfils3 = adminProfils3;
	}

	public List<AdminCertification> getAdminCertifications4() {
		return this.adminCertifications4;
	}

	public void setAdminCertifications4(List<AdminCertification> adminCertifications4) {
		this.adminCertifications4 = adminCertifications4;
	}

	public List<VisibiliteUniteCommune> getVisibiliteUniteCommunes() {
		return this.visibiliteUniteCommunes;
	}

	public void setVisibiliteUniteCommunes(List<VisibiliteUniteCommune> visibiliteUniteCommunes) {
		this.visibiliteUniteCommunes = visibiliteUniteCommunes;
	}

	public VisibiliteUniteCommune addVisibiliteUniteCommune(VisibiliteUniteCommune visibiliteUniteCommune) {
		getVisibiliteUniteCommunes().add(visibiliteUniteCommune);
		visibiliteUniteCommune.setAdminUniteOrganisationnelle(this);

		return visibiliteUniteCommune;
	}

	public VisibiliteUniteCommune removeVisibiliteUniteCommune(VisibiliteUniteCommune visibiliteUniteCommune) {
		getVisibiliteUniteCommunes().remove(visibiliteUniteCommune);
		visibiliteUniteCommune.setAdminUniteOrganisationnelle(null);

		return visibiliteUniteCommune;
	}

	public List<AdminMessage> getAdminMessages3() {
		return this.adminMessages3;
	}

	public void setAdminMessages3(List<AdminMessage> adminMessages3) {
		this.adminMessages3 = adminMessages3;
	}

	public List<AdminNorme> getAdminNormes3() {
		return this.adminNormes3;
	}

	public void setAdminNormes3(List<AdminNorme> adminNormes3) {
		this.adminNormes3 = adminNormes3;
	}

	public List<AdminPrivilege> getAdminPrivileges3() {
		return this.adminPrivileges3;
	}

	public void setAdminPrivileges3(List<AdminPrivilege> adminPrivileges3) {
		this.adminPrivileges3 = adminPrivileges3;
	}

	public List<AdminProfil> getAdminProfils4() {
		return this.adminProfils4;
	}

	public void setAdminProfils4(List<AdminProfil> adminProfils4) {
		this.adminProfils4 = adminProfils4;
	}

	public List<AdminUniteOrganisationnelle> getAdminUniteOrganisationnelles5() {
		return this.adminUniteOrganisationnelles5;
	}

	public void setAdminUniteOrganisationnelles5(List<AdminUniteOrganisationnelle> adminUniteOrganisationnelles5) {
		this.adminUniteOrganisationnelles5 = adminUniteOrganisationnelles5;
	}

	public List<AdminUniteOrganisationnelle> getAdminUniteOrganisationnelles6() {
		return this.adminUniteOrganisationnelles6;
	}

	public void setAdminUniteOrganisationnelles6(List<AdminUniteOrganisationnelle> adminUniteOrganisationnelles6) {
		this.adminUniteOrganisationnelles6 = adminUniteOrganisationnelles6;
	}

	public List<AdminUtilisateur> getAdminUtilisateurs5() {
		return this.adminUtilisateurs5;
	}

	public void setAdminUtilisateurs5(List<AdminUtilisateur> adminUtilisateurs5) {
		this.adminUtilisateurs5 = adminUtilisateurs5;
	}

	public List<VisibiliteUniteWilaya> getVisibiliteUniteWilayas() {
		return this.visibiliteUniteWilayas;
	}

	public void setVisibiliteUniteWilayas(List<VisibiliteUniteWilaya> visibiliteUniteWilayas) {
		this.visibiliteUniteWilayas = visibiliteUniteWilayas;
	}

	public VisibiliteUniteWilaya addVisibiliteUniteWilaya(VisibiliteUniteWilaya visibiliteUniteWilaya) {
		getVisibiliteUniteWilayas().add(visibiliteUniteWilaya);
		visibiliteUniteWilaya.setAdminUniteOrganisationnelle(this);

		return visibiliteUniteWilaya;
	}

	public VisibiliteUniteWilaya removeVisibiliteUniteWilaya(VisibiliteUniteWilaya visibiliteUniteWilaya) {
		getVisibiliteUniteWilayas().remove(visibiliteUniteWilaya);
		visibiliteUniteWilaya.setAdminUniteOrganisationnelle(null);

		return visibiliteUniteWilaya;
	}

}