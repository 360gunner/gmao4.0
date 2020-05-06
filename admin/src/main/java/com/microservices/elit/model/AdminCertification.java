package com.microservices.elit.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the admin_certification database table.
 * 
 */
@Entity
@Table(name="admin_certification")
@NamedQuery(name="AdminCertification.findAll", query="SELECT a FROM AdminCertification a")
public class AdminCertification implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Long id;

	private Boolean active;

	private String code;

	@Column(name="creer_le")
	private Timestamp creerLe;

	@Temporal(TemporalType.DATE)
	@Column(name="date_debut_validite")
	private Date dateDebutValidite;

	@Temporal(TemporalType.DATE)
	@Column(name="date_fin_validite")
	private Date dateFinValidite;

	@Column(name="id_organisme_certificateur")
	private Long idOrganismeCertificateur;

	@Column(name="image_footer")
	private Long imageFooter;

	@Column(name="image_header")
	private Long imageHeader;

	@Column(name="modifier_le")
	private Timestamp modifierLe;

	@Column(name="modifier_par")
	private Long modifierPar;

	//bi-directional many-to-one association to AdminNorme
	@ManyToOne
	@JoinColumn(name="id_norme", insertable=false, updatable=false)
	private AdminNorme adminNorme;

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

	//bi-directional many-to-many association to AdminUniteOrganisationnelle
	@ManyToMany(mappedBy="adminCertifications3")
	private List<AdminUniteOrganisationnelle> adminUniteOrganisationnelles1;

	//bi-directional many-to-one association to AdminUniteOrganisationnelle
	@OneToMany(mappedBy="adminCertification")
	private List<AdminUniteOrganisationnelle> adminUniteOrganisationnelles2;

	//bi-directional many-to-many association to AdminModule
	@ManyToMany(mappedBy="adminCertifications")
	private List<AdminModule> adminModules;

	//bi-directional many-to-many association to AdminProfil
	@ManyToMany(mappedBy="adminCertifications")
	private List<AdminProfil> adminProfils;

	//bi-directional many-to-many association to AdminUniteOrganisationnelle
	@ManyToMany(mappedBy="adminCertifications4")
	private List<AdminUniteOrganisationnelle> adminUniteOrganisationnelles3;

	public AdminCertification() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Boolean getActive() {
		return this.active;
	}

	public void setActive(Boolean active) {
		this.active = active;
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

	public Date getDateDebutValidite() {
		return this.dateDebutValidite;
	}

	public void setDateDebutValidite(Date dateDebutValidite) {
		this.dateDebutValidite = dateDebutValidite;
	}

	public Date getDateFinValidite() {
		return this.dateFinValidite;
	}

	public void setDateFinValidite(Date dateFinValidite) {
		this.dateFinValidite = dateFinValidite;
	}

	public Long getIdOrganismeCertificateur() {
		return this.idOrganismeCertificateur;
	}

	public void setIdOrganismeCertificateur(Long idOrganismeCertificateur) {
		this.idOrganismeCertificateur = idOrganismeCertificateur;
	}

	public Long getImageFooter() {
		return this.imageFooter;
	}

	public void setImageFooter(Long imageFooter) {
		this.imageFooter = imageFooter;
	}

	public Long getImageHeader() {
		return this.imageHeader;
	}

	public void setImageHeader(Long imageHeader) {
		this.imageHeader = imageHeader;
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

	public AdminNorme getAdminNorme() {
		return this.adminNorme;
	}

	public void setAdminNorme(AdminNorme adminNorme) {
		this.adminNorme = adminNorme;
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

	public List<AdminUniteOrganisationnelle> getAdminUniteOrganisationnelles1() {
		return this.adminUniteOrganisationnelles1;
	}

	public void setAdminUniteOrganisationnelles1(List<AdminUniteOrganisationnelle> adminUniteOrganisationnelles1) {
		this.adminUniteOrganisationnelles1 = adminUniteOrganisationnelles1;
	}

	public List<AdminUniteOrganisationnelle> getAdminUniteOrganisationnelles2() {
		return this.adminUniteOrganisationnelles2;
	}

	public void setAdminUniteOrganisationnelles2(List<AdminUniteOrganisationnelle> adminUniteOrganisationnelles2) {
		this.adminUniteOrganisationnelles2 = adminUniteOrganisationnelles2;
	}

	public AdminUniteOrganisationnelle addAdminUniteOrganisationnelles2(AdminUniteOrganisationnelle adminUniteOrganisationnelles2) {
		getAdminUniteOrganisationnelles2().add(adminUniteOrganisationnelles2);
		adminUniteOrganisationnelles2.setAdminCertification(this);

		return adminUniteOrganisationnelles2;
	}

	public AdminUniteOrganisationnelle removeAdminUniteOrganisationnelles2(AdminUniteOrganisationnelle adminUniteOrganisationnelles2) {
		getAdminUniteOrganisationnelles2().remove(adminUniteOrganisationnelles2);
		adminUniteOrganisationnelles2.setAdminCertification(null);

		return adminUniteOrganisationnelles2;
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

	public List<AdminUniteOrganisationnelle> getAdminUniteOrganisationnelles3() {
		return this.adminUniteOrganisationnelles3;
	}

	public void setAdminUniteOrganisationnelles3(List<AdminUniteOrganisationnelle> adminUniteOrganisationnelles3) {
		this.adminUniteOrganisationnelles3 = adminUniteOrganisationnelles3;
	}

}