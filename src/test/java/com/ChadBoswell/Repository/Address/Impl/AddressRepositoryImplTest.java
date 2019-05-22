package com.ChadBoswell.Repository.Address.Impl;

import com.ChadBoswell.Domain.worker.Address;
import com.ChadBoswell.Repository.Address.Impl.AddressRepositoryImpl;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.ChadBoswell.Repository.Address.AddressRepository;


import java.util.Set;

public class AddressRepositoryImplTest {

    private AddressRepository repository;

    @Before
    public void setUp() throws Exception {
        //this.repository = AddressRepositoryImpl.getRepository();
    }

    @Test
    public void getAll() {
        Set<Address> Address = this.repository.getAll();
        Assert.assertEquals(1, Address.size());
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