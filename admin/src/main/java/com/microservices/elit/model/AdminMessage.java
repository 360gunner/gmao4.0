package com.microservices.elit.model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Time;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the admin_message database table.
 * 
 */
@Entity
@Table(name="admin_message")
@NamedQuery(name="AdminMessage.findAll", query="SELECT a FROM AdminMessage a")
public class AdminMessage implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;

	@Column(name="code_message")
	private String codeMessage;

	@Column(name="contenu_message")
	private String contenuMessage;

	@Column(name="creer_le")
	private Time creerLe;

	@Temporal(TemporalType.DATE)
	@Column(name="date_debut_alerte")
	private Date dateDebutAlerte;

	@Temporal(TemporalType.DATE)
	@Column(name="date_fin_alerte")
	private Date dateFinAlerte;

	@Column(name="modifier_le")
	private Time modifierLe;

	@Column(name="modifier_par")
	private Integer modifierPar;

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
	@ManyToMany(mappedBy="adminMessages")
	private List<AdminModule> adminModules;

	//bi-directional many-to-many association to AdminProfil
	@ManyToMany(mappedBy="adminMessages")
	private List<AdminProfil> adminProfils;

	//bi-directional many-to-many association to AdminUniteOrganisationnelle
	@ManyToMany(mappedBy="adminMessages3")
	private List<AdminUniteOrganisationnelle> adminUniteOrganisationnelles;

	public AdminMessage() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCodeMessage() {
		return this.codeMessage;
	}

	public void setCodeMessage(String codeMessage) {
		this.codeMessage = codeMessage;
	}

	public String getContenuMessage() {
		return this.contenuMessage;
	}

	public void setContenuMessage(String contenuMessage) {
		this.contenuMessage = contenuMessage;
	}

	public Time getCreerLe() {
		return this.creerLe;
	}

	public void setCreerLe(Time creerLe) {
		this.creerLe = creerLe;
	}

	public Date getDateDebutAlerte() {
		return this.dateDebutAlerte;
	}

	public void setDateDebutAlerte(Date dateDebutAlerte) {
		this.dateDebutAlerte = dateDebutAlerte;
	}

	public Date getDateFinAlerte() {
		return this.dateFinAlerte;
	}

	public void setDateFinAlerte(Date dateFinAlerte) {
		this.dateFinAlerte = dateFinAlerte;
	}

	public Time getModifierLe() {
		return this.modifierLe;
	}

	public void setModifierLe(Time modifierLe) {
		this.modifierLe = modifierLe;
	}

	public Integer getModifierPar() {
		return this.modifierPar;
	}

	public void setModifierPar(Integer modifierPar) {
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