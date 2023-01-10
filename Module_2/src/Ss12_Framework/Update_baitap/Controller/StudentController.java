package Ss12_Framework.Update_baitap.Controller;

import Ss12_Framework.Update_baitap.Model.Product;
import Ss12_Framework.Update_baitap.Service.IProductManagerService;
import Ss12_Framework.Update_baitap.Service.ProductManagerService;
import javafx.scene.transform.Scale;

import java.util.Scanner;

public class StudentController {
    public static void main(String[] args) {
         IProductManagerService productManagerService = new ProductManagerService();
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("-----------MENU-------------");
            System.out.println("1. Thêm vào: \n"
                    + "2. Hiển thị: \n" +
                    "3. Chỉnh sửa theo id:  \n" +
                    "4. Xóa theo id \n" +
                    "5.Tìm theo tên: \n" +
                    "6.Sắp xếp giảm dần theo giá: \n" +
                    "7.Sắp xếp tăng dần theo giá: \n" +
                    "8. Thoát: ");
            System.out.println("Chọn mục bạn muốn: ");
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    System.out.println("Nhập Id: ");
                    int id = Integer.parseInt(scanner.nextLine());
                    System.out.println("Nhập name: ");
                    String name = scanner.nextLine();
                    System.out.println("Nhập giá: ");
                    int price = Integer.parseInt(scanner.nextLine());
                    Product product = new Product(id, name, price);
                    productManagerService.add(product);
                    break;
                case 2:
                    productManagerService.display();
                    break;
                case 3:
                    System.out.println("Nhập id: ");
                    int oldId = Integer.parseInt(scanner.nextLine());
                    Product c = productManagerService.findById(oldId);
                    if (c != null) {
                        System.out.println("Nhập sản phẩm mới: ");
                        String newName = scanner.nextLine();
                        System.out.println("Nhập giá sản phẩm mới: ");
                        int newPrice = Integer.parseInt(scanner.nextLine());
                        c.setName(newName);
                        c.setPrice(newPrice);
                        productManagerService.update(c);
                    } else {
                        System.out.println("Không tồn tại: ");
                    }
                    break;
                case 4:
                    System.out.println("Nhập id: ");
                    int oldId2 = Integer.parseInt(scanner.nextLine());
                    productManagerService.removeById(oldId2);
                    break;
                case 5:
                    System.out.println("Nhập tên sản phẩm để tìm kiếm: ");
                    String name2 = scanner.nextLine();
                    productManagerService.searchName(name2);
                    break;
                case 6:
                    productManagerService.sortAscending();
                    break;
                case 7:
                    productManagerService.sortDescending();
                    break;
                case 8:
                    System.exit(1);

            }
        } while (true);

    }
}
