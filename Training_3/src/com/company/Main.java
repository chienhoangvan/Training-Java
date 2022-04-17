package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here

//        Student.change();
//
//        Student s1 = new Student(111, "Hoang");
//        Student s2 = new Student(222, "Chien");
//
//        s1.display();
//        s2.display();

        //Test circle modifier
//        Circle cr = new Circle();
//        cr.setColor("Blue");
//        cr.setRadius(2.0);
//        System.out.println(cr.getRadius());
//        System.out.println(cr.getArea());
//        System.out.println(cr.getColor());

        //Test class Student
//        Scanner sc = new Scanner(System.in);
//        Student st = new Student();
//        st.setClassees(sc.next());
//        st.setName(sc.next());
//        System.out.println(st.getClassees());
//        System.out.println(st.getName());

        //Test class Rectangle
//        Rectangle rt = new Rectangle();
//        System.out.println(rt);
//
//        rt = new Rectangle(2, 3);
//        System.out.println(rt);
//
//        rt = new Rectangle("brown", false, 4, 5);
//        System.out.println(rt);

        // Test modifier Triangle
        Triangle tg = new Triangle();
        Scanner sc = new Scanner(System.in);
        tg.setSide1(sc.nextInt());
        tg.setSide2(sc.nextInt());
        tg.setSide3(sc.nextInt());
        tg.toString();
        System.out.println("Dien tich la: " + tg.getArea());
        System.out.println("Chu vi tam giac la: " + tg.getPerimeter());

    }
}
