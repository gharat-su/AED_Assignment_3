/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.java.com.coursera.usermanagement;

import java.util.ArrayList;
import main.java.com.coursera.users.Faculty;
import main.java.com.coursera.users.Student;
import main.java.com.coursera.users.User;
import main.java.com.coursera.users.UserType;

/**
 *
 * @author sghar
 */
public class UserList {

    private ArrayList<User> userList;

    public UserList() {
        userList = new ArrayList<>();

        User adminUser = new User("admin", "adminpassword", "admin@example.com", "Admin Name", UserType.ADMIN);
        addUser(adminUser);
    }

    // Create (Add) a new user to the list
    public void addUser(User user) {
        userList.add(user);
    }

    // Read (Retrieve) a user by their userID
    public User getUserByID(int userID) {
        for (User user : userList) {
            if (user.getUserID() == userID) {
                return user;
            }
        }
        return null; // User not found
    }

    // Update a user's information
    public boolean updateUser(int userID, String newUsername, String newEmail, String newFullName) {
        User user = getUserByID(userID);
        if (user != null) {
            user.setUsername(newUsername);
            user.setEmail(newEmail);
            user.setFullName(newFullName);
            return true; // User updated successfully
        }
        return false; // User not found, update failed
    }

    // Delete a user from the list
    public boolean deleteUser(int userID) {
        User user = getUserByID(userID);
        if (user != null) {
            userList.remove(user);
            return true; // User deleted successfully
        }
        return false; // User not found, delete failed
    }

    // List all users in the userList
    public ArrayList<User> getAllUsers() {
        return userList;
    }

    public Faculty findFacultyById(int facultyId) {
        for (User user : userList) {
            if (user instanceof Faculty && user.getUserID() == facultyId) {
                return (Faculty) user; // Found a Faculty user with the specified ID
            }
        }
        return null; // Faculty user not found with the specified ID
    }
    
        public boolean updateStudent(int userID, String newUsername, String newEmail, String newFullName, String newHighEduLevel) {
        User user = getUserByID(userID);
        if (user != null && user instanceof Student) {
            Student student = (Student) user;
            student.setUsername(newUsername);
            student.setEmail(newEmail);
            student.setFullName(newFullName);
            student.setHighEduLevel(newHighEduLevel);
            return true;
        }
        return false;
    }
}
