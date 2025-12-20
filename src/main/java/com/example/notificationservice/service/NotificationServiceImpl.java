package com.example.notificationservice.service;

import com.example.notificationservice.dto.NotificationRequest;
import com.example.notificationservice.factory.NotificationFactory;
import com.example.notificationservice.notifications.interfaces.INotification;
import com.example.notificationservice.service.interfaces.INotificationService;
import org.springframework.stereotype.Service;

@Service
public class NotificationServiceImpl implements INotificationService {
    @Override
    public void sendNotification(NotificationRequest request) {
        INotification notification = NotificationFactory.getNotification(request.getType());
        notification.send(request.getMessage());
    }
}
