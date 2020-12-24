package com.onebill.customizer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onebill.customizer.dao.BundelPlansDAO;
import com.onebill.customizer.entities.BundelPlans;
import com.onebill.customizer.exception.CustomizePlanException;

@Service
public class BundelPlanServiceImpl implements BundelPlanService {
	@Autowired
	private BundelPlansDAO dao;

	@Override
	public BundelPlans addBundelPlans(BundelPlans bundel) {
		try {
			BundelPlans bundel1 = dao.addBundelPlans(bundel);
			if (bundel1 != null) {
				return bundel1;
			} else {
				throw new CustomizePlanException("unable to add bundel Plans "+bundel.getPk() );
			}
		} catch (Exception e) {
			throw new CustomizePlanException("unable to add bundel Plans "+bundel.getPk());
		}
	}

	@Override
	public List<BundelPlans> removeBundelPlans(int bundelId) {
		try {
			List<BundelPlans> bundel1 = dao.removeBundelPlans(bundelId);
			if (bundel1 != null) {
				return bundel1;
			} else {
				throw new CustomizePlanException("unable to remove bundel Plans "+bundelId);
			}
		} catch (Exception e) {
			throw new CustomizePlanException("unable to remove bundel Plans"+bundelId);
		}

	}

	@Override
	public BundelPlans updateBundelPlans(BundelPlans bundel) {
		BundelPlans bundel1=dao.updateBundelPlans(bundel);
		try{
			if(bundel1!=null) {
			return bundel1;
		}else {
			throw new CustomizePlanException("unable to update bundel");
		}
		}catch(Exception e) {
			throw new CustomizePlanException("unable to update Bundel Plans" + bundel.getPk());
		}
	}

	@Override
	public List<BundelPlans> getAllBundelPlans() {
		List<BundelPlans> bundel = dao.getAllBundelPlans();
		try {
		if (bundel != null) {
			return bundel;
		} else {
			throw new CustomizePlanException("unable to get bundel");
		}
		}catch(Exception e) {
			throw new CustomizePlanException("unable to get bundel Plans");
		}
	}
}
