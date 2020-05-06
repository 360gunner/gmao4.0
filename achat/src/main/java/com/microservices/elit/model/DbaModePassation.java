package com.microservices.elit.model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the dba_mode_passation database table.
 * 
 */
@Entity
@Table(name="dba_mode_passation")
@NamedQuery(name="DbaModePassation.findAll", query="SELECT d FROM DbaModePassation d")
public class DbaModePassation implements Serializable {
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

	@Column(name="is_from_engagement")
	private Boolean isFromEngagement;

	@Column(name="modifier_le")
	private Timestamp modifierLe;

	@Column(name="modifier_par")
	private Long modifierPar;

	private String reference;

	//bi-directional many-to-one association to AchatEngagement
	@OneToMany(mappedBy="dbaModePassation")
	private List<AchatEngagement> achatEngagements;

	//bi-directional many-to-one association to VisibiliteModuleModePassation
	@OneToMany(mappedBy="dbaModePassation")
	private List<VisibiliteModuleModePassation> visibiliteModuleModePassations;

	//bi-directional many-to-one association to VisibiliteProfilModePassation
	@OneToMany(mappedBy="dbaModePassation")
	private List<VisibiliteProfilModePassation> visibiliteProfilModePassations;

	//bi-directional many-to-one association to VisibiliteUniteModePassation
	@OneToMany(mappedBy="dbaModePassation")
	private List<VisibiliteUniteModePassation> visibiliteUniteModePassations;

	public DbaModePassation() {
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

	public Long getModifierPar() {
		return this.modifierPar;
	}

	public void setModifierPar(Long modifierPar) {
		this.modifierPar = modifierPar;
	}

	public String getReference() {
		return this.reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public List<AchatEngagement> getAchatEngagements() {
		return this.achatEngagements;
	}

	public void setAchatEngagements(List<AchatEngagement> achatEngagements) {
		this.achatEngagements = achatEngagements;
	}

	public AchatEngagement addAchatEngagement(AchatEngagement achatEngagement) {
		getAchatEngagements().add(achatEngagement);
		achatEngagement.setDbaModePassation(this);

		return achatEngagement;
	}

	public AchatEngagement removeAchatEngagement(AchatEngagement achatEngagement) {
		getAchatEngagements().remove(achatEngagement);
		achatEngagement.setDbaModePassation(null);

		return achatEngagement;
	}

	public List<VisibiliteModuleModePassation> getVisibiliteModuleModePassations() {
		return this.visibiliteModuleModePassations;
	}

	public void setVisibiliteModuleModePassations(List<VisibiliteModuleModePassation> visibiliteModuleModePassations) {
		this.visibiliteModuleModePassations = visibiliteModuleModePassations;
	}

	public VisibiliteModuleModePassation addVisibiliteModuleModePassation(VisibiliteModuleModePassation visibiliteModuleModePassation) {
		getVisibiliteModuleModePassations().add(visibiliteModuleModePassation);
		visibiliteModuleModePassation.setDbaModePassation(this);

		return visibiliteModuleModePassation;
	}

	public VisibiliteModuleModePassation removeVisibiliteModuleModePassation(VisibiliteModuleModePassation visibiliteModuleModePassation) {
		getVisibiliteModuleModePassations().remove(visibiliteModuleModePassation);
		visibiliteModuleModePassation.setDbaModePassation(null);

		return visibiliteModuleModePassation;
	}

	public List<VisibiliteProfilModePassation> getVisibiliteProfilModePassations() {
		return this.visibiliteProfilModePassations;
	}

	public void setVisibiliteProfilModePassations(List<VisibiliteProfilModePassation> visibiliteProfilModePassations) {
		this.visibiliteProfilModePassations = visibiliteProfilModePassations;
	}

	public VisibiliteProfilModePassation addVisibiliteProfilModePassation(VisibiliteProfilModePassation visibiliteProfilModePassation) {
		getVisibiliteProfilModePassations().add(visibiliteProfilModePassation);
		visibiliteProfilModePassation.setDbaModePassation(this);

		return visibiliteProfilModePassation;
	}

	public VisibiliteProfilModePassation removeVisibiliteProfilModePassation(VisibiliteProfilModePassation visibiliteProfilModePassation) {
		getVisibiliteProfilModePassations().remove(visibiliteProfilModePassation);
		visibiliteProfilModePassation.setDbaModePassation(null);

		return visibiliteProfilModePassation;
	}

	public List<VisibiliteUniteModePassation> getVisibiliteUniteModePassations() {
		return this.visibiliteUniteModePassations;
	}

	public void setVisibiliteUniteModePassations(List<VisibiliteUniteModePassation> visibiliteUniteModePassations) {
		this.visibiliteUniteModePassations = visibiliteUniteModePassations;
	}

	public VisibiliteUniteModePassation addVisibiliteUniteModePassation(VisibiliteUniteModePassation visibiliteUniteModePassation) {
		getVisibiliteUniteModePassations().add(visibiliteUniteModePassation);
		visibiliteUniteModePassation.setDbaModePassation(this);

		return visibiliteUniteModePassation;
	}

	public VisibiliteUniteModePassation removeVisibiliteUniteModePassation(VisibiliteUniteModePassation visibiliteUniteModePassation) {
		getVisibiliteUniteModePassations().remove(visibiliteUniteModePassation);
		visibiliteUniteModePassation.setDbaModePassation(null);

		return visibiliteUniteModePassation;
	}

}