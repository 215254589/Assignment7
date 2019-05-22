package com.ChadBoswell.Repository.Employee.Impl;

import com.ChadBoswell.Domain.worker.Employee;
import org.springframework.stereotype.Repository;

import java.util.HashSet;
import java.util.Set;


@Repository
public class
EmployeeRepositoryImpl implements EmployeeRepository {

    private static EmployeeRepositoryImpl repository = null;
    Set<Employee> drivers;

    private EmployeeRepositoryImpl (){
        this.employees = new HashSet<>();
    }

    public static EmployeeRepositoryImpl getEmployee(){
        if(repository == null) repository = new EmployeeRepositoryImpl();
        return repository;
    }

    @Override
    public Employee create(Employee emp) {
        employees.add(emp);
        return emp;
    }

    @Override
    public Employee read(String s) {
        return search(s);
    }

    @Override
    public Employee update(Employee emp) {
        Employee find = search(emp.getRegistration_no());
        if(employees.contains(find)){
            employees.remove(find);
            employees.add(emp);
        }
        return emp;
    }

    @Override
    public void delete(String s) {
        employees.remove(search(s));
    }

    @Override
    public Set<Employee> getAll() {
        return employees;
    }

    public Employee search(String empID){
        return employees.stream().filter(employees -> employees.EmpID() == empID).findAny().orElse(null);
    }
}