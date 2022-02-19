package org.example;

import java.sql.SQLException;
import java.util.Scanner;

public class LogIn {
    String email;
    String password;

    public void login() throws SQLException {
        DataBaseConnection dataBaseConnection = new DataBaseConnection();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Email: ");
        email = scanner.nextLine();
        System.out.println("Password: ");
        password = scanner.nextLine();
        // TODO: DODAC TU OPCJE ZE KONTO JEST ALE ZLE HASLO TYLKO
        int value = dataBaseConnection.isAccountValid(email,password);
        if(value == 1){
            System.out.println("You have logged succesfuly");
        }
        if(value == 0){
            System.out.println("You typed wrong data");
        }
    }
}
