package com.onebill.customizer.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Repository;

import com.onebill.customizer.entities.Company;
import com.onebill.customizer.entities.Plans;


@Repository
public class CompanyDAOImpl implements CompanyDAO {

	@PersistenceContext
	EntityManager manager;

	@Override
	@Transactional
	public Company add(Company company) {
		manager.persist(company);
		return company;
	}
	@Override
	@Transactional
	public List<Company> getcompanies(String companyName) {
		TypedQuery<Company> query = manager.createQuery("FROM Company U WHERE U.companyName LIKE :value",
				Company.class);
		query.setParameter("value", "%"+companyName+"%");
		List<Company> companyList = query.getResultList();
		List<Company> list = null;
		if (!companyList.isEmpty()) {
			return companyList;
		} else {
			return list;
		}
	}


	@Override
	@Transactional
	public Company update(Company company) {
		Company company1 = manager.find(Company.class, company.getCompanyId());
		BeanUtils.copyProperties(company, company1);
		return company1;
	}

	@Override
	public List<Company> getAllCompanies() {
		return manager.createQuery("FROM Company", Company.class).getResultList();
	}


	@Override
	@Transactional
	public Company removeCompany(int companyId) {
		Company company1 = manager.find(Company.class,companyId);
		manager.remove(company1);
		return company1;
	}
	@Override
	@Transactional
	public  List<Company> getcompany(String companyName) {
		 TypedQuery<Company> query=manager.createQuery("FROM Company U WHERE U.companyName = :value", Company.class);
		 query.setParameter("value", companyName);
			List<Company> companyList = query.getResultList();
			List<Company> list = null;
			if (!companyList.isEmpty()) {
				return companyList;
			} else {
				return list;
			}

	}

}
