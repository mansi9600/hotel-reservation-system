package com.hotel.hotel_system.service;

import com.hotel.hotel_system.model.Customer;
import com.hotel.hotel_system.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    // Add Customer
    public Customer addCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    // Get All Customers
    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

    // Get Customer By Id
    public Optional<Customer> getCustomerById(Long id) {
        return customerRepository.findById(id);
    }

    // Update Customer
    public Customer updateCustomer(Long id, Customer customerDetails) {

        Customer customer = customerRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Customer not found with id: " + id));

        customer.setFirstName(customerDetails.getFirstName());
        customer.setLastName(customerDetails.getLastName());
        customer.setEmail(customerDetails.getEmail());
        customer.setPhone(customerDetails.getPhone());
        customer.setAddress(customerDetails.getAddress());

        return customerRepository.save(customer);
    }

    // Delete Customer
    public void deleteCustomer(Long id) {

        Customer customer = customerRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Customer not found with id: " + id));

        customerRepository.delete(customer);
    }
}