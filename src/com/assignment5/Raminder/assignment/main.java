package com.assignment5.Raminder.assignment;

public class main {
    public static void main(String args[]){
        data data_object=new data();
        data_object.printVariables();
        //data_object.printLocal();                 ...not possible in JAVA

        singleton singleton_object=singleton.staticMethod("Finance");
        singleton_object.printDepartment();

    }
}
/*OUTPUT:
employee_id0
gender
Finance
 */