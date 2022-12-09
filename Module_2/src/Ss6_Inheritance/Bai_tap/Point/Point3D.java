package Ss6_Inheritance.Bai_tap.Point;

import Ss6_Inheritance.Bai_tap.Point.Point2D;

import java.util.Arrays;

public class Point3D extends Point2D {
    public float z;

    public Point3D(float z) {
        this.z = z;
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public float [] getXYZ() {
        float []arr = {getX(), getY(), this.z};
        return arr;
    }

    @Override
    public String toString() {
        return "Point2D{" +
                "x=" + getX() +
                ", y=" + getY() + ", x,y=" + Arrays.toString(getXYZ()) +
                '}';
    }
}
