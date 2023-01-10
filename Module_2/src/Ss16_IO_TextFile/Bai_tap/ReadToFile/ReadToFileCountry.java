package Ss16_IO_TextFile.Bai_tap.ReadToFile;

import java.io.*;

public class ReadToFileCountry {
    public static void main(String[] args) {
        File file = new File("D:\\Codegym\\C1022G1_Ngo_Ngoc_Truong\\Module_2\\src\\Ss16_IO_TextFile\\Bai_tap\\ReadToFile\\Country.csv");
        try {
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String line = "";
            while (true) {
                line = br.readLine();
                if (line == null){
                    break;
                }
                System.out.println(line);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }


}
