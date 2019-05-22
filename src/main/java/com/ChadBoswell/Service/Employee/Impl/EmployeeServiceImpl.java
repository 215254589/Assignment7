package com.ChadBoswell.Service.Employee.Impl;

import com.ChadBoswell.Domain.worker.Employee;
import com.ChadBoswell.Repository.Employee.Impl.EmployeeRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Set;

public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepositoryImpl repository;

    private EmployeeServiceImpl()
    {
        this.repository = EmployeeRepositoryImpl.Employee();
    }

    @Override
    public Set<Employee> getAll() {
        return this.repository.getAll();
    }

    @Override
    public Employee create(Employee employee) {
        return this.create(employee);
    }

    @Override
    public Employee read(String string) {
        return this.repository.read(string);
    }

    @Override
    public Employee update(Employee employee) {
        return this.update(employee);
    }

    @Override
    public void delete(String string) {this.repository.delete(string);
    }

}
