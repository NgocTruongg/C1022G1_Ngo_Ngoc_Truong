package Ss17_IO_BinaryFile_Serialization.Bai_tap.Service;

import Ss17_IO_BinaryFile_Serialization.Bai_tap.Model.Product;

public interface IProductService {
    void add(Product product);
    void display();
    void SearchName(String string);


}
