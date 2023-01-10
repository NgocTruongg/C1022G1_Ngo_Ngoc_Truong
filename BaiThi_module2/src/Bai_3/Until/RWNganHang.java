package Bai_3.Until;

import Bai_3.Model.NganHang;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class RWNganHang {

    public static final String SO_TIET_KIEM_PATH = "src\\Bai_3\\Data\\sotietkiem.csv";

    public List<NganHang> reader() {
        List<NganHang> hangList = new ArrayList<>();
        try {
            File file = new File(SO_TIET_KIEM_PATH);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String line = "";
            try {
                while ((line = bufferedReader.readLine()) != null) {
                    String[] arr = line.split(",");
                    NganHang nganHang = new NganHang();
                    hangList.add(nganHang);
                }
                bufferedReader.close();

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return hangList;
    }

    public static void write(List<NganHang> nganHangList) {
        try {
            FileWriter fileWriter = new FileWriter(SO_TIET_KIEM_PATH);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            for (NganHang nganHang : nganHangList) {
                bufferedWriter.write(nganHang.getMaSo() + "," + nganHang.getSoTien() +"," +nganHang.getLaiSuat() + "," +
                        nganHang.getKyHan() + "," + nganHang.getTenKH());
            }
//                bufferedWriter.write(nganHang.getSoThuTu() + "," + nganHang.getMaSo() + "," + nganHang.getTenKH() +
//                        "," + nganHang.getSoTien() + "," + nganHang.getKyHan()) + "," + nganHang.getLaiSuat();
//            }
            bufferedWriter.newLine();
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
