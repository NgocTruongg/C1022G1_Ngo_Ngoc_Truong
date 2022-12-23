package Ss17_IO_BinaryFile_Serialization.Bai_tap.Controller;

import Ss17_IO_BinaryFile_Serialization.Bai_tap.Model.Product;
import Ss17_IO_BinaryFile_Serialization.Bai_tap.Repository.IProductRepository;
import Ss17_IO_BinaryFile_Serialization.Bai_tap.Repository.ProductRepository;

import java.io.*;
import java.util.List;
import java.util.Scanner;

public class ProductController {
    public static void main(String[] args)  {
        IProductRepository productRepository = new ProductRepository();
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("------------MENU-------------");
            System.out.println("You choice:");
            System.out.println("1.\t Add Product: \n" +
                    "2.\t Display Product:\n" +
                    "3.\t Search Product:\n" +
                    "4.\tExit:\n");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Enter the Id to product:");
                    int id = Integer.parseInt(sc.nextLine());
                    System.out.println("Enter the Name to product:");
                    String newName = sc.nextLine();
                    System.out.println("Enter the Manufacturer to product:");
                    String newManufacturer = sc.nextLine();
                    System.out.println("Enter the Price to product:");
                    double newPrice = Double.parseDouble(sc.nextLine());
                    Product product = new Product(id, newName, newManufacturer, newPrice);
                    try {
                        productRepository.add(product);
                    } catch (IOException e) {

                    }
                    break;
                case 2:
                    productRepository.display();
                    break;
                case 3:
                    System.out.println("Enter a Name to search ");
                    String newName2 = sc.nextLine();
                    productRepository.SearchName(newName2);
                    break;
                case 4:
                    System.exit(-1);
                    break;
                default:
                    System.out.println("Please choice again: ");
            }
        } while (true);
    }

    // ghi đối tượng:


//    public static Product readObject() throws IOException, ClassNotFoundException {
//        FileInputStream fis = new FileInputStream(FILE_PATH);
//        ObjectInputStream ois = new ObjectInputStream(fis);
//        Product product = (Product) ois.readObject();
//        return product;
//    }

//    public static void writeObjectList (List<Product> productList) throws IOException {
//        FileOutputStream fos = new FileOutputStream(FILE_PATH);
//        ObjectOutputStream oos = new ObjectOutputStream(fos);
//        oos.writeObject(productList);
//        oos.close();
//    }
}
