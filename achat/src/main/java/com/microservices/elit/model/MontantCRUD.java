package com.microservices.elit.model;

import java.math.BigDecimal;

public class MontantCRUD {
	
	private BigDecimal montant;
	
	private Integer idDemande;
	
	HTTPTYPE type;
	
	public MontantCRUD() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MontantCRUD(BigDecimal montant, Integer idDemande, HTTPTYPE type) {
		super();
		this.montant = montant;
		this.idDemande = idDemande;
		this.type = type;
	}

	


	public BigDecimal getMontant() {
		return montant;
	}

	public void setMontant(BigDecimal montant) {
		this.montant = montant;
	}

	public Integer getIdDemande() {
		return idDemande;
	}

	public void setIdDemande(Integer idDemande) {
		this.idDemande = idDemande;
	}

	public HTTPTYPE getType() {
		return type;
	}

	public void setType(HTTPTYPE type) {
		this.type = type;
	}

	
	
}