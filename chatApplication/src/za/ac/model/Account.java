/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package za.ac.model;

/**
 *
 * @author Sibiy
 */
public class Account {

   

 final   private String username;
 final   private String password;
 final   private String cellNum;
    
public static void main(String[] args) {
    
}
    // Constructor
    public Account(String username, String password, String cellNum) {
        this.username = username;
        this.password = password;
        this.cellNum = cellNum;
    }
    
    
    
    // Getters
    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getCellNum() {
        return cellNum;
    }

    // Username validation
    public boolean checkUserName() {
        return username.contains("_") && username.length() <= 5;
    }

    // Password validation
    public boolean checkPasswordComplexity() {
        return password.length() >= 8 &&
               password.matches(".*[A-Z].*") &&
               password.matches(".*[0-9].*") &&
               password.matches(".*[!@#$%^&*()].*");
    }

    // Cell validation (South Africa format example)
    public boolean checkCellPhoneNumber() {
        return cellNum.matches("^\\+27\\d{9}$");
    }

    // Register user
    public String registerUser() {

        if (!checkUserName()) {
            return "Username is not correctly formatted.";
        }

        if (!checkPasswordComplexity()) {
            return "Password is not correctly formatted.";
        }

        if (!checkCellPhoneNumber()) {
            return "Cell number incorrectly formatted.";
        }

        return "User registered successfully.";
    }
}
    
    

