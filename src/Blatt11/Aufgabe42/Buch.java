package Blatt11.Aufgabe42;

public class Buch {
    String isbn;
    String autor;
    public String getISBN() {
        return isbn;
    }
    public String getAutor() {
        return autor;
    }
    public Buch(String isbn, String title) {
        this.isbn = isbn;
        autor = title;
    }
}
