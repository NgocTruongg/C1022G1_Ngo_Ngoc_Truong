package Ss12_Framework.Bai_tap.JavaCollectionFramework.Model.service;

import Ss12_Framework.Bai_tap.JavaCollectionFramework.Model.model.Product;

public interface IProductManager {

    void them(Product product);

    void xoa(int index);

    void change(int index, Product product);

    void display();

    void find(String name);

    void sort();
}
