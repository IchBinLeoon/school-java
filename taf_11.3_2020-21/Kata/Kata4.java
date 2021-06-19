import java.util.Scanner;

public class Kata4 {

    public static void main(String[] args) {
        String str = new Scanner(System.in).nextLine();
        if(str.contains("Leon")) System.out.println(str.split(" ").length);
        else System.out.println("-1");
    }

}
