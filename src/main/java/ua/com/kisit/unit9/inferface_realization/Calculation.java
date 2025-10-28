package ua.com.kisit.unit9.inferface_realization;

public interface Calculation {

    double x = 0;

    double add(double a, double b);
    double sub(double a, double b);
    static double mul(double a, double b){
        return a * b;
    }

    default double div(double a, double b){
        return (b!=0)? a / b : 0;
    };

}
