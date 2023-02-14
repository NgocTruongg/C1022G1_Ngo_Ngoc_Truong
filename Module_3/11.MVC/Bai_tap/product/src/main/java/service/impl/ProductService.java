package service.impl;

import model.Product;
import repository.IProductRepository;
import repository.impl.ProductRepository;
import service.IProductService;

import java.util.List;

public class ProductService implements IProductService {
    private IProductRepository iProductRepository = new ProductRepository();
    @Override
    public List<Product> finAll() {
        return iProductRepository.finAll();
    }

    @Override
    public void create(Product product) {
        iProductRepository.create(product);
    }

    @Override
    public Product finById(int id) {
        return iProductRepository.finById(id);
    }

    @Override
    public void update(Product product) {
        iProductRepository.update(product);
    }

//    @Override
//    public Product finByid(int id) {
//        return iProductRepository.finById();
//    }
}
