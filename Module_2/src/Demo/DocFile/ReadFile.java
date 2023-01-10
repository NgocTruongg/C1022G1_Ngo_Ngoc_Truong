package Demo.DocFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("D:\\Codegym\\C1022G1_Ngo_Ngoc_Truong\\Module_2\\src\\Demo\\DocFile\\text.csv");
        Scanner sc = new Scanner(file);
        if (sc.hasNextLine()) {
            String line = sc.nextLine();
            System.out.println(line);
        }
//        hasNextLine : đọc 1 dòng
//        hasNext: đọc 1 từ
    }
}
