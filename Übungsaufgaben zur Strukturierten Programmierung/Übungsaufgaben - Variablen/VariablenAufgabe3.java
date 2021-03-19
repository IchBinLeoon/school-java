public class VariablenAufgabe3 {

    public static void main(String[] args) {
        int EinkaufPC = 600;
        int VerkaufPC = 800;
        int Umsatz = 30*VerkaufPC;
        int Ausgaben = 30*EinkaufPC;
        int Gewinn = Umsatz-Ausgaben;
        double MwSt = VerkaufPC/1.19;
        double AbMwSt = 30*(MwSt);
        System.out.println("Umsatz: " + Umsatz);
        System.out.println("Gewinn: " + Gewinn);
        System.out.println("Mehrwertsteuer pro PC: " + MwSt);
        System.out.println("abzuführende Mehrwertsteuer aller PC's: " + AbMwSt);
    }

}
