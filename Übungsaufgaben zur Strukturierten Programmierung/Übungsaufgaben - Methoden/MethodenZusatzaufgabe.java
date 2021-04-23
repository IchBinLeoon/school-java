public class MethodenZusatzaufgabe {

    public static void main(String[] args) {
        int year = Terminal.askInt("Bitte geben Sie eine Jahreszahl ein: ");
        boolean LeapYear = isLeapYear(year);
        if(LeapYear) {
            System.out.println(year + " ist ein Schaltjahr.");
        } else {
            System.out.println(year + " ist kein Schaltjahr.");
        }
    }

    public static boolean isLeapYear(int year) {
        return year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);
    }

}
