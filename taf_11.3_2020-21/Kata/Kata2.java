public class Kata2 {

    public static void main(String[] args) {
        System.out.println(introduceYourself(9999, "IchBinLeoon", 1.90));
    }

    static String introduceYourself(int age, String name, double height) {
        return String.format("Mein Name ist %s. Ich bin %d alt und %.2fm groß.", name, age, height);
    }

}
