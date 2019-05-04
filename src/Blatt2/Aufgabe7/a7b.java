package Blatt2.Aufgabe7;

public class a7b {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder();
        for(int i = 0; i < args.length; i++) {
            s.insert(0, args[0]);
        }
        s.reverse();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '-') {
                s.setCharAt(i, '_');
            }
        }
        System.out.println(s);
    }
}
