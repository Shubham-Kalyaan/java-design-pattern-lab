package com.example.notificationservice.service.interfaces;

import com.example.notificationservice.dto.NotificationRequest;

public interface INotificationService {
    void sendNotification(NotificationRequest request);
}
