public class MethodenAufgabe1 {

    public static void main(String[] args) {

        double number = 5.0 / 3.0;
        System.out.println(number);

        double x = 5.0;
        double y = 5.0;

        System.out.println("1.0 + 2.0 = " + add(1.0, 2.0));
        System.out.println(x + " + 3.0 = " + add(x, 3.0));
        x = add(x, 2.0);
        System.out.println(x);

        System.out.println("5.0 - 3.0 = " + sub(5.0, 3.0));
        System.out.println("8.0 - " + y + " = " + sub(8.0, y));
        y = sub(12.0, y);
        System.out.println(y);

        if (x == add(sub(x, y), y)) {
            System.out.println("x==(x-y)+y");
        }

        System.out.println("4.0 * 3.0 = " + mul(4.0, 3.0));
        y = 5.0;
        System.out.println("2.0 * " + y + " = " + mul(2.0, y));
        x = 6.0;
        System.out.println(x + " * " + y + " = " + mul(x, y));
        y = mul(-4.0, 3.0);
        System.out.println(y);
        y = mul(-4.0, -3.0);
        System.out.println(y);


        x = 4.0;
        y = 3.0;
        System.out.println(x + " ^ " + y + " = " + pow((int) x, (int) y));
        System.out.println("3 ^ 5 = " + pow(3, 5));
        System.out.println("3 ^ 0 = " + pow(3, 0));
        System.out.println("3 ^ -2 = " + pow(3, -2));
        System.out.println("2 ^ -4 = " + pow(2, -4));
        y = pow(-4, -3);
        System.out.println(y);

    }

    public static double add(double x, double y) {
        return x + y;
    }

    public static double sub(double x, double y) {
        return x - y;
    }

    public static double mul(double x, double y) {
        double mul = 0;
        if(y < 0 && x < 0) {
            y = Math.abs(y);
            x = Math.abs(x);
        } else if(y < 0) {
            double j = x;
            x = y;
            y = j;
        }
        while (y > 0) {
            mul = add(mul, x);
            y--;
        }
        return mul;
    }

    public static double pow(int basis, int exponent) {
        int pow = basis;
        boolean negativ = false;
        if(exponent == 0) {
            return 1;
        }
        if(exponent < 0) {
            exponent = (int)mul(exponent, -1.0);
            negativ = true;
        }
        while(exponent > 1) {
            pow = (int) mul(pow, basis);
            exponent--;
        }
        if(negativ) {
            return 1.0/pow;
        } else {
            return pow;
        }
    }

}
