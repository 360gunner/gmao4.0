package com.microservices.elit.model;

public class CorrectionCRUD {
	
	Correction test;
	
	HTTPTYPE type;
	
	public CorrectionCRUD() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CorrectionCRUD(Correction test, HTTPTYPE type) {
		super();
		this.test = test;
		this.type = type;
	}

	public Correction getCorrection() {
		return test;
	}

	public void setCorrection(Correction test) {
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
		return "CorrectionCRUD [this=" + test + ", type=" + type + "]";
	}
	
}