package repository;

import model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository implements IProductRepository {
    static List<Product> productList = new ArrayList<>();

    static {
        productList.add(new Product(1, "audi", "2ty", "hang sang"));
        productList.add(new Product(2, "mercedes", "3ty", "hang sang"));
        productList.add(new Product(3, "may-bach", "8ty", "hang sang"));
        productList.add(new Product(4, "bwm", "4ty", "hang sang"));
        productList.add(new Product(5, "honda", "1ty", "hang thuong"));
    }

    @Override
    public List<Product> finAll() {
        return productList;
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
    public void create(Product product) {
        product.setId(productList.size() + 1);
        productList.add(product);
    }

    @Override
    public void update(Product product) {
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getId() == product.getId()) {
                productList.set(i, productList.get(i));
            }
        }
    }

    @Override
    public void delete(Product product) {
        for (int i = 0; i < productList.size(); i++) {
            if (product.getId() == productList.get(i).getId()) {
                productList.remove(i);
            }
        }
    }

    @Override
    public List<Product> search(String name) {
        List<Product> products = new ArrayList<>();
        for (Product product : productList) {
            if (product.getName().contains(name)) {
                products.add(product);
            }
        }
        return products;
    }
}
