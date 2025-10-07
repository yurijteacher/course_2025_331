package ua.com.kisit.unit5;

public class Calculation {

        static final double PI = 3.14;
        static double x = 3;
        static double y = 5;

    public static void main(String[] args) {

        System.out.println(x+y);

        add(10,5);
        double c = subtract(10,5);
        System.out.println(c);
        // PI++;
        System.out.println(PI);

    }

    static public void add(int a, int b){
        double c = a+b;
        System.out.println(c);
    }

    static public double subtract(int a, int b){
        return a-b;
    }

}
