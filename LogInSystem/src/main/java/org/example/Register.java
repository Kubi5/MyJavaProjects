package org.example;
import java.util.Scanner;

public class Register {
    public static void register(){
        String email;
        String password;
        String passwordConfirm = " ";
        boolean emailValid;
        boolean passwordValid;

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Email: ");
            email = scanner.nextLine();
            emailValid = RegexCheck.isEmailValid(email);
            if(!emailValid) System.out.println("Email is not valid! Try again!");
        } while(!emailValid);

        do {
            System.out.println("Password (8-16 char, big letter, special symbol) : ");
            password = scanner.nextLine();
            passwordValid = RegexCheck.isPasswordValid(password);
            if(!passwordValid){
                System.out.println("Password must contain 8-16 characters, big letter and special character!");
                continue;
            }
            System.out.println("Confirm your password: ");
            passwordConfirm = scanner.nextLine();
            if(!password.equals(passwordConfirm)) System.out.println("Passwords must be the same!");
        } while(!password.equals(passwordConfirm) || !passwordValid);


    }
}
