package com.ChadBoswell.Repository.Company.Impl;

import com.ChadBoswell.Domain.Workplace.Company;
import com.ChadBoswell.Repository.Company.Impl.CompanyRepositoryImpl;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.ChadBoswell.Repository.Company.CompanyRepository;


import java.util.Set;

public class CompanyRepositoryImplTest {

    private CompanyRepository repository;

    @Before
    public void setUp() throws Exception {
        //this.repository = CompanyRepositoryImpl.getRepository();
    }

    @Test
    public void getAll() {
        Set<Company> Company = this.repository.getAll();
        Assert.assertEquals(1, Company.size());
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