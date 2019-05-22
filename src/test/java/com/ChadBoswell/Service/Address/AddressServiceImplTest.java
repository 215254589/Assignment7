package com.ChadBoswell.Service.Address;

import com.ChadBoswell.Domain.worker.Address;
import com.ChadBoswell.Factory.AddressFactory;
import com.ChadBoswell.Repository.Address.Impl.AddressRepositoryImpl;
import com.ChadBoswell.Domain.Workplace.ContactDetails;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class AddressServiceImplTest {

    private AddressRepositoryImpl repository;
    private Address getClass;

    private Address getSaved(){return this.repository.getAll().iterator().next();}

    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void getAll() {
    }

    @Test
    public void create() {
        Address created = this.repository.create(this.getClass);
        System.out.println("Created : "+created);
        assertNotNull(created);
        assertSame(created, this.getClass);
    }

    @Test
    public void update() {

    }

    @Test
    public void delete() {
        Address app = this.repository.create(this.getClass);

        repository.create(app);

        //appointment.delete();
        //assertNull(appointment.read());
        System.out.println(repository.getAll());
    }

    @Test
    public void read() {
        Address app =this.repository.create(this.getClass);

        repository.create(app);
        //assertNotNull(repository.read());
        System.out.println(repository.getAll());
    }
}