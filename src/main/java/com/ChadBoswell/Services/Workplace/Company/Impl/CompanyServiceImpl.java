package com.ChadBoswell.Services.Workplace.Company.Impl;

import com.ChadBoswell.Domain.Workplace.Company;
import com.ChadBoswell.Repository.Company.Impl.CompanyRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Set;

public class CompanyServiceImpl implements CompanyService {

    @Autowired
    private CompanyRepositoryImpl repository;

    private CompanyServiceImpl()
    {
        this.repository = CompanyRepositoryImpl.Company();
    }

    @Override
    public Set<Company> getAll() {
        return this.repository.getAll();
    }

    @Override
    public Company create(Company company) {
        return this.create(company);
    }

    @Override
    public Company read(String string) {
        return this.repository.read(string);
    }

    @Override
    public Company update(Company company) {
        return this.update(company);
    }

    @Override
    public void delete(String string) {this.repository.delete(string);
    }

}

