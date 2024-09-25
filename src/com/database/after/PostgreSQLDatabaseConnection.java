package com.database.after;

public class PostgreSQLDatabaseConnection implements DatabaseConnection {
    @Override
    public void connect() {
        System.out.println("Connecting to PostgreSQL database...");
    }
}
