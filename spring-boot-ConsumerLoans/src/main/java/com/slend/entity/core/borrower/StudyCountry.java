package com.slend.entity.core.borrower;

public enum StudyCountry {
	AUSTRALIA("AUSTRALIA"), INDIA("INDIA"), SINGAPORE("SINGAPORE"),
	UK("SINGAPORE"), USA("USA"), AUSTRIA("AUSTRIA"),
	BELGIUM("BELGIUM"), CANADA("CANADA"), DENMARK("DENMARK"), 
	FINLAND("FINLAND"), FRANCE("FRANCE"), GERMANY("GERMANY"), 
	GREECE("GREECE"),
	HONG_KONG("HONG_KONG"), HUNGARY("HUNGARY"),
	ICELAND("ICELAND"), IRELAND("IRELAND"), ITALY("ITALY"), NETHERLANDS("NETHERLANDS"),
	NEW_ZEALAND("NEW_ZEALAND"), NORWAY("NORWAY"),
	POLAND("POLAND"), PORTUGAL("PORTUGAL"), ROMANIA("ROMANIA"), SPAIN("SPAIN"),
	SWEDEN("SWEDEN"), SWITZERLAND("SWITZERLAND"),
	TURKEY("TURKEY"), UAE("UAE"), OTHER("OTHER");
	private String description;

	private StudyCountry(String description) {
		this.description = description;
	} 
	
}
