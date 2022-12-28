package com.Autocare.BennyGarage.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Autocare.BennyGarage.Entity.Faults;

public interface FaultRepository extends JpaRepository<Faults, Long> {

}
