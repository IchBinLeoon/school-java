import java.util.Arrays;

public class ArraysAufgabe1 {

    public static void main(String[] args) {
        Adressbuch a = new Adressbuch();
        for (int i = 0; i < a.namen.length; i++) {
            System.out.println(a.namen[i] + ": " + a.tel[i]);
        }
        System.out.println(a.findeTel("Boby"));
    }
}

class Adressbuch {

    String[] namen = {"Larry", "Lisa", "Harry"};
    String[] tel = {"111 222", "333 444", "012 345"};

    String findeTel(String name) {
        if(Arrays.asList(this.namen).contains(name)) {
            int index = Arrays.binarySearch(this.namen, name);
            return this.tel[(index < 0) ? -1 : index];
        } else {
            return "unbekannt";
        }
    }

}