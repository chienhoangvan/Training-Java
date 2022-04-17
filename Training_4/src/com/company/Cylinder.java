package com.company;

public class Cylinder extends Circle{
    private double heigh;

    public Cylinder() {

    }
    public Cylinder(double heigh) {
        this.heigh = heigh;
    }
    public Cylinder(double heigh, double radius, String color) {
        super(radius, color);
        this.heigh = heigh;
    }

    public double getHeigh() {
        return heigh;
    }

    public void setHeigh(double heigh) {
        this.heigh = heigh;
    }

    public double getVolume() {
        return getArea() * getHeigh();
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "heigh=" + heigh +
                "Area= " + getVolume() +
                '}';
    }
}
