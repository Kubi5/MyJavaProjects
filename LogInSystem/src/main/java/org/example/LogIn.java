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

        int value = dataBaseConnection.isAccountValid(email,password);
        switch(value) {
            case 0: System.out.println("You have provided wrong data, try again!");
            break;
            case 1: System.out.println("Wrong password! Try again");
            break;
            case 2: System.out.println("ITS FINE");
            break;
        }
    }
}
