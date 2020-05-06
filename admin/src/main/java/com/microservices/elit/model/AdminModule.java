package com.microservices.elit.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the admin_module database table.
 * 
 */
@Entity
@Table(name="admin_module")
@NamedQuery(name="AdminModule.findAll", query="SELECT a FROM AdminModule a")
public class AdminModule implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;

	@Column(name="active_module")
	private Boolean activeModule;

	private String code;

	private String description;

	private String libelle;

	private Integer ordre;

	@Column(name="url_module")
	private String urlModule;

	//bi-directional many-to-one association to AdminObjetVisibilite
	@OneToMany(mappedBy="adminModule")
	private List<AdminObjetVisibilite> adminObjetVisibilites;

	//bi-directional many-to-one association to AdminPrivilege
	@OneToMany(mappedBy="adminModule")
	private List<AdminPrivilege> adminPrivileges1;

	//bi-directional many-to-many association to AdminCertification
	@ManyToMany
	@JoinTable(
		name="visibilite_module_certification"
		, joinColumns={
			@JoinColumn(name="id_module")
			}
		, inverseJoinColumns={
			@JoinColumn(name="id_objet")
			}
		)
	private List<AdminCertification> adminCertifications;

	//bi-directional many-to-one association to VisibiliteModuleCommune
	@OneToMany(mappedBy="adminModule")
	private List<VisibiliteModuleCommune> visibiliteModuleCommunes;

	//bi-directional many-to-many association to AdminMessage
	@ManyToMany
	@JoinTable(
		name="visibilite_module_message"
		, joinColumns={
			@JoinColumn(name="id_module")
			}
		, inverseJoinColumns={
			@JoinColumn(name="id_objet")
			}
		)
	private List<AdminMessage> adminMessages;

	//bi-directional many-to-many association to AdminNorme
	@ManyToMany(mappedBy="adminModules")
	private List<AdminNorme> adminNormes;

	//bi-directional many-to-many association to AdminPrivilege
	@ManyToMany(mappedBy="adminModules")
	private List<AdminPrivilege> adminPrivileges2;

	//bi-directional many-to-many association to AdminProfil
	@ManyToMany(mappedBy="adminModules")
	private List<AdminProfil> adminProfils;

	//bi-directional many-to-many association to AdminUniteOrganisationnelle
	@ManyToMany(mappedBy="adminModules")
	private List<AdminUniteOrganisationnelle> adminUniteOrganisationnelles;

	//bi-directional many-to-many association to AdminUtilisateur
	@ManyToMany(mappedBy="adminModules")
	private List<AdminUtilisateur> adminUtilisateurs;

	//bi-directional many-to-one association to VisibiliteModuleWilaya
	@OneToMany(mappedBy="adminModule")
	private List<VisibiliteModuleWilaya> visibiliteModuleWilayas;

	public AdminModule() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Boolean getActiveModule() {
		return this.activeModule;
	}

	public void setActiveModule(Boolean activeModule) {
		this.activeModule = activeModule;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getLibelle() {
		return this.libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public Integer getOrdre() {
		return this.ordre;
	}

	public void setOrdre(Integer ordre) {
		this.ordre = ordre;
	}

	public String getUrlModule() {
		return this.urlModule;
	}

	public void setUrlModule(String urlModule) {
		this.urlModule = urlModule;
	}

	public List<AdminObjetVisibilite> getAdminObjetVisibilites() {
		return this.adminObjetVisibilites;
	}

	public void setAdminObjetVisibilites(List<AdminObjetVisibilite> adminObjetVisibilites) {
		this.adminObjetVisibilites = adminObjetVisibilites;
	}

	public AdminObjetVisibilite addAdminObjetVisibilite(AdminObjetVisibilite adminObjetVisibilite) {
		getAdminObjetVisibilites().add(adminObjetVisibilite);
		adminObjetVisibilite.setAdminModule(this);

		return adminObjetVisibilite;
	}

	public AdminObjetVisibilite removeAdminObjetVisibilite(AdminObjetVisibilite adminObjetVisibilite) {
		getAdminObjetVisibilites().remove(adminObjetVisibilite);
		adminObjetVisibilite.setAdminModule(null);

		return adminObjetVisibilite;
	}

	public List<AdminPrivilege> getAdminPrivileges1() {
		return this.adminPrivileges1;
	}

	public void setAdminPrivileges1(List<AdminPrivilege> adminPrivileges1) {
		this.adminPrivileges1 = adminPrivileges1;
	}

	public AdminPrivilege addAdminPrivileges1(AdminPrivilege adminPrivileges1) {
		getAdminPrivileges1().add(adminPrivileges1);
		adminPrivileges1.setAdminModule(this);

		return adminPrivileges1;
	}

	public AdminPrivilege removeAdminPrivileges1(AdminPrivilege adminPrivileges1) {
		getAdminPrivileges1().remove(adminPrivileges1);
		adminPrivileges1.setAdminModule(null);

		return adminPrivileges1;
	}

	public List<AdminCertification> getAdminCertifications() {
		return this.adminCertifications;
	}

	public void setAdminCertifications(List<AdminCertification> adminCertifications) {
		this.adminCertifications = adminCertifications;
	}

	public List<VisibiliteModuleCommune> getVisibiliteModuleCommunes() {
		return this.visibiliteModuleCommunes;
	}

	public void setVisibiliteModuleCommunes(List<VisibiliteModuleCommune> visibiliteModuleCommunes) {
		this.visibiliteModuleCommunes = visibiliteModuleCommunes;
	}

	public VisibiliteModuleCommune addVisibiliteModuleCommune(VisibiliteModuleCommune visibiliteModuleCommune) {
		getVisibiliteModuleCommunes().add(visibiliteModuleCommune);
		visibiliteModuleCommune.setAdminModule(this);

		return visibiliteModuleCommune;
	}

	public VisibiliteModuleCommune removeVisibiliteModuleCommune(VisibiliteModuleCommune visibiliteModuleCommune) {
		getVisibiliteModuleCommunes().remove(visibiliteModuleCommune);
		visibiliteModuleCommune.setAdminModule(null);

		return visibiliteModuleCommune;
	}

	public List<AdminMessage> getAdminMessages() {
		return this.adminMessages;
	}

	public void setAdminMessages(List<AdminMessage> adminMessages) {
		this.adminMessages = adminMessages;
	}

	public List<AdminNorme> getAdminNormes() {
		return this.adminNormes;
	}

	public void setAdminNormes(List<AdminNorme> adminNormes) {
		this.adminNormes = adminNormes;
	}

	public List<AdminPrivilege> getAdminPrivileges2() {
		return this.adminPrivileges2;
	}

	public void setAdminPrivileges2(List<AdminPrivilege> adminPrivileges2) {
		this.adminPrivileges2 = adminPrivileges2;
	}

	public List<AdminProfil> getAdminProfils() {
		return this.adminProfils;
	}

	public void setAdminProfils(List<AdminProfil> adminProfils) {
		this.adminProfils = adminProfils;
	}

	public List<AdminUniteOrganisationnelle> getAdminUniteOrganisationnelles() {
		return this.adminUniteOrganisationnelles;
	}

	public void setAdminUniteOrganisationnelles(List<AdminUniteOrganisationnelle> adminUniteOrganisationnelles) {
		this.adminUniteOrganisationnelles = adminUniteOrganisationnelles;
	}

	public List<AdminUtilisateur> getAdminUtilisateurs() {
		return this.adminUtilisateurs;
	}

	public void setAdminUtilisateurs(List<AdminUtilisateur> adminUtilisateurs) {
		this.adminUtilisateurs = adminUtilisateurs;
	}

	public List<VisibiliteModuleWilaya> getVisibiliteModuleWilayas() {
		return this.visibiliteModuleWilayas;
	}

	public void setVisibiliteModuleWilayas(List<VisibiliteModuleWilaya> visibiliteModuleWilayas) {
		this.visibiliteModuleWilayas = visibiliteModuleWilayas;
	}

	public VisibiliteModuleWilaya addVisibiliteModuleWilaya(VisibiliteModuleWilaya visibiliteModuleWilaya) {
		getVisibiliteModuleWilayas().add(visibiliteModuleWilaya);
		visibiliteModuleWilaya.setAdminModule(this);

		return visibiliteModuleWilaya;
	}

	public VisibiliteModuleWilaya removeVisibiliteModuleWilaya(VisibiliteModuleWilaya visibiliteModuleWilaya) {
		getVisibiliteModuleWilayas().remove(visibiliteModuleWilaya);
		visibiliteModuleWilaya.setAdminModule(null);

		return visibiliteModuleWilaya;
	}

}