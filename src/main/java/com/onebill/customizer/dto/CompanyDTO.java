package com.onebill.customizer.dto;

import java.io.Serializable;

public class CompanyDTO implements Serializable {
	
	private int companyId;
	private String companyName;
	private String companyemail;
	private String companyaddress;
	private Long companyPhone;

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

	public String getCompanyemail() {
		return companyemail;
	}

	public void setCompanyemail(String companyemail) {
		this.companyemail = companyemail;
	}

	public String getCompanyaddress() {
		return companyaddress;
	}

	public void setCompanyaddress(String companyaddress) {
		this.companyaddress = companyaddress;
	}

	public Long getCompanyPhone() {
		return companyPhone;
	}

	public void setCompanyPhone(Long companyPhone) {
		this.companyPhone = companyPhone;
	}

}
