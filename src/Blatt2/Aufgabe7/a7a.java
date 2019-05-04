package Blatt2.Aufgabe7;

public class a7a {
    public static void main(String[] args) {
        String s = "";
        for(int i = 0; i < args.length; i++) {
            s += args[i];
        }
        String[] strings = s.split("-");
        for(int i = 0; i < strings.length; i++) {
            if(strings[i].length() != 0) {
                System.out.println(strings[i] + "\n");
            }
        }
    }
}
