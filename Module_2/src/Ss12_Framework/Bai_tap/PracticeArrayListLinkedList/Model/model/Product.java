package Ss12_Framework.Bai_tap.PracticeArrayListLinkedList.Model.model;

public class Product {
    private int id, price;
    private String nameProduct;

    public Product() {
    }

    public Product(int id, int price, String nameProduct) {
        this.id = id;
        this.price = price;
        this.nameProduct = nameProduct;
    }

    public Product(int id, String lv, int i) {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", price=" + price +
                ", nameProduct='" + nameProduct + '\'' +
                '}';
    }
}
