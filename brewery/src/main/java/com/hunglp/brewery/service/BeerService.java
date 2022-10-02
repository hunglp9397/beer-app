package com.hunglp.brewery.service;

import com.hunglp.brewery.web.model.BeerDTO;
import java.util.UUID;

public interface BeerService {
    BeerDTO getBeerById(UUID beerId);

    BeerDTO saveNewBeer(BeerDTO beerDto);

    void updateBeer(UUID beerId, BeerDTO beerDto);

    void deleteById(UUID beerId);
}
