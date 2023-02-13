package service;

import model.Product;
import repository.IProductRepository;
import repository.ProductRepository;

import java.util.List;

public class ProductService implements IProductService{
    IProductRepository productRepository = new ProductRepository();

    @Override
    public List<Product> finAll() {
        return productRepository.finAll();
    }

    @Override
    public Product finById(int id) {
        return productRepository.finById(id);
    }

    @Override
    public void create(Product product) {
        productRepository.create(product);
    }

    @Override
    public void update(Product product) {
        productRepository.update(product);
    }

    @Override
    public void delete(Product product) {
        productRepository.delete(product);
    }

    @Override
    public List<Product> search(String name) {
        return productRepository.search(name);
    }
}
