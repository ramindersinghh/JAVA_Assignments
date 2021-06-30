package com.assignment8.main;

import com.assignment8.utility.Employee;
import com.assignment8.utility.InvalidAgeException;

public class Driver {
    public static void main(String[] args) throws InvalidAgeException {
        var employee = new Employee();

        try {
            employee.setEmpID(-1);
            employee.setEmpID(1);
            System.out.println("He/She is early employee? "+ employee.isEarlyEmployee());


            employee.setAge(17);
            System.out.println(employee.getAge());

        } catch (Exception ex) {
            System.err.print(ex);
        } finally {
            System.out.println("Program ending");
        }



    }
}
