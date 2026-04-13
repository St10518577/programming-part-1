/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package za.ac.main;


import java.util.Scanner;
import za.ac.model.Account;

public class AccountCreation {

    public static void main(String[] args) {
       System.out.println("\n===menue===");
       System.out.println("1. Register");
       System.out.println("2. Login");
       System.out.println("3. Exit");
       System.out.print("Chppse an option");
       
     
        Scanner input = new Scanner(System.in);

        System.out.println("=== REGISTRATION ===");

        System.out.print("Enter First Name: ");
        String fName = input.nextLine();

        System.out.print("Enter Last Name: ");
        String lName = input.nextLine();

        System.out.print("Enter Username: ");
        String user = input.nextLine();

        System.out.print("Enter Password: ");
        String pass = input.nextLine();

        System.out.print("Enter Cellphone (+27...): ");
        String cell = input.nextLine();

        Account userAccount = new Account(user, pass, cell);

        String message = userAccount.registerUser();
        System.out.println(message);

        // LOGIN
        if (message.equals("User registered successfully.")) {

            System.out.println("\n=== LOGIN ===");

            System.out.print("Enter Username: ");
            String loginUser = input.nextLine();

            System.out.print("Enter Password: ");
            String loginPass = input.nextLine();

            if (loginUser.equals(userAccount.getUsername()) &&
                loginPass.equals(userAccount.getPassword())) {

                System.out.println("Welcome " + fName + " " + lName);

            } else {
                System.out.println("Username or password incorrect.");
            }
        }
    }
}

