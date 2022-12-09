package Ss6_Inheritance.Bai_tap.Circle;

import Ss6_Inheritance.Bai_tap.Circle.Circle;

public class Cylinder extends Circle {
    private double height = 1.0;

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getVolume() {
        return getArea() * this.height;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + getVolume() +
                '}';
    }
}
