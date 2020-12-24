package com.onebill.customizer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onebill.customizer.dao.CompanyDAO;
import com.onebill.customizer.entities.Company;
import com.onebill.customizer.exception.CustomizePlanException;

@Service
public class CompanyServiceImpl implements CompanyService{
	@Autowired
	private CompanyDAO dao;

	@Override
	public Company add(Company company) {
		
		Company comp=null;
		try {
		 comp=dao.add(company);
		if(comp!=null) {
		return comp;
		}else {
			throw new CustomizePlanException("unable to add company");
		}
	}catch(Exception e) {
		throw new CustomizePlanException("unable to add company with invalied company details");
	}
	}

	@Override
	public Company removeCompany(int company) {
		Company comp=dao.removeCompany(company);
		try {
		if(comp!=null) {
			return comp;
			}else {
				throw new CustomizePlanException("unable to remove company");
			}
		}catch(Exception e) {
			throw new CustomizePlanException("wrong companyId "+company);
		}
	}

	@Override
	public Company update(Company company) {
		Company  comp=dao.update(company);
		try {
		if(comp!=null) {
			return comp;
			}else {
				throw new CustomizePlanException("unable to update company");
			}
		}catch(Exception e) {
			throw new CustomizePlanException("unable to update company details with companyId "+company.getCompanyId());
			
		}
	}

	@Override
	public List<Company> getAllCompanies() {
		try {
		List<Company> com=dao.getAllCompanies();
		if(com!=null) {
			return com;
			}else {
				throw new CustomizePlanException("unable to get company");
			}
		}catch(Exception e) {
			throw new CustomizePlanException("unable to get companies");
		}
	}
	
	@Override
	public List<Company> getCompany(String companyName) {
		List<Company> com=dao.getcompany(companyName);
		try {
		if(com!=null) {
			return com;
			}else {
				throw new CustomizePlanException("unable to get company");
			}
		}catch(Exception e) {
			throw new CustomizePlanException("unable find company with company name "+companyName);
		}
	}

	@Override
	public List<Company> getCompanies(String companyName) {
		List<Company> com=dao.getcompanies(companyName);
		try {
		if(com!=null) {
			return com;
			}else {
				throw new CustomizePlanException("unable to get company");
			}
		}catch(Exception e) {
			throw new CustomizePlanException("unable find company with s name"+companyName);
		}
	}

}
