package com.ChadBoswell.Repository.Employee;

import com.ChadBoswell.Repository.IRepository;
import com.ChadBoswell.Domain.worker.Employee;

import java.util.Set;

public interface EmployeeRepository extends IRepository<Employee, String>
{

    Set<Employee> getAll();

}