package Ss12_Framework.Update_baitap.Repository;

import Ss12_Framework.Update_baitap.Model.Product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ProductManagerRepository implements IProductManageRepository {
    static List<Product> list = new ArrayList<>();

    static {
        list.add(new Product(1, "Túi", 1000));
        list.add(new Product(2, "Balo", 3000));
        list.add(new Product(3, "Ví", 500));
        list.add(new Product(4, "Túi xách", 5000));
    }

    @Override
    public void add(Product product) {
        list.add(product);
    }

    @Override
    public void display() {
        for (Product c : list) {
            System.out.println(c);
        }
    }

    @Override
    public void update(Product product) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == product.getId()) {
                list.set(i, product);
                break;
            }
        }

    }

    @Override
    public Product findById(int id) {
        for (Product c : list) {
            if (c.getId() == id) {
                return c;
            }
        }
        return null;
    }

    @Override
    public void removeById(int id) {

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id) {
                list.remove(list.get(i));
            }
        }
    }

    @Override
    public void searchName(String name) {
        for (Product r : list) {
            if (r.getName().contains(name)) {
                System.out.println(r);
            }
        }
    }

    @Override
    public void sortAscending() {
        Collections.sort(list, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o2.getPrice() - o1.getPrice();
            }
        });
        this.display();
    }

    @Override
    public void sortDescending() {
        Collections.sort(list, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o1.getPrice() - o2.getPrice();
            }
        });
        this.display();
    }
}
