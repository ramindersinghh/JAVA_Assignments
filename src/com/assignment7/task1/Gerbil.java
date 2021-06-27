package com.assignment7.task1;

public class Gerbil extends Rodent{
    public Gerbil(){
        System.out.println("Gerbil created");
    }
    @Override
    public void eat() {
        System.out.println("Gerbil eating");
    }

    @Override
    public void walk() {
        System.out.println("Gerbil walking");
    }
}
