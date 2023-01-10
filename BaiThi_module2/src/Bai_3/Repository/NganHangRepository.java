package Bai_3.Repository;

import Bai_3.Model.NganHang;
import Bai_3.Until.RWNganHang;

import java.util.ArrayList;
import java.util.List;

public class NganHangRepository implements INganHangRepository {
   public static List<NganHang> nganHangList = new ArrayList<>();
    RWNganHang nganHang = new RWNganHang();
    static {
        nganHangList.add(new NganHang("ms1", "10000", "1 tháng", "2%", "KH1"));
        nganHangList.add(new NganHang("ms2", "20000", "3 tháng", "2%", "KH4"));
        nganHangList.add(new NganHang("ms3", "30000", "6 tháng", "2%", "KH3"));
        nganHangList.add(new NganHang("ms4", "40000", "1 năm", "2%", "KH2"));
    }


    @Override
    public void hienThi() {
        for (NganHang nganHang: nganHangList) {
            System.out.println(nganHang);
        }

    }

    @Override
    public void dangKi(NganHang nganHang) {
        nganHangList = new ArrayList<>();
        nganHangList.add(nganHang);
        RWNganHang.write(nganHangList);
        nganHangList.clear();

    }
}
