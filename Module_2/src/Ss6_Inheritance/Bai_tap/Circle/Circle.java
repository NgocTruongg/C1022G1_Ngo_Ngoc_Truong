package Ss6_Inheritance.Bai_tap.Circle;

public class Circle {
    private double radius;
    private String color;


    public Circle(double radius, String color, boolean filled) {
        this.radius = radius;
        this.color = color;
    }

    public Circle(double radius) {
    }

    public Circle() {

    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea () {
        return Math.pow(this.radius, 2) * Math.PI;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + getRadius() +
                ", color='" + getColor() + '\'' +
                '}';
    }
}
