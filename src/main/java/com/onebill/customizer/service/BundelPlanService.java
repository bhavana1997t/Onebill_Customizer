package com.onebill.customizer.service;

import java.util.List;

import com.onebill.customizer.entities.BundelPlans;

public interface BundelPlanService {
	public BundelPlans addBundelPlans(BundelPlans bundelPlans);
	public List<BundelPlans> removeBundelPlans(int bundelId);
	public BundelPlans updateBundelPlans(BundelPlans bundelPlans);
	public List<BundelPlans> getAllBundelPlans();

}
