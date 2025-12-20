package com.example.javadp.creational.factory.notificationservice.controller;

import com.example.javadp.creational.factory.notificationservice.dto.NotificationRequest;
import com.example.javadp.creational.factory.notificationservice.service.interfaces.INotificationService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/notifications")
public class NotificationController {
    private final INotificationService service;

    public NotificationController(INotificationService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<String> send(@RequestBody NotificationRequest request) {
        service.sendNotification(request);
        return ResponseEntity.ok("Notification Sent Successfully!!");
    }
}
