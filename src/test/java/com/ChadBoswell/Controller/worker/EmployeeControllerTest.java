package com.ChadBoswell.Controller.worker;

import com.ChadBoswell.Domain.worker.Employee;
import com.ChadBoswell.Factory.EmployeeFactory;
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
public class AppointmentControllerTest {

    @Autowired
    private TestRestTemplate restTemplate;
    private String baseURL = "http://localhost:8080/employee";

    @Test
    public void create() {
        Employee employee = EmployeeFactory.addEmployee();
        System.out.println(employee);

        ResponseEntity<Employee> postResponse = restTemplate.postForEntity(baseURL + "/create", employee, Employee.class);
        assertNotNull(postResponse);
        assertNotNull(postResponse.getBody());
    }

    @Test
    public void update() {
        int id =215254589;
        Employee appoint = restTemplate.getForObject(baseURL + "/215254589/" + id, AppointmentEmployee.class);

        restTemplate.put(baseURL + "/215254589/" + id, appoint);
        Employee updatedEmployee = restTemplate.getForObject(baseURL + "/215254589/" + id, Employee.class);
        assertNotNull(updatedEmployee);
    }

    @Test
    public void delete() {
    }

    @Test
    public void read() {
        Employee employee = restTemplate.getForObject(baseURL + "/read/215254589", Employee.class);
        assertNotNull(appointment);
    }

    @Test
    public void getAll() {
        HttpHeaders headers = new HttpHeaders();
        HttpEntity<String> entity = new HttpEntity<>(null, headers);
        ResponseEntity<String> response = restTemplate.exchange(baseURL + "/read/all", HttpMethod.GET, entity, String.class);
        assertNotNull(response.getBody());
    }
}