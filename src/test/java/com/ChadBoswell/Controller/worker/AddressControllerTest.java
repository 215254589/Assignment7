package com.ChadBoswell.Controller.worker;

import com.ChadBoswell.Domain.worker.Address;
import com.ChadBoswell.Factory.AddressFactory;
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
public class AddressControllerTest {

    @Autowired
    private TestRestTemplate restTemplate;
    private String baseURL = "http://localhost:8080/employee";

    @Test
    public void create() {
        Address Address = AddressFactory.addAddress();
        System.out.println(Address);

        ResponseEntity<Address> postResponse = restTemplate.postForEntity(baseURL + "/create", Address, Address.class);
        assertNotNull(postResponse);
        assertNotNull(postResponse.getBody());
    }

    @Test
    public void update() {
        int id =215254589;
        Address appoint = restTemplate.getForObject(baseURL + "/215254589/" + id, Address.class);

        restTemplate.put(baseURL + "/215254589/" + id, Address);
        Address updatedAddress = restTemplate.getForObject(baseURL + "/215254589/" + id, Address.class);
        assertNotNull(updatedAddress);
    }

    @Test
    public void delete() {
    }

    @Test
    public void read() {
        Address Address = restTemplate.getForObject(baseURL + "/read/215254589", Address.class);
        assertNotNull(Address);
    }

    @Test
    public void getAll() {
        HttpHeaders headers = new HttpHeaders();
        HttpEntity<String> entity = new HttpEntity<>(null, headers);
        ResponseEntity<String> response = restTemplate.exchange(baseURL + "/read/all", HttpMethod.GET, entity, String.class);
        assertNotNull(response.getBody());
    }
}