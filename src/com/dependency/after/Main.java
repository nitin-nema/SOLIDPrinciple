package com.dependency.after;

public class Main {
    public static void main(String[] args) {
        Notifier emailNotifier = new EmailService();
        NotificationService notificationService = new NotificationService(emailNotifier);
        notificationService.sendNotification("Hello via Email!");

        Notifier smsNotifier = new SMSService();
        notificationService = new NotificationService(smsNotifier);
        notificationService.sendNotification("Hello via SMS!");
    }
}
