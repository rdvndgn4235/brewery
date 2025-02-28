package com.rd.brewery.services;

import com.rd.brewery.web.model.CustomerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Override
    public CustomerDto getCustomer(UUID id) {
        return CustomerDto.builder()
                .id(UUID.randomUUID())
                .name("Allan Joe")
                .build();
    }
}
