package com.microservices.elit.model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the admin_norme database table.
 * 
 */
@Entity
@Table(name="admin_norme")
@NamedQuery(name="AdminNorme.findAll", query="SELECT a FROM AdminNorme a")
public class AdminNorme implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Long id;

	private String code;

	@Column(name="creer_le")
	private Timestamp creerLe;

	private String designation;

	@Column(name="modifier_le")
	private Timestamp modifierLe;

	@Column(name="modifier_par")
	private Long modifierPar;

	//bi-directional many-to-one association to AdminCertification
	@OneToMany(mappedBy="adminNorme")
	private List<AdminCertification> adminCertifications;

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

	//bi-directional many-to-many association to AdminModule
	@ManyToMany
	@JoinTable(
		name="visibilite_module_norme"
		, joinColumns={
			@JoinColumn(name="id_objet")
			}
		, inverseJoinColumns={
			@JoinColumn(name="id_module")
			}
		)
	private List<AdminModule> adminModules;

	//bi-directional many-to-many association to AdminProfil
	@ManyToMany(mappedBy="adminNormes")
	private List<AdminProfil> adminProfils;

	//bi-directional many-to-many association to AdminUniteOrganisationnelle
	@ManyToMany(mappedBy="adminNormes3")
	private List<AdminUniteOrganisationnelle> adminUniteOrganisationnelles;

	public AdminNorme() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
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

	public String getDesignation() {
		return this.designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
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

	public List<AdminCertification> getAdminCertifications() {
		return this.adminCertifications;
	}

	public void setAdminCertifications(List<AdminCertification> adminCertifications) {
		this.adminCertifications = adminCertifications;
	}

	public AdminCertification addAdminCertification(AdminCertification adminCertification) {
		getAdminCertifications().add(adminCertification);
		adminCertification.setAdminNorme(this);

		return adminCertification;
	}

	public AdminCertification removeAdminCertification(AdminCertification adminCertification) {
		getAdminCertifications().remove(adminCertification);
		adminCertification.setAdminNorme(null);

		return adminCertification;
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

	public List<AdminModule> getAdminModules() {
		return this.adminModules;
	}

	public void setAdminModules(List<AdminModule> adminModules) {
		this.adminModules = adminModules;
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

}