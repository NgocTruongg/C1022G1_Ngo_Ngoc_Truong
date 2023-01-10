package Repository;

import Model.CongNhan;
import util.RWCongNhan;

import java.util.ArrayList;
import java.util.List;

public class CongNhanRepository implements ICongNhanRepository {
    List<CongNhan> congNhanList = new ArrayList<>();

    @Override
    public void display() {
        congNhanList = RWCongNhan.readFile();
        for (CongNhan congNhan : congNhanList) {
            System.out.println(congNhan);
        }
    }

    @Override
    public void themMoi(CongNhan congNhan) {
        congNhanList = new ArrayList<>();
        congNhanList.add(congNhan);
        RWCongNhan.writeAppendFile(congNhanList);
        congNhanList.clear();

    }


    @Override
    public void timKiemTheoTen(String ten) {
        congNhanList = RWCongNhan.readFile();
        for (int i = 0; i < congNhanList.size(); i++) {
            if (congNhanList.get(i).getName().contains(ten)) {
                System.out.println(congNhanList.get(i));
            }
        }
    }

    @Override
    public CongNhan timTheoId(String id) {
        congNhanList = RWCongNhan.readFile();
        for (int i = 0; i < congNhanList.size(); i++) {
            if (congNhanList.get(i).getId().equals(id)) {
                return congNhanList.get(i);
            }
        }
        return null;
    }

    @Override
    public void xoa(CongNhan congNhan) {
        congNhanList.remove(congNhan);
        RWCongNhan.writeFile(congNhanList);
        congNhanList.clear();
    }

    @Override
    public void chinhSua(CongNhan congNhan) {
        congNhanList = RWCongNhan.readFile();
        for (int i = 0; i < congNhanList.size(); i++) {
            if (congNhanList.get(i).getId().equals(congNhan.getId())) {
                congNhanList.set(i, congNhan);
                break;
            }
        }
        RWCongNhan.writeFile(congNhanList);
    }
}
