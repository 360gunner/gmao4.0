package com.microservices.elit.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the admin_niveau_visibilite database table.
 * 
 */
@Entity
@Table(name="admin_niveau_visibilite")
@NamedQuery(name="AdminNiveauVisibilite.findAll", query="SELECT a FROM AdminNiveauVisibilite a")
public class AdminNiveauVisibilite implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String code;

	public AdminNiveauVisibilite() {
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

}