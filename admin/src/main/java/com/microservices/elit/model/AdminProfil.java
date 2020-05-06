package com.microservices.elit.model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the admin_profil database table.
 * 
 */
@Entity
@Table(name="admin_profil")
@NamedQuery(name="AdminProfil.findAll", query="SELECT a FROM AdminProfil a")
public class AdminProfil implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;

	private Boolean active;

	@Column(name="creer_le")
	private Timestamp creerLe;

	@Column(name="creer_par")
	private String creerPar;

	private String description;

	private String libelle;

	@Column(name="modifier_le")
	private Timestamp modifierLe;

	@Column(name="modifier_par")
	private String modifierPar;

	//bi-directional many-to-one association to AdminUniteOrganisationnelle
	@ManyToOne
	@JoinColumn(name="id_unite_organisationnelle_appartenance", insertable=false, updatable=false)
	private AdminUniteOrganisationnelle adminUniteOrganisationnelle1;

	//bi-directional many-to-one association to AdminUniteOrganisationnelle
	@ManyToOne
	@JoinColumn(name="id_unite_organisationnelle_createur", insertable=false, updatable=false)
	private AdminUniteOrganisationnelle adminUniteOrganisationnelle2;

	//bi-directional many-to-many association to AdminPrivilege
	@ManyToMany
	@JoinTable(
		name="admin_profil_privilege"
		, joinColumns={
			@JoinColumn(name="id_profil")
			}
		, inverseJoinColumns={
			@JoinColumn(name="id_privilege")
			}
		)
	private List<AdminPrivilege> adminPrivileges1;

	//bi-directional many-to-many association to AdminUtilisateur
	@ManyToMany(mappedBy="adminProfils1")
	private List<AdminUtilisateur> adminUtilisateurs1;

	//bi-directional many-to-many association to AdminModule
	@ManyToMany
	@JoinTable(
		name="visibilite_module_profil"
		, joinColumns={
			@JoinColumn(name="id_objet")
			}
		, inverseJoinColumns={
			@JoinColumn(name="id_module")
			}
		)
	private List<AdminModule> adminModules;

	//bi-directional many-to-many association to AdminCertification
	@ManyToMany
	@JoinTable(
		name="visibilite_profil_certification"
		, joinColumns={
			@JoinColumn(name="id_profil")
			}
		, inverseJoinColumns={
			@JoinColumn(name="id_objet")
			}
		)
	private List<AdminCertification> adminCertifications;

	//bi-directional many-to-one association to VisibiliteProfilCommune
	@OneToMany(mappedBy="adminProfil")
	private List<VisibiliteProfilCommune> visibiliteProfilCommunes;

	//bi-directional many-to-many association to AdminMessage
	@ManyToMany
	@JoinTable(
		name="visibilite_profil_message"
		, joinColumns={
			@JoinColumn(name="id_profil")
			}
		, inverseJoinColumns={
			@JoinColumn(name="id_objet")
			}
		)
	private List<AdminMessage> adminMessages;

	//bi-directional many-to-many association to AdminNorme
	@ManyToMany
	@JoinTable(
		name="visibilite_profil_norme"
		, joinColumns={
			@JoinColumn(name="id_profil")
			}
		, inverseJoinColumns={
			@JoinColumn(name="id_objet")
			}
		)
	private List<AdminNorme> adminNormes;

	//bi-directional many-to-many association to AdminPrivilege
	@ManyToMany
	@JoinTable(
		name="visibilite_profil_privilege"
		, joinColumns={
			@JoinColumn(name="id_profil")
			}
		, inverseJoinColumns={
			@JoinColumn(name="id_objet")
			}
		)
	private List<AdminPrivilege> adminPrivileges2;

	//bi-directional many-to-many association to AdminProfil
	@ManyToMany
	@JoinTable(
		name="visibilite_profil_profil"
		, joinColumns={
			@JoinColumn(name="id_profil")
			}
		, inverseJoinColumns={
			@JoinColumn(name="id_objet")
			}
		)
	private List<AdminProfil> adminProfils1;

	//bi-directional many-to-many association to AdminProfil
	@ManyToMany(mappedBy="adminProfils1")
	private List<AdminProfil> adminProfils2;

	//bi-directional many-to-many association to AdminUniteOrganisationnelle
	@ManyToMany(mappedBy="adminProfils3")
	private List<AdminUniteOrganisationnelle> adminUniteOrganisationnelles1;

	//bi-directional many-to-many association to AdminUtilisateur
	@ManyToMany(mappedBy="adminProfils2")
	private List<AdminUtilisateur> adminUtilisateurs2;

	//bi-directional many-to-one association to VisibiliteProfilWilaya
	@OneToMany(mappedBy="adminProfil")
	private List<VisibiliteProfilWilaya> visibiliteProfilWilayas;

	//bi-directional many-to-many association to AdminUniteOrganisationnelle
	@ManyToMany(mappedBy="adminProfils4")
	private List<AdminUniteOrganisationnelle> adminUniteOrganisationnelles2;

	public AdminProfil() {
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

	public Timestamp getCreerLe() {
		return this.creerLe;
	}

	public void setCreerLe(Timestamp creerLe) {
		this.creerLe = creerLe;
	}

	public String getCreerPar() {
		return this.creerPar;
	}

	public void setCreerPar(String creerPar) {
		this.creerPar = creerPar;
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

	public Timestamp getModifierLe() {
		return this.modifierLe;
	}

	public void setModifierLe(Timestamp modifierLe) {
		this.modifierLe = modifierLe;
	}

	public String getModifierPar() {
		return this.modifierPar;
	}

	public void setModifierPar(String modifierPar) {
		this.modifierPar = modifierPar;
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

	public List<AdminPrivilege> getAdminPrivileges1() {
		return this.adminPrivileges1;
	}

	public void setAdminPrivileges1(List<AdminPrivilege> adminPrivileges1) {
		this.adminPrivileges1 = adminPrivileges1;
	}

	public List<AdminUtilisateur> getAdminUtilisateurs1() {
		return this.adminUtilisateurs1;
	}

	public void setAdminUtilisateurs1(List<AdminUtilisateur> adminUtilisateurs1) {
		this.adminUtilisateurs1 = adminUtilisateurs1;
	}

	public List<AdminModule> getAdminModules() {
		return this.adminModules;
	}

	public void setAdminModules(List<AdminModule> adminModules) {
		this.adminModules = adminModules;
	}

	public List<AdminCertification> getAdminCertifications() {
		return this.adminCertifications;
	}

	public void setAdminCertifications(List<AdminCertification> adminCertifications) {
		this.adminCertifications = adminCertifications;
	}

	public List<VisibiliteProfilCommune> getVisibiliteProfilCommunes() {
		return this.visibiliteProfilCommunes;
	}

	public void setVisibiliteProfilCommunes(List<VisibiliteProfilCommune> visibiliteProfilCommunes) {
		this.visibiliteProfilCommunes = visibiliteProfilCommunes;
	}

	public VisibiliteProfilCommune addVisibiliteProfilCommune(VisibiliteProfilCommune visibiliteProfilCommune) {
		getVisibiliteProfilCommunes().add(visibiliteProfilCommune);
		visibiliteProfilCommune.setAdminProfil(this);

		return visibiliteProfilCommune;
	}

	public VisibiliteProfilCommune removeVisibiliteProfilCommune(VisibiliteProfilCommune visibiliteProfilCommune) {
		getVisibiliteProfilCommunes().remove(visibiliteProfilCommune);
		visibiliteProfilCommune.setAdminProfil(null);

		return visibiliteProfilCommune;
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

	public List<AdminProfil> getAdminProfils1() {
		return this.adminProfils1;
	}

	public void setAdminProfils1(List<AdminProfil> adminProfils1) {
		this.adminProfils1 = adminProfils1;
	}

	public List<AdminProfil> getAdminProfils2() {
		return this.adminProfils2;
	}

	public void setAdminProfils2(List<AdminProfil> adminProfils2) {
		this.adminProfils2 = adminProfils2;
	}

	public List<AdminUniteOrganisationnelle> getAdminUniteOrganisationnelles1() {
		return this.adminUniteOrganisationnelles1;
	}

	public void setAdminUniteOrganisationnelles1(List<AdminUniteOrganisationnelle> adminUniteOrganisationnelles1) {
		this.adminUniteOrganisationnelles1 = adminUniteOrganisationnelles1;
	}

	public List<AdminUtilisateur> getAdminUtilisateurs2() {
		return this.adminUtilisateurs2;
	}

	public void setAdminUtilisateurs2(List<AdminUtilisateur> adminUtilisateurs2) {
		this.adminUtilisateurs2 = adminUtilisateurs2;
	}

	public List<VisibiliteProfilWilaya> getVisibiliteProfilWilayas() {
		return this.visibiliteProfilWilayas;
	}

	public void setVisibiliteProfilWilayas(List<VisibiliteProfilWilaya> visibiliteProfilWilayas) {
		this.visibiliteProfilWilayas = visibiliteProfilWilayas;
	}

	public VisibiliteProfilWilaya addVisibiliteProfilWilaya(VisibiliteProfilWilaya visibiliteProfilWilaya) {
		getVisibiliteProfilWilayas().add(visibiliteProfilWilaya);
		visibiliteProfilWilaya.setAdminProfil(this);

		return visibiliteProfilWilaya;
	}

	public VisibiliteProfilWilaya removeVisibiliteProfilWilaya(VisibiliteProfilWilaya visibiliteProfilWilaya) {
		getVisibiliteProfilWilayas().remove(visibiliteProfilWilaya);
		visibiliteProfilWilaya.setAdminProfil(null);

		return visibiliteProfilWilaya;
	}

	public List<AdminUniteOrganisationnelle> getAdminUniteOrganisationnelles2() {
		return this.adminUniteOrganisationnelles2;
	}

	public void setAdminUniteOrganisationnelles2(List<AdminUniteOrganisationnelle> adminUniteOrganisationnelles2) {
		this.adminUniteOrganisationnelles2 = adminUniteOrganisationnelles2;
	}

}