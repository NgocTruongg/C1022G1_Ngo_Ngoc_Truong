package Ss7_AbstractClass_Interface.Bai_tap.Interface_Colorsizeable;

public class RectangleTest {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);

        rectangle = new Rectangle("orange", true, 3, 4);
        System.out.println(rectangle);
    }
}
