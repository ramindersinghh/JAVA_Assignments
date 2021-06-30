package com.assignment5.raminder.assignment;

public class Driver {
    public static void main(String[] args){
        Data dataObject=new Data();
        dataObject.printVariables();
        //dataObject.printLocal();                 ...not possible in JAVA

        Singleton singletonObject= Singleton.staticMethod("Finance");
        singletonObject.printDepartment();

    }
}
/*OUTPUT:
employee_id0
gender
Finance
 */