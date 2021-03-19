import java.util.Scanner;

public class MethodenAufgabe2 {

    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        int year = Scanner.nextInt();
        System.out.println("Schaltjahr: " + isLeapYear(year));
    }

    public static boolean isLeapYear(int year) {
        boolean isLeap = false;
        if(year%4==0) {
            if(year%100==0) {
                if(year%400==0) {
                    isLeap = true;
                }
            } else {
                isLeap = true;
            }
        }
        return isLeap;
    }

}
