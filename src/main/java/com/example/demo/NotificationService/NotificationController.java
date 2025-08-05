package com.example.demo.NotificationService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NotificationController {
    private final NotificationManagerRequestBody notificationManagerRequestBody;

    NotificationController(NotificationManagerRequestBody notificationManagerRequestBody){
        this.notificationManagerRequestBody = notificationManagerRequestBody;
    }
    @GetMapping("/notification")
    public String receiveMessage(){
        notificationManagerRequestBody.receiveMessage();
        return "Your message has been received.";
    }
}
