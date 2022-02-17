package org.example;

import java.util.Scanner;

public class LogIn {

    public static void login(){
        String email;
        String password;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Email: ");
        email = scanner.nextLine();
        System.out.println("Password: ");
        password = scanner.nextLine();

    }
}
