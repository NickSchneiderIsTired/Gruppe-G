package Blatt11.Aufgabe41;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class a41b {

    public static void printPreis(Connection c, String kunde) throws SQLException {
        Statement abfrage = null;
        int sum = 0;
        try {
            abfrage = c.createStatement();
            String befehl = "select preis from Auftrag where nummer=" + kunde + ";";
            ResultSet result = abfrage.executeQuery(befehl);
            while(result.next()) {
                sum += result.getInt(1);
            }
            System.out.println("Summe: " + sum);
        } finally {
            try {
                if(abfrage != null) {
                    abfrage.close();
                }
            } catch (SQLException e) {}
        }
    }

}
