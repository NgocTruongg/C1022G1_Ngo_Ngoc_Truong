package Ss12_Framework.Update_baitap.Repository;

import Ss12_Framework.Update_baitap.Model.Product;

public interface IProductManageRepository {
    void add(Product product);

    void display();

    void update(Product product);

    Product findById(int id);

    void removeById(int id);

    void searchName(String name);

    void sortAscending();

    void sortDescending();
}
