package com.onebill.customizer.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Repository;

import com.onebill.customizer.entities.Bundel;
import com.onebill.customizer.entities.BundelPlans;

@Repository
public class BundelPlansDAOImpl implements BundelPlansDAO{
	@PersistenceContext
	EntityManager manager;

	@Override
	@Transactional
	public BundelPlans addBundelPlans(BundelPlans bundelPlans) {
		manager.persist(bundelPlans);
		return bundelPlans;
	}

	@Override
	@Transactional
	public List<BundelPlans> removeBundelPlans(int bundelId) {
		Bundel bundelPlans1 = manager.find(Bundel.class, bundelId);
		return manager.createQuery("delete FROM BundelPlans  U WHERE U.bundelId = :value",BundelPlans.class).getResultList();

	}

	@Override
	@Transactional
	public BundelPlans updateBundelPlans(BundelPlans bundelPlans) {
		BundelPlans bundelPlans1 = manager.find(BundelPlans.class, bundelPlans.getPk());
		BeanUtils.copyProperties(bundelPlans, bundelPlans1);
		return bundelPlans1;
	}

	@Override
	@Transactional
	public List<BundelPlans> getAllBundelPlans() {
		return manager.createQuery("FROM BundelPlans", BundelPlans.class).getResultList();
	}

}
