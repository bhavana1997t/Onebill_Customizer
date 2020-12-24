package com.onebill.customizer.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.onebill.customizer.dto.ResponseDTO;
import com.onebill.customizer.exception.CustomizePlanException;

@RestControllerAdvice
public class ControllerAdvice {
	@ExceptionHandler(CustomizePlanException.class)
	public ResponseEntity<ResponseDTO> handler(CustomizePlanException e1){
		ResponseDTO dto = new ResponseDTO();
		dto.setError(true);
		dto.setData(e1.getLocalizedMessage());
		return new ResponseEntity<ResponseDTO>(dto, HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
