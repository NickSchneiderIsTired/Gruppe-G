package Blatt3.Aufgabe11;

import java.util.Random;
import java.util.stream.IntStream;

public class a11c {
    public static void main(String[] args) {
        Random r = new Random();
        IntStream ints = IntStream.generate(() -> r.nextInt(100));
        ints = ints.limit(10);
        ints = ints.sorted();
        ints.forEach(System.out::println);
    }
}
