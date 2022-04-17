package com.company;
import java.util.*;

public class Student {
    private String classees = "C02";
    private String name = "John";
    //private static String college = "BBDIT";

    public Student() {}

    public Student( String name, String classes) {
        this.name = name;
        this.classees = classes;
    }

    protected void setName(String name) {
        this.name = name;
    }
     protected void setClassees(String classees) {
        this.classees = classees;
    }
    public String getClassees(){
        return classees;
    }
    public String getName() {
        return name;
    }


//    void display() {
//        System.out.println(rollno + " " + name + " " + college);
//    }
}
