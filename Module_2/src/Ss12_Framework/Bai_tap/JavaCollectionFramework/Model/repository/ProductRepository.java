package Ss12_Framework.Bai_tap.JavaCollectionFramework.Model.repository;

import Ss12_Framework.Bai_tap.JavaCollectionFramework.Model.model.Product;

import java.util.*;

public class ProductRepository implements IProductRepository {
    List<Product> productList = new ArrayList<>();
    Product product1 = new Product(1, 1000, "Ví");
    Product product2 = new Product(2, 2000, "Túi xách");
    Product product3 = new Product(3, 3000, "Balo");

    {
        productList.add(product1);
        productList.add(product2);
        productList.add(product3);

    }

    @Override
    public void them(Product product) {
        productList.add(product);
    }

    @Override
    public void xoa(int index) {
        productList.remove(index);
    }

    @Override
    public void change(int index, Product product) {
        productList.set(index, product);
    }

    @Override
    public void display() {
        for (int i = 0; i < productList.size() ; i++) {
            System.out.println(productList.get(i));
        }
    }

    @Override
    public void find(String name) {
        for (int i = 0; i <productList.size() ; i++) {
            System.out.println(productList.get(i));
        }
    }

    @Override
    public void sort() {
        Collections.sort(productList, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o1.getId() - o2.getId();
            }
        });

    }
}
