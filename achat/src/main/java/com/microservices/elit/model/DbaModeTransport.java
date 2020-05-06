package com.microservices.elit.model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the dba_mode_transport database table.
 * 
 */
@Entity
@Table(name="dba_mode_transport")
@NamedQuery(name="DbaModeTransport.findAll", query="SELECT d FROM DbaModeTransport d")
public class DbaModeTransport implements Serializable {
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
	@OneToMany(mappedBy="dbaModeTransport")
	private List<AchatEngagement> achatEngagements;

	//bi-directional many-to-one association to VisibiliteModuleModeTransport
	@OneToMany(mappedBy="dbaModeTransport")
	private List<VisibiliteModuleModeTransport> visibiliteModuleModeTransports;

	//bi-directional many-to-one association to VisibiliteProfilModeTransport
	@OneToMany(mappedBy="dbaModeTransport")
	private List<VisibiliteProfilModeTransport> visibiliteProfilModeTransports;

	//bi-directional many-to-one association to VisibiliteUniteModeTransport
	@OneToMany(mappedBy="dbaModeTransport")
	private List<VisibiliteUniteModeTransport> visibiliteUniteModeTransports;

	public DbaModeTransport() {
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
		achatEngagement.setDbaModeTransport(this);

		return achatEngagement;
	}

	public AchatEngagement removeAchatEngagement(AchatEngagement achatEngagement) {
		getAchatEngagements().remove(achatEngagement);
		achatEngagement.setDbaModeTransport(null);

		return achatEngagement;
	}

	public List<VisibiliteModuleModeTransport> getVisibiliteModuleModeTransports() {
		return this.visibiliteModuleModeTransports;
	}

	public void setVisibiliteModuleModeTransports(List<VisibiliteModuleModeTransport> visibiliteModuleModeTransports) {
		this.visibiliteModuleModeTransports = visibiliteModuleModeTransports;
	}

	public VisibiliteModuleModeTransport addVisibiliteModuleModeTransport(VisibiliteModuleModeTransport visibiliteModuleModeTransport) {
		getVisibiliteModuleModeTransports().add(visibiliteModuleModeTransport);
		visibiliteModuleModeTransport.setDbaModeTransport(this);

		return visibiliteModuleModeTransport;
	}

	public VisibiliteModuleModeTransport removeVisibiliteModuleModeTransport(VisibiliteModuleModeTransport visibiliteModuleModeTransport) {
		getVisibiliteModuleModeTransports().remove(visibiliteModuleModeTransport);
		visibiliteModuleModeTransport.setDbaModeTransport(null);

		return visibiliteModuleModeTransport;
	}

	public List<VisibiliteProfilModeTransport> getVisibiliteProfilModeTransports() {
		return this.visibiliteProfilModeTransports;
	}

	public void setVisibiliteProfilModeTransports(List<VisibiliteProfilModeTransport> visibiliteProfilModeTransports) {
		this.visibiliteProfilModeTransports = visibiliteProfilModeTransports;
	}

	public VisibiliteProfilModeTransport addVisibiliteProfilModeTransport(VisibiliteProfilModeTransport visibiliteProfilModeTransport) {
		getVisibiliteProfilModeTransports().add(visibiliteProfilModeTransport);
		visibiliteProfilModeTransport.setDbaModeTransport(this);

		return visibiliteProfilModeTransport;
	}

	public VisibiliteProfilModeTransport removeVisibiliteProfilModeTransport(VisibiliteProfilModeTransport visibiliteProfilModeTransport) {
		getVisibiliteProfilModeTransports().remove(visibiliteProfilModeTransport);
		visibiliteProfilModeTransport.setDbaModeTransport(null);

		return visibiliteProfilModeTransport;
	}

	public List<VisibiliteUniteModeTransport> getVisibiliteUniteModeTransports() {
		return this.visibiliteUniteModeTransports;
	}

	public void setVisibiliteUniteModeTransports(List<VisibiliteUniteModeTransport> visibiliteUniteModeTransports) {
		this.visibiliteUniteModeTransports = visibiliteUniteModeTransports;
	}

	public VisibiliteUniteModeTransport addVisibiliteUniteModeTransport(VisibiliteUniteModeTransport visibiliteUniteModeTransport) {
		getVisibiliteUniteModeTransports().add(visibiliteUniteModeTransport);
		visibiliteUniteModeTransport.setDbaModeTransport(this);

		return visibiliteUniteModeTransport;
	}

	public VisibiliteUniteModeTransport removeVisibiliteUniteModeTransport(VisibiliteUniteModeTransport visibiliteUniteModeTransport) {
		getVisibiliteUniteModeTransports().remove(visibiliteUniteModeTransport);
		visibiliteUniteModeTransport.setDbaModeTransport(null);

		return visibiliteUniteModeTransport;
	}

}