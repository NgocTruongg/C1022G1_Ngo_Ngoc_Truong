package util;

import Model.CongNhan;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class RWCongNhan {
    public static final String CONGNHAN_PATH = "src\\data\\congnhan.csv";

    public static List<CongNhan> readFile() {
        List<CongNhan> congNhanList = new ArrayList<>();
        try {
            File file = new File(CONGNHAN_PATH);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String line = "";
            while ((line= bufferedReader.readLine()) != null) {
                String[] arr = line.split(",");
                CongNhan congNhan = new CongNhan(arr[0],arr[1],arr[2],arr[3]);
                congNhanList.add(congNhan);
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return congNhanList;
    }



    public static void writeFile(List<CongNhan> congNhans) {

        try {
            FileWriter fileWriter = new FileWriter(CONGNHAN_PATH);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (CongNhan congNhan :congNhans) {
                bufferedWriter.write(congNhan.getId() + "," + congNhan.getName()+ "," + congNhan.getEmail() +
                       "," +congNhan.getDiaChi() );
            }
            bufferedWriter.newLine();
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void writeAppendFile(List<CongNhan> congNhans) {

        try {
            FileWriter fileWriter = new FileWriter(CONGNHAN_PATH,true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (CongNhan congNhan :congNhans) {
                bufferedWriter.write(congNhan.getId() + "," + congNhan.getName()+ "," + congNhan.getEmail() +
                        "," +congNhan.getDiaChi() );
            }
            bufferedWriter.newLine();
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
