package Ss17_IO_BinaryFile_Serialization.Bai_tap_update.Repository;

import Ss17_IO_BinaryFile_Serialization.Bai_tap_update.Model.SanPhamOto;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class SanPhamOtoRepository implements ISanPhamOtoRepository {

    static List<SanPhamOto> sanPhamOtoList = new ArrayList<>();


    static {
        sanPhamOtoList.add(new SanPhamOto(1, "ip6", "apple", 3000, "Black"));
        sanPhamOtoList.add(new SanPhamOto(2, "ip7", "apple", 4000, "white"));
        sanPhamOtoList.add(new SanPhamOto(1, "ip8", "apple", 4500, "red"));
        sanPhamOtoList.add(new SanPhamOto(1, "ipX", "apple", 5000, "Blue"));
        sanPhamOtoList.add(new SanPhamOto(1, "ip11", "apple", 6000, "Black"));
        sanPhamOtoList.add(new SanPhamOto(1, "ip12", "apple", 9000, "yellow"));
        writeObject(sanPhamOtoList);
    }

    private static final String FILE_PATH = "D:\\Codegym\\C1022G1_Ngo_Ngoc_Truong\\Module_2\\src\\Ss17_IO_BinaryFile_Serialization\\Bai_tap_update\\Controller\\iphone.dat";

    public static void writeObject(List<SanPhamOto> sanPhamOto) {
        FileOutputStream fos = null;
        ObjectOutputStream oss = null;
        try {
            fos = new FileOutputStream(FILE_PATH);
             oss = new ObjectOutputStream(fos);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {

        }try {
            oss.writeObject(sanPhamOto);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                oss.close();;
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
//    public static SanPhamOto readObject() {
//        FileInputStream fis = null;
//        try {
//            fis = new FileInputStream(FILE_PATH);
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
//        try {
//            ObjectInputStream ois = new ObjectInputStream(fis);
//            ois.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        return null;
//    }

    public static List<SanPhamOto> readObjectList() {
        FileInputStream fileInputStream = null;
        ObjectInputStream objectInputStream = null;
        try {
            fileInputStream = new FileInputStream(FILE_PATH);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            objectInputStream = new ObjectInputStream(fileInputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            List<SanPhamOto> sanPhamOtoList = (List<SanPhamOto>) objectInputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                objectInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return sanPhamOtoList;
    }


    @Override
    public void add(SanPhamOto sanPhamOto) {
        List<SanPhamOto> resultList = readObjectList();
        resultList.add(sanPhamOto);
        writeObject(resultList);
    }

    @Override
    public void display() {
        List<SanPhamOto> resultList = readObjectList();
        for (SanPhamOto c : resultList) {
            System.out.println(c);
        }
        writeObject(resultList);
    }

    @Override
    public SanPhamOto searchName(String string) {
        List<SanPhamOto> resultList = readObjectList();
        for (SanPhamOto c : resultList) {
            if (c.getName().contains(string)) {
                writeObject(resultList);
                return c;
            }
        }

        return null;
    }


}
