package com.assignment7.task3;

public class DriverTask3 {
    public static void showBehindCar(CameraSwitch cameraSwitch){
        cameraSwitch.turnCameraOn();
    }
    public static void playMusic(RadioSwitch radioSwitch){
        radioSwitch.turnRadioOn();
    }
    public static void startAC(ACSwitch acSwitch){
        acSwitch.turnACOn();
    }
    public static void powerSwitchBoard(SwitchBoard switchBoard){
        switchBoard.turnMainSwitchOn();
    }

    public static void main(String[] args) {
        Car car=new Car();
        powerSwitchBoard(car);
        showBehindCar(car);
        playMusic(car);
        startAC(car);

    }

}