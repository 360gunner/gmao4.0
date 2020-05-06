package com.microservices.elit.model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the dba_mode_paiement database table.
 * 
 */
@Entity
@Table(name="dba_mode_paiement")
@NamedQuery(name="DbaModePaiement.findAll", query="SELECT d FROM DbaModePaiement d")
public class DbaModePaiement implements Serializable {
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

	//bi-directional many-to-one association to AchatDemandePrixFille
	@OneToMany(mappedBy="dbaModePaiement")
	private List<AchatDemandePrixFille> achatDemandePrixFilles;

	//bi-directional many-to-one association to AchatDemandePrixMere
	@OneToMany(mappedBy="dbaModePaiement")
	private List<AchatDemandePrixMere> achatDemandePrixMeres;

	//bi-directional many-to-one association to AchatEngagement
	@OneToMany(mappedBy="dbaModePaiement")
	private List<AchatEngagement> achatEngagements;

	//bi-directional many-to-one association to AchatFacture
	@OneToMany(mappedBy="dbaModePaiement")
	private List<AchatFacture> achatFactures;

	//bi-directional many-to-one association to VisibiliteModuleModePaiement
	@OneToMany(mappedBy="dbaModePaiement")
	private List<VisibiliteModuleModePaiement> visibiliteModuleModePaiements;

	//bi-directional many-to-one association to VisibiliteProfilModePaiement
	@OneToMany(mappedBy="dbaModePaiement")
	private List<VisibiliteProfilModePaiement> visibiliteProfilModePaiements;

	//bi-directional many-to-one association to VisibiliteUniteModePaiement
	@OneToMany(mappedBy="dbaModePaiement")
	private List<VisibiliteUniteModePaiement> visibiliteUniteModePaiements;

	public DbaModePaiement() {
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

	public List<AchatDemandePrixFille> getAchatDemandePrixFilles() {
		return this.achatDemandePrixFilles;
	}

	public void setAchatDemandePrixFilles(List<AchatDemandePrixFille> achatDemandePrixFilles) {
		this.achatDemandePrixFilles = achatDemandePrixFilles;
	}

	public AchatDemandePrixFille addAchatDemandePrixFille(AchatDemandePrixFille achatDemandePrixFille) {
		getAchatDemandePrixFilles().add(achatDemandePrixFille);
		achatDemandePrixFille.setDbaModePaiement(this);

		return achatDemandePrixFille;
	}

	public AchatDemandePrixFille removeAchatDemandePrixFille(AchatDemandePrixFille achatDemandePrixFille) {
		getAchatDemandePrixFilles().remove(achatDemandePrixFille);
		achatDemandePrixFille.setDbaModePaiement(null);

		return achatDemandePrixFille;
	}

	public List<AchatDemandePrixMere> getAchatDemandePrixMeres() {
		return this.achatDemandePrixMeres;
	}

	public void setAchatDemandePrixMeres(List<AchatDemandePrixMere> achatDemandePrixMeres) {
		this.achatDemandePrixMeres = achatDemandePrixMeres;
	}

	public AchatDemandePrixMere addAchatDemandePrixMere(AchatDemandePrixMere achatDemandePrixMere) {
		getAchatDemandePrixMeres().add(achatDemandePrixMere);
		achatDemandePrixMere.setDbaModePaiement(this);

		return achatDemandePrixMere;
	}

	public AchatDemandePrixMere removeAchatDemandePrixMere(AchatDemandePrixMere achatDemandePrixMere) {
		getAchatDemandePrixMeres().remove(achatDemandePrixMere);
		achatDemandePrixMere.setDbaModePaiement(null);

		return achatDemandePrixMere;
	}

	public List<AchatEngagement> getAchatEngagements() {
		return this.achatEngagements;
	}

	public void setAchatEngagements(List<AchatEngagement> achatEngagements) {
		this.achatEngagements = achatEngagements;
	}

	public AchatEngagement addAchatEngagement(AchatEngagement achatEngagement) {
		getAchatEngagements().add(achatEngagement);
		achatEngagement.setDbaModePaiement(this);

		return achatEngagement;
	}

	public AchatEngagement removeAchatEngagement(AchatEngagement achatEngagement) {
		getAchatEngagements().remove(achatEngagement);
		achatEngagement.setDbaModePaiement(null);

		return achatEngagement;
	}

	public List<AchatFacture> getAchatFactures() {
		return this.achatFactures;
	}

	public void setAchatFactures(List<AchatFacture> achatFactures) {
		this.achatFactures = achatFactures;
	}

	public AchatFacture addAchatFacture(AchatFacture achatFacture) {
		getAchatFactures().add(achatFacture);
		achatFacture.setDbaModePaiement(this);

		return achatFacture;
	}

	public AchatFacture removeAchatFacture(AchatFacture achatFacture) {
		getAchatFactures().remove(achatFacture);
		achatFacture.setDbaModePaiement(null);

		return achatFacture;
	}

	public List<VisibiliteModuleModePaiement> getVisibiliteModuleModePaiements() {
		return this.visibiliteModuleModePaiements;
	}

	public void setVisibiliteModuleModePaiements(List<VisibiliteModuleModePaiement> visibiliteModuleModePaiements) {
		this.visibiliteModuleModePaiements = visibiliteModuleModePaiements;
	}

	public VisibiliteModuleModePaiement addVisibiliteModuleModePaiement(VisibiliteModuleModePaiement visibiliteModuleModePaiement) {
		getVisibiliteModuleModePaiements().add(visibiliteModuleModePaiement);
		visibiliteModuleModePaiement.setDbaModePaiement(this);

		return visibiliteModuleModePaiement;
	}

	public VisibiliteModuleModePaiement removeVisibiliteModuleModePaiement(VisibiliteModuleModePaiement visibiliteModuleModePaiement) {
		getVisibiliteModuleModePaiements().remove(visibiliteModuleModePaiement);
		visibiliteModuleModePaiement.setDbaModePaiement(null);

		return visibiliteModuleModePaiement;
	}

	public List<VisibiliteProfilModePaiement> getVisibiliteProfilModePaiements() {
		return this.visibiliteProfilModePaiements;
	}

	public void setVisibiliteProfilModePaiements(List<VisibiliteProfilModePaiement> visibiliteProfilModePaiements) {
		this.visibiliteProfilModePaiements = visibiliteProfilModePaiements;
	}

	public VisibiliteProfilModePaiement addVisibiliteProfilModePaiement(VisibiliteProfilModePaiement visibiliteProfilModePaiement) {
		getVisibiliteProfilModePaiements().add(visibiliteProfilModePaiement);
		visibiliteProfilModePaiement.setDbaModePaiement(this);

		return visibiliteProfilModePaiement;
	}

	public VisibiliteProfilModePaiement removeVisibiliteProfilModePaiement(VisibiliteProfilModePaiement visibiliteProfilModePaiement) {
		getVisibiliteProfilModePaiements().remove(visibiliteProfilModePaiement);
		visibiliteProfilModePaiement.setDbaModePaiement(null);

		return visibiliteProfilModePaiement;
	}

	public List<VisibiliteUniteModePaiement> getVisibiliteUniteModePaiements() {
		return this.visibiliteUniteModePaiements;
	}

	public void setVisibiliteUniteModePaiements(List<VisibiliteUniteModePaiement> visibiliteUniteModePaiements) {
		this.visibiliteUniteModePaiements = visibiliteUniteModePaiements;
	}

	public VisibiliteUniteModePaiement addVisibiliteUniteModePaiement(VisibiliteUniteModePaiement visibiliteUniteModePaiement) {
		getVisibiliteUniteModePaiements().add(visibiliteUniteModePaiement);
		visibiliteUniteModePaiement.setDbaModePaiement(this);

		return visibiliteUniteModePaiement;
	}

	public VisibiliteUniteModePaiement removeVisibiliteUniteModePaiement(VisibiliteUniteModePaiement visibiliteUniteModePaiement) {
		getVisibiliteUniteModePaiements().remove(visibiliteUniteModePaiement);
		visibiliteUniteModePaiement.setDbaModePaiement(null);

		return visibiliteUniteModePaiement;
	}

}