package Ss7_AbstractClass_Interface.Bai_tap.Interface_Colorsizeable;

public abstract class Geometry {
    private String color;
    private boolean filled;

    public Geometry(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "Geometry{" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}