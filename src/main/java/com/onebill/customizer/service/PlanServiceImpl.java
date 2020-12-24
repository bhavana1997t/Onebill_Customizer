package com.onebill.customizer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onebill.customizer.dao.PlanDAO;
import com.onebill.customizer.entities.Plans;
import com.onebill.customizer.entities.Products;
import com.onebill.customizer.exception.CustomizePlanException;

@Service
public class PlanServiceImpl implements PlanService {
	@Autowired
	private PlanDAO dao;

	@Override
	public Plans addPlan(Plans plan) {
		try {
			Plans plan1 = dao.addPlan(plan);
			if (plan1 != null) {
				return plan1;
			} else {
				throw new CustomizePlanException("unable to add plan");
			}
		} catch (Exception e) {
			throw new CustomizePlanException(
					"unable to add plan with plan name" + plan.getPlanName() );
		}
	}

	@Override
	public Plans removePlan(int plan) {
		Plans plan1 = dao.removePlan(plan);
		try {
			if (plan1 != null) {
				return plan1;
			} else {
				throw new CustomizePlanException("unable to remove plan");
			}
		} catch (Exception e) {
			throw new CustomizePlanException("wrong planId " + plan);

		}

	}

	@Override
	public Plans updatePlan(Plans plan) {
		Plans plan1 = dao.updatePlan(plan);
		try {
			if (plan1 != null) {
				return plan1;
			} else {
				throw new CustomizePlanException("unable to update plan");
			}
		} catch (Exception e) {
			throw new CustomizePlanException(
					"unable to update plan with planID " + plan.getPlanId() + " and product" + plan.getProduct());
		}
	}

	@Override
	public List<Plans> getAllPlans(Products product) {
		List<Plans> plans = dao.getAllPlans(product);
		try {
			if (plans != null) {
				return plans;
			} else {
				throw new CustomizePlanException("unable to get plan");
			}
		} catch (Exception e) {
			throw new CustomizePlanException("unable to get plans");
		}
	}

	@Override
	public List<Plans> getPlan(String planName) {
		List<Plans> plans = dao.getPlan(planName);
		try {
			if (plans != null) {
				return plans;
			} else {
				throw new CustomizePlanException("unable to get plan");
			}
		} catch (Exception e) {
			throw new CustomizePlanException(planName + "not found");
		}
	}

	@Override
	public List<Plans> getMyPlan(String planName) {
		List<Plans> plans = dao.getMyPlan(planName);
		try {
			if (plans != null) {
				return plans;
			} else {
				throw new CustomizePlanException("unable to get plan");
			}
		} catch (Exception e) {
			throw new CustomizePlanException(planName + "not found");
		}
	}

	@Override
	public List<Plans> getPlanByProduct(int productId) {
		List<Plans> plans = dao.getPlansByProduct(productId);
		try {
			if (plans != null) {
				return plans;
			} else {
				throw new CustomizePlanException("unable to get plan");
			}
		} catch (Exception e) {
			throw new CustomizePlanException(productId + "not found");
		}
		
	}

	@Override
	public List<Plans> getPlansByBundel(int bundelId) {
		List<Plans> plans = dao.getPlansByBundel(bundelId);
		try {
			if (plans != null) {
				return plans;
			} else {
				throw new CustomizePlanException("unable to get plan");
			}
		} catch (Exception e) {
			throw new CustomizePlanException(bundelId + "not found");
		}
	}

}
