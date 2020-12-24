package com.onebill.customizer.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Repository;

import com.onebill.customizer.entities.Plans;
import com.onebill.customizer.entities.Products;

@Repository
public class PlanDAOImpl implements PlanDAO {
	@PersistenceContext
	EntityManager manager;

	@Override
	@Transactional
	public Plans addPlan(Plans plan) {
		manager.persist(plan);
		return plan;
	}

	@Override
	@Transactional
	public Plans removePlan(int planId) {
		Plans plan1 = manager.find(Plans.class, planId);
		manager.remove(plan1);
		return plan1;
	}

	@Override
	@Transactional
	public Plans updatePlan(Plans plan) {
		Plans plan1 = manager.find(Plans.class, plan.getPlanId());
		BeanUtils.copyProperties(plan, plan1);
		return plan1;
	}

	@Override
	@Transactional
	public List<Plans> getAllPlans(Products product) {
		return manager.createQuery("FROM Plans p WHERE p.product=product", Plans.class).getResultList();
	}

	@Override
	@Transactional
	public List<Plans> getPlan(String planName) {
		TypedQuery<Plans> query = manager.createQuery("FROM Plans U WHERE U.planName = :value", Plans.class);
		query.setParameter("value", planName);
		List<Plans> planList = query.getResultList();
		List<Plans> list = null;
		if (!planList.isEmpty()) {
			return planList;
		} else {
			return list;
		}

	}

	@Override
	@Transactional
	public List<Plans> getMyPlan(String planName) {
		TypedQuery<Plans> query =
				manager.createQuery("From Plans  p where p.planName LIKE :value",
				Plans.class);
		query.setParameter("value","%"+ planName+"%");
			return query.getResultList();
		
	}

	@Override
	public List<Plans> getPlansByProduct(int productId) {
		TypedQuery<Plans> query =
				manager.createQuery("From Plans  p where p.product.productId = :value",
				Plans.class);
		query.setParameter("value",productId);
			return query.getResultList();
		
	}

	@Override
	public List<Plans> getPlansByBundel(int bundelId) {
		TypedQuery<Plans> query =
				manager.createQuery("From Plans  p where p.bundel.bundelId = :value",
				Plans.class);
		query.setParameter("value",bundelId);
			return query.getResultList();
	}

}
