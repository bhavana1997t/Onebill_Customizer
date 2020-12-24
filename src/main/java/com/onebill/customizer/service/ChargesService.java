package com.onebill.customizer.service;

import java.util.List;

import com.onebill.customizer.entities.Charges;
import com.onebill.customizer.entities.Plans;

public interface ChargesService {
	public Charges addCharge(Charges charge);
	public Charges removeCharge(int chargeId);
	public Charges updateCharge(Charges charge);
	public List<Charges> getAllCharges(Plans plan);
	List<Charges> getCharges(int chargeId);
	List<Charges> getChargesByType(String chargeType);
	List<Charges> getChargesByPlan(int planId);
}
