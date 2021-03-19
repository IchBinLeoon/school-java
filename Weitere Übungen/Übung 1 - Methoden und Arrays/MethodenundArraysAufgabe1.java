public class MethodenundArraysAufgabe1 {

    public static void main(String[] agrs) {
        int quersumme = querSumme(123);
        System.out.println(quersumme);
    }

    static int querSumme(int x) {
        int quer = 0;
        String number = String.valueOf(x);
        String[] digits = number.split("");
        for(String digit : digits) {
            int numberInt = Integer.parseInt(digit);
            quer = quer + numberInt;
        }
        return quer;
    }

}