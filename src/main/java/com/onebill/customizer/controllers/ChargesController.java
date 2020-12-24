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
import com.onebill.customizer.entities.Charges;
import com.onebill.customizer.entities.Plans;
import com.onebill.customizer.service.ChargesService;


@RestController
@RequestMapping("/charges")
@CrossOrigin("*")
public class ChargesController {
	@Autowired
	private ChargesService service;
	
	@PostMapping
	public ResponseDTO addCharge(@RequestBody Charges charge) {
		ResponseDTO response=new ResponseDTO();
		response.setData(service.addCharge(charge));
		return response;
	}
	
	@PutMapping(produces = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE })
	public ResponseDTO updateCharge(@RequestBody Charges charge) {
	ResponseDTO response=new ResponseDTO();
	response.setData(service.updateCharge(charge));
	return response;
	}
	
	@DeleteMapping(path = "/{chargeId}", produces = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE })
	public ResponseDTO removeCharge(@PathVariable int chargeId) {
		ResponseDTO response=new ResponseDTO();
		response.setData(service.removeCharge(chargeId));
		return response;
	}
	
	@GetMapping
	public ResponseDTO getAllCharges(Plans plan) {
		ResponseDTO response=new ResponseDTO();
		response.setData(service.getAllCharges(plan));
		return response;
	}
	
	@GetMapping(path = "/{chargeId}", produces = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE })
	public ResponseDTO getCharge(@PathVariable int chargeId) {
		ResponseDTO response=new ResponseDTO();
		response.setData(service.getCharges(chargeId));
		return response;
	}
	
	@GetMapping(path = "/charge/{chargeType}", produces = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE })
	public ResponseDTO getCharge(@PathVariable String chargeType) {
		ResponseDTO response=new ResponseDTO();
		response.setData(service.getChargesByType(chargeType));
		return response;
	}
	
	@GetMapping(path = "/plan/{planId}", produces = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE })
	public ResponseDTO getChargesByplan(@PathVariable int planId) {
		ResponseDTO response=new ResponseDTO();
		response.setData(service.getChargesByPlan(planId));
		return response;
	}


}
