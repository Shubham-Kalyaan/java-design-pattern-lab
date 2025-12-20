package com.example.notificationservice.notifications;

import com.example.notificationservice.notifications.interfaces.INotification;

public class SmsNotification implements INotification {
    @Override
    public void send(String message) {
        System.out.println("SMS sent: "+message);
    }
}
