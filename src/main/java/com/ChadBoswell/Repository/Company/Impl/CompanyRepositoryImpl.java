package com.ChadBoswell.Repository.Company.Impl;

import com.ChadBoswell.Domain.Workplace.Company;
import org.springframework.stereotype.Repository;

import java.util.HashSet;
import java.util.Set;


@Repository
public class
CompanyRepositoryImpl implements CompanyRepository {

    private static CompanyRepositoryImpl repository = null;
    Set<Company> companies;

    private CompanyRepositoryImpl (){
        this.comp = new HashSet<>();
    }

    public static CompanyRepositoryImpl getCompany(){
        if(repository == null) repository = new CompanyRepositoryImpl();
        return repository;
    }

    @Override
    public Company create(Company companies) {
        comp.add(companies);
        return companies;
    }

    @Override
    public Company read(String s) {
        return search(s);
    }

    @Override
    public Company update(Company companies) {
        Company find = search(companies.getCompanyId());
        if(comp.contains(find)){
            comp.remove(find);
            comp.add(companies);
        }
        return companies;
    }

    @Override
    public void delete(String s) {
        comp.remove(search(s));
    }

    @Override
    public Set<Company> getAll() {
        return comp;
    }

    public Company search(final String compID){
        return comp.stream().filter(comp -> comp.CompanyID == compID).findAny().orElse(null);
    }
}
