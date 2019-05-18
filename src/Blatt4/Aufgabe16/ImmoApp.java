package Blatt4.Aufgabe16;

public class ImmoApp {
    public static void main(String[] args) {
        try {
            Grundstück gs = new Grundstück(500000, 1000);
            System.out.println(gs.getSquareMeterPrice());
        } catch(IllegalPriceException | IllegalSizeException e) {
            if(e instanceof IllegalPriceException) {
                System.out.println(e.getMessage());
            } else {
                e.printStackTrace();
            }
        }

        try {
            Appartment a = new Appartment(450000, 150);
            System.out.println(a.getSquareMeterPrice());
        } catch (IllegalSizeException | IllegalPriceException e) {
            if(e instanceof IllegalPriceException) {
                System.out.println(e.getMessage());
            } else {
                e.printStackTrace();
            }
        }
    }
}
