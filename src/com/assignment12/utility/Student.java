package com.assignment12.utility;

public class Student {
    int id;
    String name;
    int age;
    String gender;
    String engDepartment;
    int yearOfEnrollment ;
    double perTillDate;

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getEngDepartment() {
        return engDepartment;
    }

    public int getYearOfEnrollment() {
        return yearOfEnrollment;
    }

    public double getPerTillDate() {
        return perTillDate;
    }

    public Student(int id, String name, int age, String gender, String engDepartment, int yearOfEnrollment, double perTillDate) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.engDepartment = engDepartment;
        this.yearOfEnrollment = yearOfEnrollment;
        this.perTillDate = perTillDate;
    }


}
