package com.onebill.customizer.dto;

import java.io.Serializable;

import com.onebill.customizer.entities.Plans;

public class ChargesDTO  implements Serializable{
	private int chargeId;
	private String strategyName;
	private double strategyCost;
	private String chargeDEscription;
	private int validityInDays;
	private String chargeType;
	private Plans plan;
	public int getChargeId() {
		return chargeId;
	}
	public void setChargeId(int chargeId) {
		this.chargeId = chargeId;
	}
	public String getStrategyName() {
		return strategyName;
	}
	public void setStrategyName(String strategyName) {
		this.strategyName = strategyName;
	}
	public double getStrategyCost() {
		return strategyCost;
	}
	public void setStrategyCost(double strategyCost) {
		this.strategyCost = strategyCost;
	}
	public String getChargeDEscription() {
		return chargeDEscription;
	}
	public void setChargeDEscription(String chargeDEscription) {
		this.chargeDEscription = chargeDEscription;
	}
	public int getValidityInDays() {
		return validityInDays;
	}
	public void setValidityInDays(int validityInDays) {
		this.validityInDays = validityInDays;
	}
	public String getChargeType() {
		return chargeType;
	}
	public void setChargeType(String chargeType) {
		this.chargeType = chargeType;
	}
	public Plans getPlan() {
		return plan;
	}
	public void setPlan(Plans plan) {
		this.plan = plan;
	}
	
	

}
