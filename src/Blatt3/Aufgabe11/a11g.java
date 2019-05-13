package Blatt3.Aufgabe11;

import java.util.Arrays;

public class a11g {
    public static void main(String[] args) {
        Arrays.stream(args).filter(s -> s.length() > 0).forEach(s -> {
            s
                    .toUpperCase()
                    .replaceAll("[^a-zA-Z0-9]", "")
                    .replaceAll("\\s", "");
            System.out.println(s);
        });

    }
}
