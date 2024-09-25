package com.database.before;

public class UserService {
    private DatabaseConnection dbConnection;

    public UserService() {
        this.dbConnection = new DatabaseConnection(); // Tightly coupled
    }

    public void getUserDetails() {
        dbConnection.connect();
        System.out.println("Fetching user details...");
    }
}
