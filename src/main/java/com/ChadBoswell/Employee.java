package com.ChadBoswell;

import java.util.Set;

public class Employee {
    private String empId,
            empName,
            empSname;
    private int age;

    private Set<Company> comp;

    private Employee() {
    }

    private Employee(Builder builder) {
        this.empId = builder.empId;
        this.age = builder.age;
        this.empName = builder.empName;
        this.empSname = builder.empSname;
    }

    public String getEmpId() {
        return empId;
    }

    public String getEmpName() {
        return empName;
    }

    public String EmpSname() {
        return empSname;
    }

    public int getAge() {
        return age;
    }

    public static class Builder {

        private String empId,
                       empName,
                       empSname;
        private int age;
        private Set<Company> comp;

        public Builder EmpId(String empId) {
            this.empId = empId;
            return this;
        }

        public Builder EmpName(String empName) {
            this.empName = empName;
            return this;
        }

        public Builder EmpSname(String empSname) {
            this.empSname = empSname;
            return this;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public Employee build() {
            return new Employee(this);
        }
    }
}


