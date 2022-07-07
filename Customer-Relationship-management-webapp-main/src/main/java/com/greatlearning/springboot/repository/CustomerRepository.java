package com.greatlearning.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.greatlearning.springboot.model.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long>{

}
