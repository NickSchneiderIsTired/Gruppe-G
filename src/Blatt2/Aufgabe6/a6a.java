package Blatt2.Aufgabe6;

import java.util.Random;

import static java.lang.Character.*;

public class a6a {
    public static void main(String[] args) {
        Random random = new Random();
        char c = (char) random.nextInt(255);
        System.out.println(getName(c) + " " + c);
        if(isLowerCase(c)) {
            System.out.println(toUpperCase(c));
        }
    }
}
