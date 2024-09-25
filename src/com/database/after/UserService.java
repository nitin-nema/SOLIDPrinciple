package com.database.after;

public class UserService {
    private DatabaseConnection dbConnection;

    public UserService(DatabaseConnection dbConnection) {
        this.dbConnection = dbConnection; // Dependency injection
    }

    public void getUserDetails() {
        dbConnection.connect();
        System.out.println("Fetching user details...");
    }
}
