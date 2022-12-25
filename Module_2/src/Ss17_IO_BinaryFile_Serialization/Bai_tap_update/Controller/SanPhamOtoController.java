package Ss17_IO_BinaryFile_Serialization.Bai_tap_update.Controller;

import Ss17_IO_BinaryFile_Serialization.Bai_tap_update.Model.SanPhamOto;
import Ss17_IO_BinaryFile_Serialization.Bai_tap_update.Repository.ISanPhamOtoRepository;
import Ss17_IO_BinaryFile_Serialization.Bai_tap_update.Repository.SanPhamOtoRepository;

import java.util.Scanner;

public class SanPhamOtoController {
    public static void main(String[] args) {

        ISanPhamOtoRepository sanPhamOtoRepository = new SanPhamOtoRepository();
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("--------Menu--------");
            System.out.println("1. Thêm sản Phẩm: \n" +
                    "2. Hiển thị danh sách sản phẩm: \n" +
                    "3. Tìm kiếm sản phẩm theo tên: \n" +
                    "4. Thoát:");
            System.out.println("Vui lòng lựa chọn: ");
            int luaChon = Integer.parseInt(sc.nextLine());

            switch (luaChon) {
                case 1:
                    System.out.println("Nhập mã sản phẩm  mới: ");
                    int newId = Integer.parseInt(sc.nextLine());
                    System.out.println("Nhập tên sản phẩm mới");
                    String name1 = sc.nextLine();
                    System.out.println("Nhập hãng SX của sản phẩm: ");
                    String newHangSX = sc.nextLine();
                    System.out.println("Nhập giá sản phẩm mới: ");
                    Double newPrice = Double.parseDouble(sc.nextLine());
                    System.out.println("Nhập mô tả mới: ");
                    String newNote = sc.nextLine();
                    SanPhamOto sanPhamOto = new SanPhamOto(newId, name1, newHangSX, newPrice, newNote);
                    sanPhamOtoRepository.add(sanPhamOto);
                    break;
                case 2:
                    sanPhamOtoRepository.display();
                    break;
                case 3:
                    System.out.println("Nhập tên để tìm sản phẩm: ");
                    String searchName = sc.nextLine();
                    sanPhamOtoRepository.searchName(searchName);
                    break;
                case 4:
                    System.exit(-1);
                default:
                    System.out.println("Vui lòng lựa chọn lại: ");

            }
        }while (true);
    }
}
