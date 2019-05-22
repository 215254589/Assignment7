package com.ChadBoswell.Service.Employee.Impl;

import com.ChadBoswell.Domain.worker.Employee;
import com.ChadBoswell.Factory.EmployeeFactory;
import com.ChadBoswell.Repository.Employee.Impl.EmployeeRepositoryImpl;
import com.ChadBoswell.Domain.Workplace.ContactDetails;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class EmployeeServiceImplTest {

    private EmployeeRepositoryImpl repository;
    private Employee getClass;

    private Employee getSaved(){return this.repository.getAll().iterator().next();}

    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void getAll() {
    }

    @Test
    public void create() {
        Employee created = this.repository.create(this.getClass);
        System.out.println("Created : "+created);
        assertNotNull(created);
        assertSame(created, this.getClass);
    }

    @Test
    public void update() {

    }

    @Test
    public void delete() {
        Employee app = this.repository.create(this.getClass);

        repository.create(app);

        //appointment.delete(216062241);
        //assertNull(appointment.read(216062241));
        System.out.println(repository.getAll());
    }

    @Test
    public void read() {
        Employee app =this.repository.create(this.getClass);

        repository.create(app);
        //assertNotNull(repository.read());
        System.out.println(repository.getAll());
    }
}