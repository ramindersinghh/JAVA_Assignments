package com.assignment7.task1;

public class Hamster extends Rodent{
    public Hamster(){
        System.out.println("Gerbil created");
    }
    @Override
    public void eat() {
        System.out.println("Hamster eating");
    }

    @Override
    public void walk() {
        System.out.println("Hamster walking");
    }
}
