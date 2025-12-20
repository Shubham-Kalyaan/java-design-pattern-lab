package com.example.javadp.creational.factory.notificationservice.factory;

import com.example.javadp.creational.factory.notificationservice.notifications.MailNotification;
import com.example.javadp.creational.factory.notificationservice.notifications.PushNotification;
import com.example.javadp.creational.factory.notificationservice.notifications.SmsNotification;
import com.example.javadp.creational.factory.notificationservice.notifications.interfaces.INotification;

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
