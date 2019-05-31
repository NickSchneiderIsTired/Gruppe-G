package Blatt6.Aufgabe23und24;

import Blatt4.Aufgabe14.IllegalInputException;

public class Telephone {

    private TelephoneType type;
    private String number;

    public Telephone(TelephoneType t, String n) throws IllegalInputException {
        setNumber(n);
        setType(t);
    }

    public Telephone(Telephone t) {
        this.type = t.type;
        this.number = t.number;
    }

    public TelephoneType getType() {
        return type;
    }

    public void setType(TelephoneType type) {
        this.type = type;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) throws IllegalInputException {
        if(!checkNumber(number)) {
            throw new IllegalInputException("","");
        } else {
            this.number = number;
        }
    }

    private boolean checkNumber(String number) {
        return (number.matches("[0-9]+") && number.length() > 3);
    }

}
