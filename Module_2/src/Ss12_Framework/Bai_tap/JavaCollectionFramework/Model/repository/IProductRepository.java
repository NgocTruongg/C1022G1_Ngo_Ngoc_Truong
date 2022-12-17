package Ss12_Framework.Bai_tap.JavaCollectionFramework.Model.repository;

import Ss12_Framework.Bai_tap.JavaCollectionFramework.Model.model.Product;

public interface IProductRepository {

    void them(Product product);

    void xoa(int index);

    void change(int index, Product product);

    void display();

    void find(String name);

    void sort();

}
