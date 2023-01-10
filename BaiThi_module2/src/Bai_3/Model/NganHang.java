package Bai_3.Model;

public class NganHang {
    private String maSo;
    private String soTien;
    private String kyHan;
    private String laiSuat;
    private String maKH;
    private String soThuTu;
    private String tenKH;


    public NganHang() {
    }

    public NganHang(String maSo, String soTien, String kyHan, String laiSuat, String maKH) {
        this.maSo = maSo;
        this.soTien = soTien;
        this.kyHan = kyHan;
        this.laiSuat = laiSuat;
        this.maKH = maKH;
    }
    public void dangKiSTK(String soThuTu, String maSo, String tenKH, String soTien, String kyHan, String laiSuat) {
        this.soThuTu = soThuTu;
        this.maSo = maSo;
        this.tenKH = tenKH;
        this.soTien = soTien;
        this.kyHan = kyHan;
        this.laiSuat = laiSuat;

    }

    public String getMaSo() {
        return maSo;
    }

    public void setMaSo(String maSo) {
        this.maSo = maSo;
    }

    public String getSoTien() {
        return soTien;
    }

    public void setSoTien(String soTien) {
        this.soTien = soTien;
    }

    public String getKyHan() {
        return kyHan;
    }

    public void setKyHan(String kyHan) {
        this.kyHan = kyHan;
    }

    public String getLaiSuat() {
        return laiSuat;
    }

    public void setLaiSuat(String laiSuat) {
        this.laiSuat = laiSuat;
    }

    public String getMaKH() {
        return maKH;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    public String getSoThuTu() {
        return soThuTu;
    }

    public void setSoThuTu(String soThuTu) {
        this.soThuTu = soThuTu;
    }

    public String getTenKH() {
        return tenKH;
    }

    public void setTenKH(String tenKH) {
        this.tenKH = tenKH;
    }

    @Override
    public String toString() {
        return "maSo=" + soThuTu + '\'' +
                ", soTien=" + maSo + '\'' +
                ", kyHan=" + tenKH + '\'' +
                ", laiSuat=" + soTien + '\'' +
                ", soThuTu=" + kyHan + '\'' +
                ", tenKH=" + laiSuat + '\'' +
                '}';
    }
}