package Demo.ReadToFile;

import java.io.*;

public class ReadToFile {
    public static void main(String[] args) {
        File file = new File("src\\Demo\\ReadToFile\\text.cvs");

        try {
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String line = "";
            while (true) {
                line = br.readLine();
                if (line == null) {
                    break;
                }
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
