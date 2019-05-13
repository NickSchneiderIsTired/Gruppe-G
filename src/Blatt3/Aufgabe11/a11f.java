package Blatt3.Aufgabe11;

import java.util.stream.IntStream;

public class a11f {
    public static void main(String[] args) {
        int number = 10;
        System.out.println(IntStream.rangeClosed(2, number).reduce(1, (x, y) -> x * y));
    }
}
