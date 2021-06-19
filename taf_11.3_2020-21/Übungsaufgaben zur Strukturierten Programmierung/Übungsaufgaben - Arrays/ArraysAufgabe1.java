import java.util.Arrays;

public class ArraysAufgabe1 {

    public static void main(String[] args) {

        int[] days = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};
        int[] temperatures = {12, 14, 9, 12, 15, 16, 15, 15, 11, 8, 13, 13, 15, 12};

        int average = 0;
        for(int i : temperatures) average = average + i;
        average = average/temperatures.length;
        System.out.println("Durchschnittstemperatur: " + average);

        int[] sorted = Arrays.copyOf(temperatures, temperatures.length);
        Arrays.sort(sorted);
        System.out.println("Minimale Temperatur: " + sorted[0]);
        System.out.println("Maximale Temperatur: " + sorted[sorted.length-1]);

        int maxDiff = 0;
        int FromDay = 0;
        int ToDay = 0;
        for(int i = 0; i < temperatures.length; i++) {
            int diff = 0;
            if((i + 1) < temperatures.length) {
                if(temperatures[i] < temperatures[i + 1]) {
                    diff = temperatures[i + 1] - temperatures[i];
                } else if(temperatures[i] >= temperatures[i + 1]) {
                    diff = temperatures[i] - temperatures[i + 1];
                }
                if(maxDiff < diff) {
                    maxDiff = diff;
                    FromDay = i+1;
                    ToDay = i+2;
                }
            }
        }
        System.out.println("Größter Temperaturumschwung von Tag " + (FromDay) + " auf Tag " + (ToDay));

        System.out.print("Tag: \t\t\t");
        for(int i : days) {
            System.out.print(i + "\t");
        }
        System.out.println();
        System.out.print("Temperatur: \t");
        for(int i : temperatures) {
            System.out.print(i + "\t");
        }

    }

}
