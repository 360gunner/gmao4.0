package com.microservices.elit.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the achat_demande_prix_mere_item database table.
 * 
 */
@Entity
@Table(name="achat_demande_prix_mere_item")
@NamedQuery(name="AchatDemandePrixMereItem.findAll", query="SELECT a FROM AchatDemandePrixMereItem a")
public class AchatDemandePrixMereItem implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;

	@Column(name="creer_le")
	private Timestamp creerLe;

	@Column(name="creer_par")
	private Long creerPar;

	@Column(name="delai_execution")
	private Integer delaiExecution;

	@Column(name="id_correction")
	private Integer idCorrection;

	@Column(name="id_item")
	private Long idItem;

	@Column(name="id_reference_fournisseur")
	private Long idReferenceFournisseur;

	@Column(name="id_unite_delais_exec")
	private Long idUniteDelaisExec;

	@Column(name="id_unite_organisationnelle_createur")
	private Long idUniteOrganisationnelleCreateur;

	@Column(name="modifier_le")
	private Timestamp modifierLe;

	@Column(name="modifier_par")
	private Long modifierPar;

	private BigDecimal prix;

	@Column(name="prix_final")
	private BigDecimal prixFinal;

	private BigDecimal quantite;

	private Timestamp version;

	//bi-directional many-to-one association to AchatDemandePrixMere
	@ManyToOne
	@JoinColumn(name="id_demande_prix", insertable=false, updatable=false)
	private AchatDemandePrixMere achatDemandePrixMere;

	//bi-directional many-to-one association to AchatDemandePrixMereItemCentreCharge
	@OneToMany(mappedBy="achatDemandePrixMereItem")
	private List<AchatDemandePrixMereItemCentreCharge> achatDemandePrixMereItemCentreCharges;

	//bi-directional many-to-one association to AchatDemandePrixMereItemMagasin
	@OneToMany(mappedBy="achatDemandePrixMereItem")
	private List<AchatDemandePrixMereItemMagasin> achatDemandePrixMereItemMagasins;

	public AchatDemandePrixMereItem() {
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

	public Integer getDelaiExecution() {
		return this.delaiExecution;
	}

	public void setDelaiExecution(Integer delaiExecution) {
		this.delaiExecution = delaiExecution;
	}

	public Integer getIdCorrection() {
		return this.idCorrection;
	}

	public void setIdCorrection(Integer idCorrection) {
		this.idCorrection = idCorrection;
	}

	public Long getIdItem() {
		return this.idItem;
	}

	public void setIdItem(Long idItem) {
		this.idItem = idItem;
	}

	public Long getIdReferenceFournisseur() {
		return this.idReferenceFournisseur;
	}

	public void setIdReferenceFournisseur(Long idReferenceFournisseur) {
		this.idReferenceFournisseur = idReferenceFournisseur;
	}

	public Long getIdUniteDelaisExec() {
		return this.idUniteDelaisExec;
	}

	public void setIdUniteDelaisExec(Long idUniteDelaisExec) {
		this.idUniteDelaisExec = idUniteDelaisExec;
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

	public BigDecimal getPrix() {
		return this.prix;
	}

	public void setPrix(BigDecimal prix) {
		this.prix = prix;
	}

	public BigDecimal getPrixFinal() {
		return this.prixFinal;
	}

	public void setPrixFinal(BigDecimal prixFinal) {
		this.prixFinal = prixFinal;
	}

	public BigDecimal getQuantite() {
		return this.quantite;
	}

	public void setQuantite(BigDecimal quantite) {
		this.quantite = quantite;
	}

	public Timestamp getVersion() {
		return this.version;
	}

	public void setVersion(Timestamp version) {
		this.version = version;
	}

	public AchatDemandePrixMere getAchatDemandePrixMere() {
		return this.achatDemandePrixMere;
	}

	public void setAchatDemandePrixMere(AchatDemandePrixMere achatDemandePrixMere) {
		this.achatDemandePrixMere = achatDemandePrixMere;
	}

	public List<AchatDemandePrixMereItemCentreCharge> getAchatDemandePrixMereItemCentreCharges() {
		return this.achatDemandePrixMereItemCentreCharges;
	}

	public void setAchatDemandePrixMereItemCentreCharges(List<AchatDemandePrixMereItemCentreCharge> achatDemandePrixMereItemCentreCharges) {
		this.achatDemandePrixMereItemCentreCharges = achatDemandePrixMereItemCentreCharges;
	}

	public AchatDemandePrixMereItemCentreCharge addAchatDemandePrixMereItemCentreCharge(AchatDemandePrixMereItemCentreCharge achatDemandePrixMereItemCentreCharge) {
		getAchatDemandePrixMereItemCentreCharges().add(achatDemandePrixMereItemCentreCharge);
		achatDemandePrixMereItemCentreCharge.setAchatDemandePrixMereItem(this);

		return achatDemandePrixMereItemCentreCharge;
	}

	public AchatDemandePrixMereItemCentreCharge removeAchatDemandePrixMereItemCentreCharge(AchatDemandePrixMereItemCentreCharge achatDemandePrixMereItemCentreCharge) {
		getAchatDemandePrixMereItemCentreCharges().remove(achatDemandePrixMereItemCentreCharge);
		achatDemandePrixMereItemCentreCharge.setAchatDemandePrixMereItem(null);

		return achatDemandePrixMereItemCentreCharge;
	}

	public List<AchatDemandePrixMereItemMagasin> getAchatDemandePrixMereItemMagasins() {
		return this.achatDemandePrixMereItemMagasins;
	}

	public void setAchatDemandePrixMereItemMagasins(List<AchatDemandePrixMereItemMagasin> achatDemandePrixMereItemMagasins) {
		this.achatDemandePrixMereItemMagasins = achatDemandePrixMereItemMagasins;
	}

	public AchatDemandePrixMereItemMagasin addAchatDemandePrixMereItemMagasin(AchatDemandePrixMereItemMagasin achatDemandePrixMereItemMagasin) {
		getAchatDemandePrixMereItemMagasins().add(achatDemandePrixMereItemMagasin);
		achatDemandePrixMereItemMagasin.setAchatDemandePrixMereItem(this);

		return achatDemandePrixMereItemMagasin;
	}

	public AchatDemandePrixMereItemMagasin removeAchatDemandePrixMereItemMagasin(AchatDemandePrixMereItemMagasin achatDemandePrixMereItemMagasin) {
		getAchatDemandePrixMereItemMagasins().remove(achatDemandePrixMereItemMagasin);
		achatDemandePrixMereItemMagasin.setAchatDemandePrixMereItem(null);

		return achatDemandePrixMereItemMagasin;
	}

}