package Ss7_AbstractClass_Interface.Bai_tap.Interface_Colorsizeable;

public class Test {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle("blue", true, 5);
        shapes[1] = new Rectangle("white", false, 5, 7);
        shapes[2] = new Square("black", true, 6);
        for (Shape shape : shapes) {
            shape.howToCloro();
            System.out.println(shape.toString());
            System.out.println("");
        }

    }
}