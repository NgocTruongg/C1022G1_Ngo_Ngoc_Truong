package repository.impl;

import model.Product;
import repository.IProductRepository;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository implements IProductRepository {
    private static List<Product> productList = new ArrayList<>();

    static {
        productList.add(new Product(1, "audi", "2ty", "new car"));
        productList.add(new Product(2, "mercedes", "2,5ty", "new car"));
        productList.add(new Product(3, "bmw", "3ty", "new car"));
        productList.add(new Product(4, "may-bach", "8ty", "new car"));
        productList.add(new Product(5, "porsche", "6ty", "new car"));
    }

    @Override
    public List<Product> finAll() {
        return productList;
    }

    @Override
    public void create(Product product) {
        product.setId(productList.size() + 1);
        productList.add(product);
    }

    @Override
    public Product finById(int id) {
        for (Product product : productList) {
            if (id == product.getId()) {
                return product;
            }
        }
        return null;
    }

    @Override
    public void update(Product product) {
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getId() == product.getId()) {
                productList.set(i, productList.get(i));
            }
        }
    }
}
