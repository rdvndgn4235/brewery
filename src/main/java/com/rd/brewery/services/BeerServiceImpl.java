package com.rd.brewery.services;

import com.rd.brewery.web.model.BeerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class BeerServiceImpl implements BeerService {

    @Override
    public BeerDto getBeerById(UUID id) {
        return BeerDto.builder()
                .id(UUID.randomUUID())
                .beerName("Black Cat")
                .beerStyle("Pale Ale")
                .upc(1234L)
                .build();
    }
}
