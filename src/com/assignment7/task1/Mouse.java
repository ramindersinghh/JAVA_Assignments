package com.assignment7.task1;

public class Mouse extends Rodent{
    public Mouse(){
        System.out.println("Gerbil created");
    }
    @Override
    public void eat() {
        System.out.println("MOuse eating");
    }

    @Override
    public void walk() {
        System.out.println("Mouse walking");
    }
}
