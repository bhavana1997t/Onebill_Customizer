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
import com.onebill.customizer.entities.BundelPlans;
import com.onebill.customizer.service.BundelPlanService;

@RestController
@RequestMapping("/bundelplans")
@CrossOrigin("*")
public class BundelPlansController {
	
	@Autowired
	private BundelPlanService service;
	
	@PostMapping
	public ResponseDTO addBundelPlans(@RequestBody BundelPlans bundel) {
		ResponseDTO response=new ResponseDTO();
		response.setData(service.addBundelPlans( bundel));
		return response;
	}
	
	@PutMapping(produces = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE })
	public ResponseDTO updateBundelPlans(@RequestBody BundelPlans bundel) {
	ResponseDTO response=new ResponseDTO();
	response.setData(service.updateBundelPlans(bundel));
	return response;
	}
	
	@GetMapping
	public ResponseDTO getAllBundelPlans() {
		ResponseDTO response=new ResponseDTO();
		response.setData(service.getAllBundelPlans());
		return response;
	}
	
	@DeleteMapping(path = "/{bundelId}", produces = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE })
	public ResponseDTO removeBundel(@PathVariable int bundelId) {
		ResponseDTO response=new ResponseDTO();
		response.setData(service.removeBundelPlans(bundelId));
		return response;
	}
	
}
