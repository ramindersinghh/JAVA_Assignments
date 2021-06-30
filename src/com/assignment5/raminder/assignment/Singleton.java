package com.assignment5.raminder.assignment;

public class Singleton {
    String Department;
    public static Singleton staticMethod(String Department){
        Singleton singleton_object=new Singleton();
        singleton_object.Department=Department;
        return singleton_object;
    }
    public void printDepartment(){
        System.out.println(Department);
    }

}
