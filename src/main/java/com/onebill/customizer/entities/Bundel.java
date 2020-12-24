package com.onebill.customizer.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.UniqueElements;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
public class Bundel {
	@Id
	@GeneratedValue( strategy = GenerationType.AUTO)
	@Column(name="bundel_id")
	private int bundelId;
	
	@Column(name="bundel_name")
	@NotNull
	private String bundelName;
	
	@Column(name="bundel_description")
	private String bundelDescription;	
	
	@OneToMany
	@JsonIgnore
	private List<Plans> plan;
	
	public List<Plans> getPlan() {
		return plan;
	}

	public void setPlan(List<Plans> plan) {
		this.plan = plan;
	}

	@JoinTable(name="Bundel_Plans", joinColumns=@JoinColumn(name="bundel_id"),inverseJoinColumns=@JoinColumn(name="plan_id"))
	
	public int getBundelId() {
		return bundelId;
	}

	public void setBundelId(int bundelId) {
		this.bundelId = bundelId;
	}

	public String getBundelName() {
		return bundelName;
	}

	public void setBundelName(String bundelName) {
		this.bundelName = bundelName;
	}

	public String getBundelDescription() {
		return bundelDescription;
	}

	public void setBundelDescription(String bundelDescription) {
		this.bundelDescription = bundelDescription;
	}	
}
