package Ss7_AbstractClass_Interface.Bai_tap.Interfacer_Resizeable;

import Ss7_AbstractClass_Interface.Bai_tap.Interfacer_Resizeable.Circle;
import Ss7_AbstractClass_Interface.Bai_tap.Interfacer_Resizeable.Rectangle;
import Ss7_AbstractClass_Interface.Bai_tap.Interfacer_Resizeable.Square;

public class Test {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        Circle circle = new Circle();
        Square square = new Square();
        rectangle.setLength(2);
        rectangle.setWidth(3);
        System.out.println("Diện tích phần tử trước khi tăng :" + rectangle.getArea());
        rectangle.resize(Math.floor(Math.random()*(100+1-1)+1));

        circle.setRadius(5);
        System.out.println("Diện tích phần tử trước khi tăng: " + circle.getArea());
        circle.resize(Math.floor(Math.random()*(100+1-1)+1));

        square.setEdge(5);
        System.out.println("Diện tích phần tử trước khi tăng: " + square.getArea());
        circle.resize(Math.floor(Math.random()*(100+1-1)+1));
    }
}
