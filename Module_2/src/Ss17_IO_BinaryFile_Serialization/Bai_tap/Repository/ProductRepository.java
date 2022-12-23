package Ss17_IO_BinaryFile_Serialization.Bai_tap.Repository;

import Ss17_IO_BinaryFile_Serialization.Bai_tap.Model.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ProductRepository implements IProductRepository {
    private static final String FILE_PATH = "D:\\Codegym\\C1022G1_Ngo_Ngoc_Truong\\Module_2\\src\\Ss17_IO_BinaryFile_Serialization\\Bai_tap\\Controller\\text.dat";

    static List<Product> productList = new ArrayList<>();
    public static void writeObject(List<Product> product) {
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream(FILE_PATH);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        ObjectOutputStream bos = null;
        try {
            bos = new ObjectOutputStream(fos);
            bos.writeObject(product);
            bos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static List<Product> readObjectList() {
        try {
            FileInputStream fileInputStream =new FileInputStream(FILE_PATH);
            ObjectInputStream objectInputStream =new ObjectInputStream(fileInputStream);
            List<Product> productList =(List<Product>) objectInputStream.readObject();
            return productList;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();

        }
        return null;
    }

    static {
        productList.add(new Product(1, "Camry", "Toyota", 1200000, "Sedan"));
        productList.add(new Product(2, "Vio", "Toyota", 600000, "Sedan"));
        productList.add(new Product(3, "S450", "Mercedes", 3200000, "Sedan"));
        productList.add(new Product(4, "GLC200", "Mercedes", 1700000, "SUV"));
        productList.add(new Product(5, "Civic", "Honda", 800000, "Sedan"));
        productList.add(new Product(6, "320i", "BMW", 4000000, "Sedan"));
            writeObject( productList);

    }


    @Override
    public void add(Product product){
        productList.add(product);

        writeObject(productList);
    }

    @Override
    public void display() {
        for (Product c: productList) {
            System.out.println(c);
        }
    }

    @Override
    public void SearchName(String string) {
        for (Product c: productList) {
            if (c.getName().contains(string)) {
                System.out.println(c);
            }
        }
    }

}

