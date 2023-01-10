package Bai_3.Service;

import Bai_3.Model.NganHang;
import Bai_3.Repository.INganHangRepository;
import Bai_3.Repository.NganHangRepository;

public class NganHangService implements INganHangService {
            INganHangRepository iNganHangRepository = new NganHangRepository();

    @Override
    public void hienThi() {
        iNganHangRepository.hienThi();
    }

    @Override
    public void dangKi(NganHang nganHang) {
        iNganHangRepository.dangKi(nganHang);
    }
}
