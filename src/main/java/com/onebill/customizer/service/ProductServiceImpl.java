package com.onebill.customizer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onebill.customizer.dao.ProductDAO;
import com.onebill.customizer.entities.Company;
import com.onebill.customizer.entities.Products;
import com.onebill.customizer.exception.CustomizePlanException;

@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	private ProductDAO dao;

	@Override
	public Products addproduct(Company company, Products product) {
		try {
		Products product1= dao.addproduct(company, product);
		if(product1!=null) {
		return product1;
		}else {
			throw new CustomizePlanException("unable to add product");
		}
		}catch(Exception e) {
			throw new CustomizePlanException("unable to add product with product name"+ product.getProductName());
		}
	}

	@Override
	public Products remove(int product) {
		try {
		Products product1= dao.remove(product);
		if(product1!=null) {
			return product1;
			}else {
				throw new CustomizePlanException("unable to remove product");
			}
		}catch(Exception e) {
			throw new CustomizePlanException("unable to remove product with productId "+product);
		}
	}

	@Override
	public Products updateProduct(Products product) {
		Products  product1=dao.updateProduct(product);
		try {
		if(product1!=null) {
			return product1;
			}else {
				throw new CustomizePlanException("unable to add product");
			}
		}catch(Exception e) {
			throw new CustomizePlanException("unable to update product with company"+ product.getCompany()+" product name"+ product.getProductName());
		}
	}

	@Override
	public List<Products> getAllProducts(Company comany) {
		List<Products> product1=dao.getAllProducts(comany);
		try {
		if(product1!=null) {
			return product1;
			}else {
				throw new CustomizePlanException("unable to add product");
			}
		}catch(Exception e) {
			throw new CustomizePlanException("unable to get products ");
		}
	}
	
	@Override
	public List<Products> getProducts(String productName) {
		try {
		List<Products> product1=dao.getProduct(productName);
		if(product1!=null) {
			return product1;
			}else {
				throw new CustomizePlanException("unable to add product");
			}
		}catch(Exception e) {
			throw new CustomizePlanException("unable to add product with company"+ productName);
		}
	}

	@Override
	public List<Products> getProductsByName(String productName) {
		try {
			List<Products> product1=dao.getProductByName(productName);
			if(product1!=null) {
				return product1;
				}else {
					throw new CustomizePlanException("unable to add product");
				}
			}catch(Exception e) {
				throw new CustomizePlanException("unable to add product with product "+ productName);
			}
	}

	@Override
	public List<Products> getProductsByCompany(int companyId) {
		try {
			List<Products> product1=dao.getProductByCompany(companyId);
			if(product1!=null) {
				return product1;
				}else {
					throw new CustomizePlanException("unable to add product");
				}
			}catch(Exception e) {
				throw new CustomizePlanException("unable to add product with product ");
			}
	}

}
