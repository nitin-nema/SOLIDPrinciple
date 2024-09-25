package com.user;

public class UserProfile {
    private final UserDataService userDataService;
    private final EmailService emailService;

    public UserProfile(UserDataService userDataService, EmailService emailService) {
        this.userDataService = userDataService;
        this.emailService = emailService;
    }

    public void saveUserProfile(String userData) {
        userDataService.saveToDatabase(userData);
    }

    public void sendConfirmationEmail(String email) {
        emailService.sendEmail(email);
    }
}
