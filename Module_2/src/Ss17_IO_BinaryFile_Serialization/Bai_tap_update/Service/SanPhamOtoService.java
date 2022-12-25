package Ss17_IO_BinaryFile_Serialization.Bai_tap_update.Service;

import Ss17_IO_BinaryFile_Serialization.Bai_tap_update.Model.SanPhamOto;

public class SanPhamOtoService implements ISanPhamOtoService {
    ISanPhamOtoService iSanPhamOtoService = new SanPhamOtoService();
    @Override
    public void add(SanPhamOto sanPhamOto) {
        iSanPhamOtoService.add(sanPhamOto);
    }

    @Override
    public void display() {
        iSanPhamOtoService.display();
    }

    @Override
    public void searchName(String string) {
        iSanPhamOtoService.searchName(string);
    }


}
