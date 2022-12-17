package Ss12_Framework.Bai_tap.JavaCollectionFramework.Model.service;

import Ss12_Framework.Bai_tap.JavaCollectionFramework.Model.model.Product;
import Ss12_Framework.Bai_tap.JavaCollectionFramework.Model.repository.IProductRepository;
import Ss12_Framework.Bai_tap.JavaCollectionFramework.Model.repository.ProductRepository;

public class ProductManager extends Product implements IProductManager {

    private final IProductRepository repository = new ProductRepository();
    @Override
    public void them(Product product) {
        repository.them(product);
    }

    @Override
    public void xoa(int index) {
        repository.xoa(index);
    }

    @Override
    public void change(int index, Product product) {
        repository.change(index, product);
    }

    @Override
    public void display() {
        repository.display();
    }

    @Override
    public void find(String name) {
        repository.find(name);
    }

    @Override
    public void sort() {
        repository.sort();
    }
}
