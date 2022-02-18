package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;

public class DataBaseConnection {
    String jdbcURL = "jdbc:postgresql://localhost:5432/dane_uzytkownikow";
    String username = "postgres";
    String password = "Barcelona12";

    public void addingNewClient(String email, String password) throws SQLException {
        try {
            Connection connection = DriverManager.getConnection(jdbcURL, username, this.password);
            System.out.println("Connected to PostgreSQL server");
            Statement statement = connection.createStatement();
            String sql = "INSERT INTO dane_klientow(email,password) VALUES ('" + email + "', '" + password + "')";
            statement.executeUpdate(sql);
            connection.close();
        }catch(SQLException e){
            System.out.println("ERROR IN CONNECTING PPOSTGRESQL SERVER");
            e.printStackTrace();
        }
    }
}
