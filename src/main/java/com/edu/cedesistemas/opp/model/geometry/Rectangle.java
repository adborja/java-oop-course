package com.edu.cedesistemas.opp.model.geometry;

import java.awt.*;

public class Rectangle implements Shape {

    private Point bl;
    private Point tr;
    private Point br;
    private Point tl;
    private double height;
    private double width;

<<<<<<< HEAD
    /*public Rectangle(Point obj, double height, double width) {
        this.bl = obj;
        this.height = height;
        this.width = width;
    }*/

    public Rectangle(Point obj, double height, double width) {
        //Point point = new Point(height,width);
        this.bl = obj;
        this.height = height;
        this.width = width;
            }
=======
    public Rectangle (Point obj, double height, double width) {
        this.bl = obj;
        this.height = height;
        this.width = width;
    }
>>>>>>> origin/feature/dhoyos-javaopp

    public Point BottomLeft() {
        return bl;
    }

    public Point getTopRight() {
        return tr;
    }

    public Point BottomRight() {
        return br;
    }

    public Point getTopLeft() {
        return tl;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public double area() {
        return (width * height);
    }

    @Override
    public double perimeter() {
        return  (2 * width + 2 * height);
    }
}
