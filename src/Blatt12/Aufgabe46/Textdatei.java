package Blatt12.Aufgabe46;
import Blatt11.Aufgabe42.Buch;
import Blatt4.Aufgabe14.IllegalInputException;
import java.io.*;

/*
public class Textdatei {

    private BufferedReader reader;
    private PrintWriter writer;
    private String filename;

    private void load(BuchContainer con) throws PersistenceException{
        try {
            reader = new BufferedReader(new FileReader(filename));
            String line = reader.readLine();
            while(!line.equals("ende")) {
                if(line.equals("buch")) {
                    String isbn = reader.readLine();
                    String titel = reader.readLine();
                    try {
                        con.linkBuch(new Buch(isbn, titel));
                    } catch(IllegalInputException e) {
                        e.printStackTrace();
                    }
                } else {
                    break;
                }
                reader.readLine();
            }
        } catch(IOException e) {
            throw new PersistenceException("Fehler beim laden", e);
        }
    }

    private void safe(BuchContainer con) throws PersistenceException {
        try {
            writer = new PrintWriter(new FileWriter(filename));
            for(Buch b : con) {
                writer.println("buch");
                writer.println(b.getISBN());
                writer.println(b.getTitle());
            }
            writer.println("ende");
        } catch(IOException e) {
            throw new PersistenceException("Fehler beim speichern", e);
        }
    }

}
*/