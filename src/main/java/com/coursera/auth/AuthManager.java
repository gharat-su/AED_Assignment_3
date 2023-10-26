/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.java.com.coursera.auth;

import main.java.com.coursera.usermanagement.UserList;
import main.java.com.coursera.users.User;

/**
 *
 * @author sghar
 */
public class AuthManager {

    private UserList userList;
    private User loggedInUser;

    public AuthManager(UserList userList) {
        this.userList = userList;
        this.loggedInUser = null;
    }

    public User authenticateUser(String username, String password) {
        for (User user : userList.getAllUsers()) {
            if (user.getUsername().equals(username)) {
                if (user.getPassword().equals(User.hashPassword(password))) {
                    loggedInUser = user; // Set the authenticated user
                    return user; // Authentication successful
                }
            }
        }
        return null; // Authentication failed
    }

    public User getLoggedInUser() {
        return loggedInUser;
    }

    public void logout() {
        loggedInUser = null; // Clear the authenticated user when logging out
    }

}
