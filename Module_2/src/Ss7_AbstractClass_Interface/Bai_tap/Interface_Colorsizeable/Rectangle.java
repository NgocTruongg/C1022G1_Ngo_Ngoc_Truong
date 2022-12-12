package Ss7_AbstractClass_Interface.Bai_tap.Interface_Colorsizeable;

public class Rectangle extends Shape implements IColorable {
    private double height = 1;
    private double width = 1;

    public Rectangle() {
    }

    public Rectangle(String color, boolean filled, double height, double width) {
        super(color, filled);
        this.height = height;
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getArea() {
        return this.width * this.height;
    }

    @Override
    public String toString() {
        return "Area of Rectangle is: "
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