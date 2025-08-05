package com.example.demo.NotificationService;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class NotificationManagerRequestBody {

    private final NotificationService notificationService;

    NotificationManagerRequestBody(@Qualifier("Email") NotificationService notificationService){
        this.notificationService = notificationService;
    }

    public void receiveMessage(){
        notificationService.send("I need to talk to you");
    }
}
