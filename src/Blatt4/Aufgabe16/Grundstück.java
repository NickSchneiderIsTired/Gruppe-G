package Blatt4.Aufgabe16;

public class Grundstück extends Immobilie {

    int size;

    public Grundstück(int price, int size) throws IllegalSizeException, IllegalPriceException{
        super(price);
        setSize(size);
    }

    private void setSize(int size) throws IllegalSizeException {
        if(!checkSize(size)) {
            throw new IllegalSizeException("Invalid price");
        } else {
            this.size = size;
        }
    }

    public double getSquareMeterPrice() {
        return price / size;
    }

    private boolean checkSize(int size) {
        return size >= 250;
    }

}
