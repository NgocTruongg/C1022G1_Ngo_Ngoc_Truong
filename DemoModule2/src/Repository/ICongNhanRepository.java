package Repository;

import Model.CongNhan;

public interface ICongNhanRepository {

    void display();
    void themMoi(CongNhan congNhan);
    void timKiemTheoTen(String ten);
    CongNhan timTheoId (String id);
    void xoa(CongNhan congNhan);
    void chinhSua(CongNhan congNhan);
}
