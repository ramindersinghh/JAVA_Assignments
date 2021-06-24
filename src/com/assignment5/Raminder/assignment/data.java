package com.assignment5.Raminder.assignment;

public class data {
    int employee_id;
    char gender;
    public void printVariables(){
        System.out.println("employee_id"+ employee_id);
        System.out.println("gender"+ gender);
    }
    /*
    Not possible in JAVA:
    /home/ramins/IdeaProjects/JAVA_Assignments/src/com/assignment5/Raminder/assignment/data.java:13:38
java: variable status might not have been initialized

Variable 'status' might not have been initialized
Variable 'salary' might not have been initialized
     */
   /* public void printLocal(){
        char status;
        int salary;
        System.out.println("status"+ status);
        System.out.println("salary"+ salary);
    }*/
}
