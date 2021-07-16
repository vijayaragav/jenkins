package com.infosys;

public class Rectangle {
    private int length;
    private int breadth;


    public void setLength(int length) {
        this.length = length;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }
    void calculatePerimeter(int l, int b){
        Rectangle rectangle = new Rectangle();
        rectangle.setLength(l);
        rectangle.setBreadth(b);
        System.out.println(2*(rectangle.length+rectangle.breadth));
    }
}

class perimeterCalculator{
    public static void main(String[] args) {
       Rectangle rectangle = new Rectangle();
       rectangle.calculatePerimeter(25,13);


    }
}
