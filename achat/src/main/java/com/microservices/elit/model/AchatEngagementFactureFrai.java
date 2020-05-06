package com.microservices.elit.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the achat_engagement_facture_frais database table.
 * 
 */
@Entity
@Table(name="achat_engagement_facture_frais")
@NamedQuery(name="AchatEngagementFactureFrai.findAll", query="SELECT a FROM AchatEngagementFactureFrai a")
public class AchatEngagementFactureFrai implements Serializable {
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

	@Column(name="inclure_all_item")
	private String inclureAllItem;

	@Column(name="inclure_dans_calcul")
	private Boolean inclureDansCalcul;

	@Column(name="modifier_le")
	private Timestamp modifierLe;

	@Column(name="modifier_par")
	private Long modifierPar;

	@Column(name="repartition_equitable")
	private Boolean repartitionEquitable;

	@Column(name="taux_utilisation")
	private BigDecimal tauxUtilisation;

	@Column(name="valeur_utilisee")
	private BigDecimal valeurUtilisee;

	//bi-directional many-to-one association to AchatEngagement
	@ManyToOne
	@JoinColumn(name="id_engagement", insertable=false, updatable=false)
	private AchatEngagement achatEngagement;

	//bi-directional many-to-one association to AchatFacture
	@ManyToOne
	@JoinColumn(name="id_facture_frais", insertable=false, updatable=false)
	private AchatFacture achatFacture;

	//bi-directional many-to-one association to AchatEngagementFactureFraisItem
	@OneToMany(mappedBy="achatEngagementFactureFrai")
	private List<AchatEngagementFactureFraisItem> achatEngagementFactureFraisItems;

	public AchatEngagementFactureFrai() {
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

	public String getInclureAllItem() {
		return this.inclureAllItem;
	}

	public void setInclureAllItem(String inclureAllItem) {
		this.inclureAllItem = inclureAllItem;
	}

	public Boolean getInclureDansCalcul() {
		return this.inclureDansCalcul;
	}

	public void setInclureDansCalcul(Boolean inclureDansCalcul) {
		this.inclureDansCalcul = inclureDansCalcul;
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

	public Boolean getRepartitionEquitable() {
		return this.repartitionEquitable;
	}

	public void setRepartitionEquitable(Boolean repartitionEquitable) {
		this.repartitionEquitable = repartitionEquitable;
	}

	public BigDecimal getTauxUtilisation() {
		return this.tauxUtilisation;
	}

	public void setTauxUtilisation(BigDecimal tauxUtilisation) {
		this.tauxUtilisation = tauxUtilisation;
	}

	public BigDecimal getValeurUtilisee() {
		return this.valeurUtilisee;
	}

	public void setValeurUtilisee(BigDecimal valeurUtilisee) {
		this.valeurUtilisee = valeurUtilisee;
	}

	public AchatEngagement getAchatEngagement() {
		return this.achatEngagement;
	}

	public void setAchatEngagement(AchatEngagement achatEngagement) {
		this.achatEngagement = achatEngagement;
	}

	public AchatFacture getAchatFacture() {
		return this.achatFacture;
	}

	public void setAchatFacture(AchatFacture achatFacture) {
		this.achatFacture = achatFacture;
	}

	public List<AchatEngagementFactureFraisItem> getAchatEngagementFactureFraisItems() {
		return this.achatEngagementFactureFraisItems;
	}

	public void setAchatEngagementFactureFraisItems(List<AchatEngagementFactureFraisItem> achatEngagementFactureFraisItems) {
		this.achatEngagementFactureFraisItems = achatEngagementFactureFraisItems;
	}

	public AchatEngagementFactureFraisItem addAchatEngagementFactureFraisItem(AchatEngagementFactureFraisItem achatEngagementFactureFraisItem) {
		getAchatEngagementFactureFraisItems().add(achatEngagementFactureFraisItem);
		achatEngagementFactureFraisItem.setAchatEngagementFactureFrai(this);

		return achatEngagementFactureFraisItem;
	}

	public AchatEngagementFactureFraisItem removeAchatEngagementFactureFraisItem(AchatEngagementFactureFraisItem achatEngagementFactureFraisItem) {
		getAchatEngagementFactureFraisItems().remove(achatEngagementFactureFraisItem);
		achatEngagementFactureFraisItem.setAchatEngagementFactureFrai(null);

		return achatEngagementFactureFraisItem;
	}

}