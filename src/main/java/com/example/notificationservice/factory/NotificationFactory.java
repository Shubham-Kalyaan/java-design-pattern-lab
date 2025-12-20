package com.example.notificationservice.factory;

import com.example.notificationservice.notifications.MailNotification;
import com.example.notificationservice.notifications.interfaces.INotification;
import com.example.notificationservice.notifications.PushNotification;
import com.example.notificationservice.notifications.SmsNotification;

public class NotificationFactory {
    public static INotification getNotification(String type) {
        switch (type.toUpperCase()) {
            case "EMAIL":
                return new MailNotification();
            case "SMS":
                return new SmsNotification();
            case "PUSH":
                return new PushNotification();
            default:
                throw new IllegalArgumentException("Invalid type");
        }
    }
}
