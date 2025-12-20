package com.example.notificationservice.notifications;

import com.example.notificationservice.notifications.interfaces.INotification;

public class MailNotification implements INotification {

    @Override
    public void send(String message) {
        System.out.print("Email sent: "+message);
    }
}
