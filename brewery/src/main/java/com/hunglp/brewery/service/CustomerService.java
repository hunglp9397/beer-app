package com.hunglp.brewery.service;


import com.hunglp.brewery.web.model.CustomerDTO;

import java.util.UUID;


public interface CustomerService {

    CustomerDTO getCustomerById(UUID customerId);

    CustomerDTO saveNewCustomer(CustomerDTO customerDto);

    void updateCustomer(UUID customerId, CustomerDTO customerDto);

    void deleteById(UUID customerId);
}