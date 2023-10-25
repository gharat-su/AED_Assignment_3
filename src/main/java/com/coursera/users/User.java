/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.java.com.coursera.users;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 *
 * @author sghar
 */
public class User {
    private static int userCount = 0;
    private int userID;
    private String username;
    private String email;
    private String fullName;
    private String password;
    private UserType userType; // Enum to store the user type

    public User(String username, String plainpassword, String email, String fullName, UserType userType) {
        this.userID = ++userCount;
        this.username = username;
        this.password = hashPassword(plainpassword);
        this.email = email;
        this.fullName = fullName;
        this.userType = userType;
    }

    public int getUserID() {
        return userID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = hashPassword(password);
    }

    public UserType getUserType() {
        return userType;
    }

    public void setUserType(UserType userType) {
        this.userType = userType;
    }
    
    
    public static String hashPassword(String plainPassword) {
        String salt = "Sujendra";
        try {
            // Concatenate the password and salt
            String saltedPassword = plainPassword + salt;

            // Create a MessageDigest instance for SHA-256
            MessageDigest md = MessageDigest.getInstance("SHA-256");

            // Compute the hash value of the salted password
            byte[] hashBytes = md.digest(saltedPassword.getBytes());

            // Convert the byte array to a hexadecimal string
            StringBuilder hexStringBuilder = new StringBuilder();
            for (byte b : hashBytes) {
                hexStringBuilder.append(String.format("%02x", b));
            }

            return hexStringBuilder.toString();
        } catch (NoSuchAlgorithmException e) {
            return null;
        }
    }
}
