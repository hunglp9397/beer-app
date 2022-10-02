package com.hunglp.brewery.service;

import com.hunglp.brewery.web.model.CustomerDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
@Service
public class CustomerServiceImpl implements CustomerService {
    @Override
    public CustomerDTO getCustomerById(UUID customerId) {
        return CustomerDTO.builder()
                .id(UUID.randomUUID())
                .name("Joe Buck")
                .build();
    }

    @Override
    public CustomerDTO saveNewCustomer(CustomerDTO CustomerDTO) {
        return CustomerDTO.builder()
                .id(UUID.randomUUID())
                .build();
    }

    @Override
    public void updateCustomer(UUID customerId, CustomerDTO CustomerDTO) {
        //todo impl
        log.debug("Updating....");
    }

    @Override
    public void deleteById(UUID customerId) {
        log.debug("Deleting.... ");
    }
}