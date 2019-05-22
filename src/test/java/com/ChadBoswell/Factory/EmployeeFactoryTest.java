package com.ChadBoswell.Factory;

import com.ChadBoswell.Domain.worker.Employee;

import static org.junit.Assert.*;

public class EmployeeFactoryTest {

    @org.junit.Test
    public void addEmployee() { Employee emp= EmployeeFactory.AddEmployee("215254589");
    assertNotNull(emp);}

}