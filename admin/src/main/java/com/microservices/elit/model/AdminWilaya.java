package com.microservices.elit.model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the admin_wilaya database table.
 * 
 */
@Entity
@Table(name="admin_wilaya")
@NamedQuery(name="AdminWilaya.findAll", query="SELECT a FROM AdminWilaya a")
public class AdminWilaya implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="code_wilaya")
	private String codeWilaya;

	@Column(name="creer_le")
	private Timestamp creerLe;

	private Integer id;

	@Column(name="modifier_le")
	private Timestamp modifierLe;

	@Column(name="modifier_par")
	private Integer modifierPar;

	@Column(name="nom_wilaya")
	private String nomWilaya;

	//bi-directional many-to-one association to AdminCommune
	@OneToMany(mappedBy="adminWilaya")
	private List<AdminCommune> adminCommunes;

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

	public AdminWilaya() {
	}

	public String getCodeWilaya() {
		return this.codeWilaya;
	}

	public void setCodeWilaya(String codeWilaya) {
		this.codeWilaya = codeWilaya;
	}

	public Timestamp getCreerLe() {
		return this.creerLe;
	}

	public void setCreerLe(Timestamp creerLe) {
		this.creerLe = creerLe;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public String getNomWilaya() {
		return this.nomWilaya;
	}

	public void setNomWilaya(String nomWilaya) {
		this.nomWilaya = nomWilaya;
	}

	public List<AdminCommune> getAdminCommunes() {
		return this.adminCommunes;
	}

	public void setAdminCommunes(List<AdminCommune> adminCommunes) {
		this.adminCommunes = adminCommunes;
	}

	public AdminCommune addAdminCommune(AdminCommune adminCommune) {
		getAdminCommunes().add(adminCommune);
		adminCommune.setAdminWilaya(this);

		return adminCommune;
	}

	public AdminCommune removeAdminCommune(AdminCommune adminCommune) {
		getAdminCommunes().remove(adminCommune);
		adminCommune.setAdminWilaya(null);

		return adminCommune;
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

}