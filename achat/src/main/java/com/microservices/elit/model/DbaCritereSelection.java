package com.microservices.elit.model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the dba_critere_selection database table.
 * 
 */
@Entity
@Table(name="dba_critere_selection")
@NamedQuery(name="DbaCritereSelection.findAll", query="SELECT d FROM DbaCritereSelection d")
public class DbaCritereSelection implements Serializable {
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

	//bi-directional many-to-one association to AchatEngagement
	@OneToMany(mappedBy="dbaCritereSelection")
	private List<AchatEngagement> achatEngagements;

	//bi-directional many-to-one association to VisibiliteModuleCritereSelection
	@OneToMany(mappedBy="dbaCritereSelection")
	private List<VisibiliteModuleCritereSelection> visibiliteModuleCritereSelections;

	//bi-directional many-to-one association to VisibiliteProfilCritereSelection
	@OneToMany(mappedBy="dbaCritereSelection")
	private List<VisibiliteProfilCritereSelection> visibiliteProfilCritereSelections;

	//bi-directional many-to-one association to VisibiliteUniteCritereSelection
	@OneToMany(mappedBy="dbaCritereSelection")
	private List<VisibiliteUniteCritereSelection> visibiliteUniteCritereSelections;

	public DbaCritereSelection() {
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

	public List<AchatEngagement> getAchatEngagements() {
		return this.achatEngagements;
	}

	public void setAchatEngagements(List<AchatEngagement> achatEngagements) {
		this.achatEngagements = achatEngagements;
	}

	public AchatEngagement addAchatEngagement(AchatEngagement achatEngagement) {
		getAchatEngagements().add(achatEngagement);
		achatEngagement.setDbaCritereSelection(this);

		return achatEngagement;
	}

	public AchatEngagement removeAchatEngagement(AchatEngagement achatEngagement) {
		getAchatEngagements().remove(achatEngagement);
		achatEngagement.setDbaCritereSelection(null);

		return achatEngagement;
	}

	public List<VisibiliteModuleCritereSelection> getVisibiliteModuleCritereSelections() {
		return this.visibiliteModuleCritereSelections;
	}

	public void setVisibiliteModuleCritereSelections(List<VisibiliteModuleCritereSelection> visibiliteModuleCritereSelections) {
		this.visibiliteModuleCritereSelections = visibiliteModuleCritereSelections;
	}

	public VisibiliteModuleCritereSelection addVisibiliteModuleCritereSelection(VisibiliteModuleCritereSelection visibiliteModuleCritereSelection) {
		getVisibiliteModuleCritereSelections().add(visibiliteModuleCritereSelection);
		visibiliteModuleCritereSelection.setDbaCritereSelection(this);

		return visibiliteModuleCritereSelection;
	}

	public VisibiliteModuleCritereSelection removeVisibiliteModuleCritereSelection(VisibiliteModuleCritereSelection visibiliteModuleCritereSelection) {
		getVisibiliteModuleCritereSelections().remove(visibiliteModuleCritereSelection);
		visibiliteModuleCritereSelection.setDbaCritereSelection(null);

		return visibiliteModuleCritereSelection;
	}

	public List<VisibiliteProfilCritereSelection> getVisibiliteProfilCritereSelections() {
		return this.visibiliteProfilCritereSelections;
	}

	public void setVisibiliteProfilCritereSelections(List<VisibiliteProfilCritereSelection> visibiliteProfilCritereSelections) {
		this.visibiliteProfilCritereSelections = visibiliteProfilCritereSelections;
	}

	public VisibiliteProfilCritereSelection addVisibiliteProfilCritereSelection(VisibiliteProfilCritereSelection visibiliteProfilCritereSelection) {
		getVisibiliteProfilCritereSelections().add(visibiliteProfilCritereSelection);
		visibiliteProfilCritereSelection.setDbaCritereSelection(this);

		return visibiliteProfilCritereSelection;
	}

	public VisibiliteProfilCritereSelection removeVisibiliteProfilCritereSelection(VisibiliteProfilCritereSelection visibiliteProfilCritereSelection) {
		getVisibiliteProfilCritereSelections().remove(visibiliteProfilCritereSelection);
		visibiliteProfilCritereSelection.setDbaCritereSelection(null);

		return visibiliteProfilCritereSelection;
	}

	public List<VisibiliteUniteCritereSelection> getVisibiliteUniteCritereSelections() {
		return this.visibiliteUniteCritereSelections;
	}

	public void setVisibiliteUniteCritereSelections(List<VisibiliteUniteCritereSelection> visibiliteUniteCritereSelections) {
		this.visibiliteUniteCritereSelections = visibiliteUniteCritereSelections;
	}

	public VisibiliteUniteCritereSelection addVisibiliteUniteCritereSelection(VisibiliteUniteCritereSelection visibiliteUniteCritereSelection) {
		getVisibiliteUniteCritereSelections().add(visibiliteUniteCritereSelection);
		visibiliteUniteCritereSelection.setDbaCritereSelection(this);

		return visibiliteUniteCritereSelection;
	}

	public VisibiliteUniteCritereSelection removeVisibiliteUniteCritereSelection(VisibiliteUniteCritereSelection visibiliteUniteCritereSelection) {
		getVisibiliteUniteCritereSelections().remove(visibiliteUniteCritereSelection);
		visibiliteUniteCritereSelection.setDbaCritereSelection(null);

		return visibiliteUniteCritereSelection;
	}

}