package Ss7_AbstractClass_Interface.Bai_tap.Interface_Colorsizeable;

public class Circle extends Shape implements IColorable {
    private double radius = 1;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "Area of Circle is: "
                + getArea() + ". "
                + super.toString();
    }

    @Override
    public void howToCloro() {
        if (isFilled()) {
            System.out.println("Color all four sides");
        } else {
            System.out.println("No color !!!");
        }
    }
}

