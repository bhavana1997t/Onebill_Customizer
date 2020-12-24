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
import com.onebill.customizer.service.CompanyService;

@RestController
@RequestMapping("/company")
@CrossOrigin("*")
public class CompanyController {
	@Autowired
	private CompanyService service;
	
	@PostMapping
	public ResponseDTO addCompany(@RequestBody Company company){
		ResponseDTO response=new ResponseDTO();
		response.setData(service.add(company));
		return response;
	}

	@DeleteMapping(path = "/{companyId}", produces = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE })
	public ResponseDTO removeCompany(@PathVariable int companyId) {
		ResponseDTO reponse=new ResponseDTO();
		reponse.setData(service.removeCompany(companyId));
		return reponse;
	}
	
	@PutMapping(produces = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE })
	public ResponseDTO updatCompany(@RequestBody Company company) {
		ResponseDTO response = new ResponseDTO();
		response.setData(service.update(company));
		return response;
	}
	@GetMapping
	public ResponseDTO getAllCompany(Company company) {
		ResponseDTO response =new ResponseDTO();
		response.setData(service.getAllCompanies());
		return response;
	}
	
	@GetMapping(path = "/{companyName}", produces = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE })
	public ResponseDTO getCompany(@PathVariable String companyName) {
		ResponseDTO response =new ResponseDTO();
		response.setData(service.getCompany(companyName));
		return response;
	}
	
	@GetMapping(path = "/companies/{companyName}", produces = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE })
	public ResponseDTO getCompanies(@PathVariable String companyName) {
		ResponseDTO response =new ResponseDTO();
		response.setData(service.getCompanies(companyName));
		return response;
	}

}
