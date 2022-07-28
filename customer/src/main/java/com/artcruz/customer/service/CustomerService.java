package com.artcruz.customer.service;

import com.artcruz.customer.api.request.CustomerRegistrationRequest;
import com.artcruz.customer.model.repository.CustomerRepository;
import com.artcruz.customer.model.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public void registerCustomer(CustomerRegistrationRequest req) {
        Customer customer = Customer.builder()
                .firstName(req.getFirstName())
                .lastName(req.getLastName())
                .email(req.getEmail())
                .build();

        customerRepository.save(customer);
    }
}
