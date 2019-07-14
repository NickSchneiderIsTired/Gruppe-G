package Blatt12;

public class LoadSaveException extends Exception {

    public LoadSaveException(String message, Exception cause) {
        super(message, cause);
    }

    public String getDetails() {
        if (getCause() == null)
            return "no details";
        else
            return getCause().getClass() + ", " + getCause().getMessage();
    }
}
