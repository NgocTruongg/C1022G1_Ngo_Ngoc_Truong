package service;

import model.Product;

import java.util.List;

public interface IProductService {
    List<Product> finAll();
    Product finById(int id);
    void create (Product product);
    void update (Product product);
    void delete (Product product);
    List<Product> search (String name);
}
