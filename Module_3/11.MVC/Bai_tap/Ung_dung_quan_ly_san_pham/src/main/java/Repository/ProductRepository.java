package Repository;

import Model.Product;
import Service.IProductService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductRepository implements IProductRepository {
    private static Map<Integer,Product> productMap;

    static {
        productMap = new HashMap<>();
        productMap.put(1, new Product(1, "Mercedes", "2ty", "old car"));
        productMap.put(2, new Product(2, "Audi", "3ty", "new car"));
        productMap.put(3, new Product(3, "BMW", "2.5ty", "old car"));
        productMap.put(4, new Product(4, "Porsche", "6ty", "new car"));
        productMap.put(5, new Product(5, "May-bach", "8.5ty", "new car"));
    }




    @Override
    public List<Product> finAll() {
        return new ArrayList<>(productMap.values());
    }

    @Override
    public void save(Product product) {
        product.setId(productMap.size() + 1);
        productMap.put(product.getId(), product);
    }

    @Override
    public void update(int id, Product product) {
        productMap.put(id, product);
    }

    @Override
    public void delete(int id) {
    productMap.remove(id);
    }

    @Override
    public Product findByName(Product product) {
        return null;
    }
}
