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
import com.onebill.customizer.entities.Plans;
import com.onebill.customizer.entities.Products;
import com.onebill.customizer.service.PlanService;

@RestController
@RequestMapping("/plans")
@CrossOrigin("*")
public class PlanController {
	@Autowired
	private PlanService service;

	@PostMapping
	public ResponseDTO addProduct(@RequestBody Plans plan) {
		ResponseDTO response = new ResponseDTO();
		response.setData(service.addPlan(plan));
		return response;
	}

	@PutMapping(produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	public ResponseDTO updateProduct(@RequestBody Plans plan) {
		ResponseDTO response = new ResponseDTO();
		response.setData(service.updatePlan(plan));
		return response;
	}

	@DeleteMapping(path = "/{planId}", produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	public ResponseDTO removeProduct(@PathVariable int planId) {
		ResponseDTO response = new ResponseDTO();
		response.setData(service.removePlan(planId));
		return response;
	}

	@GetMapping
	public ResponseDTO getAllPlans(Products product) {
		ResponseDTO response = new ResponseDTO();
		response.setData(service.getAllPlans(product));
		return response;
	}

	@GetMapping(path = "/{planName}", produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	public ResponseDTO getPlans(@PathVariable String planName) {
		ResponseDTO response = new ResponseDTO();
		response.setData(service.getPlan(planName));
		return response;
	}

	@GetMapping(path = "/plan/{planName}", produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	public ResponseDTO getMyPlans(@PathVariable String planName) {
		ResponseDTO response = new ResponseDTO();
		response.setData(service.getMyPlan(planName));
		return response;
	}
	
	@GetMapping(path = "/product/{productId}", produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	public ResponseDTO getPlansByProduct(@PathVariable int productId) {
		ResponseDTO response = new ResponseDTO();
		response.setData(service.getPlanByProduct(productId));
		return response;
	}
	
	@GetMapping(path = "/bundel/{bundelId}", produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	public ResponseDTO getPlansByBundel(@PathVariable int bundelId) {
		ResponseDTO response = new ResponseDTO();
		response.setData(service.getPlansByBundel(bundelId));
		return response;
	}
}
