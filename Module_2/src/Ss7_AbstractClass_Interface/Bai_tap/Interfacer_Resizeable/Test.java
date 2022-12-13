package Ss7_AbstractClass_Interface.Bai_tap.Interfacer_Resizeable;

public class Test {
    public static void main(String[] args) {
        Geometry[] geometries = new Geometry[3];
        geometries[0] = new Circle(true, 3);
        geometries[1] = new Rectangle(false, 5, 10);
        geometries[2] = new Square(true, 4);
        for (Geometry geometry : geometries) {
            if (geometry instanceof Circle) {
                IResizeable squareInterface = (Circle) geometry;
                System.out.println("Diện tích ban đầu là: " + squareInterface.getArea());
                double percent = Math.floor(Math.random() * 100 + 1);
                System.out.println("Tỉ lệ phần trăm tăng: " + percent + '%');
                squareInterface.resize(percent);
            }
            System.out.println();
            if (geometry instanceof Rectangle) {
                IResizeable recctangleInterface = (Rectangle) geometry;
                System.out.println("Diện tích ban đầu là: " + recctangleInterface.getArea());
                double percent = Math.floor(Math.random() * 100 + 1);
                System.out.println("Tỉ lệ phần trăm tăng: " + percent + '%');
                recctangleInterface.resize(percent);
            }
            System.out.println();
            if (geometry instanceof Square) {
                IResizeable squareInterface = (Square) geometry;
                System.out.println("Diện tích ban đầu là: " + squareInterface.getArea());
                double percent = Math.floor(Math.random() * 100 + 1);
                System.out.println("Tỉ lệ phần trăm tăng: " + percent + '%');
                squareInterface.resize(percent);
            }
        }
    }
}
