package com.company;
import PT_Bac2.Prepare;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        // Them xoa phan tu trong day so
//        Scanner sc = new Scanner(System.in);
//        System.out.print("So luong phan tu la: ");
//        int n = sc.nextInt();
//        int[] a = new int[50];
//        System.out.println("Day so la: ");
//        for(int i = 0; i < n; i++) {
//            a[i] = sc.nextInt();
//        }
//        System.out.println("So can xoa la: ");
//        int x = sc.nextInt();
//        Delete(a, x, n);

//        System.out.println("So can them va vi tri la: ");
//        int k = sc.nextInt();
//        int j = sc.nextInt();
//        add_ele add = new add_ele();
//        add.add_ele(a,n,k,j);

        //Danh sach sinh vien va tim sinh vien
//	    Scanner sc = new Scanner(System.in);
//        String[] ds = new String[50];
//        int sl;
//        System.out.print("So luong sinh vien la: ");
//        sl = sc.nextInt();
//        for(int i = 0; i < sl; i++) {
//            System.out.print("Ten sinh vien thu " + (i + 1) + ": ");
//            ds[i] = sc.next();
//        }
//
//        System.out.println("Ten sinh vien can tim la: ");
//        String input_name = sc.next();
//        boolean isExist = false;
//        for(int i = 0; i < sl; i++) {
//            if(ds[i].equals(input_name)) {
//                System.out.print("Position of the students int the list is: " + (i+1) + "\n");
//                isExist = true;
//                break;
//            }
//        }
//        if(!isExist) {
//            System.out.println("NOt found");
//        }

        //Giai phuong trinh bac 2
//        Prepare pre = new Prepare();
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Nhap vao 3 so: ");
//        pre.setA(sc.nextInt());
//        pre.setB(sc.nextInt());
//        pre.setC(sc.nextInt());
//        double a = pre.getterA();
//        double b = pre.getterB();
//        double c = pre.getterC();
//        double delta = pre.getDelta(a,b,c);
//
//        System.out.println("Gia tri delta la: ");
//        System.out.println(delta);
//
//        if(delta > 0) {
//            double r1 = pre.getRoot1(a,b,delta);
//            double r2 = pre.getRoot2(a,b,delta);
//            System.out.println("Hai nghiem la: " + r1 +" va " + r2);
//        } else if ( delta == 0) {
//            double r = pre.getRoot1(a, b, delta);
//            System.out.println("Nghiem phuong trinh la: " +  r);
//        } else {
//            System.out.println("Phuong trinh khong co nghiem thuc!!");
//        }
 //Object class
    Fan fan1 = new Fan();
    Fan fan2 = new Fan();

    fan1.setSpeed(fan1.FAST);
    fan1.setRadius(10);
    fan1.setColor("yellow");
    fan1.setOn(true);

    fan2.setSpeed(fan1.MEDIUM);
    fan2.setRadius(fan2.getRadius());
    fan2.setColor(fan2.getColor());
    fan2.setOn(false);

    fan1.toString(fan1.getOn(),fan1.getSpeed(), fan1.getRadius(), fan1.getColor());
    fan2.toString(fan2.getOn(), fan2.getSpeed(), fan2.getRadius(), fan2.getColor());
    }
}


