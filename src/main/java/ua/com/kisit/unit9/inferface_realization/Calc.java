package ua.com.kisit.unit9.inferface_realization;


public class Calc implements Calculation {

    @Override
    public double add(double a, double b) {
        return a+b;
    }

    @Override
    public double sub(double a, double b) {
        return a-b;
    }

//    @Override
//    public double div(double a, double b) {
//        return Calculation.super.div(a, b);
//    }
}
