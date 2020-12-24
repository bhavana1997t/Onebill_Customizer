package com.onebill.customizer.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;


@SuppressWarnings("serial")
@Entity
@Table
public class BundelPlans implements Serializable{

	@EmbeddedId
	private BundelPk pk;
	
	public Object getBundelIdBundelPk() {
		return pk.getBundelId();
	}
	
	public BundelPk getPk() {
		return pk;
	}

	public void setPk(BundelPk pk) {
		this.pk = pk;
	}
	
	@Column(name="Bundel_plan_Description")
	private String BundelPlanDescription;

	public String getBundelPlanDescription() {
		return BundelPlanDescription;
	}

	public void setBundelPlanDescription(String bundelPlanDescription) {
		BundelPlanDescription = bundelPlanDescription;
	}
}
