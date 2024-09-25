package com.database.after;

public class Main {
    public static void main(String[] args) {
        DatabaseConnection mySQLConnection = new MySQLDatabaseConnection();
        UserService userService = new UserService(mySQLConnection);
        userService.getUserDetails();

        DatabaseConnection postgreSQLConnection = new PostgreSQLDatabaseConnection();
        userService = new UserService(postgreSQLConnection);
        userService.getUserDetails();
    }
}
