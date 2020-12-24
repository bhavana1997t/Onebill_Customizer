package com.onebill.customizer.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.onebill.customizer.dto.ResponseDTO;
import com.onebill.customizer.entities.Company;
import com.onebill.customizer.entities.Products;
import com.onebill.customizer.service.ProductService;

@RestController
@RequestMapping("/products")
@CrossOrigin("*")
public class ProductController {
	@Autowired
	private ProductService service;
	
	@PostMapping
	public ResponseDTO addProduct(Company company,@RequestBody Products product) {
		ResponseDTO response=new ResponseDTO();
		response.setData(service.addproduct(company, product));
		return response;
	}
	
	@PutMapping(produces = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE })
	public ResponseDTO updateProduct(@RequestBody Products product) {
	ResponseDTO response=new ResponseDTO();
	response.setData(service.updateProduct(product));
	return response;
	}
	
	@DeleteMapping(path = "/{productId}", produces = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE })
	public ResponseDTO removePlan(@PathVariable int productId) {
		ResponseDTO response=new ResponseDTO();
		response.setData(service.remove(productId));
		return response;
	}
	
	@GetMapping
	public ResponseDTO getAllProducts(Company company) {
		ResponseDTO response=new ResponseDTO();
		response.setData(service.getAllProducts(company));
		return response;
	}
	
	@GetMapping(path = "/product/{productName}", produces = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE })
	public ResponseDTO getProductsByName(@PathVariable String productName) {
		ResponseDTO response=new ResponseDTO();
		response.setData(service.getProductsByName(productName));
		return response;
	}
	
	@GetMapping(path = "/{productName}", produces = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE })
	public ResponseDTO getProducts(@PathVariable String productName) {
		ResponseDTO response=new ResponseDTO();
		response.setData(service.getProducts(productName));
		return response;
	}
	
	@GetMapping(path = "/company/{companyId}", produces = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE })
	public ResponseDTO getProductsByCompany(@PathVariable int companyId) {
		ResponseDTO response=new ResponseDTO();
		response.setData(service.getProductsByCompany(companyId));
		return response;
	}

}
