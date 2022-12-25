package Ss17_IO_BinaryFile_Serialization.Bai_tap_update.Model;

import java.io.Serializable;

public class SanPhamOto implements Serializable {
    private int id;
    private String name;
    private String hangSX;
    private double giaTien;
    private String note;


    public SanPhamOto() {
    }

    public SanPhamOto(int id, String name, String hangSX, double giaTien, String note) {
        this.id = id;
        this.name = name;
        this.hangSX = hangSX;
        this.giaTien = giaTien;
        this.note = note;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHangSX() {
        return hangSX;
    }

    public void setHangSX(String hangSX) {
        this.hangSX = hangSX;
    }

    public double getGiaTien() {
        return giaTien;
    }

    public void setGiaTien(double giaTien) {
        this.giaTien = giaTien;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return "SanPhamOto{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", hangSX='" + hangSX + '\'' +
                ", giaTien=" + giaTien +
                ", note='" + note + '\'' +
                '}';
    }
}
