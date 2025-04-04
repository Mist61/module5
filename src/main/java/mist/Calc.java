package mist;

public class Calc {

    public double multiply(double a, double b) {
        return a * b;
    }

    public double addition(double a, double b) {
        return a + b;
    }

    public double division(double a, double b) {
        if (b == 0) {
            return -1;
        }
        return a / b;
    }

    public double subtraction(double a, double b) {
        return a - b;
    }

}
