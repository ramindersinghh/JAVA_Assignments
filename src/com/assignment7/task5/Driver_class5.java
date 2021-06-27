package com.assignment7.task5;
class OuterClass{
    int x;
    void methodOfOuterClass()
    {
        System.out.println("From OuterClass");
    }
    class InnerClassOne{
        int y;
        InnerClassOne(int y){
            this.y=y;
            System.out.println("Inner class one created. Value="+ y);
        }
    }
}
//Extending non-static inner class or member inner class
class AnotherClass extends OuterClass {
    //Inner Class of AnotherClass extends Inner Class of OuterClass
    class AnotherInnerClass extends InnerClassOne
    {
        AnotherInnerClass(int value) {
            super(value);
        }
    }
}

public class Driver_class5 {
    public static void main(String[] args) {
        AnotherClass anotherClass = new AnotherClass();  //creating AnotherClass Object

        System.out.println(anotherClass.x);    //accessing inherited field x from OuterClass

        anotherClass.methodOfOuterClass();    //calling inherited method from OuterClass

        //Using the properties of InnerClass

        AnotherClass.AnotherInnerClass anotherInnerClass = anotherClass.new AnotherInnerClass(Integer.MAX_VALUE);

        //creating object to AnotherInnerClass

        System.out.println(anotherInnerClass.y);  //accessing inherited field y from InnerClass

    }
}/* Output:
0
From OuterClass
Inner class one created. Value=2147483647
2147483647

*/
