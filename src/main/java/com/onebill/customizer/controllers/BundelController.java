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
import com.onebill.customizer.entities.Bundel;
import com.onebill.customizer.service.BundelService;


@RestController
@RequestMapping("/bundels")
@CrossOrigin("*")
public class BundelController {
		@Autowired
		private BundelService service;
		
		@PostMapping
		public ResponseDTO addBundel(@RequestBody Bundel bundel) {
			ResponseDTO response=new ResponseDTO();
			response.setData(service.addBundel( bundel));
			return response;
		}
		
		@PutMapping(produces = { MediaType.APPLICATION_JSON_VALUE,
				MediaType.APPLICATION_XML_VALUE })
		public ResponseDTO updateBundel(@RequestBody Bundel bundel) {
		ResponseDTO response=new ResponseDTO();
		response.setData(service.updateBundel(bundel));
		return response;
		}
		
		@DeleteMapping(path = "/{bundelId}", produces = { MediaType.APPLICATION_JSON_VALUE,
				MediaType.APPLICATION_XML_VALUE })
		public ResponseDTO removeBundel(@PathVariable int bundelId) {
			ResponseDTO response=new ResponseDTO();
			response.setData(service.removeBundel(bundelId));
			return response;
		}
		
		@GetMapping
		public ResponseDTO getAllBundel() {
			ResponseDTO response=new ResponseDTO();
			response.setData(service.getAllBundel());
			return response;
		}
		
		@GetMapping(path = "/{bundelName}", produces = { MediaType.APPLICATION_JSON_VALUE,
				MediaType.APPLICATION_XML_VALUE })
		public ResponseDTO getBundel(@PathVariable String bundelName) {
			ResponseDTO response=new ResponseDTO();
			response.setData(service.getBundel(bundelName));
			return response;
		}
		

		@GetMapping(path = "/bundel/{bundelName}", produces = { MediaType.APPLICATION_JSON_VALUE,
				MediaType.APPLICATION_XML_VALUE })
		public ResponseDTO getBundels(@PathVariable String bundelName) {
			ResponseDTO response=new ResponseDTO();
			response.setData(service.getBundels(bundelName));
			return response;
		}
}
		