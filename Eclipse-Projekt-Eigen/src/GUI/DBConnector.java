package GUI;

import java.sql.*;

public class DBConnector {

    public static Connection connect() {
        Connection conn = null;
        try {
            // URL zur Datenbank
            String url = "jdbc:sqlite:branchen.db";
            // create a connection to the database
            conn = DriverManager.getConnection(url);
            
            System.out.println("Connection to SQLite has been established.");
            
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
        return conn;
    }

}
