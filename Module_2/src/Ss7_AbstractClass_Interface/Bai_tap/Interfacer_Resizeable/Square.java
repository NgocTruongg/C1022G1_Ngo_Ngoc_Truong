package Ss7_AbstractClass_Interface.Bai_tap.Interfacer_Resizeable;

public class Square extends Geometry implements IResizeable {
    private double side;

    public Square(boolean filled, double side) {
        super(filled);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return this.side * this.side;
    }

    @Override
    public void resize(double percent) {
        System.out.println("Diện tích hình vuông sau khi tăng là: " + (getArea() * percent / 100 + getArea()));
    }
}