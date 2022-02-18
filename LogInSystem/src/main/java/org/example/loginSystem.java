package org.example;

import java.sql.SQLException;
import java.util.Scanner;

public class loginSystem {
    int chosen_number;
        public void Welcome(){
            System.out.println("==========  Welcome on our www website!  ==========\n");
            System.out.println("(type 1) to LOG IN");
            System.out.println("(type 2) to Register if you do not have an account");
        }

    public void ValidChoice(){
           Scanner scanner = new Scanner(System.in);

           do{
               chosen_number = scanner.nextInt();
               if(chosen_number != 1 && chosen_number != 2){
                   System.out.println("YOU HAVE TYPED WRONG NUMBER!");
               }
           }
           while(chosen_number != 1 && chosen_number != 2);
        }
        // TODO: ZROBIC COS ZEBY KONSOLA SIE CZYSCILA PO WYBORACH
        public void runProgram() throws SQLException {
            if(chosen_number == 1){
                System.out.print("\033[H\033[2J");
                System.out.flush();
                LogIn logIn = new LogIn();
                logIn.login();
            }
            else if(chosen_number == 2){
                System.out.print("\033[H\033[2J");
                System.out.flush();
                Register register = new Register();
                register.register();
            }
        }

}
