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

    public void addTelephone(Telephone telephone) throws IllegalInputException, IllegalArgumentException {
        if(!checkFormatTelephone(telephone)) {
            throw new IllegalArgumentException("Wrong Format");
        } else if(!checkCountTelephone(telephone)) {
            throw new IllegalInputException("Already 3 Numbers", "");
        } else {
            this.telephone.add(telephone);
        }
    }

    public void deleteTelephone(Telephone telephone) {
        this.telephone.remove(telephone);
    }

    public String getTelephone(int index) throws IndexOutOfBoundsException {
        if(telephone.size() <= index) {
            throw new IndexOutOfBoundsException("Index existiert nicht");
        } else {
            return telephone.get(index).getNumber();
        }
    }

    private boolean checkFormatTelephone(Telephone telephone) {
        return !telephone.getNumber().matches("00.*");
    }

    private boolean checkCountTelephone(Telephone telephone) { //Useless
        return this.telephone.size() < 3;
    }
}
