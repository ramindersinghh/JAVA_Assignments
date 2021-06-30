package com.assignment10.main;

import com.assignment10.utility.SList;
import com.assignment10.utility.SListIterator;

public class Driver {
    public static void main(String[] args) {
        SList<String> sl = new SList<>();
        System.out.println(sl);
        SListIterator<String> slIter = sl.iterator();
        System.out.println("inserting \"Hi\"");
        slIter.insert("Hi");
        System.out.println(sl);
        System.out.println("inserting \"Raminder!\"");
        slIter.insert("Raminder!");
        System.out.println(sl);
        System.out.println("inserting \"Welcome\"");
        slIter.insert("Welcome");
        System.out.println(sl);
        System.out.println("inserting \"to Zemoso\"");
        slIter.insert("to Zemoso");
        System.out.println(sl);
        SListIterator<String> slIter2 = sl.iterator();
        System.out.println("removing \"Hi\"");
        slIter2.remove();
        System.out.println(sl);
        System.out.println("inserting \"Hello\"");
        slIter2.insert("Hello");
        System.out.println(sl);
        System.out.println("removing \"Raminder!\"");
        slIter2.remove();
        System.out.println(sl);
        System.out.println("removing \"Welcome\"");
        slIter2.remove();
        System.out.println(sl);
        System.out.println("removing \"to Zemoso\"");
        slIter2.remove();
        System.out.println(sl);
        System.out.println("removing \"Hello\"");
        SListIterator<String> slIter3 = sl.iterator();
        slIter3.remove();
        System.out.println(sl);
    }
}
/*
OUTPUT:
SList: []
inserting "Hi"
SList: [Hi]
inserting "Raminder!"
SList: [Hi, Raminder!]
inserting "Welcome"
SList: [Hi, Raminder!, Welcome]
inserting "to Zemoso"
SList: [Hi, Raminder!, Welcome, to Zemoso]
removing "Hi"
SList: [Raminder!, Welcome, to Zemoso]
inserting "Hello"
SList: [Hello, Raminder!, Welcome, to Zemoso]
removing "Raminder!"
SList: [Hello, Welcome, to Zemoso]
removing "Welcome"
SList: [Hello, to Zemoso]
removing "to Zemoso"
SList: [Hello]
removing "Hello"
SList: []
 */
