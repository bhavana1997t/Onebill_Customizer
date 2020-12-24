package com.onebill.customizer.dao;

import java.util.List;

import com.onebill.customizer.entities.Charges;
import com.onebill.customizer.entities.Plans;

public interface ChargesDAO {
	public Charges addCharge(Charges charge);
	public Charges removeCharge(int chargeId);
	public Charges updateCharge(Charges charge);
	public List<Charges> getAllCharges(Plans plan);
	List<Charges> getcharges(int ChargeId);
	List<Charges> getchargesByType(String  ChargeType);
	List<Charges> getchargesByPlan(int  PlanId);
	

}
