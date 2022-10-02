package com.hunglp.brewery.service;

import com.hunglp.brewery.web.model.BeerDTO;
import java.util.UUID;

public interface BeerService {
    BeerDTO getBeerById(UUID beerId);
}
