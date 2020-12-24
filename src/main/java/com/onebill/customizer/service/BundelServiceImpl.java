package com.onebill.customizer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onebill.customizer.dao.BundelDAO;
import com.onebill.customizer.entities.Bundel;
import com.onebill.customizer.exception.CustomizePlanException;

@Service
public class BundelServiceImpl implements BundelService{
	@Autowired
	private BundelDAO dao;
	
	
	@Override
	public Bundel addBundel( Bundel bundel) {
		Bundel bundels=null;
		try {
		 bundels=dao.addBundel(bundel);
		if(bundels!=null) {
			return bundels;
		}
		else {
			throw new CustomizePlanException("unable to add Bundel enter valid Bundel name "+bundel.getBundelName()+" and product"+bundel.getPlan());
			
		}
		}catch(Exception e) {
			throw new CustomizePlanException("unable to add Bundel enter valid Bundel name: "+bundel.getBundelName()+" and product : "+bundel.getPlan());
		}
	}

	@Override
	public Bundel removeBundel(int bundelId) {
		try {
		Bundel bundel1=dao.removeBundel(bundelId);
		if(bundel1!=null) {
			return bundel1;
		}else {
			throw new CustomizePlanException("unable to remove bundel");
		}
		}catch(Exception e){
			throw new CustomizePlanException("Please enter a valied Id "+ bundelId +" is not  valied");
		}
	
	}

	@Override
	public Bundel updateBundel(Bundel bundel) {
		try {
		Bundel bundel1=dao.updateBundel(bundel);
		if(bundel1!=null) {
			return bundel1;
		}else {
			throw new CustomizePlanException("unable to update bundel"+bundel.getBundelName());
		}
		}
		catch(Exception e){
			throw new CustomizePlanException("unble to update Bundel enter valied Bundel name "+bundel.getBundelName()+"  and plan details  "+bundel.getPlan());
		}
	}

	@Override
	public List<Bundel> getAllBundel() {
		List<Bundel> bundel1=dao.getAllBundel();
		try {
		if(bundel1!=null) {
			return bundel1;
		}else {
			throw new CustomizePlanException("unable to get bundel");
		}
		}catch(Exception e) {
			throw new CustomizePlanException("unable to fetch bundels");
		}
	}
	
	@Override
	public List<Bundel> getBundel(String bundelName) {
		List<Bundel> bundel1=dao.getBundel(bundelName);
		try{
			if(bundel1!=null) {
			return bundel1;
		}else {
			throw new CustomizePlanException("unable to get bundel");
		}
		}catch(Exception e) {
			throw new CustomizePlanException("enter valied bundel name"+ bundelName +"is invalied");
		}
	}

	@Override
	public List<Bundel> getBundels(String bundelName) {
		List<Bundel> bundel1=dao.getBundels(bundelName);
		try{
			if(bundel1!=null) {
			return bundel1;
		}else {
			throw new CustomizePlanException("unable to get bundel");
		}
		}catch(Exception e) {
			throw new CustomizePlanException("enter valied bundel name"+ bundelName +"is invalied");
		}
	
	}
	
	

}