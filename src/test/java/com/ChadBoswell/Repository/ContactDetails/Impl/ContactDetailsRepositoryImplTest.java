package com.ChadBoswell.Repository.ContactDetails.Impl;

import com.ChadBoswell.Domain.Workplace.ContactDetails;
import com.ChadBoswell.Repository.ContactDetails.Impl.ContactDetailsRepositoryImpl;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.ChadBoswell.Repository.ContactDetails.ContactDetailsRepository;


import java.util.Set;

public class ContactDetailsRepositoryImplTest {

    private ContactDetailsRepository repository;

    @Before
    public void setUp() throws Exception {
        //this.repository = ContactDetailsRepositoryImpl.getRepository();
    }

    @Test
    public void getAll() {
        Set<ContactDetails> ContactDetails = this.repository.getAll();
        Assert.assertEquals(1, ContactDetails.size());
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