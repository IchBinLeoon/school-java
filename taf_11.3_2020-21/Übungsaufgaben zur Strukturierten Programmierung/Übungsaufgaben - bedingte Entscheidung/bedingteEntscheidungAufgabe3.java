import java.util.Scanner;

public class bedingteEntscheidungAufgabe3 {

    public static void main(String[] args) {
        System.out.println("Noten mit Leerzeichen getrennt eingeben:");
        Scanner Scanner = new Scanner(System.in).useDelimiter("[,\\s+]");
        String input = Scanner.nextLine();
        String[] grades = input.split(" ");
        int one = 0;
        int two = 0;
        int three = 0;
        int four = 0;
        int five = 0;
        int six = 0;
        int unknown = 0;
        double average = 0;
        for(String i : grades) {
            int grade = Integer.parseInt(i);
            if(grade>6 || grade<=0) {
                unknown++;
            } else {
                if (grade == 1) {
                    one++;
                } else if (grade == 2) {
                    two++;
                } else if (grade == 3) {
                    three++;
                } else if (grade == 4) {
                    four++;
                } else if (grade == 5) {
                    five++;
                } else {
                    six++;
                }
                average = average + grade;
            }
        }
        average = average/(grades.length-unknown);
        System.out.println("Klassenspiegel:");
        System.out.println("1 | " + one);
        System.out.println("2 | " + two);
        System.out.println("3 | " + three);
        System.out.println("4 | " + four);
        System.out.println("5 | " + five);
        System.out.println("6 | " + six);
        System.out.println("- | " + unknown);
        System.out.println("Ø = " + average);
        if(average>4.5) {
            System.out.println("Die Klassenarbeit muss wiederholt werden.");
        } else {
            System.out.println("Die Klassenarbeit kann gewertet werden.");
        }
    }

}
