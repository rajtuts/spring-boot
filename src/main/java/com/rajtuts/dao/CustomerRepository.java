package com.rajtuts.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rajtuts.model.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
}