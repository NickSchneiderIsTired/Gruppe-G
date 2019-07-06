package Blatt11.Aufgabe41;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class a41a {

    public static void printBooks(Connection c) throws SQLException {
        Statement abfrage = null;
        try {
            abfrage = c.createStatement();
            String befehl = "select isbn from Buch;";
            ResultSet ergebnis = abfrage.executeQuery(befehl);
            while(ergebnis.next()) {
                System.out.println(ergebnis.getString(1));
            }
        } finally {
            try {
                if(abfrage != null) {
                    abfrage.close();
                }
            } catch (SQLException e) {}
        }
    }

}
