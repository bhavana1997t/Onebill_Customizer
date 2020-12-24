package com.onebill.customizer.service;

import java.util.List;

import com.onebill.customizer.entities.Company;
import com.onebill.customizer.entities.Products;

public interface ProductService {
	public Products addproduct(Company company,Products product);
	public Products updateProduct(Products product);
	public List<Products> getAllProducts(Company comany);
	Products remove(int product);
	List<Products> getProducts(String productName);
	List<Products> getProductsByName(String productName);
	List<Products> getProductsByCompany(int companyId);
	

}
