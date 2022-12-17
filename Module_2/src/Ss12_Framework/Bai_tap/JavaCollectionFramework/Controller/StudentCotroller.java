package Ss12_Framework.Bai_tap.JavaCollectionFramework.Controller;

import Ss12_Framework.Bai_tap.JavaCollectionFramework.Model.model.Product;
import Ss12_Framework.Bai_tap.JavaCollectionFramework.Model.service.ProductManager;

import java.util.Scanner;

public class StudentCotroller {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ProductManager proManager = new ProductManager();
        int choice;
        do {
          System.out.println("Chọn phương thức bạn muốn: \n" +
                "1.Thêm sản phẩm.\n" +
                "2.Sửa sản phẩm.\n" +
                "3.Hiển thị sản phẩm.\n" +
                "4.Tìm kiếm sản phẩm.\n" +
                "5.Sắp xếp sản phẩm.\n" +
                "6.Xóa sản phẩm.\n" +
                "7.Thoát.\n");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Sản phẩm thêm vào: ");
                    System.out.println("Id: ");
                    int id = Integer.parseInt(scanner.nextLine());
                    System.out.println("Tên sản phẩm: ");
                    String namePro = scanner.nextLine();
                    System.out.println("Giá tiền: ");
                    int price = Integer.parseInt(scanner.nextLine());
                    Product pro = new Product(id, price, namePro);
                    proManager.them(pro);
                    break;
                case 2:
                    System.out.println("Nhập vào sản phẩm bạn muốn đổi: ");
                    System.out.println("Id: ");
                    int id2 = Integer.parseInt(scanner.nextLine());
                    System.out.println("Tên sản phẩm: ");
                    String namePro2 = scanner.nextLine();
                    System.out.println("Giá tiền: ");
                    int price2 = Integer.parseInt(scanner.nextLine());
                    System.out.println("Vị trí muốn đổi: ");
                    int index = Integer.parseInt(scanner.nextLine());
                    Product pro2 = new Product(id2, price2, namePro2);
                    proManager.change(index, pro2);
                    break;
                case 3:
                    proManager.display();
                    break;
                case 4:
                    System.out.println("Sản phẩm bạn muốn tìm: ");
                    System.out.println("Tên sản phẩm: ");
                    String namepro3 = scanner.nextLine();
                    proManager.find(namepro3);
                    break;
                case 5:
                    proManager.sort();
                    break;

            }
        } while (choice < 6);
    }
}
