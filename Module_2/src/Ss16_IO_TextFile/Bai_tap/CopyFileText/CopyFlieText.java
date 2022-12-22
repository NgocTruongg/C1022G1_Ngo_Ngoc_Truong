package Ss16_IO_TextFile.Bai_tap.CopyFileText;

import java.io.*;

public class CopyFlieText {
    public static void readFile () {
        try {
            FileReader fr = new FileReader("D:\\Codegym\\C1022G1_Ngo_Ngoc_Truong\\Module_2\\src\\Ss16_IO_TextFile\\Bai_tap\\CopyFileText\\FileText.csv");
            BufferedReader bf = new BufferedReader(fr);
            int count = 0;
            int readChar;
            FileWriter fileWriter = new FileWriter("D:\\Codegym\\C1022G1_Ngo_Ngoc_Truong\\Module_2\\src\\Ss16_IO_TextFile\\Bai_tap\\CopyFileText\\FileText2.csv");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            while ((readChar = bf.read()) != -1){
                count++;
                bufferedWriter.write(readChar);
            }
            System.out.println("Số kí tự được sao chép: " + count);
            bufferedWriter.flush();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        readFile();
    }
}
