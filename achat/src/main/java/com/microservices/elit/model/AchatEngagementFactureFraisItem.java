package com.microservices.elit.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the achat_engagement_facture_frais_item database table.
 * 
 */
@Entity
@Table(name="achat_engagement_facture_frais_item")
@NamedQuery(name="AchatEngagementFactureFraisItem.findAll", query="SELECT a FROM AchatEngagementFactureFraisItem a")
public class AchatEngagementFactureFraisItem implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;

	@Column(name="creer_le")
	private Timestamp creerLe;

	@Column(name="creer_par")
	private Long creerPar;

	@Column(name="id_correction")
	private Integer idCorrection;

	@Column(name="id_unite_organisationnelle_createur")
	private Long idUniteOrganisationnelleCreateur;

	@Column(name="modifier_le")
	private Timestamp modifierLe;

	@Column(name="modifier_par")
	private Long modifierPar;

	@Column(name="quantite_utilisee")
	private BigDecimal quantiteUtilisee;

	@Column(name="taux_utilise")
	private BigDecimal tauxUtilise;

	@Column(name="valeur_utilisee")
	private BigDecimal valeurUtilisee;

	//bi-directional many-to-one association to AchatEngagementFactureFrai
	@ManyToOne
	@JoinColumn(name="id_engagement_facture_frais", insertable=false, updatable=false)
	private AchatEngagementFactureFrai achatEngagementFactureFrai;

	//bi-directional many-to-one association to AchatFactureLigne
	@ManyToOne
	@JoinColumn(name="id_ligne_facture", insertable=false, updatable=false)
	private AchatFactureLigne achatFactureLigne;

	public AchatEngagementFactureFraisItem() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public Integer getIdCorrection() {
		return this.idCorrection;
	}

	public void setIdCorrection(Integer idCorrection) {
		this.idCorrection = idCorrection;
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

	public BigDecimal getQuantiteUtilisee() {
		return this.quantiteUtilisee;
	}

	public void setQuantiteUtilisee(BigDecimal quantiteUtilisee) {
		this.quantiteUtilisee = quantiteUtilisee;
	}

	public BigDecimal getTauxUtilise() {
		return this.tauxUtilise;
	}

	public void setTauxUtilise(BigDecimal tauxUtilise) {
		this.tauxUtilise = tauxUtilise;
	}

	public BigDecimal getValeurUtilisee() {
		return this.valeurUtilisee;
	}

	public void setValeurUtilisee(BigDecimal valeurUtilisee) {
		this.valeurUtilisee = valeurUtilisee;
	}

	public AchatEngagementFactureFrai getAchatEngagementFactureFrai() {
		return this.achatEngagementFactureFrai;
	}

	public void setAchatEngagementFactureFrai(AchatEngagementFactureFrai achatEngagementFactureFrai) {
		this.achatEngagementFactureFrai = achatEngagementFactureFrai;
	}

	public AchatFactureLigne getAchatFactureLigne() {
		return this.achatFactureLigne;
	}

	public void setAchatFactureLigne(AchatFactureLigne achatFactureLigne) {
		this.achatFactureLigne = achatFactureLigne;
	}

}