package com.ChadBoswell.Services.Workplace.Company;

import com.ChadBoswell.Domain.Workplace.Company;
import com.ChadBoswell.Services.IService;

import java.util.Set;

public interface CompanyService extends IService<Company, String> {
    Set<Company> getAll();
}

