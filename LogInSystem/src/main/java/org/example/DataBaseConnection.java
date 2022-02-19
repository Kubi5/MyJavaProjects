package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;
import java.util.Hashtable;

public class DataBaseConnection {
    String jdbcURL = "jdbc:postgresql://localhost:5432/dane_uzytkownikow";
    String username = "postgres";
    String password = "Barcelona12";

    public void addingNewClient(String email, String password) throws SQLException {
        try {
            Connection connection = DriverManager.getConnection(jdbcURL, username, this.password);
            //System.out.println("Connected to PostgreSQL server");
            Statement statement = connection.createStatement();
            String sql = "INSERT INTO dane_klientow(email,password) VALUES ('" + email + "', '" + password + "')";
            statement.executeUpdate(sql);
            connection.close();
        } catch (SQLException e) {
            System.out.println("ERROR IN CONNECTING POSTGRESQL SERVER");
            e.printStackTrace();
        }
    }

    // TODO: DODAC OPCJE ZE EMAIL JEST ALE HASLO ZLE
    public int isAccountValid(String email_, String password_) throws SQLException {
        Connection connection = DriverManager.getConnection(jdbcURL, username, this.password);
        Hashtable<String, String> dataDict = new Hashtable<String, String>();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM dane_klientow");
        while (resultSet.next()) {
            int id = resultSet.getInt("clientID");
            String email = resultSet.getString("email");
            if(email.equals(email_)){
                String password = resultSet.getString("password");
                if(password.equals(password_)){
                    return 1;
                }
            }

        }
        return 0;
    }

    public void TestingDatabase() throws SQLException {
        Connection connection = DriverManager.getConnection(jdbcURL, username, this.password);
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT email FROM dane_klientow");
        while (resultSet.next()) {
            // retrieve and print the values for the current row
            //int id = resultSet.getInt("clientID");
            String email = resultSet.getString("email");
            //String password = resultSet.getString("password");
            //System.out.println(id + " " + email + " " + password);
        }
    }
}
