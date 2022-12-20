package Ss12_Framework.Update_baitap.Service;

import Ss12_Framework.Update_baitap.Model.Product;
import Ss12_Framework.Update_baitap.Repository.IProductManageRepository;
import Ss12_Framework.Update_baitap.Repository.ProductManagerRepository;

public class ProductManagerService implements IProductManagerService {
    IProductManageRepository iProductManageRepository = new ProductManagerRepository();

    @Override
    public void add(Product product) {
        iProductManageRepository.add(product);
    }

    @Override
    public void display() {
        iProductManageRepository.display();
    }

    @Override
    public void update(Product product) {
        iProductManageRepository.update(product);
    }

    @Override
    public Product findById(int id) {
        return iProductManageRepository.findById(id);

    }

    @Override
    public void removeById(int id) {
        iProductManageRepository.removeById(id);
    }

    @Override
    public void searchName(String name) {
        iProductManageRepository.searchName(name);
    }

    @Override
    public void sortAscending() {
        iProductManageRepository.sortAscending();
    }

    @Override
    public void sortDescending() {
        iProductManageRepository.sortDescending();
    }

}
