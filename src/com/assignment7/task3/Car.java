package com.assignment7.task3;

public class Car extends Vehicle implements SwitchBoard {
    @Override
    public void turnACOn() {
        System.out.println("turnACOn");
    }

    @Override
    public void turnACOff() {
        System.out.println("turnACOff");
    }

    @Override
    public void turnCameraOn() {
        System.out.println("turnCameraOn");
    }

    @Override
    public void turnCameraOff() {
        System.out.println("turnCameraOff");
    }

    @Override
    public void turnRadioOn() {
        System.out.println("turnRadioOn");
    }

    @Override
    public void turnRadioOff() {
        System.out.println("turnRadioOff");
    }

    @Override
    public void turnMainSwitchOn() {
        System.out.println("turnMainOn");
    }

    @Override
    public void turnMainSwitchOff() {
        System.out.println("turnMainOff");
    }
}
