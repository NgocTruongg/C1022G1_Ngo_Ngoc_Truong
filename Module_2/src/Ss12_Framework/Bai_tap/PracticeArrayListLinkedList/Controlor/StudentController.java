package Ss12_Framework.Bai_tap.PracticeArrayListLinkedList.Controlor;

import Ss12_Framework.Bai_tap.PracticeArrayListLinkedList.Model.model.Product;

import java.util.Scanner;

public class StudentController {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ProducManagerImp producManager = new ProducManagerImp();
        int choice;
        do {
            producManager.menu();
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Sản phẩm bạn muốn thêm: ");
                    System.out.println("Id: ");
                    int id = Integer.parseInt(sc.nextLine());
                    System.out.println("Tên sản phẩm: ");
                    String nameProduct = sc.nextLine();
                    System.out.println("Giá tiền: ");
                    int price = Integer.parseInt(sc.nextLine());
                    Product product = new Product(id, nameProduct, price);
                    producManager.them(product);
                    break;
                case 2:
                    System.out.println("Nhập sản phẩm bạn muốn đổi: ");
                    System.out.println("Id: ");
                    int id2 = Integer.parseInt(sc.nextLine());
                    System.out.println("Tên sản phẩm: ");
                    String nameProduct2 = sc.nextLine();
                    System.out.println("Giá tiền: ");
                    int price2 = Integer.parseInt(sc.nextLine());
                    System.out.println("Vị trí bạn muốn đổi: ");
                    int index = Integer.parseInt(sc.nextLine());
                    Product product2 = new Product(id2, nameProduct2, price2);
                    producManager.changer(index,product2);
                    break;
                case 3:
                    producManager.display();
                    break;
                case 4:
                    System.out.println("Nhập sản phẩm bạn muốn tìm: ");
                    System.out.println("Tên sản phẩm: ");
                    String nameProduct4 = sc.nextLine();
                    producManager.find(nameProduct4);
                    break;
                case 5:
                    producManager.sort();
                    break;
            }
        }
        while (choice < 6);
    }
}
