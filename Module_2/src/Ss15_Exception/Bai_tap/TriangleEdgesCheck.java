package Ss15_Exception.Bai_tap;

public class TriangleEdgesCheck {
    public void checkTriangleEdgesCheck(double a, double b, double c) {
        try {
            if (a + b > c && b + c > a && a + c > b && a > 0 && b > 0 && c > 0) {
                System.out.println("A, B, C is the side of the triangle: ");
            } else {
                throw new IllegalTriangleException();
            }

        } catch (IllegalTriangleException e) {
            System.out.println("A, B, C is not the side of the triangle: ");
        } finally {
            System.out.println("------------And-------------");
        }
    }

}
