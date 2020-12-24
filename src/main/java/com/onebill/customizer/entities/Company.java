package com.onebill.customizer.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.UniqueElements;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Company {
	@Id
	@GeneratedValue( strategy = GenerationType.AUTO)
	@Column(name="company_id")
	private int companyId;
	
	@Column(name= "company_name")
	private String companyName;
	
	@Column(name="company_address")
	private String  companyAddress;
	
	@Column(name="company_phone")
	private Long companyPhone;
	
	@OneToMany(mappedBy="company")
	@JsonIgnore
	private List<Products> product;

	public int getCompanyId() {
		return companyId;
	}

	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getCompanyAddress() {
		return companyAddress;
	}

	public void setCompanyAddress(String companyAddress) {
		this.companyAddress = companyAddress;
	}

	public Long getCompanyPhone() {
		return companyPhone;
	}

	public void setCompanyPhone(Long companyPhone) {
		this.companyPhone = companyPhone;
	}

	public List<Products> getProduct() {
		return product;
	}

	public void setProduct(List<Products> product) {
		this.product = product;
	}
	
}
