package Ss17_IO_BinaryFile_Serialization.Bai_tap.Repository;

import Ss17_IO_BinaryFile_Serialization.Bai_tap.Model.Product;

import java.io.IOException;

public interface IProductRepository {

    void add(Product product) throws IOException;
    void display();
    void SearchName(String string);

}
