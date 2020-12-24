package com.onebill.customizer.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Repository;

import com.onebill.customizer.entities.Charges;
import com.onebill.customizer.entities.Plans;

@Repository
public class ChargesDAOImpl implements ChargesDAO {
	@PersistenceContext
	EntityManager manager;

	@Transactional
	@Override
	public Charges addCharge(Charges charge) {
		manager.persist(charge);
		return charge;
	}

	@Transactional
	@Override
	public Charges removeCharge(int chargeId) {
		Charges charge1 = manager.find(Charges.class, chargeId);
		manager.remove(charge1);
		return charge1;
	}

	@Transactional
	@Override
	public Charges updateCharge(Charges charge) {
		Charges charge1 = manager.find(Charges.class, charge.getChargeId());
		BeanUtils.copyProperties(charge, charge1);
		return charge1;
	}

	@Override
	@Transactional
	public List<Charges> getcharges(int ChargeId) {
		TypedQuery<Charges> query = manager.createQuery("FROM Charges U WHERE U.chargeId = :value", Charges.class);
		query.setParameter("value", ChargeId);
		List<Charges> chargeList = query.getResultList();
		List<Charges> list = null;
		if (!chargeList.isEmpty()) {
			return chargeList;
		} else {
			return list;
		}

	}

	@Override
	public List<Charges> getAllCharges(Plans plan) {
		return manager.createQuery("FROM Charges c Where c.plan= :value", Charges.class).getResultList();
	}

	@Override
	public List<Charges> getchargesByType(String chargeType) {
		TypedQuery<Charges> query = manager.createQuery("FROM Charges c Where c.chargeType LIKE :value", Charges.class);
		query.setParameter("value", "%" + chargeType + "%");
		return query.getResultList();
	}

	@Override
	public List<Charges> getchargesByPlan(int PlanId) {
		TypedQuery<Charges> query = manager.createQuery("FROM Charges c Where c.plan.planId = :value", Charges.class);
		query.setParameter("value", PlanId);
		return query.getResultList();
	}

}
