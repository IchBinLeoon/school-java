public class Kata3 {

    public static void main(String[] args) {

        for(int i = 1; i <= 100; i++) {
            if(i % 3 == 0 && i % 5 == 0) System.out.println("foobar");
            else if(i % 3 == 0) System.out.println("tDrei");
            else if(i % 5 == 0) System.out.println("tFuenf");
            else System.out.println(i);
        }

    }

}
