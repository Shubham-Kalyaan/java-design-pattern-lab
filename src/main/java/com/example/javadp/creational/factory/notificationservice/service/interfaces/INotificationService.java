package com.example.javadp.creational.factory.notificationservice.service.interfaces;

import com.example.javadp.creational.factory.notificationservice.dto.NotificationRequest;

public interface INotificationService {
    void sendNotification(NotificationRequest request);
}
