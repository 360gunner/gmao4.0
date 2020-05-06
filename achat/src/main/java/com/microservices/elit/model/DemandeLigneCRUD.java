package com.microservices.elit.model;

public class DemandeLigneCRUD {
	
	DemandeLigne test;
	
	HTTPTYPE type;
	
	public DemandeLigneCRUD() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DemandeLigneCRUD(DemandeLigne test, HTTPTYPE type) {
		super();
		this.test = test;
		this.type = type;
	}

	public DemandeLigne getDemandeLigne() {
		return test;
	}

	public void setDemandeLigne(DemandeLigne test) {
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
		return "DemandeLigneCRUD [this=" + test + ", type=" + type + "]";
	}
	
}