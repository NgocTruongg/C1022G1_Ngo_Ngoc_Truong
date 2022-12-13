package Ss7_AbstractClass_Interface.Bai_tap.Interface_Colorsizeable;

public class Rectangle extends Geometry implements IColorable {
    private double width, height;

    public Rectangle(String color, boolean filled, double width, double height) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return this.width * this.height;
    }

    @Override
    public String toString() {
        return "Area of this rectangle is: " + this.getArea();
    }

    @Override
    public void howToCloro() {
        if (super.isFilled()) {
            System.out.println("Color " + super.getColor() + " all four sides");
        } else {
            System.out.println("No color");
        }
    }
}
