import java.util.Arrays;

public class WeitereAufgabenzuListenundSchleifen {

    public static void main(String[] args) {

        // Aufgabe 1
        int[] list1 = {-3,13,-23,33,43};
        for(int i = 0; i < list1.length; i++) list1[i] += 2;

        // Aufgabe 2
        int[] list2 = new int[list1.length];
        for(int i = 0; i < list1.length; i++) list2[i] = list1[i] * 2;

        // Aufgabe 3
        int[] list3 = new int[list1.length];
        for(int i = 0; i < list1.length; i++) list3[i] = Math.abs(list1[i]);

        // Aufgabe 4
        Arrays.sort(list2);
        Arrays.sort(list3);

        // Aufgabe 5
        int[][] array = {list2, list3};
        System.out.println(" |\tA\tB\n------------");
        for(int i = 0; i < array[1].length; i++) System.out.println(i + "|\t" + array[0][i] + "\t" + array[1][i]);

    }

}
