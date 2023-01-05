package com.emre.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.emre.models.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long>{

}

