package Ss7_AbstractClass_Interface.Bai_tap.Interfacer_Resizeable;

public class Rectangle extends Geometry implements IResizeable{
    private double width, height;

    public double getWidth() {
        return width;
    }

    public void setWidth(double withd) {
        this.width = withd;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public Rectangle(boolean filled, double width, double height) {
        super(filled);
        this.width = width;
        this.height = height;



    }

    @Override
    public void resize(double percent) {
        System.out.println("Diện tích hình chữ nhật sau khi tăng: " + (getArea() * percent / 100 + getArea()));
    }

    @Override
    public double getArea() {
        return this.height * this.width;
    }
}
