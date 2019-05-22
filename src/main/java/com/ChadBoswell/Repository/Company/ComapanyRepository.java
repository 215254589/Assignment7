package com.ChadBoswell.Repository.Company;

import com.ChadBoswell.Repository.IRepository;
import com.ChadBoswell.Domain.Workplace.Company;

import java.util.Set;

public interface CompanyRepository extends IRepository<Company, String> {

    Set<Company> getAll();

}
