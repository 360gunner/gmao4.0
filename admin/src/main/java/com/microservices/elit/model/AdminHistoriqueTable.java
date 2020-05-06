package com.microservices.elit.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the admin_historique_table database table.
 * 
 */
@Entity
@Table(name="admin_historique_table")
@NamedQuery(name="AdminHistoriqueTable.findAll", query="SELECT a FROM AdminHistoriqueTable a")
public class AdminHistoriqueTable implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;

	private String description;

	private String libelle;

	public AdminHistoriqueTable() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getLibelle() {
		return this.libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

}