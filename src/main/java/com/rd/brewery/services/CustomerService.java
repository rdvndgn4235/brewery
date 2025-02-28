package com.rd.brewery.services;

import com.rd.brewery.web.model.CustomerDto;

import java.util.UUID;

public interface CustomerService {
    CustomerDto getCustomer(UUID id);
}
