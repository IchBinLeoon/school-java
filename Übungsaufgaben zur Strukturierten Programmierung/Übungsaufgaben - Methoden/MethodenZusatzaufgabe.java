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
