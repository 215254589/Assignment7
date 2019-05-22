package com.ChadBoswell.Factory;

import com.ChadBoswell.Domain.Workplace.Company;
import com.ChadBoswell.Domain.worker.Employee;

import static org.junit.Assert.*;

public class CompanyFactoryTest {

    @org.junit.Test
    public void addCompany() { Company comp= CompanyFactory.AddCompany("215254589");
        assertNotNull(comp);}

}