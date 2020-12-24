package com.onebill.customizer.dao;

import java.util.List;

import com.onebill.customizer.entities.Plans;
import com.onebill.customizer.entities.Products;


public interface PlanDAO{
	public Plans addPlan(Plans plan);
	public Plans updatePlan(Plans plan);
	public List<Plans> getAllPlans(Products product);
	public Plans removePlan(int planId);
	List<Plans> getPlan(String planName);
	public List<Plans>  getMyPlan(String planName);
	public List<Plans>  getPlansByProduct(int productID);
	public List<Plans>  getPlansByBundel(int bundelId);
	
}
