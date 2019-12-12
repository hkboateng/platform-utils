package com.anansemind.platform.utils;

public enum Region {
	ASHANTI("ashanti"),
	BONO("bono"),
	GREATER_ACCRA("greater accra"),
	EASTERN("eastern"),
	SAVANNAH("savannah"),
	WESTERN("western"),
	CENTRAL("central"),
	VOLTA("volta");
	
	private String region;
	
	Region (String region) {
		this.region = region;
	}
	
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
}
