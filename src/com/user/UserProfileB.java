package com.user;

public class UserProfileB {
    public void saveUserProfile(String userData) {
        // Save user data to database
        saveToDatabase(userData);
    }

    public void sendConfirmationEmail(String email) {
        // Send confirmation email
        sendEmail(email);
    }

    private void saveToDatabase(String data) {
        // Implementation of saving to database
    }

    private void sendEmail(String email) {
        // Implementation of sending email
    }
}
