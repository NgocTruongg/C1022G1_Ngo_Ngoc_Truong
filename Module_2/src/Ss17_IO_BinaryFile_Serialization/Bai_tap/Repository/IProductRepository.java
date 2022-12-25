package Ss17_IO_BinaryFile_Serialization.Bai_tap.Repository;

import Ss17_IO_BinaryFile_Serialization.Bai_tap.Model.Product;

public interface IProductRepository {

    void add(Product product);
    void display();
    Product SearchName(String string);

}
