package Factory;

import worker.Employee;

public class EmployeeFactory {

    public static Employee AddEmployee(String empID){
        return new Employee.Builder().EmpId( empID).build();
    }

}
