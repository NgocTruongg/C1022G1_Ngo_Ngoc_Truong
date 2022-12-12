package Ss7_AbstractClass_Interface.Bai_tap.Interface_Colorsizeable;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);

        circle = new Circle(3.5);
        System.out.println(circle);

        circle = new Circle("indigo", false, 4);
        System.out.println(circle);
    }
}
