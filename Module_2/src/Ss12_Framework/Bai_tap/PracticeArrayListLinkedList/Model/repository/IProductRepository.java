package Ss12_Framework.Bai_tap.PracticeArrayListLinkedList.Model.repository;

import Ss12_Framework.Bai_tap.PracticeArrayListLinkedList.Model.model.Product;

public interface IProductRepository {
    void menu();
    void them(Product product);
    void changer (int index, Product product);
    void display();
    void find(String name);
    void sort();
}
