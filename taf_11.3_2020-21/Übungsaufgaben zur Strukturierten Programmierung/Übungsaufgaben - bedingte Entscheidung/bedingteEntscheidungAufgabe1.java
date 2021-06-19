import java.util.Scanner;

public class bedingteEntscheidungAufgabe1 {

    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        int a = Scanner.nextInt();
        int b = Scanner.nextInt();
        int c = Scanner.nextInt();
        if(a>b && a>c) {
            System.out.println("Größte Zahl:" + a);
        } else if(b>a && b>c) {
            System.out.println("Größte Zahl:" + b);
        } else if(c>a && c>b) {
            System.out.println("Größte Zahl:" + c);
        }
    }

}
