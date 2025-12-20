package com.example.javadp.creational.factory.notificationservice.notifications;

import com.example.javadp.creational.factory.notificationservice.notifications.interfaces.INotification;

public class MailNotification implements INotification {

    @Override
    public void send(String message) {
        System.out.print("Email sent: "+message);
    }
}
