package com.onebill.customizer.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Repository;

import com.onebill.customizer.entities.Company;
import com.onebill.customizer.entities.Products;


@Repository
public class ProductDAOImpl implements ProductDAO{
	@PersistenceContext
	EntityManager manager;
	
	@Override
	@Transactional
	public Products addproduct(Company company,Products product) {
		manager.persist(product);
		return product;
	}
	@Override
	@Transactional
	public List<Products> getProduct(String productName) {
		TypedQuery<Products> query = manager.createQuery("FROM Products U WHERE U.productName = :value",
				Products.class);
		query.setParameter("value", productName);
		List<Products> productList = query.getResultList();
		List<Products> list = null;
		if (!productList.isEmpty()) {
			return productList;
		} else {
			return list;
		}
	}

	@Override
	@Transactional
	public Products remove(int productId) {
		Products product1=manager.find(Products.class, productId);
		manager.remove(product1);
		return product1;
	}

	@Override
	@Transactional
	public Products updateProduct(Products product) {
		Products product1=manager.find(Products.class, product.getProductId());
		BeanUtils.copyProperties(product,product1);
		return product1;
	}

	@Override
	public List<Products> getAllProducts(Company comany) {
		return manager.createQuery("FROM Products p WHERE p.company=company",Products.class).getResultList();
	}
	@Override
	public List<Products> getProductByName(String productName) {
		TypedQuery<Products> query = manager.createQuery("FROM Products U WHERE U.productName LIKE :value",
				Products.class);
		query.setParameter("value", "%"+productName+"%");
		return query.getResultList();
			
	
	}
	@Override
	public List<Products> getProductByCompany(int companyName) {
		TypedQuery<Products> query = manager.createQuery("FROM Products U WHERE U.company.companyId = :value",
				Products.class);
		query.setParameter("value",companyName);
		return query.getResultList();
	}

}
