package com.assignment5.Raminder.assignment;

public class singleton {
    String Department;
    public static singleton staticMethod(String Department){
        singleton singleton_object=new singleton();
        singleton_object.Department=Department;
        return singleton_object;
    }
    public void printDepartment(){
        System.out.println(Department);
    }

}
