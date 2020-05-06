package com.microservices.elit.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the correction database table.
 * 
 */
@Entity
@NamedQuery(name="Correction.findAll", query="SELECT c FROM Correction c")
public class Correction implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Long id;

	private String code;

	@Column(name="creer_le")
	private Timestamp creerLe;

	@Column(name="creer_par")
	private Long creerPar;

	@Temporal(TemporalType.DATE)
	private Date date;

	@Column(name="id_unite_organisationnelle_appartenance")
	private Long idUniteOrganisationnelleAppartenance;

	@Column(name="id_unite_organisationnelle_createur")
	private Long idUniteOrganisationnelleCreateur;

	@Column(name="modifier_le")
	private Timestamp modifierLe;

	@Column(name="modifier_par")
	private Long modifierPar;

	private String observation;

	//bi-directional many-to-one association to AchatArrivage
	@OneToMany(mappedBy="correction")
	private List<AchatArrivage> achatArrivages;

	//bi-directional many-to-one association to AchatArrivageDemandeAchatItem
	@OneToMany(mappedBy="correction")
	private List<AchatArrivageDemandeAchatItem> achatArrivageDemandeAchatItems;

	public Correction() {
	}

	public Correction(long id2, String string) {
		this.id=id2;
		// TODO Auto-generated constructor stub
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

	public Long getCreerPar() {
		return this.creerPar;
	}

	public void setCreerPar(Long creerPar) {
		this.creerPar = creerPar;
	}

	public Date getDate() {
		return this.date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Long getIdUniteOrganisationnelleAppartenance() {
		return this.idUniteOrganisationnelleAppartenance;
	}

	public void setIdUniteOrganisationnelleAppartenance(Long idUniteOrganisationnelleAppartenance) {
		this.idUniteOrganisationnelleAppartenance = idUniteOrganisationnelleAppartenance;
	}

	public Long getIdUniteOrganisationnelleCreateur() {
		return this.idUniteOrganisationnelleCreateur;
	}

	public void setIdUniteOrganisationnelleCreateur(Long idUniteOrganisationnelleCreateur) {
		this.idUniteOrganisationnelleCreateur = idUniteOrganisationnelleCreateur;
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

	public String getObservation() {
		return this.observation;
	}

	public void setObservation(String observation) {
		this.observation = observation;
	}

	public List<AchatArrivage> getAchatArrivages() {
		return this.achatArrivages;
	}

	public void setAchatArrivages(List<AchatArrivage> achatArrivages) {
		this.achatArrivages = achatArrivages;
	}

	public AchatArrivage addAchatArrivage(AchatArrivage achatArrivage) {
		getAchatArrivages().add(achatArrivage);
		achatArrivage.setCorrection(this);

		return achatArrivage;
	}

	public AchatArrivage removeAchatArrivage(AchatArrivage achatArrivage) {
		getAchatArrivages().remove(achatArrivage);
		achatArrivage.setCorrection(null);

		return achatArrivage;
	}

	public List<AchatArrivageDemandeAchatItem> getAchatArrivageDemandeAchatItems() {
		return this.achatArrivageDemandeAchatItems;
	}

	public void setAchatArrivageDemandeAchatItems(List<AchatArrivageDemandeAchatItem> achatArrivageDemandeAchatItems) {
		this.achatArrivageDemandeAchatItems = achatArrivageDemandeAchatItems;
	}

	public AchatArrivageDemandeAchatItem addAchatArrivageDemandeAchatItem(AchatArrivageDemandeAchatItem achatArrivageDemandeAchatItem) {
		getAchatArrivageDemandeAchatItems().add(achatArrivageDemandeAchatItem);
		achatArrivageDemandeAchatItem.setCorrection(this);

		return achatArrivageDemandeAchatItem;
	}

	public AchatArrivageDemandeAchatItem removeAchatArrivageDemandeAchatItem(AchatArrivageDemandeAchatItem achatArrivageDemandeAchatItem) {
		getAchatArrivageDemandeAchatItems().remove(achatArrivageDemandeAchatItem);
		achatArrivageDemandeAchatItem.setCorrection(null);

		return achatArrivageDemandeAchatItem;
	}

}