package Blatt6.Aufgabe23und24;

import Blatt4.Aufgabe14.IllegalInputException;

import java.util.ArrayList;

public class Contact {

    private ArrayList<Telephone> telephone = new ArrayList<>();
    private boolean favorite;
    private String remark = "";

    public Contact() {}

    public boolean getFavorite() {
        return favorite;
    }

    public void setFavorite(boolean favorite) {
        this.favorite = favorite;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    /*It makes no sense to use a String here, since the List has "Telephone" objects*/
    public void addTelephone(String telephone) throws IllegalInputException, IllegalArgumentException {
        if(!checkFormatTelephone(telephone)) {
            throw new IllegalArgumentException("Wrong Format");
        } else if(!checkCountTelephone(telephone)) {
            throw new IllegalInputException("Already 3 Numbers", "");
        } else {
            this.telephone.add(new Telephone(TelephoneType.PRIVATE, telephone)); // Doesnt make sense with String param
        }
    }

    public void deleteTelephone(String telephone) {
        this.telephone.remove(telephone);
    }

    public String getTelephone(int index) throws IndexOutOfBoundsException {
        if(telephone.size() <= index) {
            throw new IndexOutOfBoundsException("Index existiert nicht");
        } else {
            return telephone.get(index).getNumber();
        }
    }

    private boolean checkFormatTelephone(String telephone) {
        return !telephone.matches("00.*");
    }

    private boolean checkCountTelephone(String telephone) {
        return this.telephone.size() < 3;
    }
}
