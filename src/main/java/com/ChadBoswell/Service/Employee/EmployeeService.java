package com.ChadBoswell.Service.Employee;

import com.ChadBoswell.Domain.worker.Employee;
import com.ChadBoswell.Services.IService;

import java.util.Set;

public interface EmployeeService extends IService<Employee, String> {
    Set<Employee> getAll();
}

