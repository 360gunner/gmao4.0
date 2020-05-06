package com.microservices.elit.model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the admin_privilege database table.
 * 
 */
@Entity
@Table(name="admin_privilege")
@NamedQuery(name="AdminPrivilege.findAll", query="SELECT a FROM AdminPrivilege a")
public class AdminPrivilege implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;

	private String code;

	@Column(name="code_ihm")
	private String codeIhm;

	@Column(name="creer_le")
	private Time creerLe;

	private String description;

	@Column(name="modifier_le")
	private Timestamp modifierLe;

	@Column(name="modifier_par")
	private Integer modifierPar;

	@Column(name="url_page")
	private String urlPage;

	//bi-directional many-to-one association to AdminFavori
	@OneToMany(mappedBy="adminPrivilege")
	private List<AdminFavori> adminFavoris;

	//bi-directional many-to-one association to AdminModule
	@ManyToOne
	@JoinColumn(name="id_module", insertable=false, updatable=false)
	private AdminModule adminModule;

	//bi-directional many-to-one association to AdminUniteOrganisationnelle
	@ManyToOne
	@JoinColumn(name="id_unite_organisationnelle_appartenance", insertable=false, updatable=false)
	private AdminUniteOrganisationnelle adminUniteOrganisationnelle1;

	//bi-directional many-to-one association to AdminUniteOrganisationnelle
	@ManyToOne
	@JoinColumn(name="id_unite_organisationnelle_createur", insertable=false, updatable=false)
	private AdminUniteOrganisationnelle adminUniteOrganisationnelle2;

	//bi-directional many-to-one association to AdminUtilisateur
	@ManyToOne
	@JoinColumn(name="creer_par", insertable=false, updatable=false)
	private AdminUtilisateur adminUtilisateur;

	//bi-directional many-to-many association to AdminProfil
	@ManyToMany(mappedBy="adminPrivileges1")
	private List<AdminProfil> adminProfils1;

	//bi-directional many-to-many association to AdminModule
	@ManyToMany
	@JoinTable(
		name="visibilite_module_privilege"
		, joinColumns={
			@JoinColumn(name="id_objet")
			}
		, inverseJoinColumns={
			@JoinColumn(name="id_module")
			}
		)
	private List<AdminModule> adminModules;

	//bi-directional many-to-many association to AdminProfil
	@ManyToMany(mappedBy="adminPrivileges2")
	private List<AdminProfil> adminProfils2;

	//bi-directional many-to-many association to AdminUniteOrganisationnelle
	@ManyToMany(mappedBy="adminPrivileges3")
	private List<AdminUniteOrganisationnelle> adminUniteOrganisationnelles;

	public AdminPrivilege() {
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

	public String getCodeIhm() {
		return this.codeIhm;
	}

	public void setCodeIhm(String codeIhm) {
		this.codeIhm = codeIhm;
	}

	public Time getCreerLe() {
		return this.creerLe;
	}

	public void setCreerLe(Time creerLe) {
		this.creerLe = creerLe;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
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

	public String getUrlPage() {
		return this.urlPage;
	}

	public void setUrlPage(String urlPage) {
		this.urlPage = urlPage;
	}

	public List<AdminFavori> getAdminFavoris() {
		return this.adminFavoris;
	}

	public void setAdminFavoris(List<AdminFavori> adminFavoris) {
		this.adminFavoris = adminFavoris;
	}

	public AdminFavori addAdminFavori(AdminFavori adminFavori) {
		getAdminFavoris().add(adminFavori);
		adminFavori.setAdminPrivilege(this);

		return adminFavori;
	}

	public AdminFavori removeAdminFavori(AdminFavori adminFavori) {
		getAdminFavoris().remove(adminFavori);
		adminFavori.setAdminPrivilege(null);

		return adminFavori;
	}

	public AdminModule getAdminModule() {
		return this.adminModule;
	}

	public void setAdminModule(AdminModule adminModule) {
		this.adminModule = adminModule;
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

	public AdminUtilisateur getAdminUtilisateur() {
		return this.adminUtilisateur;
	}

	public void setAdminUtilisateur(AdminUtilisateur adminUtilisateur) {
		this.adminUtilisateur = adminUtilisateur;
	}

	public List<AdminProfil> getAdminProfils1() {
		return this.adminProfils1;
	}

	public void setAdminProfils1(List<AdminProfil> adminProfils1) {
		this.adminProfils1 = adminProfils1;
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

	public List<AdminUniteOrganisationnelle> getAdminUniteOrganisationnelles() {
		return this.adminUniteOrganisationnelles;
	}

	public void setAdminUniteOrganisationnelles(List<AdminUniteOrganisationnelle> adminUniteOrganisationnelles) {
		this.adminUniteOrganisationnelles = adminUniteOrganisationnelles;
	}

}