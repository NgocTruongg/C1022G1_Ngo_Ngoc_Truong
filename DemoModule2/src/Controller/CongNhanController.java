package Controller;

import Model.CongNhan;
import Service.CongNhanService;
import Service.ICongNhanService;

import java.util.Scanner;

public class CongNhanController {
    private static ICongNhanService iCongNhanService = new CongNhanService();

    public static void main(String[] args) {
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("1.\t hiển thị danh sách\n" +
                    "2.\t thêm mới nhân viên\n" +
                    "3.\t tìm theo tên\n" +
                    "4.\t xóa theo id\n" +
                    "5.\t chỉnh sửa thông tin\n" +
                    "6.\t thoát");
            int luaChon = Integer.parseInt(scanner.nextLine());
            switch (luaChon) {
                case 1:
                    iCongNhanService.display();
                    break;
                case 2:
                    System.out.println("Id");
                    String id = scanner.nextLine();
                    System.out.println("name");
                    String newName = scanner.nextLine();
                    System.out.println("email");
                    String newEmail = scanner.nextLine();
                    System.out.println("nơi ở");
                    String newNoiO = scanner.nextLine();
                    CongNhan congNhan = new CongNhan(id, newName, newEmail, newNoiO);
                    iCongNhanService.themMoi(congNhan);
                    break;
                case 3:
                    System.out.println("tên cần tìm");
                    String search = scanner.nextLine();
                    iCongNhanService.timKiemTheoTen(search);
                    break;
                case 4:
                    System.out.println("nhập id cần xóa");
                    String oldId = scanner.nextLine();
                    CongNhan congNhan1 = iCongNhanService.timTheoId(oldId);
                    if (congNhan1 != null) {
                        iCongNhanService.xoa(congNhan1);
                    } else {
                        System.out.println("ID không tồn tại !");
                    }
                    break;
                case 5:
                    System.out.println("nhập id nv cần sửa");
                    String oldIdEdit = scanner.nextLine();
                    CongNhan idCongNhan = iCongNhanService.timTheoId(oldIdEdit);
                    if (idCongNhan != null) {
                        System.out.println("sửa id");
                        String newId = scanner.nextLine();
                        System.out.println("sửa name");
                        String newNameEdit = scanner.nextLine();
                        System.out.println("sửa email");
                        String newEmailEdit = scanner.nextLine();
                        System.out.println("sửa địa chỉ");
                        String newDiaChi = scanner.nextLine();

                        idCongNhan.setId(newId);
                        idCongNhan.setName(newNameEdit);
                        idCongNhan.setEmail(newEmailEdit);
                        idCongNhan.setDiaChi(newDiaChi);
                        iCongNhanService.chinhSua(idCongNhan);
                    } else {
                        System.out.println("id không tồn tại !");
                    }
                    break;
                case 6:
                    System.exit(-1);
            }
        } while (true);
    }

}
