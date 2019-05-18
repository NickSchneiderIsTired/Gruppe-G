package Blatt4.Aufgabe15;

public class TaskApp {
    public static void main(String[] args) {
        Task t = new Task("Laufen");
        t.setPrio(2);
        t.printTask();

        Task t2 = new Task("Uebungsblatt", 5);
        System.out.println(t2.toString());

        Task t3 = new Task("Einkaufen", 0);
        System.out.println(t3.toString());

        Task t4 = new Task("einkaufen", 3);
        System.out.println(t4.equals(t3));
    }
}
