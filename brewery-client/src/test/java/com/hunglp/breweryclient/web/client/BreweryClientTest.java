package com.hunglp.breweryclient.web.client;

import com.hunglp.breweryclient.web.model.BeerDTO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertNotNull;


import java.util.UUID;

@SpringBootTest
public class BreweryClientTest {

    @Autowired
    BreweryClient client;

    @Test
    void getBeerById() {
        BeerDTO dto = client.getBeerById(UUID.randomUUID());

        assertNotNull(dto);

    }
}
