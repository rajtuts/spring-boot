package com.rajtuts.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rajtuts.model.Customer;
import com.rajtuts.service.CustomerService;

@RestController
public class CustomerController {

    @Autowired 
    private CustomerService customerService;

    // Get Customer by Id
    @GetMapping("/{id}")
    public Customer getCustomer(@PathVariable("id") Long id)
    {
        return customerService.getCustomer(id);
    }
    
    @GetMapping("/getCustomers")
    public List<Customer> getCustomers()
    {
        return customerService.findAll();
    }

    // Add new Customer
    @PostMapping("/")
    public String addcustomer(@RequestBody Customer customer)
    {
        return customerService.addCustomer(customer);
    }

    // Update Customer details
    @PutMapping("/")
    public String updateCustomer(@RequestBody Customer customer)
    {
        return customerService.updateCustomer(customer);
    }
    
    @DeleteMapping("/{id}")
    public String deleteCustomer(@PathVariable("id") Long id)
    {
         customerService.deleteCustomer(id);
         return "Success delete Customer "+id;
    }
}
