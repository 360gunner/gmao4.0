package com.microservices.elit.model;

public class DbaCentreChargeCRUD {
	
	DbaCentreCharge test;
	
	HTTPTYPE type;
	
	public DbaCentreChargeCRUD() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DbaCentreChargeCRUD(DbaCentreCharge test, HTTPTYPE type) {
		super();
		this.test = test;
		this.type = type;
	}

	public DbaCentreCharge getDbaCentreCharge() {
		return test;
	}

	public void setDbaCentreCharge(DbaCentreCharge test) {
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
		return "DbaCentreChargeCRUD [this=" + test + ", type=" + type + "]";
	}
	
}