package com.onebill.customizer.service;

import java.util.List;

import com.onebill.customizer.entities.Company;

public interface CompanyService {
	public Company add(Company company);
	public Company update(Company company);
	public List<Company> getAllCompanies();
	Company removeCompany(int company);
	List<Company> getCompanies(String companyName);
	List<Company> getCompany(String companyName);

}
