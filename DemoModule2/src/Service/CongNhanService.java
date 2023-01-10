package Service;

import Model.CongNhan;
import Repository.CongNhanRepository;
import Repository.ICongNhanRepository;

import java.util.List;

public class CongNhanService implements ICongNhanService{
   private static ICongNhanRepository iCongNhanRepository = new CongNhanRepository();

    @Override
    public void display() {
    iCongNhanRepository.display();
    }

 @Override
 public void themMoi(CongNhan congNhan) {
  iCongNhanRepository.themMoi(congNhan);
 }

 @Override
    public void timKiemTheoTen(String ten) {
    iCongNhanRepository.timKiemTheoTen(ten);
    }

    @Override
    public CongNhan timTheoId(String id) {
        return iCongNhanRepository.timTheoId(id);
    }

    @Override
    public void xoa(CongNhan congNhan) {
        iCongNhanRepository.xoa(congNhan);
    }

    @Override
    public void chinhSua(CongNhan congNhan) {
        iCongNhanRepository.chinhSua(congNhan);
    }

}
