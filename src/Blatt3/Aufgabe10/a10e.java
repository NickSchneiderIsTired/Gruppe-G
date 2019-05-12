package Blatt3.Aufgabe10;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

public class a10e {
    public static void main(String[] args) {
        Random r = new Random();
        int x = r.nextInt(99) + 1;
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < x; i++) {
            set.add(r.nextInt(1000) + 1);
        }

        if(x % 2 == 1) {
            System.out.println("Die Anzahl der Elemente ist ungerade");
        } else {
            System.out.println("Die Anzahl der Elemente ist gerade");
        }

        int a = 500;
        if(set.contains(a)) {
            System.out.println("500 vorhanden");
        } else {
            System.out.println("500 nicht vorhanden");
        }

        int max = 0;
        Iterator<Integer> iter = set.iterator();
        while(iter.hasNext()) {
            int next = iter.next();
            if(next > max) {
                max = next;
            }
            iter.remove();
        }
        System.out.println(max);
    }
}
