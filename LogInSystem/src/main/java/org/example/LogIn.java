package org.example;

import java.util.Scanner;

public class LogIn {
    String email;
    String password;

    public void login(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Email: ");
        email = scanner.nextLine();
        System.out.println("Password: ");
        password = scanner.nextLine();

    }
}
