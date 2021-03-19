public class ArraysAufgabe2 {

    public static void main(String[] args) {
        double[] potenzen = new double[20];
        for(int i = 0; i < 20; i++) {
            potenzen[i] = Math.pow(2, (i+1));
            System.out.println("2^" + (i+1) + " = " + potenzen[i]);
        }
    }

}
