package Ss7_AbstractClass_Interface.Bai_tap.Interface_Colorsizeable;

public class Test {
    public static void main(String[] args) {
        Geometry[] geometries = new Geometry[3];
        geometries[0] = new Square("blue", true, 5);
        geometries[1] = new Square("red", false, 4);
        geometries[2] = new Rectangle("yellow", true, 4, 5);

        for (Geometry geometry : geometries) {
            if (geometry instanceof Square) {
                IColorable squareInterface = (Square) geometry;
                System.out.println(geometry);
                squareInterface.howToCloro();
                System.out.println();
            }
            if (geometry instanceof Rectangle) {
                IColorable rectangleInterface = (Rectangle) geometry;
                System.out.println(geometry);
                rectangleInterface.howToCloro();
            }
        }
    }
}