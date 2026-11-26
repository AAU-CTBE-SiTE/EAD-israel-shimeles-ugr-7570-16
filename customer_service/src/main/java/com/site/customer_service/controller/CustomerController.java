package com.site.customer_service.controller;

import com.site.customer_service.entity.Customer;
import com.site.customer_service.service.CustomerService;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestClient;

import java.util.List;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {

    private final CustomerService customerService;
    private final RestClient restClient;

    public CustomerController(CustomerService customerService, RestClient restClient) {
        this.customerService = customerService;
        this.restClient = restClient;
    }

    @PostMapping
    public Customer createCustomer(@RequestBody Customer customer) {
        return customerService.saveCustomer(customer);
    }

    @GetMapping
    public List<Customer> getAllCustomers() {
        return customerService.getAllCustomers();
    }

    @GetMapping("/{id}")
    public Customer getCustomerById(@PathVariable Long id) {
        return customerService.getCustomerById(id);
    }

    @PutMapping("/{id}")
    public Customer updateCustomer(@PathVariable Long id, @RequestBody Customer customer) {
        return customerService.updateCustomer(id, customer);
    }

    @DeleteMapping("/{id}")
    public void deleteCustomer(@PathVariable Long id) {
        customerService.deleteCustomer(id);
    }

    @GetMapping("/{id}/orders")
    public List<?> getCustomerOrders(@PathVariable Long id) {
        String orderServiceUrl = "/api/orders/customer/{id}";
        return restClient.get()
                .uri(orderServiceUrl, id)
                .retrieve()
                .body(List.class);
    }
}