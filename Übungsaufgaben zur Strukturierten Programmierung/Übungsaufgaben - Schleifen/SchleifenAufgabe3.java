public class SchleifenAufgabe3 {

    public static void main(String[] args) {
        int six = 0;
        for(int i = 1; i <= 6000; i++) {
            int rand = (int)((Math.random()) * 6) + 1;
            if(rand == 6) {
                six++;
            }
        }
        System.out.println("Gewürfelten 6er: " + six);
    }

}
