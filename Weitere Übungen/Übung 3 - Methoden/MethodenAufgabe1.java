public class MethodenAufgabe1 {

    public static void main(String[] args) {
        //Aufgabe 1
        System.out.println("Erzeuge einen neuen Studenten...");
        Student max = new Student();
        max.name = "Max Musterstudent";
        max.matnr = 424242;
        max.studiengang = "Wi-Inf";
        System.out.println("Name: " + max.name + ", Matrikelnummer: " + max.matnr + ", Studiengang: " + max.studiengang);

        //Aufgabe 2
        System.out.println("Erzeuge noch einen neuen Studenten...");
        Student paul = new Student("Paul", 213123, "Informatik", 23);
        System.out.println("Name: " + paul.name + ", Matrikelnummer: " + paul.matnr + ", Studiengang: " + paul.studiengang);

        //Aufgabe 3
        System.out.println("Ausgabe mithilfe von printMe()...");
        Student paul2 = new Student("Paul", 213123, "Informatik", 23);
        paul2.printMe();
    }

}

class Student {

    String name;
    int matnr;
    String studiengang;
    int alter;

    public Student() {
    }

    public Student(String name, int matnr, String studiengang, int alter) {
        this.name = name;
        this.matnr = matnr;
        this.studiengang = studiengang;
        this.alter = alter;
    }

    public void printMe() {
        System.out.println("Student: " + name + "\nMatrikelnummer: " + matnr + "\nStudiengang: " + studiengang + "\nAlter: " + alter);
    }

}