package com.hunglp.brewery.service;

import com.hunglp.brewery.web.model.BeerDTO;
import org.springframework.stereotype.Service;
import java.util.UUID;

@Service
public class BeerServiceImpl implements BeerService{


    @Override
    public BeerDTO getBeerById(UUID beerId) {
        return BeerDTO.builder().id(UUID.randomUUID())
                .beerName("Galaxy Cat")
                .beerStyle("Pale Ale")
                .build();
    }
}
