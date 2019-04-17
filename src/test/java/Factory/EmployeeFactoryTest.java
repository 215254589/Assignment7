package Factory;

import worker.Employee;

import static org.junit.Assert.*;

public class EmployeeFactoryTest {

    @org.junit.Test
    public void addEmployee() { Employee emp= EmployeeFactory.AddEmployee("215254589");
    assertNotNull(emp);}

}