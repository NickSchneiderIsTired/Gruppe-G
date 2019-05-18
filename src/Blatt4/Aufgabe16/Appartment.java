package Blatt4.Aufgabe16;

public class Appartment extends Immobilie {

    int area;

    public Appartment(int price, int area) throws IllegalSizeException, IllegalPriceException {
        super(price);
        setArea(area);
    }
    private void setArea(int area) throws IllegalSizeException {
        if(!checkArea(area)) {
            throw new IllegalSizeException("Invalid price");
        } else {
            this.area = area;
        }
    }

    public double getSquareMeterPrice() {
        return price / area;
    }

    private boolean checkArea(int area) {
        return area >= 20 && area <= 120;
    }
}
