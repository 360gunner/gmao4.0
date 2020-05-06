package com.microservices.elit.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the admin_entity_visibilite database table.
 * 
 */
@Entity
@Table(name="admin_entity_visibilite")
@NamedQuery(name="AdminEntityVisibilite.findAll", query="SELECT a FROM AdminEntityVisibilite a")
public class AdminEntityVisibilite implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="entity_name")
	private String entityName;

	@Column(name="entity_domain")
	private String entityDomain;

	@Column(name="entity_simple_name")
	private String entitySimpleName;

	@Column(name="entity_supp_name")
	private String entitySuppName;

	@Column(name="save_stat_page_list")
	private Boolean saveStatPageList;

	@Column(name="use_by_child")
	private Boolean useByChild;

	@Column(name="visibilite_appartenance")
	private Boolean visibiliteAppartenance;

	@Column(name="visibilite_module")
	private Boolean visibiliteModule;

	@Column(name="visibilite_profil")
	private Boolean visibiliteProfil;

	@Column(name="visibilite_technologie")
	private Boolean visibiliteTechnologie;

	@Column(name="visibilite_unite")
	private Boolean visibiliteUnite;

	@Column(name="visibilite_user")
	private Boolean visibiliteUser;

	public AdminEntityVisibilite() {
	}

	public String getEntityName() {
		return this.entityName;
	}

	public void setEntityName(String entityName) {
		this.entityName = entityName;
	}

	public String getEntityDomain() {
		return this.entityDomain;
	}

	public void setEntityDomain(String entityDomain) {
		this.entityDomain = entityDomain;
	}

	public String getEntitySimpleName() {
		return this.entitySimpleName;
	}

	public void setEntitySimpleName(String entitySimpleName) {
		this.entitySimpleName = entitySimpleName;
	}

	public String getEntitySuppName() {
		return this.entitySuppName;
	}

	public void setEntitySuppName(String entitySuppName) {
		this.entitySuppName = entitySuppName;
	}

	public Boolean getSaveStatPageList() {
		return this.saveStatPageList;
	}

	public void setSaveStatPageList(Boolean saveStatPageList) {
		this.saveStatPageList = saveStatPageList;
	}

	public Boolean getUseByChild() {
		return this.useByChild;
	}

	public void setUseByChild(Boolean useByChild) {
		this.useByChild = useByChild;
	}

	public Boolean getVisibiliteAppartenance() {
		return this.visibiliteAppartenance;
	}

	public void setVisibiliteAppartenance(Boolean visibiliteAppartenance) {
		this.visibiliteAppartenance = visibiliteAppartenance;
	}

	public Boolean getVisibiliteModule() {
		return this.visibiliteModule;
	}

	public void setVisibiliteModule(Boolean visibiliteModule) {
		this.visibiliteModule = visibiliteModule;
	}

	public Boolean getVisibiliteProfil() {
		return this.visibiliteProfil;
	}

	public void setVisibiliteProfil(Boolean visibiliteProfil) {
		this.visibiliteProfil = visibiliteProfil;
	}

	public Boolean getVisibiliteTechnologie() {
		return this.visibiliteTechnologie;
	}

	public void setVisibiliteTechnologie(Boolean visibiliteTechnologie) {
		this.visibiliteTechnologie = visibiliteTechnologie;
	}

	public Boolean getVisibiliteUnite() {
		return this.visibiliteUnite;
	}

	public void setVisibiliteUnite(Boolean visibiliteUnite) {
		this.visibiliteUnite = visibiliteUnite;
	}

	public Boolean getVisibiliteUser() {
		return this.visibiliteUser;
	}

	public void setVisibiliteUser(Boolean visibiliteUser) {
		this.visibiliteUser = visibiliteUser;
	}

}