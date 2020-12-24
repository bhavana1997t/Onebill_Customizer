package com.onebill.customizer.dto;

import java.io.Serializable;

public class BundelDTO implements Serializable {
	
	private  int bundelID;
	private String BundelName;
	private String bundelDescription;
	public  int getBundelID() {
		return bundelID;
	}
	public void setBundelID(int bundelID) {
		this.bundelID = bundelID;
	}
	public String getBundelName() {
		return BundelName;
	}
	public void setBundelName(String bundelName) {
		BundelName = bundelName;
	}
	public String getBundelDescription() {
		return bundelDescription;
	}
	public void setBundelDescription(String bundelDescription) {
		this.bundelDescription = bundelDescription;
	}


}
