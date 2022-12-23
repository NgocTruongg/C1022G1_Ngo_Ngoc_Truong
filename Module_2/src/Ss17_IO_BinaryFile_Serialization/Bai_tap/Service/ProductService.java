package Ss17_IO_BinaryFile_Serialization.Bai_tap.Service;

import Ss17_IO_BinaryFile_Serialization.Bai_tap.Model.Product;

public class ProductService implements IProductService {
    IProductService iProductService = new ProductService();
    @Override
    public void add(Product product) {
        iProductService.add(product);
    }

    @Override
    public void display() {
        iProductService.display();
    }

    @Override
    public void SearchName(String string) {
        iProductService.SearchName(string);
    }


}
