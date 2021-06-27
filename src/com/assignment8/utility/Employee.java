package com.assignment8.utility;

public class Employee {
    int empID, salary,age;
    String name, address, department, email;

    //Getter and setters for getting and setting properties

    public int getEmpID() {
        return empID;
    }
    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;

    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) throws InvalidAgeException {
        if(age<18)
            throw new InvalidAgeException("Under 18 Age: Not allowed");
        this.age = age;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    //Overriding toString() method
    @Override
    public String toString() {
        return "Employee [emp_id = " + empID + ", salary = " + salary + ", name = " + name + ", address = " + address
                + ", department = " + department + ", email = " + email + "]";
    }
    public boolean isEarlyEmployee() throws EmployeeNotFoundException {
        if(empID<1) {
            throw new EmployeeNotFoundException(
                    "Invalid employee with ID " + empID);
        }
        if (empID>=1 && empID<=100) {
            return true;
        }else {
            return false;
        }
    }
}

