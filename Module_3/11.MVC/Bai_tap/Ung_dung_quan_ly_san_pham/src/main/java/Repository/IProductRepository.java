package Repository;

import Model.Product;

import java.util.List;

public interface IProductRepository  {
    List<Product> finAll();
    void save (Product product);
    void update (int id, Product product);
    void delete (int id);
    Product findByName (Product product);
}
