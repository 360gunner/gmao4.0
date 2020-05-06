package com.microservices.elit.model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the dba_centre_charge database table.
 * 
 */
@Entity
@Table(name="dba_centre_charge")
@NamedQuery(name="DbaCentreCharge.findAll", query="SELECT d FROM DbaCentreCharge d")
public class DbaCentreCharge implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;

	private Boolean active;

	private String code;

	@Column(name="code_categorie")
	private String codeCategorie;

	@Column(name="creer_le")
	private Timestamp creerLe;

	@Column(name="creer_par")
	private Integer creerPar;

	@Column(name="date_experation")
	private Timestamp dateExperation;

	private String description;

	private String designation;

	@Column(name="id_centre_charge_pere")
	private Integer idCentreChargePere;

	@Column(name="id_unite_organisationnelle_appartenance")
	private Integer idUniteOrganisationnelleAppartenance;

	@Column(name="id_unite_organisationnelle_createur")
	private Integer idUniteOrganisationnelleCreateur;

	@Column(name="is_from_engagement")
	private Boolean isFromEngagement;

	@Column(name="modifier_le")
	private Timestamp modifierLe;

	@Column(name="modifier_par")
	private Integer modifierPar;

	//bi-directional many-to-one association to AchatArrivage
	@OneToMany(mappedBy="dbaCentreCharge")
	private List<AchatArrivage> achatArrivages;

	public DbaCentreCharge() {
	}

	public DbaCentreCharge(int id2, String string) {
		
		this.id=id2;
		
		// TODO Auto-generated constructor stub
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

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getCodeCategorie() {
		return this.codeCategorie;
	}

	public void setCodeCategorie(String codeCategorie) {
		this.codeCategorie = codeCategorie;
	}

	public Timestamp getCreerLe() {
		return this.creerLe;
	}

	public void setCreerLe(Timestamp creerLe) {
		this.creerLe = creerLe;
	}

	public Integer getCreerPar() {
		return this.creerPar;
	}

	public void setCreerPar(Integer creerPar) {
		this.creerPar = creerPar;
	}

	public Timestamp getDateExperation() {
		return this.dateExperation;
	}

	public void setDateExperation(Timestamp dateExperation) {
		this.dateExperation = dateExperation;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDesignation() {
		return this.designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public Integer getIdCentreChargePere() {
		return this.idCentreChargePere;
	}

	public void setIdCentreChargePere(Integer idCentreChargePere) {
		this.idCentreChargePere = idCentreChargePere;
	}

	public Integer getIdUniteOrganisationnelleAppartenance() {
		return this.idUniteOrganisationnelleAppartenance;
	}

	public void setIdUniteOrganisationnelleAppartenance(Integer idUniteOrganisationnelleAppartenance) {
		this.idUniteOrganisationnelleAppartenance = idUniteOrganisationnelleAppartenance;
	}

	public Integer getIdUniteOrganisationnelleCreateur() {
		return this.idUniteOrganisationnelleCreateur;
	}

	public void setIdUniteOrganisationnelleCreateur(Integer idUniteOrganisationnelleCreateur) {
		this.idUniteOrganisationnelleCreateur = idUniteOrganisationnelleCreateur;
	}

	public Boolean getIsFromEngagement() {
		return this.isFromEngagement;
	}

	public void setIsFromEngagement(Boolean isFromEngagement) {
		this.isFromEngagement = isFromEngagement;
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

	public List<AchatArrivage> getAchatArrivages() {
		return this.achatArrivages;
	}

	public void setAchatArrivages(List<AchatArrivage> achatArrivages) {
		this.achatArrivages = achatArrivages;
	}

	public AchatArrivage addAchatArrivage(AchatArrivage achatArrivage) {
		getAchatArrivages().add(achatArrivage);
		achatArrivage.setDbaCentreCharge(this);

		return achatArrivage;
	}

	public AchatArrivage removeAchatArrivage(AchatArrivage achatArrivage) {
		getAchatArrivages().remove(achatArrivage);
		achatArrivage.setDbaCentreCharge(null);

		return achatArrivage;
	}

}