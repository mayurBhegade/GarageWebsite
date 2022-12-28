package com.Autocare.BennyGarage.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Faults
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	Long id;
	
    String faultno;
    
    String Description;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFaultno() {
		return faultno;
	}

	public void setFaultno(String faultno) {
		this.faultno = faultno;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}
	
}
