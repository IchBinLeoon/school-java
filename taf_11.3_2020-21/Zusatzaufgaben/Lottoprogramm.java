import java.util.Random;
import java.util.stream.IntStream;

public class Lottoprogramm {

    public static void main(String[] args) {

        int[] lottery = new int[7];
        Random random = new Random();

        for(int i = 0; i < lottery.length; i++) {
            int x;
            do {
                x = random.nextInt(49) + 1;
            } while(checkDuplicate(lottery, x));
            lottery[i] = x;
        }

        for(int i : lottery) {
            System.out.print(i + "\t");
        }

    }

    private static boolean checkDuplicate(int[] arr, int key) {
        return IntStream.of(arr).anyMatch(y -> y == key);
    }

}
