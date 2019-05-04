package Blatt2.Aufgabe6;

import java.util.Random;

public class a6c {
    public static void main(String[] args) {
        Random random = new Random();
        double a = Math.random();
        int n = random.nextInt(999);
        double x = Math.pow(a, n);

        System.out.println(Double.isNaN(1/x));
        System.out.println(Double.isInfinite(1/x));

        Double d = x;
        System.out.println((double) d);
        Double e = 1/x;
        System.out.println(e.intValue());
    }
}
