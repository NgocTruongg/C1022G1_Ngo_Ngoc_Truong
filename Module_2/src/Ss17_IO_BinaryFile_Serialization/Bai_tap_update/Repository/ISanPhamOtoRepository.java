package Ss17_IO_BinaryFile_Serialization.Bai_tap_update.Repository;

import Ss17_IO_BinaryFile_Serialization.Bai_tap_update.Model.SanPhamOto;

public interface ISanPhamOtoRepository {


    void add (SanPhamOto sanPhamOto);
    void display();

    SanPhamOto searchName(String string);

}
