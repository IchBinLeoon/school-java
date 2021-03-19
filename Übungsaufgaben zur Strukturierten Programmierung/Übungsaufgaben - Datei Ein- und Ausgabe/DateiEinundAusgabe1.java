import java.io.*;
import java.util.ArrayList;

public class DateiEinundAusgabe1 {

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

        int sum = 0;
        for(String i : lines) {
            sum += Integer.parseInt(i);
        }
        int mul = Integer.parseInt(lines.get(1)) * Integer.parseInt(lines.get(3));
        int sub = Integer.parseInt(lines.get(0)) - Integer.parseInt(lines.get(2));

        FileWriter fw = new FileWriter(PATH);
        try (BufferedWriter bw = new BufferedWriter(fw)) {
            bw.write(String.join(" + ", lines) + " = " + sum);
            bw.newLine();
            bw.write(lines.get(1) + " * " + lines.get(3) + " = " + mul);
            bw.newLine();
            bw.write(lines.get(0) + " - " + lines.get(2) + " = " + sub);
        }

    }

}
