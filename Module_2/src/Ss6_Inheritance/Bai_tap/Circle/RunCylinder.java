package Ss6_Inheritance.Bai_tap.Circle;

import Ss6_Inheritance.Bai_tap.Circle.Circle;
import Ss6_Inheritance.Bai_tap.Circle.Cylinder;

public class RunCylinder {
    public static void main(String[] args) {
        Circle circle = new Circle(10, "black");
        System.out.println(circle.toString());
        Cylinder cylinder = new Cylinder(5, "blue", 2);
        System.out.println(cylinder.toString());
    }
}
