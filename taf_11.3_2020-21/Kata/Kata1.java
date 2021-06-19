public class Kata1 {

    public static void main(String[] args) {
        Methode(new int[] {1, 2, 3, 4, 5, 6});
    }

    static void Methode(int[] arr) {
        for(int i : arr) if(i % 2 == 0) System.out.println(i);
    }

}
