package Blatt6.Aufgabe23und24;

import Blatt4.Aufgabe14.IllegalInputException;

public class ContactApp {
    public static void main(String[] args) {
        Contact c = new Contact();
        System.out.println(c.getFavorite() + " " + c.getRemark());
        c.setFavorite(true);
        c.setRemark("Diese Aufgabe is bescheuert");
        System.out.println(c.getFavorite() + " " + c.getRemark());
        try {
            Telephone t = new Telephone(TelephoneType.PRIVATE, "7483701");
            c.addTelephone(t);
            System.out.println(c.getTelephone(0));
        } catch (IllegalInputException e) {
            e.printStackTrace();
        }
    }
}
