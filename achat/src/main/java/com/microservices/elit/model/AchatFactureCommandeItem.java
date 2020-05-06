package com.microservices.elit.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the achat_facture_commande_item database table.
 * 
 */
@Entity
@Table(name="achat_facture_commande_item")
@NamedQuery(name="AchatFactureCommandeItem.findAll", query="SELECT a FROM AchatFactureCommandeItem a")
public class AchatFactureCommandeItem implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private AchatFactureCommandeItemPK id;

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

	private BigDecimal quantite;

	//bi-directional many-to-one association to AchatEngagementItem
	@ManyToOne
	@JoinColumn(name="id_commande_item", insertable=false, updatable=false)
	private AchatEngagementItem achatEngagementItem;

	//bi-directional many-to-one association to AchatFacture
	@ManyToOne
	@JoinColumn(name="id_facture", insertable=false, updatable=false)
	private AchatFacture achatFacture;

	public AchatFactureCommandeItem() {
	}

	public AchatFactureCommandeItemPK getId() {
		return this.id;
	}

	public void setId(AchatFactureCommandeItemPK id) {
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

	public BigDecimal getQuantite() {
		return this.quantite;
	}

	public void setQuantite(BigDecimal quantite) {
		this.quantite = quantite;
	}

	public AchatEngagementItem getAchatEngagementItem() {
		return this.achatEngagementItem;
	}

	public void setAchatEngagementItem(AchatEngagementItem achatEngagementItem) {
		this.achatEngagementItem = achatEngagementItem;
	}

	public AchatFacture getAchatFacture() {
		return this.achatFacture;
	}

	public void setAchatFacture(AchatFacture achatFacture) {
		this.achatFacture = achatFacture;
	}

}