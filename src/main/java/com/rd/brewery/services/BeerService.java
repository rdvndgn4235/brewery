package com.rd.brewery.services;

import com.rd.brewery.web.model.BeerDto;

import java.util.UUID;

public interface BeerService {
    BeerDto getBeerById(UUID id);
}
