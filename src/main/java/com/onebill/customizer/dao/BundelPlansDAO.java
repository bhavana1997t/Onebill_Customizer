package com.onebill.customizer.dao;

import java.util.List;

import com.onebill.customizer.entities.BundelPlans;

public interface BundelPlansDAO {
	public BundelPlans addBundelPlans(BundelPlans bundelPlans);
	public List<BundelPlans> removeBundelPlans(int bundelId);
	public BundelPlans updateBundelPlans(BundelPlans bundelPlans);
	public List<BundelPlans> getAllBundelPlans();
}