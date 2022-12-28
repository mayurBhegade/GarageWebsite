package com.Autocare.BennyGarage.DAO;




import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Autocare.BennyGarage.Entity.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long>
{


}
