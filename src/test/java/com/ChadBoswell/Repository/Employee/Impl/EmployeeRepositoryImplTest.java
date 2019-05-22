package com.ChadBoswell.Repository.Employee.Impl;

import com.ChadBoswell.Domain.worker.Employee;
import com.ChadBoswell.Repository.Employee.Impl.EmployeeRepositoryImpl;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.ChadBoswell.Repository.Employee.EmployeeRepository;


import java.util.Set;

public class EmployeeRepositoryImplTest {

    private EmployeeRepository repository;

    @Before
    public void setUp() throws Exception {
        //this.repository = EmployeeRepositoryImpl.getRepository();
    }

    @Test
    public void getAll() {
        Set<Employee> Employee = this.repository.getAll();
        Assert.assertEquals(1, Employee.size());
    }

    @Test
    public void create() {
        this.repository.create(null);
        Assert.assertEquals(null, null);
    }

    @Test
    public void update() {
    }

    @Test
    public void delete() {
    }

    @Test
    public void read() {
    }
}