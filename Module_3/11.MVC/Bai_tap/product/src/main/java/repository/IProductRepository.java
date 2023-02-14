package repository;

import model.Product;

import java.util.List;

public interface IProductRepository {

    List<Product> finAll();
    void create(Product product);

    Product finById(int id);

    void update(Product product);
//    Product finById();
}
