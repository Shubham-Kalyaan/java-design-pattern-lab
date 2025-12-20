package com.example.javadp.creational.factory.notificationservice.service;

import com.example.javadp.creational.factory.notificationservice.dto.NotificationRequest;
import com.example.javadp.creational.factory.notificationservice.factory.NotificationFactory;
import com.example.javadp.creational.factory.notificationservice.service.interfaces.INotificationService;
import com.example.javadp.creational.factory.notificationservice.notifications.interfaces.INotification;
import org.springframework.stereotype.Service;

@Service
public class NotificationServiceImpl implements INotificationService {
    @Override
    public void sendNotification(NotificationRequest request) {
        INotification notification = NotificationFactory.getNotification(request.getType());
        notification.send(request.getMessage());
    }
}
