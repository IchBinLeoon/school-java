import java.util.Arrays;

public class MethodenundArraysAufgabe4 {

    public static void main(String[] args) {
        int[] neu = verschiebeLinks(new int[] {6, 2, 5, 3});
        System.out.println(Arrays.toString(neu));
    }

    static int[] verschiebeLinks(int[] daten) {
        int[] neu = new int[daten.length];
        if (daten.length != 0) {
            if (daten.length - 1 >= 0) System.arraycopy(daten, 1, neu, 0, daten.length - 1);
            neu[neu.length - 1] = daten[0];
        }
        return neu;
    }

}