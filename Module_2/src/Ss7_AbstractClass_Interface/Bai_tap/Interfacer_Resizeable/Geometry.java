package Ss7_AbstractClass_Interface.Bai_tap.Interfacer_Resizeable;

public abstract class Geometry {
    private boolean filled;

    public Geometry(boolean filled) {
        this.filled = filled;
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
                "filled=" + filled +
                '}';
    }
}
