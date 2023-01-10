package Bai_3.Controller;

import Bai_3.Model.NganHang;
import Bai_3.Service.INganHangService;
import Bai_3.Service.NganHangService;

import java.util.Scanner;

public class NganHangController {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        INganHangService iNganHangService = new NganHangService();
        do {
            System.out.println("Hệ thống quản lý \n" +
                    "1.\t Hiển thị danh sách\n" +
                    "2.\t Đăng kí thông tin\n" +
                    "3.\t Thoát\n" +
                    "\t---- Mời bạn lựa chọn ----");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    iNganHangService.hienThi();
                    break;
//                case 2:
//
//                    System.out.println("Nhập số thứ tự");
//                    String thuTu = sc.nextLine();
//                    System.out.println("Nhập mã sổ tiết kiệm");
//                    String maSo = sc.nextLine();
//                    System.out.println("Tên khách hàng");
//                    String tenKH = sc.nextLine();
//                    System.out.println("Nhập số tiền ");
//                    String soTien = sc.nextLine();
//
//                    String kiHan ="";
//                    do {
//                    System.out.println("Nhập kì hạn:\n" +
//                            "1.\t vô thời hạn\n" +
//                            "2.\t 1 tháng\n" +
//                            "3.\t 3 tháng\n" +
//                            "4.\t 6 tháng\n" +
//                            "5.\t 1 năm.");
//
//                    kiHan = sc.nextLine();
//                    int choiceKiHan = Integer.parseInt(sc.nextLine());
//                    switch (choiceKiHan) {
//                        case 1:
//                            kiHan = "vô thời hạn";
//                        case 2:
//                            kiHan = "1 tháng";
//                        case 3:
//                            kiHan = "3 tháng";
//                        case 4:
//                            kiHan = "6 tháng";
//                        case 5:
//                            kiHan = "1 năm";
//                    }
//                    break;
//                    }while (true);
//                    System.out.println("Lãi suất");
//                    String laiSuat = sc.nextLine();
//                    NganHang nganHang = new NganHang(thuTu,maSo,tenKH,soTien,kiHan,laiSuat);
//                    iNganHangService.dangKi(nganHang);
//
//
//                    break;
                case 3:
                    System.exit(0);
            }
        }while (true);
    }

}
