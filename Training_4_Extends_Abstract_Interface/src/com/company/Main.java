package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {

	// write your code here
    //Test Circle va Cylinder
//        Circle cr = new Circle(2, "red");
//        System.out.println(cr);
//        Cylinder cl = new Cylinder(3, 2, "blue");
//        System.out.println(cl);

        //Trien khai lop Point2D
//        Point2D p2d = new Point2D();
//        p2d.setXY(1,2);
//        for(int i = 0; i < p2d.getXY().length; i++) {
//            System.out.println(p2d.getXY()[i] + ", ");
//        }
//        System.out.println(p2d.getX() +" " + p2d.getY());
//        System.out.println(p2d.toString());

        //Trien khai lop Point3D
//        Point3D p3d = new Point3D();
//        p3d.setXYZ(4,5,6);
//        for (int i = 0; i < p3d.getXYZ().length; i++){
//            System.out.println(p3d.getXYZ()[i]);
//        }

    Scanner sc = new Scanner(System.in);
    Resizeable[] rs = new Resizeable[3];
    Circle cl = new Circle();
    Rectangle rt = new Rectangle();
    Square sq = new Square();

    //Test circle
    // System.out.println("Nhap vao do dai ban kinh: ");
    // cl.setRadius(sc.nextInt());
    // cl.resize(2);
    // System.out.println(cl.getArea()); 

    //Test Rectangle
    System.out.println("Nhap vao chieu dai va chieu rong: ");
    rt.setLength(sc.nextInt());
    rt.setWidth(sc.nextInt());
    rt.resize(sc.nextInt());
    System.out.println(rt.getArea());

    //Test Square
    System.out.println("Nhap vao do dai canh hinh vuong: ");
    sq.setSide(sc.nextInt());
    sq.resize(sc.nextInt());
    System.out.println(sq.getArea());
    }
}
