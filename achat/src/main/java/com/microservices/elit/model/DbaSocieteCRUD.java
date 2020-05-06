package com.microservices.elit.model;

public class DbaSocieteCRUD {
	
	DbaSociete test;
	
	HTTPTYPE type;
	
	public DbaSocieteCRUD() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DbaSocieteCRUD(DbaSociete test, HTTPTYPE type) {
		super();
		this.test = test;
		this.type = type;
	}

	public DbaSociete getDbaSociete() {
		return test;
	}

	public void setDbaSociete(DbaSociete test) {
		this.test = test;
	}

	public HTTPTYPE getType() {
		return type;
	}

	public void setType(HTTPTYPE type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "DbaSocieteCRUD [this=" + test + ", type=" + type + "]";
	}
	
}