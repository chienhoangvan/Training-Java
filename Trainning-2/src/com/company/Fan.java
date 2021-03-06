package com.company;

public class Fan {

    final int SLOW = 1, MEDIUM = 2, FAST = 3;
    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";

    public Fan() {}

    public int getSpeed() {
        return speed;
    }
    public boolean getOn() {
        return on;
    }
    public double getRadius() {
        return radius;
    }
    public String getColor() {
        return color;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public void setOn(boolean on) {
        this.on = on;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public void toString( boolean on, int speed, double radius, String color) {
        if(on) {
            System.out.println("fan is on ");
            System.out.println("Speed: " + speed +" Color: " + color + " Radius: " + radius + "\n");
        } else {
            System.out.println("fan is off ");
            System.out.println("Color: " + color + " Radius: " + radius );
        }
    }


}
