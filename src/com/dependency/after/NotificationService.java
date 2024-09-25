package com.dependency.after;

public class NotificationService {
    private Notifier notifier;

    public NotificationService(Notifier notifier) {
        this.notifier = notifier; // Dependency injection
    }

    public void sendNotification(String message) {
        notifier.send(message);
    }
}
