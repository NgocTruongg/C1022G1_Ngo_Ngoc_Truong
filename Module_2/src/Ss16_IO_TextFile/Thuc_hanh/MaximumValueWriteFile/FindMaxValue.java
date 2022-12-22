package Ss16_IO_TextFile.Thuc_hanh.MaximumValueWriteFile;

import java.util.ArrayList;
import java.util.List;

public class FindMaxValue {
    public static int finMax(List<Integer> number) {
        int max = number.get(0);
        for (int i = 0; i < number.size(); i++) {
            if (max < number.get(i)) {
                max = number.get(i);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
        List<Integer> number = readAndWriteFile.readFile("number.txt");
        int maxValue = finMax(number);
        readAndWriteFile.WriteFiler("number.txt", maxValue);
    }
}
