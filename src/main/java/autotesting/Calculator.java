package autotesting;

public class Calculator {
    public double add(int a, int b) {
        return a + b;
    }

    public double add(String a, String b) {
        int numA = Integer.parseInt(a);
        int numB = Integer.parseInt(b);
        return numA + numB;
    }

    public double multiple(double a, double b) {
        return a * b;
    }

    public double divide(double a, double b) {
        return a / b;
    }

    public double divide(String a, String b) {
        double numA = Integer.parseInt(a);
        double numB = Integer.parseInt(b);
        return numA / numB;
    }

    public double powOperation(double a, double b) {
        return Math.pow(a, b);
    }
}
