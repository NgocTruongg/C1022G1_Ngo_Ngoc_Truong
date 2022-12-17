package Ss12_Framework.Bai_tap.PracticeArrayListLinkedList.Model.service;

import Ss12_Framework.Bai_tap.PracticeArrayListLinkedList.Model.model.Product;

public interface IProductManager {
    void menu();

    void them(Product product);

    void change(int index, Product product);

    void display();

    void find(String name);

    void sort();

}
