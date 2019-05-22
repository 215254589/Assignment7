package com.ChadBoswell.Service.LocationImpl;

import com.ChadBoswell.Domain.Workplace.Location;
import com.ChadBoswell.Factory.LocationFactory;
import com.ChadBoswell.Repository.Location.Impl.LocationRepositoryImpl;
import com.ChadBoswell.Domain.Workplace.ContactDetails;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class EmployeeServiceImplTest {

    private LocationRepositoryImpl repository;
    private Location getClass;

    private Location getSaved(){return this.repository.getAll().iterator().next();}

    @Before
    public void setUp() throws Exception {
        this.repository = LocationRepositoryImpl.getRepository();
        ContactDetails con = new ContactDetails.Builder().setHomeNumber(null).setCellNumber(null).build();
        // this.getClass = LocationFactory.AddLocation(Cape town,
         com.ChadBoswell.Util.Misc.generateId(), "7 kwartel",
                null, "Male", "White", con);

    }

    @Test
    public void getAll() {
    }

    @Test
    public void create() {
        Location created = this.repository.create(this.getClass);
        System.out.println("Created : "+created);
        assertNotNull(created);
        assertSame(created, this.getClass);
    }

    @Test
    public void update() {

    }

    @Test
    public void delete() {
        Location app = this.repository.create(this.getClass);

        repository.create(app);

        //appointment.delete(216062241);
        //assertNull(appointment.read(216062241));
        System.out.println(repository.getAll());
    }

    @Test
    public void read() {
        Location app =this.repository.create(this.getClass);

        repository.create(app);
        //assertNotNull(repository.read());
        System.out.println(repository.getAll());
    }
}