package com.assignment6.main;

import com.assignment6.utility.Cube;
import com.assignment6.utility.Task3;
import com.assignment6.utility.VampireNumber;

public class Driver {
    public static void main(String[] args) {
        //task 1
        System.out.println("\n Task 1-->");
        VampireNumber.printFirst100VampireNos();
        System.out.println("\n Task 2-->");
        //task 2
        Cube cube=new Cube(1,2,3);
        //OUTPUT: Constructor with 3 parameters -> Constructor with 2 parameters
        cube.toString();

        // task 3
        Task3[] task3Array=new Task3[10];
        //OUTPUT: initialization messages from the constructor calls are NOT printed

        System.out.println("\n Task 4-->");
        //task 4
        for ( int i=0; i<task3Array.length; i++) {
            task3Array[i]=new Task3("Number"+i);
        }
    }
}
