package Ss12_Framework.Bai_tap.JavaCollectionFramework.Model.model;

public class Product {
    private int id, price;
    private String namePro;

    public Product() {
    }

    public Product(int id, int price, String namePro) {
        this.id = id;
        this.price = price;
        this.namePro = namePro;
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

    public String getNamePro() {
        return namePro;
    }

    public void setNamePro(String namePro) {
        this.namePro = namePro;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", price=" + price +
                ", namePro='" + namePro + '\'' +
                '}';
    }
}
