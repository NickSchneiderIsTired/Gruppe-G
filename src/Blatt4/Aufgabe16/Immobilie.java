package Blatt4.Aufgabe16;

public class Immobilie {

    int price;

    public Immobilie(int price) throws IllegalPriceException {
        setPrize(price);
    }

    private void setPrize(int price) throws IllegalPriceException{
        if(!checkPrize(price)) {
            throw new IllegalPriceException("Invalid price");
        } else {
            this.price = (int) (price * 1.00345);
        }
    }

    private boolean checkPrize(int price) {
        return price >= 10000 && (price % 1000) == 0;
    }

}
