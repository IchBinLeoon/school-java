public class MethodenundArraysAufgabe3 {

    public static void main(String[] args) {
        int summe = quadratSumme(new int[] {2, 3, 5});
        System.out.println(summe);
    }

    static int quadratSumme(int[] daten) {
        int summe = 0;
        int quadrat;
        for(int i : daten) {
            quadrat = (int)Math.pow(i, 2);
            summe = summe+quadrat;
        }
        return summe;
    }

}