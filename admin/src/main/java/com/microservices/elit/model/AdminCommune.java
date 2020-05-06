package com.microservices.elit.model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the admin_commune database table.
 * 
 */
@Entity
@Table(name="admin_commune")
@NamedQuery(name="AdminCommune.findAll", query="SELECT a FROM AdminCommune a")
public class AdminCommune implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="code_commune")
	private String codeCommune;

	@Column(name="code_postal_commune")
	private String codePostalCommune;

	@Column(name="creer_le")
	private Timestamp creerLe;

	private Long id;

	@Column(name="id_wilaya")
	private Integer idWilaya;

	@Column(name="modifier_le")
	private Timestamp modifierLe;

	@Column(name="modifier_par")
	private Integer modifierPar;

	@Column(name="nom_commune")
	private String nomCommune;

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

	//bi-directional many-to-one association to AdminWilaya
	@ManyToOne
	@JoinColumn(name="code_wil", insertable=false, updatable=false)
	private AdminWilaya adminWilaya;

	public AdminCommune() {
	}

	public String getCodeCommune() {
		return this.codeCommune;
	}

	public void setCodeCommune(String codeCommune) {
		this.codeCommune = codeCommune;
	}

	public String getCodePostalCommune() {
		return this.codePostalCommune;
	}

	public void setCodePostalCommune(String codePostalCommune) {
		this.codePostalCommune = codePostalCommune;
	}

	public Timestamp getCreerLe() {
		return this.creerLe;
	}

	public void setCreerLe(Timestamp creerLe) {
		this.creerLe = creerLe;
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getIdWilaya() {
		return this.idWilaya;
	}

	public void setIdWilaya(Integer idWilaya) {
		this.idWilaya = idWilaya;
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

	public String getNomCommune() {
		return this.nomCommune;
	}

	public void setNomCommune(String nomCommune) {
		this.nomCommune = nomCommune;
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

	public AdminWilaya getAdminWilaya() {
		return this.adminWilaya;
	}

	public void setAdminWilaya(AdminWilaya adminWilaya) {
		this.adminWilaya = adminWilaya;
	}

}