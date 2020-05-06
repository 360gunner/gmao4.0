package com.microservices.elit.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the demande_ligne database table.
 * 
 */
@Entity
@Table(name="demande_ligne")
@NamedQuery(name="DemandeLigne.findAll", query="SELECT d FROM DemandeLigne d")
public class DemandeLigne implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Long id;

	@Column(name="creer_le")
	private Timestamp creerLe;

	@Column(name="creer_par")
	private Integer creerPar;

	@Column(name="date_livraison_souhaitee")
	private Timestamp dateLivraisonSouhaitee;

	@Column(name="id_article")
	private Integer idArticle;

	@Column(name="id_correction")
	private Integer idCorrection;

	@Column(name="id_demande")
	private Integer idDemande;

	@Column(name="id_emplacement")
	private Integer idEmplacement;

	@Column(name="id_reference")
	private Integer idReference;

	@Column(name="id_unite_organisationnelle_createur")
	private Integer idUniteOrganisationnelleCreateur;

	@Column(name="modifier_le")
	private Timestamp modifierLe;

	@Column(name="modifier_par")
	private Integer modifierPar;

	@Column(name="num_ligne")
	private Integer numLigne;

	private BigDecimal prix;

	@Column(name="qte_demande")
	private BigDecimal qteDemande;

	@Column(name="qte_restante")
	private BigDecimal qteRestante;

	@Column(name="qte_restante_dp")
	private double qteRestanteDp;

	@Column(name="qte_restante_eng")
	private double qteRestanteEng;

	@Column(name="qte_restante_theo")
	private BigDecimal qteRestanteTheo;

	@Column(name="qte_restante_theo_dp")
	private double qteRestanteTheoDp;

	@Column(name="qte_restante_theo_eng")
	private double qteRestanteTheoEng;

	private Timestamp version;

	//bi-directional many-to-one association to AchatArrivageDemandeAchatItem
	@OneToMany(mappedBy="demandeLigne")
	private List<AchatArrivageDemandeAchatItem> achatArrivageDemandeAchatItems;

	public DemandeLigne() {
	}

	public DemandeLigne(long id2, String string) {
		// TODO Auto-generated constructor stub
		this.id=id2;
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Timestamp getCreerLe() {
		return this.creerLe;
	}

	public void setCreerLe(Timestamp creerLe) {
		this.creerLe = creerLe;
	}

	public Integer getCreerPar() {
		return this.creerPar;
	}

	public void setCreerPar(Integer creerPar) {
		this.creerPar = creerPar;
	}

	public Timestamp getDateLivraisonSouhaitee() {
		return this.dateLivraisonSouhaitee;
	}

	public void setDateLivraisonSouhaitee(Timestamp dateLivraisonSouhaitee) {
		this.dateLivraisonSouhaitee = dateLivraisonSouhaitee;
	}

	public Integer getIdArticle() {
		return this.idArticle;
	}

	public void setIdArticle(Integer idArticle) {
		this.idArticle = idArticle;
	}

	public Integer getIdCorrection() {
		return this.idCorrection;
	}

	public void setIdCorrection(Integer idCorrection) {
		this.idCorrection = idCorrection;
	}

	public Integer getIdDemande() {
		return this.idDemande;
	}

	public void setIdDemande(Integer idDemande) {
		this.idDemande = idDemande;
	}

	public Integer getIdEmplacement() {
		return this.idEmplacement;
	}

	public void setIdEmplacement(Integer idEmplacement) {
		this.idEmplacement = idEmplacement;
	}

	public Integer getIdReference() {
		return this.idReference;
	}

	public void setIdReference(Integer idReference) {
		this.idReference = idReference;
	}

	public Integer getIdUniteOrganisationnelleCreateur() {
		return this.idUniteOrganisationnelleCreateur;
	}

	public void setIdUniteOrganisationnelleCreateur(Integer idUniteOrganisationnelleCreateur) {
		this.idUniteOrganisationnelleCreateur = idUniteOrganisationnelleCreateur;
	}

	public Timestamp getModifierLe() {
		return this.modifierLe;
	}

	public void setModifierLe(Timestamp modifierLe) {
		this.modifierLe = modifierLe;
	}

	public Integer getModifierPar() {
		return this.modifierPar;
	}

	public void setModifierPar(Integer modifierPar) {
		this.modifierPar = modifierPar;
	}

	public Integer getNumLigne() {
		return this.numLigne;
	}

	public void setNumLigne(Integer numLigne) {
		this.numLigne = numLigne;
	}

	public BigDecimal getPrix() {
		return this.prix;
	}

	public void setPrix(BigDecimal prix) {
		this.prix = prix;
	}

	public BigDecimal getQteDemande() {
		return this.qteDemande;
	}

	public void setQteDemande(BigDecimal qteDemande) {
		this.qteDemande = qteDemande;
	}

	public BigDecimal getQteRestante() {
		return this.qteRestante;
	}

	public void setQteRestante(BigDecimal qteRestante) {
		this.qteRestante = qteRestante;
	}

	public double getQteRestanteDp() {
		return this.qteRestanteDp;
	}

	public void setQteRestanteDp(double qteRestanteDp) {
		this.qteRestanteDp = qteRestanteDp;
	}

	public double getQteRestanteEng() {
		return this.qteRestanteEng;
	}

	public void setQteRestanteEng(double qteRestanteEng) {
		this.qteRestanteEng = qteRestanteEng;
	}

	public BigDecimal getQteRestanteTheo() {
		return this.qteRestanteTheo;
	}

	public void setQteRestanteTheo(BigDecimal qteRestanteTheo) {
		this.qteRestanteTheo = qteRestanteTheo;
	}

	public double getQteRestanteTheoDp() {
		return this.qteRestanteTheoDp;
	}

	public void setQteRestanteTheoDp(double qteRestanteTheoDp) {
		this.qteRestanteTheoDp = qteRestanteTheoDp;
	}

	public double getQteRestanteTheoEng() {
		return this.qteRestanteTheoEng;
	}

	public void setQteRestanteTheoEng(double qteRestanteTheoEng) {
		this.qteRestanteTheoEng = qteRestanteTheoEng;
	}

	public Timestamp getVersion() {
		return this.version;
	}

	public void setVersion(Timestamp version) {
		this.version = version;
	}

	public List<AchatArrivageDemandeAchatItem> getAchatArrivageDemandeAchatItems() {
		return this.achatArrivageDemandeAchatItems;
	}

	public void setAchatArrivageDemandeAchatItems(List<AchatArrivageDemandeAchatItem> achatArrivageDemandeAchatItems) {
		this.achatArrivageDemandeAchatItems = achatArrivageDemandeAchatItems;
	}

	public AchatArrivageDemandeAchatItem addAchatArrivageDemandeAchatItem(AchatArrivageDemandeAchatItem achatArrivageDemandeAchatItem) {
		getAchatArrivageDemandeAchatItems().add(achatArrivageDemandeAchatItem);
		achatArrivageDemandeAchatItem.setDemandeLigne(this);

		return achatArrivageDemandeAchatItem;
	}

	public AchatArrivageDemandeAchatItem removeAchatArrivageDemandeAchatItem(AchatArrivageDemandeAchatItem achatArrivageDemandeAchatItem) {
		getAchatArrivageDemandeAchatItems().remove(achatArrivageDemandeAchatItem);
		achatArrivageDemandeAchatItem.setDemandeLigne(null);

		return achatArrivageDemandeAchatItem;
	}

}