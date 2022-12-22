package Ss16_IO_TextFile.Bai_tap.ReadFile;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Test {

    public static final String PATH = "D:\\Codegym\\C1022G1_Ngo_Ngoc_Truong\\Module_2\\src\\Ss16_IO_TextFile\\Bai_tap\\ReadFile\\Country.csv";

    public static void main(String[] args) {
        Test.readFile(PATH);
    }
    public static void readFile(String PATH) {
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(PATH);
            bufferedReader = new BufferedReader(fileReader);
            String temp;
            String[] arr;
            Country country;
            while ((temp = bufferedReader.readLine()) != null) {
                arr = temp.split(",");
                int id = Integer.parseInt(arr[0]);
                String code = arr[1];
                String name = arr[2];
                country = new Country(id, code, name);
                System.out.println(country);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                System.out.println("IOException");
            }
        }
    }


}
