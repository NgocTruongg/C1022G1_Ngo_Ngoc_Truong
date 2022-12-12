package Ss6_Inheritance.Bai_tap.Circle;

public class Cylinder extends Circle {
    private static final boolean filled = true;
    private double height = 1.0;

    public Cylinder(double radius, String color, double height) {
        super(radius, color, filled);
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
