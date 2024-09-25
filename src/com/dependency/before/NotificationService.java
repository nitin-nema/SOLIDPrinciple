package com.dependency.before;

public class NotificationService {
    private EmailService emailService;

    public NotificationService() {
        this.emailService = new EmailService(); // Direct dependency
    }

    public void sendNotification(String message) {
        emailService.sendEmail(message);
    }
}
