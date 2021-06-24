package com.assignment6.utility;

public class Cube {
    int length;
    int breadth;
    int height=1;
    public Cube(int length,int breadth, int height){
        this(length, breadth);
        this.height=height;
        System.out.println("3 parameters");

    }
    private Cube(int length, int breadth){
        this.length=length;
        this.breadth=breadth;
        System.out.println("2 parameters");
    }
    public Cube(){
        System.out.println("default constructor");
    }


}

/*
Constructor chaining is the process of calling one constructor from another constructor with respect to current object.
Constructor chaining can be done in two ways:

Within same class: It can be done using this() keyword for constructors in same class
From base class: by using super() keyword to call constructor from the base class.
 */