public class KlassenundObjekteAufgabe2 {

    public static void main(String[] args) {
        Rennschnecke schnecke = new Rennschnecke("Fridolin", "Limax maximus", 110);
        System.out.println(schnecke.toString());
    }

}

class Rennschnecke {

    String name;
    String rasse;
    float maxspeed;
    float strecke;

    public Rennschnecke(String name, String rasse, int maxspeed) {
        this.name = name;
        this.rasse = rasse;
        this.maxspeed = maxspeed;
        this.strecke = 0;
    }

    void krieche() {
        strecke += (int)((Math.random()) * maxspeed) + 1;
    }

    public String toString() {
        return name + "" + rasse + ":" + maxspeed + "@" + strecke;
    }

}