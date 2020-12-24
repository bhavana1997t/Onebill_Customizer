package com.onebill.customizer.entities;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@SuppressWarnings("serial")
@Embeddable
public class BundelPk implements Serializable{
	
	@Column(name="bundel_id")
	protected int bundelId;
	
	@Column(name="plan_id")
	protected int planId;
	
	   public BundelPk() {
		   
	    }

	    public BundelPk(Integer planId, Integer bundelId) {
	        this.planId = planId;
	        this.bundelId = bundelId;
	    }

	    public Object getBundelId() {
	        return bundelId;
	    }
	    
	    public Object getPlanId() {
	    	return planId;
	    }

	   @Override
	    public boolean equals(Object o) {
	        if (this == o) return true;
	        if (!(o instanceof Plans)) return false;
	        Plans that = (Plans) o;
	        return Objects.equals(getBundelId(), that.getBundel()) &&
	                Objects.equals(getPlanId(), that.getPlanId());
	    }

	    @Override
	    public int hashCode() {
	        return Objects.hash(getBundelId(), getPlanId());
	    }
}
