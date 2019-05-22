package com.ChadBoswell.Repository.Contract.Impl;

import com.ChadBoswell.Domain.worker.Contract;
import com.ChadBoswell.Repository.Contract.Impl.ContractRepositoryImpl;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.ChadBoswell.Repository.Contract.ContractRepository;


import java.util.Set;

public class ContractRepositoryImplTest {

    private ContractRepository repository;

    @Before
    public void setUp() throws Exception {
        //this.repository = ContractRepositoryImpl.getRepository();
    }

    @Test
    public void getAll() {
        Set<Contract> Contract = this.repository.getAll();
        Assert.assertEquals(1, Contract.size());
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