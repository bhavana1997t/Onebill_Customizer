package com.onebill.customizer.dao;

import java.util.List;

import com.onebill.customizer.entities.Company;
import com.onebill.customizer.entities.Products;


public interface ProductDAO {
	public Products addproduct(Company company,Products product);
	public Products updateProduct(Products product);
	public List<Products> getAllProducts(Company comany);
	public Products remove(int product);
	List<Products> getProduct(String productName);
	List<Products> getProductByName(String productName);
	List<Products> getProductByCompany(int companyName);

}
