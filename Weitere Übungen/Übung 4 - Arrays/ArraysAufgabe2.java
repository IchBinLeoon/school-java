public class ArraysAufgabe2 {

    public static void main(String[] args) {
        Robot r1 = new Robot();
        r1.name = "stormy";
        r1.stellDichVor();
        r1.tschuess();
    }

}

class Robot {

    String name;

    void stellDichVor() {
        System.out.println("Hallo, ich heiße " +  this.name);
    }

    void sagWetter() {
        String[] list = {"Das Wetter wird gut.", "Bald gibt es Regen...", "Ich kann schon Wolken sehen."};
        System.out.println(list[(int)((Math.random()) * 3)]);
    }

    void tschuess() {
        System.out.println(this.name + " sagt auf Wiedersehen!");
    }

}