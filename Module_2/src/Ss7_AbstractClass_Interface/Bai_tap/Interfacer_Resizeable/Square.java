package Ss7_AbstractClass_Interface.Bai_tap.Interfacer_Resizeable;

import Ss7_AbstractClass_Interface.Bai_tap.Interfacer_Resizeable.IResizeable;
import Ss7_AbstractClass_Interface.Bai_tap.Interfacer_Resizeable.Rectangle;

public class Square extends Rectangle implements IResizeable {
    public double getEdge() {
        return edge;
    }

    public void setEdge(double edge) {
        this.edge = edge;
    }

    private double edge=1;
    public Square() {
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() {
        return getWidth();
    }

    public void setSide(double side) {
        setWidth(side);
        setLength(side);
    }
    public double getArea() {
        return this.edge*this.edge;
    }

    @Override
    public void setWidth(double width) {
        setSide(width);
    }

    @Override
    public void setLength(double length) {
        setSide(length);
    }

    @Override
    public String toString() {
        return "A Square with side="
                + getSide()
                + ", which is a subclass of "
                + super.toString();
    }
    @Override
    public void resize(double percent) {
        System.out.println("Diện tích phần tử sau khi tăng: " + this.getArea()+this.getArea()*percent/100);
    }
}