package com.microservices.elit.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the achat_livraison_item_facture_achat database table.
 * 
 */
@Entity
@Table(name="achat_livraison_item_facture_achat")
@NamedQuery(name="AchatLivraisonItemFactureAchat.findAll", query="SELECT a FROM AchatLivraisonItemFactureAchat a")
public class AchatLivraisonItemFactureAchat implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private AchatLivraisonItemFactureAchatPK id;

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

	//bi-directional many-to-one association to AchatFactureLigne
	@ManyToOne
	@JoinColumn(name="id_facture_achat_item", insertable=false, updatable=false)
	private AchatFactureLigne achatFactureLigne;

	//bi-directional many-to-one association to AchatLivraison
	@ManyToOne
	@JoinColumn(name="id_livraison", insertable=false, updatable=false)
	private AchatLivraison achatLivraison;

	public AchatLivraisonItemFactureAchat() {
	}

	public AchatLivraisonItemFactureAchatPK getId() {
		return this.id;
	}

	public void setId(AchatLivraisonItemFactureAchatPK id) {
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

	public AchatFactureLigne getAchatFactureLigne() {
		return this.achatFactureLigne;
	}

	public void setAchatFactureLigne(AchatFactureLigne achatFactureLigne) {
		this.achatFactureLigne = achatFactureLigne;
	}

	public AchatLivraison getAchatLivraison() {
		return this.achatLivraison;
	}

	public void setAchatLivraison(AchatLivraison achatLivraison) {
		this.achatLivraison = achatLivraison;
	}

}