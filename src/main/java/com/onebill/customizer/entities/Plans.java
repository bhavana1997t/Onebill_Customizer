package com.onebill.customizer.entities;

import java.sql.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.UniqueElements;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Plans {
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY)
	@Column(name="plan_id")
	private int planId;
	
	@Column(name="plan_name")
	private String planName;
	
	@Column(name="plan_description")
	private String planDescription;
	
	@Column(name="start_date")
	private Date startDate;
	
	@ManyToOne
	@JoinColumn(name="product_id")
	private Products product;
	
	@OneToMany(mappedBy="plan")
	@JsonIgnore
	private List<Charges> charges;
	
	@ManyToOne
	private Bundel bundel;

	public Bundel getBundel() {
		return bundel;
	}

	public void setBundel(Bundel bundel) {
		this.bundel = bundel;
	}

	public int getPlanId() {
		return planId;
	}

	public void setPlanId(int planId) {
		this.planId = planId;
	}

	public String getPlanName() {
		return planName;
	}

	public void setPlanName(String planName) {
		this.planName = planName;
	}

	public String getPlanDescription() {
		return planDescription;
	}

	public void setPlanDescription(String planDescription) {
		this.planDescription = planDescription;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Products getProduct() {
		return product;
	}

	public void setProduct(Products product) {
		this.product = product;
	}

	public List<Charges> getCharges() {
		return charges;
	}

	public void setCharges(List<Charges> charges) {
		this.charges = charges;
	}



}
