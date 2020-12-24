package com.onebill.customizer.dao;

import java.util.List;

import com.onebill.customizer.entities.Company;


public interface CompanyDAO {
	public Company add(Company company);
	public Company update(Company company);
	public List<Company> getAllCompanies();
	public Company removeCompany(int company);
	List<Company> getcompanies(String companyName);
	public List<Company> getcompany(String CompanyName);
	
	
}
