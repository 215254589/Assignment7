package com.ChadBoswell.Controller.workplace;

import com.ChadBoswell.Domain.Workplace.Company;
import com.ChadBoswell.Factory.CompanyFactory;
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
public class CompanyControllerTest {

    @Autowired
    private TestRestTemplate restTemplate;
    private String baseURL = "http://localhost:8080/Company";

    @Test
    public void create() {
        Company Address = CompanyFactory.addCompany();
        System.out.println(Company);

        ResponseEntity<Company> postResponse = restTemplate.postForEntity(baseURL + "/create", Company, Company.class);
        assertNotNull(postResponse);
        assertNotNull(postResponse.getBody());
    }

    @Test
    public void update() {
        int id =215254589;
        Address Company = restTemplate.getForObject(baseURL + "/215254589/" + id, Company.class);

        restTemplate.put(baseURL + "/215254589/" + id, Company);
        Company updatedCompany = restTemplate.getForObject(baseURL + "/215254589/" + id, Company.class);
        assertNotNull(updatedCompany);
    }

    @Test
    public void delete() {
    }

    @Test
    public void read() {
        Company Company = restTemplate.getForObject(baseURL + "/read/215254589", Company.class);
        assertNotNull(Company);
    }

    @Test
    public void getAll() {
        HttpHeaders headers = new HttpHeaders();
        HttpEntity<String> entity = new HttpEntity<>(null, headers);
        ResponseEntity<String> response = restTemplate.exchange(baseURL + "/read/all", HttpMethod.GET, entity, String.class);
        assertNotNull(response.getBody());
    }
}