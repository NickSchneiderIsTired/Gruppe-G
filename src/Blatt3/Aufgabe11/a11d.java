package Blatt3.Aufgabe11;

import java.util.ArrayList;
import java.util.Random;

public class a11d {
    public static void main(String[] args) {
        Random r = new Random();
        int x = r.nextInt(10000) + 1;
        System.out.println(x);
        //Absolut unnötig komplizierte Lösung
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 1; i <= x; i++) {
            list.add(i);
        }

        list
                .stream()
                .filter(n -> (x % n) == 0)
                .forEach(System.out::println);
    }
}
