import java.util.Scanner;

public class MethodenAufgabe2 {

    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        int year = Scanner.nextInt();
        System.out.println(isLeapYear(year));
    }

    public static boolean isLeapYear(int year) {
        return year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);
    }

}
