package com.site.customer_service.service;

import com.site.customer_service.entity.Customer;
import com.site.customer_service.repo.CustomerRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    private final CustomerRepo customerRepo;

    public CustomerService(CustomerRepo customerRepo) {
        this.customerRepo = customerRepo;
    }

    public Customer saveCustomer(Customer customer) {
        return customerRepo.save(customer);
    }

    public List<Customer> getAllCustomers() {
        return customerRepo.findAll();
    }

    public Customer getCustomerById(Long id) {
        return customerRepo.findById(id).orElse(null);
    }

    public Customer updateCustomer(Long id, Customer updatedCustomer) {
        Customer existing = customerRepo.findById(id).orElse(null);
        if (existing == null) {
            return null;
        }
        existing.setName(updatedCustomer.getName());
        existing.setEmail(updatedCustomer.getEmail());
        return customerRepo.save(existing);
    }

    public void deleteCustomer(Long id) {
        customerRepo.deleteById(id);
    }
}
