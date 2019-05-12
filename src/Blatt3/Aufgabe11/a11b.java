package Blatt3.Aufgabe11;

import java.util.Random;
import java.util.stream.IntStream;

public class a11b {
    public static void main(String[] args) {
        Random r = new Random();
        IntStream intstream = r.ints(500);
        intstream = intstream.limit(10);
        intstream = intstream.sorted();
        intstream.forEach(s -> System.out.println(s));
    }
}
