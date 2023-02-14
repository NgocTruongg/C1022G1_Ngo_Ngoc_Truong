package service;

import model.Product;

import java.util.List;

public interface IProductService {
    List<Product> finAll();

    void create(Product product);

    Product finById(int id);

    void update(Product product);

//    Product finByid(int id);
}
