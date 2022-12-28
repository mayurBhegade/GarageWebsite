package com.Autocare.BennyGarage.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Autocare.BennyGarage.Entity.Faults;
import com.Autocare.BennyGarage.service.FaultService;

@RestController
public class FaultController
{
		@Autowired
		
		FaultService faultService;
		
		@PostMapping("/fault")
		public Faults CreateFault(@RequestBody Faults fault)
		{
			return faultService.CreateFault(fault);
		}
}
