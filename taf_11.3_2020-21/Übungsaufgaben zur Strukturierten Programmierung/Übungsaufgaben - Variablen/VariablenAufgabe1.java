public class VariablenAufgabe1 {

    public static void main(String[] args) {
        int[] P = {3, 4};
        int[] Q = {5, 2};
        int m = (P[1]-Q[1])/(P[0]-Q[0]);
        int b = -((m*P[0])-(P[1]));
        int zero = -b/m;
        System.out.println("Funktionsgleichung: y=" + m + "x+" +  b);
        System.out.println("Nullstelle: x=" + zero);
    }

}
