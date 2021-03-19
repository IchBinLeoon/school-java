import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class DateiEinundAusgabe2 {

    public static void main(String[] args) throws IOException {

        String PATH = "";

        ArrayList<String> lines = new ArrayList<>();

        FileReader fr = new FileReader(PATH);
        try (BufferedReader br = new BufferedReader(fr)) {
            String line;
            while ((line = br.readLine()) != null) {
                lines.add(line);
            }
        }

        Collections.sort(lines);

        FileWriter fw = new FileWriter(PATH);
        try (BufferedWriter bw = new BufferedWriter(fw)) {
            for(String i: lines) {
                bw.write(i);
                bw.newLine();
            }
        }

    }

}
