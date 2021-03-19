public class SchleifenAufgabe4 {

    public static void main(String[] args) {
        int versuche = 1;
        int i = (int)((Math.random()) * 6) + 1;
        while(i != 6) {
            versuche++;
            i = (int)((Math.random()) * 6) + 1;
        }
        System.out.println("Versuche: " + versuche);
    }

}
