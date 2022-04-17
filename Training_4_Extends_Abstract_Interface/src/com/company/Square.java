package com.company;

public class Square implements Resizeable,Colorable {
    private double side;

    public Square() {}
    public Square(double side) {
        this.side = side;
    }
    public double getSide() {
        return side;
    }
    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public void resize(double percent) {
        setSide( side * percent );
    }

    @Override
    public void howToColor(){
        System.out.println("Color all four sides.");
    }

    public double getArea() {
        return side * side;
    }
    
}
