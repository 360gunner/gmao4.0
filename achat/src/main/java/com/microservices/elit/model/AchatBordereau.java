package com.microservices.elit.model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the achat_bordereau database table.
 * 
 */
@Entity
@Table(name="achat_bordereau")
@NamedQuery(name="AchatBordereau.findAll", query="SELECT a FROM AchatBordereau a")
public class AchatBordereau implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;

	private String code;

	@Column(name="creer_le")
	private Timestamp creerLe;

	@Column(name="creer_par")
	private Long creerPar;

	private String description;

	private String designation;

	private String dtype;

	@Column(name="id_unite_organisationnelle_appartenance")
	private Long idUniteOrganisationnelleAppartenance;

	@Column(name="id_unite_organisationnelle_createur")
	private Long idUniteOrganisationnelleCreateur;

	@Column(name="modifier_le")
	private Timestamp modifierLe;

	@Column(name="modifier_par")
	private Long modifierPar;

	//bi-directional many-to-one association to AchatEngagement
	@ManyToOne
	@JoinColumn(name="id_engagement", insertable=false, updatable=false)
	private AchatEngagement achatEngagement;

	//bi-directional many-to-one association to AchatEngagementItem
	@OneToMany(mappedBy="achatBordereau")
	private List<AchatEngagementItem> achatEngagementItems;

	//bi-directional many-to-one association to VisibiliteModuleAchatBordereau
	@OneToMany(mappedBy="achatBordereau")
	private List<VisibiliteModuleAchatBordereau> visibiliteModuleAchatBordereaus;

	//bi-directional many-to-one association to VisibiliteProfilAchatBordereau
	@OneToMany(mappedBy="achatBordereau")
	private List<VisibiliteProfilAchatBordereau> visibiliteProfilAchatBordereaus;

	//bi-directional many-to-one association to VisibiliteUniteAchatBordereau
	@OneToMany(mappedBy="achatBordereau")
	private List<VisibiliteUniteAchatBordereau> visibiliteUniteAchatBordereaus;

	public AchatBordereau() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
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

	public String getDtype() {
		return this.dtype;
	}

	public void setDtype(String dtype) {
		this.dtype = dtype;
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

	public AchatEngagement getAchatEngagement() {
		return this.achatEngagement;
	}

	public void setAchatEngagement(AchatEngagement achatEngagement) {
		this.achatEngagement = achatEngagement;
	}

	public List<AchatEngagementItem> getAchatEngagementItems() {
		return this.achatEngagementItems;
	}

	public void setAchatEngagementItems(List<AchatEngagementItem> achatEngagementItems) {
		this.achatEngagementItems = achatEngagementItems;
	}

	public AchatEngagementItem addAchatEngagementItem(AchatEngagementItem achatEngagementItem) {
		getAchatEngagementItems().add(achatEngagementItem);
		achatEngagementItem.setAchatBordereau(this);

		return achatEngagementItem;
	}

	public AchatEngagementItem removeAchatEngagementItem(AchatEngagementItem achatEngagementItem) {
		getAchatEngagementItems().remove(achatEngagementItem);
		achatEngagementItem.setAchatBordereau(null);

		return achatEngagementItem;
	}

	public List<VisibiliteModuleAchatBordereau> getVisibiliteModuleAchatBordereaus() {
		return this.visibiliteModuleAchatBordereaus;
	}

	public void setVisibiliteModuleAchatBordereaus(List<VisibiliteModuleAchatBordereau> visibiliteModuleAchatBordereaus) {
		this.visibiliteModuleAchatBordereaus = visibiliteModuleAchatBordereaus;
	}

	public VisibiliteModuleAchatBordereau addVisibiliteModuleAchatBordereaus(VisibiliteModuleAchatBordereau visibiliteModuleAchatBordereaus) {
		getVisibiliteModuleAchatBordereaus().add(visibiliteModuleAchatBordereaus);
		visibiliteModuleAchatBordereaus.setAchatBordereau(this);

		return visibiliteModuleAchatBordereaus;
	}

	public VisibiliteModuleAchatBordereau removeVisibiliteModuleAchatBordereaus(VisibiliteModuleAchatBordereau visibiliteModuleAchatBordereaus) {
		getVisibiliteModuleAchatBordereaus().remove(visibiliteModuleAchatBordereaus);
		visibiliteModuleAchatBordereaus.setAchatBordereau(null);

		return visibiliteModuleAchatBordereaus;
	}

	public List<VisibiliteProfilAchatBordereau> getVisibiliteProfilAchatBordereaus() {
		return this.visibiliteProfilAchatBordereaus;
	}

	public void setVisibiliteProfilAchatBordereaus(List<VisibiliteProfilAchatBordereau> visibiliteProfilAchatBordereaus) {
		this.visibiliteProfilAchatBordereaus = visibiliteProfilAchatBordereaus;
	}

	public VisibiliteProfilAchatBordereau addVisibiliteProfilAchatBordereaus(VisibiliteProfilAchatBordereau visibiliteProfilAchatBordereaus) {
		getVisibiliteProfilAchatBordereaus().add(visibiliteProfilAchatBordereaus);
		visibiliteProfilAchatBordereaus.setAchatBordereau(this);

		return visibiliteProfilAchatBordereaus;
	}

	public VisibiliteProfilAchatBordereau removeVisibiliteProfilAchatBordereaus(VisibiliteProfilAchatBordereau visibiliteProfilAchatBordereaus) {
		getVisibiliteProfilAchatBordereaus().remove(visibiliteProfilAchatBordereaus);
		visibiliteProfilAchatBordereaus.setAchatBordereau(null);

		return visibiliteProfilAchatBordereaus;
	}

	public List<VisibiliteUniteAchatBordereau> getVisibiliteUniteAchatBordereaus() {
		return this.visibiliteUniteAchatBordereaus;
	}

	public void setVisibiliteUniteAchatBordereaus(List<VisibiliteUniteAchatBordereau> visibiliteUniteAchatBordereaus) {
		this.visibiliteUniteAchatBordereaus = visibiliteUniteAchatBordereaus;
	}

	public VisibiliteUniteAchatBordereau addVisibiliteUniteAchatBordereaus(VisibiliteUniteAchatBordereau visibiliteUniteAchatBordereaus) {
		getVisibiliteUniteAchatBordereaus().add(visibiliteUniteAchatBordereaus);
		visibiliteUniteAchatBordereaus.setAchatBordereau(this);

		return visibiliteUniteAchatBordereaus;
	}

	public VisibiliteUniteAchatBordereau removeVisibiliteUniteAchatBordereaus(VisibiliteUniteAchatBordereau visibiliteUniteAchatBordereaus) {
		getVisibiliteUniteAchatBordereaus().remove(visibiliteUniteAchatBordereaus);
		visibiliteUniteAchatBordereaus.setAchatBordereau(null);

		return visibiliteUniteAchatBordereaus;
	}

}