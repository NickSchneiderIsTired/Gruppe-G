package Blatt3.Aufgabe11;

import java.util.ArrayList;
import java.util.Random;

public class a11a {
    public static void main(String[] args) {
        Random r = new Random();
        int x = r.nextInt(99) + 1;

        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < x; i++) {
            list.add(r.nextInt(10000) + 1);
        }

        list.removeIf(n -> (n % 2) == 1);
        list.forEach(n -> {
            if(n > 900) {
                System.out.println(n);
            }
        });
    }
}
