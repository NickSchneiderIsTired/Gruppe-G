package Blatt2.Aufgabe6;

import java.util.Random;

public class a6b {
    public static void main(String[] args) {
        Random random = new Random();
        int x = random.nextInt();
        System.out.println(Integer.toBinaryString(x) + " " +
                Integer.toOctalString(x) + " " +
                Integer.toHexString(x) + " " + x);
        System.out.println(Integer.bitCount(x));
        System.out.println(32 - Integer.highestOneBit(x));
        System.out.println(~x);
    }
}
