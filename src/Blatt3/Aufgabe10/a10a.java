package Blatt3.Aufgabe10;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class a10a {
    public static void main(String[] args) {
        Random r = new Random();
        int x = r.nextInt(99) + 1;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < x; i++) {
            list.add(r.nextInt(1000) + 1);
        }

        if(x % 2 == 1) {
            System.out.println(list.get(x / 2));
        } else {
            System.out.println("Die Anzahl der Elemente ist gerade");
        }

        int a = 500;
        if(list.contains(a)) {
            System.out.println(list.indexOf(a));
        } else {
            System.out.println("500 nicht vorhanden");
        }

        int max = 0;
        Iterator<Integer> iter = list.iterator();
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
