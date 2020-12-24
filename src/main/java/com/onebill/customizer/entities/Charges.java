package com.onebill.customizer.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.UniqueElements;

@Entity
public class Charges {
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY)
	@Column(name="charge_id")
	private int chargeId;
	
	@Column(name="strategy_cost")
	private Long strategyCost;
	
	@Column(name="strategy_name")
	private String strategyName;
	
	@Column(name="charge_descrption")
	private String chargeDescription;
	
	@Column(name="charge_type")
	private String chargeType;
	
	
	@Column(name="validity_in_days")
	private int validityInDays;
	
	@ManyToOne
	@JoinColumn(name="plan_id")
	private Plans plan;

	public int getChargeId() {
		return chargeId;
	}

	public void setChargeId(int chargeId) {
		this.chargeId = chargeId;
	}

	public Long getStrategyCost() {
		return strategyCost;
	}

	public void setStrategyCost(Long strategyCost) {
		this.strategyCost = strategyCost;
	}

	public String getStrategyName() {
		return strategyName;
	}

	public void setStrategyName(String strategyName) {
		this.strategyName = strategyName;
	}

	public String getChargeDescription() {
		return chargeDescription;
	}

	public void setChargeDescription(String chargeDescription) {
		this.chargeDescription = chargeDescription;
	}

	public String getChargeType() {
		return chargeType;
	}

	public void setChargeType(String chargeType) {
		this.chargeType = chargeType;
	}

	public int getValidityInDays() {
		return validityInDays;
	}

	public void setValidityInDays(int validityInDays) {
		this.validityInDays = validityInDays;
	}

	public Plans getPlan() {
		return plan;
	}

	public void setPlan(Plans plan) {
		this.plan = plan;
	}

}
