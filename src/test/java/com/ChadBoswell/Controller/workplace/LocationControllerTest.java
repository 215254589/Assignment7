package com.ChadBoswell.Controller.workplace;

import com.ChadBoswell.Domain.Workplace.Location;
import com.ChadBoswell.Factory.LocationFactory;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.*;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.HttpClientErrorException;


import static org.junit.Assert.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
@RunWith(SpringRunner.class)
public class LocationControllerTest {

    @Autowired
    private TestRestTemplate restTemplate;
    private String baseURL = "http://localhost:8080/Location";

    @Test
    public void create() {
        Company Location = LocationFactory.addLocation();
        System.out.println(Location);

        ResponseEntity<Location> postResponse = restTemplate.postForEntity(baseURL + "/create", Location, Location.class);
        assertNotNull(postResponse);
        assertNotNull(postResponse.getBody());
    }

    @Test
    public void update() {
        int id =215254589;
        Location Location = restTemplate.getForObject(baseURL + "/215254589/" + id, Location.class);

        restTemplate.put(baseURL + "/215254589/" + id, Location);
        Location updatedCompany = restTemplate.getForObject(baseURL + "/215254589/" + id, Location.class);
        assertNotNull(updatedLocation);
    }

    @Test
    public void delete() {
    }

    @Test
    public void read() {
        Location Location = restTemplate.getForObject(baseURL + "/read/215254589", Location.class);
        assertNotNull(Location);
    }

    @Test
    public void getAll() {
        HttpHeaders headers = new HttpHeaders();
        HttpEntity<String> entity = new HttpEntity<>(null, headers);
        ResponseEntity<String> response = restTemplate.exchange(baseURL + "/read/all", HttpMethod.GET, entity, String.class);
        assertNotNull(response.getBody());
    }
}