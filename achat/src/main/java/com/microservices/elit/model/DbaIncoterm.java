package com.microservices.elit.model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the dba_incoterm database table.
 * 
 */
@Entity
@Table(name="dba_incoterm")
@NamedQuery(name="DbaIncoterm.findAll", query="SELECT d FROM DbaIncoterm d")
public class DbaIncoterm implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;

	private Boolean active;

	private String code;

	@Column(name="creer_le")
	private Timestamp creerLe;

	@Column(name="creer_par")
	private Long creerPar;

	private String designation;

	@Column(name="id_unite_organisationnelle_appartenance")
	private Long idUniteOrganisationnelleAppartenance;

	@Column(name="id_unite_organisationnelle_createur")
	private Long idUniteOrganisationnelleCreateur;

	@Column(name="modifier_le")
	private Timestamp modifierLe;

	@Column(name="modifier_par")
	private Long modifierPar;

	//bi-directional many-to-one association to AchatEngagement
	@OneToMany(mappedBy="dbaIncoterm")
	private List<AchatEngagement> achatEngagements;

	//bi-directional many-to-one association to VisibiliteModuleIncoterm
	@OneToMany(mappedBy="dbaIncoterm")
	private List<VisibiliteModuleIncoterm> visibiliteModuleIncoterms;

	//bi-directional many-to-one association to VisibiliteProfilIncoterm
	@OneToMany(mappedBy="dbaIncoterm")
	private List<VisibiliteProfilIncoterm> visibiliteProfilIncoterms;

	//bi-directional many-to-one association to VisibiliteUniteIncoterm
	@OneToMany(mappedBy="dbaIncoterm")
	private List<VisibiliteUniteIncoterm> visibiliteUniteIncoterms;

	public DbaIncoterm() {
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

	public String getDesignation() {
		return this.designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
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

	public List<AchatEngagement> getAchatEngagements() {
		return this.achatEngagements;
	}

	public void setAchatEngagements(List<AchatEngagement> achatEngagements) {
		this.achatEngagements = achatEngagements;
	}

	public AchatEngagement addAchatEngagement(AchatEngagement achatEngagement) {
		getAchatEngagements().add(achatEngagement);
		achatEngagement.setDbaIncoterm(this);

		return achatEngagement;
	}

	public AchatEngagement removeAchatEngagement(AchatEngagement achatEngagement) {
		getAchatEngagements().remove(achatEngagement);
		achatEngagement.setDbaIncoterm(null);

		return achatEngagement;
	}

	public List<VisibiliteModuleIncoterm> getVisibiliteModuleIncoterms() {
		return this.visibiliteModuleIncoterms;
	}

	public void setVisibiliteModuleIncoterms(List<VisibiliteModuleIncoterm> visibiliteModuleIncoterms) {
		this.visibiliteModuleIncoterms = visibiliteModuleIncoterms;
	}

	public VisibiliteModuleIncoterm addVisibiliteModuleIncoterm(VisibiliteModuleIncoterm visibiliteModuleIncoterm) {
		getVisibiliteModuleIncoterms().add(visibiliteModuleIncoterm);
		visibiliteModuleIncoterm.setDbaIncoterm(this);

		return visibiliteModuleIncoterm;
	}

	public VisibiliteModuleIncoterm removeVisibiliteModuleIncoterm(VisibiliteModuleIncoterm visibiliteModuleIncoterm) {
		getVisibiliteModuleIncoterms().remove(visibiliteModuleIncoterm);
		visibiliteModuleIncoterm.setDbaIncoterm(null);

		return visibiliteModuleIncoterm;
	}

	public List<VisibiliteProfilIncoterm> getVisibiliteProfilIncoterms() {
		return this.visibiliteProfilIncoterms;
	}

	public void setVisibiliteProfilIncoterms(List<VisibiliteProfilIncoterm> visibiliteProfilIncoterms) {
		this.visibiliteProfilIncoterms = visibiliteProfilIncoterms;
	}

	public VisibiliteProfilIncoterm addVisibiliteProfilIncoterm(VisibiliteProfilIncoterm visibiliteProfilIncoterm) {
		getVisibiliteProfilIncoterms().add(visibiliteProfilIncoterm);
		visibiliteProfilIncoterm.setDbaIncoterm(this);

		return visibiliteProfilIncoterm;
	}

	public VisibiliteProfilIncoterm removeVisibiliteProfilIncoterm(VisibiliteProfilIncoterm visibiliteProfilIncoterm) {
		getVisibiliteProfilIncoterms().remove(visibiliteProfilIncoterm);
		visibiliteProfilIncoterm.setDbaIncoterm(null);

		return visibiliteProfilIncoterm;
	}

	public List<VisibiliteUniteIncoterm> getVisibiliteUniteIncoterms() {
		return this.visibiliteUniteIncoterms;
	}

	public void setVisibiliteUniteIncoterms(List<VisibiliteUniteIncoterm> visibiliteUniteIncoterms) {
		this.visibiliteUniteIncoterms = visibiliteUniteIncoterms;
	}

	public VisibiliteUniteIncoterm addVisibiliteUniteIncoterm(VisibiliteUniteIncoterm visibiliteUniteIncoterm) {
		getVisibiliteUniteIncoterms().add(visibiliteUniteIncoterm);
		visibiliteUniteIncoterm.setDbaIncoterm(this);

		return visibiliteUniteIncoterm;
	}

	public VisibiliteUniteIncoterm removeVisibiliteUniteIncoterm(VisibiliteUniteIncoterm visibiliteUniteIncoterm) {
		getVisibiliteUniteIncoterms().remove(visibiliteUniteIncoterm);
		visibiliteUniteIncoterm.setDbaIncoterm(null);

		return visibiliteUniteIncoterm;
	}

}