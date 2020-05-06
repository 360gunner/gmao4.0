package com.microservices.elit.model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the dba_nature_demande database table.
 * 
 */
@Entity
@Table(name="dba_nature_demande")
@NamedQuery(name="DbaNatureDemande.findAll", query="SELECT d FROM DbaNatureDemande d")
public class DbaNatureDemande implements Serializable {
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

	private Boolean stockable;

	//bi-directional many-to-one association to VisibiliteModuleNaturedemande
	@OneToMany(mappedBy="dbaNatureDemande")
	private List<VisibiliteModuleNaturedemande> visibiliteModuleNaturedemandes;

	//bi-directional many-to-one association to VisibiliteProfilNaturedemande
	@OneToMany(mappedBy="dbaNatureDemande")
	private List<VisibiliteProfilNaturedemande> visibiliteProfilNaturedemandes;

	//bi-directional many-to-one association to VisibiliteUniteNaturedemande
	@OneToMany(mappedBy="dbaNatureDemande")
	private List<VisibiliteUniteNaturedemande> visibiliteUniteNaturedemandes;

	public DbaNatureDemande() {
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

	public Boolean getStockable() {
		return this.stockable;
	}

	public void setStockable(Boolean stockable) {
		this.stockable = stockable;
	}

	public List<VisibiliteModuleNaturedemande> getVisibiliteModuleNaturedemandes() {
		return this.visibiliteModuleNaturedemandes;
	}

	public void setVisibiliteModuleNaturedemandes(List<VisibiliteModuleNaturedemande> visibiliteModuleNaturedemandes) {
		this.visibiliteModuleNaturedemandes = visibiliteModuleNaturedemandes;
	}

	public VisibiliteModuleNaturedemande addVisibiliteModuleNaturedemande(VisibiliteModuleNaturedemande visibiliteModuleNaturedemande) {
		getVisibiliteModuleNaturedemandes().add(visibiliteModuleNaturedemande);
		visibiliteModuleNaturedemande.setDbaNatureDemande(this);

		return visibiliteModuleNaturedemande;
	}

	public VisibiliteModuleNaturedemande removeVisibiliteModuleNaturedemande(VisibiliteModuleNaturedemande visibiliteModuleNaturedemande) {
		getVisibiliteModuleNaturedemandes().remove(visibiliteModuleNaturedemande);
		visibiliteModuleNaturedemande.setDbaNatureDemande(null);

		return visibiliteModuleNaturedemande;
	}

	public List<VisibiliteProfilNaturedemande> getVisibiliteProfilNaturedemandes() {
		return this.visibiliteProfilNaturedemandes;
	}

	public void setVisibiliteProfilNaturedemandes(List<VisibiliteProfilNaturedemande> visibiliteProfilNaturedemandes) {
		this.visibiliteProfilNaturedemandes = visibiliteProfilNaturedemandes;
	}

	public VisibiliteProfilNaturedemande addVisibiliteProfilNaturedemande(VisibiliteProfilNaturedemande visibiliteProfilNaturedemande) {
		getVisibiliteProfilNaturedemandes().add(visibiliteProfilNaturedemande);
		visibiliteProfilNaturedemande.setDbaNatureDemande(this);

		return visibiliteProfilNaturedemande;
	}

	public VisibiliteProfilNaturedemande removeVisibiliteProfilNaturedemande(VisibiliteProfilNaturedemande visibiliteProfilNaturedemande) {
		getVisibiliteProfilNaturedemandes().remove(visibiliteProfilNaturedemande);
		visibiliteProfilNaturedemande.setDbaNatureDemande(null);

		return visibiliteProfilNaturedemande;
	}

	public List<VisibiliteUniteNaturedemande> getVisibiliteUniteNaturedemandes() {
		return this.visibiliteUniteNaturedemandes;
	}

	public void setVisibiliteUniteNaturedemandes(List<VisibiliteUniteNaturedemande> visibiliteUniteNaturedemandes) {
		this.visibiliteUniteNaturedemandes = visibiliteUniteNaturedemandes;
	}

	public VisibiliteUniteNaturedemande addVisibiliteUniteNaturedemande(VisibiliteUniteNaturedemande visibiliteUniteNaturedemande) {
		getVisibiliteUniteNaturedemandes().add(visibiliteUniteNaturedemande);
		visibiliteUniteNaturedemande.setDbaNatureDemande(this);

		return visibiliteUniteNaturedemande;
	}

	public VisibiliteUniteNaturedemande removeVisibiliteUniteNaturedemande(VisibiliteUniteNaturedemande visibiliteUniteNaturedemande) {
		getVisibiliteUniteNaturedemandes().remove(visibiliteUniteNaturedemande);
		visibiliteUniteNaturedemande.setDbaNatureDemande(null);

		return visibiliteUniteNaturedemande;
	}

}