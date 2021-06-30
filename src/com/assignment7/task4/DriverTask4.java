package com.assignment7.task4;

interface Cycle{
    void ride();
}
interface CycleFactory{
    Cycle getCycle();
}

class Unicycle implements Cycle{
    public void ride(){
        System.out.println("Riding Uni");
    }
}
class UniFactory implements CycleFactory{
    public Cycle getCycle(){
        return new Unicycle();
    }
}

class Bicycle implements Cycle{
    public void ride(){
        System.out.println("Riding Bi");
    }
}
class BiFactory implements CycleFactory{
    public Cycle getCycle(){
        return new Bicycle();
    }
}

class Tricycle implements Cycle{
    public void ride(){
        System.out.println("Riding Tri");
    }
}
class TriFactory implements CycleFactory{
    public Cycle getCycle(){
        return new Tricycle();
    }
}

public class DriverTask4 {
    public static void rideCycle(CycleFactory factory){
        var c = factory.getCycle();
        c.ride();
    }
    public static void main(String[] args) {
        rideCycle(new UniFactory());
        rideCycle(new BiFactory());
        rideCycle(new TriFactory());
    }
}/* Output:
Riding Uni
Riding Bi
Riding Tri
*/