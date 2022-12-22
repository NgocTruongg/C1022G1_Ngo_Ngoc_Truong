package Ss16_IO_TextFile.Thuc_hanh.MaximumValueWriteFile;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile {
    public List<Integer> readFile(String filePath) {
        List<Integer> number = new ArrayList<>();
        try {
            File file = new File(filePath);

            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = "";
            while ((line = br.readLine()) != null) {
                number.add(Integer.parseInt(line));
            }
            br.close();

        } catch (Exception e) {
            System.out.println("File không tồn tại hoặc nội dung lỗi !");
        }
        return number;

    }
    public void WriteFiler(String filaPath, int max) {
        try {
            FileWriter fileWriter = new FileWriter(filaPath, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write("Giá trị lớn nhất: " + max);
            bufferedWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
