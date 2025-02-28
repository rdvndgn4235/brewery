package com.rd.brewery.services;

import com.rd.brewery.web.model.CustomerDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
@Service
public class CustomerServiceImpl implements CustomerService {
    @Override
    public CustomerDto getCustomer(UUID id) {
        return CustomerDto.builder()
                .id(UUID.randomUUID())
                .name("Allan Joe")
                .build();
    }

    @Override
    public CustomerDto createCustomer(CustomerDto customerDto) {
        return CustomerDto.builder()
                .id(UUID.randomUUID())
                .name(customerDto.getName())
                .build();
    }

    @Override
    public CustomerDto updateCustomer(CustomerDto customerDto) {
        return CustomerDto.builder()
                .name(customerDto.getName())
                .build();
    }

    @Override
    public void deleteCustomer(UUID customerId) {
        log.debug("Deleting customer with id {}", customerId);
    }
}
