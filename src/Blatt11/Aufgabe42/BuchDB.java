package Blatt11.Aufgabe42;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class BuchDB implements DataInterface{

    Connection c;

    public void add(Buch buch) throws SQLException{
        Statement abfrage1 = null;
        Statement abfrage2 = null;
        try {
            abfrage1 = c.createStatement();
            abfrage2 = c.createStatement();
            String befehl1 = "insert into Buch values (" + buch.getISBN() + ")";
            String befehl2 = "insert into BuchAutor values" + buch.getAutor() + "," + buch.getISBN() + ")";
            abfrage1.executeQuery(befehl1);
            abfrage2.executeQuery(befehl2);
        } finally {
            try {
                if(abfrage1 != null) {
                    abfrage1.close();
                }
                if (abfrage2 != null) {
                    abfrage2.close();
                }
            } catch (SQLException e) {}
        }
    }

    public void delete(Buch buch) throws SQLException{
        Statement abfrage1 = null;
        Statement abfrage2 = null;
        try {
            abfrage1 = c.createStatement();
            abfrage2 = c.createStatement();
            String befehl1 = "delete from BuchAutor where isbn=" + buch.getISBN() + ";";
            String befehl2 = "delete from Buch where isbn=" + buch.getISBN() + ";";
            abfrage1.executeQuery(befehl1);
            abfrage2.executeQuery(befehl2);
        } finally {
            try {
                if(abfrage1 != null) {
                    abfrage1.close();
                }
                if (abfrage2 != null) {
                    abfrage2.close();
                }
            } catch (SQLException e) {}
        }
    }

}
