public class KlassenundObjekteAufgabe1 {

    public static void main(String[] args ) {
        Person person = new Person("James", 23);
        System.out.println(person.getName() + " " + person.getAlter());
        person.werdeAelter(13);
        System.out.println(person.getName() + " " + person.getAlter());
    }

}

class Person {

    String name;
    int alter;

    public Person(String name, int alter) {
        this.name = name;
        this.alter = alter;
    }

    public String getName(){
        return name;
    }

    public int getAlter() {
        return alter;
    }

    public int werdeAelter(int jahre) {
        this.alter += jahre;
        return this.alter;
    }

}