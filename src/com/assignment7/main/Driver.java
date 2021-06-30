package com.assignment7.main;

import com.assignment7.task1.Gerbil;
import com.assignment7.task1.Hamster;
import com.assignment7.task1.Mouse;
import com.assignment7.task1.Rodent;
import com.assignment7.task2.Bicycle;
import com.assignment7.task2.Cycle;
import com.assignment7.task2.Tricycle;
import com.assignment7.task2.Unicycle;

public class Driver {
    public static void main(String[] args) {
        // Task 1
        Rodent[] rodent=new Rodent[3];
        rodent[0]=new Mouse();
        rodent[1]=new Gerbil();
        rodent[2]=new Hamster();

        rodent[0].eat();
        rodent[0].walk();

        rodent[1].eat();
        rodent[1].walk();

        rodent[2].eat();
        rodent[2].walk();

        //Task2
        //Upcast
        Cycle[] cycles=new Cycle[3];
        cycles[0]=new Unicycle();
        cycles[1]=new Bicycle();
        cycles[2]=new Tricycle();

        for(Cycle object:cycles){
            //object.balance();
            /*
                java: cannot find symbol
                  symbol:   method balance()
                  location: variable object of type com.assignment7.task2.Cycle
                 */
        }
        //Upcast
        ////Unicycle unicycle=new Cycle();

        //Performing Downcasting Implicitly
        //Child c = new Parent(); // it gives compile-time error
        //java: incompatible types: com.assignment7.task2.Cycle cannot be converted to com.assignment7.task2.Unicycle


        // Performing Downcasting Explicitly
        //Child c = (Child)p;
        Cycle cycle=new Unicycle();
        Unicycle unicycle1=(Unicycle) cycle;
        unicycle1.balance();
        //OUTPUT: Balance Unicycle


    }
}
/*
OUTPUT:
Gerbil created
Gerbil created
Gerbil created
MOuse eating
Mouse walking
Gerbil eating
Gerbil walking
Hamster eating
Hamster walking
 */

