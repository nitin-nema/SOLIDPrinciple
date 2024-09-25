package com.user;

public class Main {
    public static void main(String[] args) {
        UserDataService userDataService = new UserDataService();
        EmailService emailService = new EmailService();
        UserProfile userProfile = new UserProfile(userDataService, emailService);

        userProfile.saveUserProfile("User data");
        userProfile.sendConfirmationEmail("user@example.com");
    }
}
