package Service;

import Model.Product;
import Repository.IProductRepository;
import Repository.ProductRepository;

import java.util.ArrayList;
import java.util.List;

public class ProductService implements IProductService{
    private IProductRepository iProductRepository = new ProductRepository();
    @Override
    public List<Product> finAll() {
        return iProductRepository.finAll();
    }

    @Override
    public void save(Product product) {

    }

    @Override
    public void update(int id, Product product) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public Product findByName(Product product) {
        return null;
    }
}
