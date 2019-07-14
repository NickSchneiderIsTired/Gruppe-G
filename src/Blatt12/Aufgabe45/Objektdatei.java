package Blatt12.Aufgabe45;
/*
import java.io.*;

public class Objektdatei {

    private String filename;
    private ObjectOutputStream writer;
    private ObjectInputStream reader;

    public void load(ArtikelContainer con) throws PersistenceException {
        try {
            reader = new ObjectInputStream(new FileInputStream(filename));
            ArtikelContainer temp = (ArtikelContainer) reader.readObject();
            for(Artikel a : temp) {
                temp.linkArtikel(a);
            }
        } catch (IOException | ClassNotFoundException e) {
            throw new PersistenceException("Fehler beim laden", e);
        }
    }

    public void save(ArtikelContainer con) throws PersistenceException {
        try {
            writer = new ObjectOutputStream(new FileOutputStream(filename));
            writer.writeObject(con);
        } catch (IOException e) {
            throw new PersistenceException("Fehler beim laden", e);
        }
    }

}
*/