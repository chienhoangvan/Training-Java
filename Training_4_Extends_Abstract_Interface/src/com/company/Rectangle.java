package com.company;

public class Rectangle implements Resizeable {
    private double width;
    private double length;
    
    public Rectangle () {}
    public Rectangle (double width, double length) {
        this.length = length;
        this.width = width;
    }
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        this.length = length;
    }

    public void resize(double percent) {
        setLength( length *  percent );
        setWidth( width *  percent );
    }
    
    public double getArea() {
        return  getLength() * getWidth();
    }

    
    
}
