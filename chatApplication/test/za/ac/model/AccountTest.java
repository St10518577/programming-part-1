/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package za.ac.model;

import org.junit.Test;
import static org.junit.Assert.*;

public class AccountTest {

    // ---------------- USERNAME TESTS ----------------

    @Test
    public void testValidUsername() {
        Account acc = new Account("kyl_1", "Abc@1234", "+27831234567");
        assertTrue(acc.checkUserName());
    }

    @Test
    public void testInvalidUsername() {
        Account acc = new Account("kyle!!!!", "Abc@1234", "+27831234567");
        assertFalse(acc.checkUserName());
    }

    // ---------------- PASSWORD TESTS ----------------

    @Test
    public void testValidPassword() {
        Account acc = new Account("kyl_1", "Abc@1234", "+27831234567");
        assertTrue(acc.checkPasswordComplexity());
    }

    @Test
    public void testPasswordTooShort() {
        Account acc = new Account("kyl_1", "abc", "+27831234567");
        assertFalse(acc.checkPasswordComplexity());
    }

    @Test
    public void testPasswordMissingCapital() {
        Account acc = new Account("kyl_1", "abc@1234", "+27831234567");
        assertFalse(acc.checkPasswordComplexity());
    }

    // ---------------- CELLPHONE TESTS ----------------

    @Test
    public void testValidCellNumber() {
        Account acc = new Account("kyl_1", "Abc@1234", "+27831234567");
        assertTrue(acc.checkCellPhoneNumber());
    }

    @Test
    public void testInvalidCellNumber() {
        Account acc = new Account("kyl_1", "Abc@1234", "083123");
        assertFalse(acc.checkCellPhoneNumber());
    }

    // ---------------- REGISTER TESTS ----------------

    @Test
    public void testRegisterSuccess() {
        Account acc = new Account("kyl_1", "Abc@1234", "+27831234567");
        assertEquals("User registered successfully.", acc.registerUser());
    }

    @Test
    public void testRegisterFailUsername() {
        Account acc = new Account("kyle!!!!", "Abc@1234", "+27831234567");
        assertEquals("Username is not correctly formatted.", acc.registerUser());
    }

    @Test
    public void testRegisterFailPassword() {
        Account acc = new Account("kyl_1", "password", "+27831234567");
        assertEquals("Password is not correctly formatted.", acc.registerUser());
    }

    @Test
    public void testRegisterFailCell() {
        Account acc = new Account("kyl_1", "Abc@1234", "083123");
        assertEquals("Cell number incorrectly formatted.", acc.registerUser());
    }
}

    // ---------------- GETTERS TEST