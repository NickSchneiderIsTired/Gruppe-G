package Blatt3.Aufgabe11;


import java.util.ArrayList;

public class a11e {
    public static void main(String[] args) {
        ArrayList<Integer> values = new ArrayList<>();
        for(int i = 0; i < 10; i++) {
            values.add(2 * i + 1);
        }

        int sum = values
                .stream()
                .mapToInt(s -> s)
                .sum();

        System.out.println(sum);
    }
}
