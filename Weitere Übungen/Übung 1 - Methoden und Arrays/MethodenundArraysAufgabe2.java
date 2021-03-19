public class MethodenundArraysAufgabe2 {

    public static void main(String[] args) {
        int anzahl = zaehleGerade(new int[] {2, 3, 5});
        System.out.println(anzahl);
    }

    static int zaehleGerade(int[] daten) {
        int gerade = 0;
        for(int i : daten) {
            if(i%2==0) {
                gerade++;
            }
        }
        return gerade;
    }

}