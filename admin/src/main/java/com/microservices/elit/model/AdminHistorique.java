package com.microservices.elit.model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Time;
import java.sql.Timestamp;


/**
 * The persistent class for the admin_historique database table.
 * 
 */
@Entity
@Table(name="admin_historique")
@NamedQuery(name="AdminHistorique.findAll", query="SELECT a FROM AdminHistorique a")
public class AdminHistorique implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_admin_historique")
	private Integer idAdminHistorique;

	@Column(name="adresse_ip")
	private String adresseIp;

	private String classe;

	@Column(name="creer_le")
	private Timestamp creerLe;

	@Column(name="date_mouvement")
	private Timestamp dateMouvement;

	private String donnee;

	@Column(name="id_correction")
	private Long idCorrection;

	@Column(name="id_objet")
	private String idObjet;

	@Column(name="modifier_le")
	private Time modifierLe;

	@Column(name="modifier_par")
	private Integer modifierPar;

	@Column(name="type_mouvement")
	private String typeMouvement;

	private String url;

	private String utilisateur;

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

	public AdminHistorique() {
	}

	public Integer getIdAdminHistorique() {
		return this.idAdminHistorique;
	}

	public void setIdAdminHistorique(Integer idAdminHistorique) {
		this.idAdminHistorique = idAdminHistorique;
	}

	public String getAdresseIp() {
		return this.adresseIp;
	}

	public void setAdresseIp(String adresseIp) {
		this.adresseIp = adresseIp;
	}

	public String getClasse() {
		return this.classe;
	}

	public void setClasse(String classe) {
		this.classe = classe;
	}

	public Timestamp getCreerLe() {
		return this.creerLe;
	}

	public void setCreerLe(Timestamp creerLe) {
		this.creerLe = creerLe;
	}

	public Timestamp getDateMouvement() {
		return this.dateMouvement;
	}

	public void setDateMouvement(Timestamp dateMouvement) {
		this.dateMouvement = dateMouvement;
	}

	public String getDonnee() {
		return this.donnee;
	}

	public void setDonnee(String donnee) {
		this.donnee = donnee;
	}

	public Long getIdCorrection() {
		return this.idCorrection;
	}

	public void setIdCorrection(Long idCorrection) {
		this.idCorrection = idCorrection;
	}

	public String getIdObjet() {
		return this.idObjet;
	}

	public void setIdObjet(String idObjet) {
		this.idObjet = idObjet;
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

	public String getTypeMouvement() {
		return this.typeMouvement;
	}

	public void setTypeMouvement(String typeMouvement) {
		this.typeMouvement = typeMouvement;
	}

	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUtilisateur() {
		return this.utilisateur;
	}

	public void setUtilisateur(String utilisateur) {
		this.utilisateur = utilisateur;
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