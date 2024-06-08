package com.rajtuts.service;

import java.util.List;

import com.rajtuts.model.Customer;

public interface CustomerService {

    // Method to get customer by its Id
    Customer getCustomer(Long id);
    
    List<Customer> findAll();

    // Method to add a new Customer
    // into the database
    String addCustomer(Customer customer);

    // Method to update details of a Customer
    String updateCustomer(Customer customer);
    
    void deleteCustomer(Long id);
}