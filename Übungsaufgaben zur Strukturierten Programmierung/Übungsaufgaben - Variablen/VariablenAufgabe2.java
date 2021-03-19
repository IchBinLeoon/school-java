public class VariablenAufgabe2 {

    public static void main(String[] args) {
        int r = 4;
        int h = 7;
        double Vk = (1.0/3.0)*Math.PI*Math.pow(r, 2)*h;
        double Ok = (Math.PI*Math.pow(r, 2))+(Math.PI*r*(Math.sqrt(Math.pow(r, 2)+Math.pow(h, 2))));
        double Vz = (Math.PI*Math.pow(r, 2))*h;
        double Oz = 2*Math.PI+r*(r+h)+(Math.PI+Math.pow(r, 2));
        System.out.println("Volumen Kegel: " + Vk);
        System.out.println("Oberfläche Kegel: " + Ok);
        System.out.println("Volumen Zylinder: " + Vz);
        System.out.println("Oberfläche Zylinder: " + Oz);
    }

}
