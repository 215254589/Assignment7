package Factory;

import Util.Misc;
import com.ChadBoswell.Employee;

public class EmployeeFactoryTest {
    public static Employee getEmployee(String empName, String empSname, int age) {
        return new Employee.Builder().age(age)
                .empName(empName)
                .empSname(empSname)
                .empId(Misc.generateId())
                .build();
    }


}
