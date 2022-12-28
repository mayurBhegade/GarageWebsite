package com.Autocare.BennyGarage.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Autocare.BennyGarage.DAO.FaultRepository;
import com.Autocare.BennyGarage.Entity.Faults;

@Service
public class FaultService 
{
	@Autowired
	
	FaultRepository faultRepository;

	public Faults CreateFault(Faults fault)
	{
		return faultRepository.save(fault);
	}
}
