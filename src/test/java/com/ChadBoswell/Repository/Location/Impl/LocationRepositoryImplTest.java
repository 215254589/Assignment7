package com.ChadBoswell.Repository.Location.Impl;

import com.ChadBoswell.Domain.Workplace.Location;
import com.ChadBoswell.Repository.Location.Impl.LocationRepositoryImpl;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.ChadBoswell.Repository.Location.LocationRepository;


import java.util.Set;

public class LocationRepositoryImplTest {

    private LocationRepository repository;

    @Before
    public void setUp() throws Exception {
        //this.repository = LocationRepositoryImpl.getRepository();
    }

    @Test
    public void getAll() {
        Set<Location> Location = this.repository.getAll();
        Assert.assertEquals(1, Location.size());
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