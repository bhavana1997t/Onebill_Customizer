package com.onebill.customizer.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Repository;

import com.onebill.customizer.entities.Bundel;
import com.onebill.customizer.entities.Plans;


@Repository
public class BundelDAOImpl implements BundelDAO {
	@PersistenceContext
	EntityManager manager;
	
	@Override
	@Transactional
	public Bundel addBundel(Bundel bundel) {
		manager.persist(bundel);
		return bundel;
	}

	@Override
	@Transactional
	public Bundel removeBundel(int bundelId) {
		Bundel bundel1=manager.find(Bundel.class,bundelId);
		manager.remove(bundel1);
		return bundel1;
	}

	@Override
	@Transactional
	public Bundel updateBundel(Bundel bundel) {
		Bundel bundel1=manager.find(Bundel.class,bundel.getBundelId());
		BeanUtils.copyProperties(bundel,bundel1);
		return bundel1;
	}
	
	@Override
	@Transactional
	public List<Bundel> getBundel(String bundelName) {
		TypedQuery<Bundel> query = manager.createQuery("FROM Bundel U WHERE U.bundelName = :value",
				Bundel.class);
		query.setParameter("value", bundelName);
		List<Bundel> bundelList = query.getResultList();
		List<Bundel> list = null;
		if (!bundelList.isEmpty()) {
			return bundelList;
		} else {
			return list;
		}
	}

	@Override
	@Transactional
	public List<Bundel> getAllBundel() {
		return manager.createQuery("FROM Bundel",Bundel.class).getResultList();
	}

	@Override
	public List<Bundel> getBundels(String bundelName) {
		TypedQuery<Bundel> query =
				manager.createQuery("From Bundel  b where b.bundelName LIKE :value",
				Bundel.class);
		query.setParameter("value","%"+ bundelName+"%");
			return query.getResultList();
	}
}