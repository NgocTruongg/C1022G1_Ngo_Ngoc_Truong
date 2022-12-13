package Ss7_AbstractClass_Interface.Bai_tap.Interface_Colorsizeable;

public class Square extends Geometry implements IColorable {
    private double side;

    public Square(String color, boolean filled, double side) {
        super(color, filled);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getArea() {
        return this.side * this.side;
    }

    @Override
    public String toString() {
        return "Area of this square: " + this.getArea();
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