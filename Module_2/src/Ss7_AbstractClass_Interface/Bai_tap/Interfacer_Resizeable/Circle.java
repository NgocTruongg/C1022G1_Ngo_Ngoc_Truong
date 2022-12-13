package Ss7_AbstractClass_Interface.Bai_tap.Interfacer_Resizeable;

public class Circle extends Geometry implements IResizeable {
    private double radius;

    public Circle(boolean filled, double radius) {
        super(filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.pow(this.radius, 2) * Math.PI;
    }

    @Override
    public void resize(double percent) {
        System.out.println("Diện tích hình tròn sau khi tăng: " + (getArea() * percent / 100 + getArea()));
    }
}