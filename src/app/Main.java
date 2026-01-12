package app;
import java.util.*;
import java.util.Scanner;

public class Main {
    static void main() {
        System.out.println("Welcome to Console Bank");
        Scanner scanner = new Scanner(System.in);
       boolean running = true;
       while (running) {
           //when we have to do multiple lines in the java , then we have to use """ """ strings
           System.out.println(""" 
              1) Open Account
              2) Deposit
              3) Withdraw
              4) Transfer
              5) Account Statement
              6) List Accounts
              7) Search Accounts by Customer Name
              0) Exist  
           """);
           System.out.println("Choose your choice: ");
           String choice = scanner.nextLine().trim();
           System.out.println("Your choice: " + choice);

           switch (choice) {
               case "1"
           }
       }


    }
}
