package com.onebill.customizer.service;

import java.util.List;

import com.onebill.customizer.entities.Plans;
import com.onebill.customizer.entities.Products;

public interface PlanService {
	public Plans addPlan(Plans plan);
	public Plans removePlan(int plan);
	public Plans updatePlan(Plans plan);
	public List<Plans> getAllPlans(Products product);
	List<Plans> getPlan(String planName);
	public List<Plans> getMyPlan(String planName);
	public List<Plans> getPlanByProduct(int productId);
	public List<Plans>getPlansByBundel(int bundelId);
}
