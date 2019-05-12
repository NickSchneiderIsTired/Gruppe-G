package Blatt3.Aufgabe9;

public class a9b {
    public static void main(String[] args) {
        Number n = Double.valueOf(13.0);
        System.out.println(((Double) n).isNaN());
        Double d = (Double) n;
        n = null;
        // d Zeigt auf neues Double Objekt
        new Double(123.5);
        // Für alle nicht mehr verwendeten Obj. darf
        // der Platz freigegeben werden
        // n und "new Double(123.5)" werden freigegeben
        System.gc();
    }
}
