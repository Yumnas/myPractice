package com.example.demo.NotificationService;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service("Email")
public class EmailNotificationService implements NotificationService {

    @Value("${spring.email.apiURL}")
    private String apiURL;

    @Value("${spring.email.enabled}")
    private String enabled;

    @Value("${spring.email.timeout}")
    private String timeout;

    @Override
    public void send(String message){
        System.out.println("Sending Email: " + message);
        System.out.println("API URL: " + apiURL);
        System.out.println("Is it enabed? " + enabled);
        System.out.println("Whats the timeout? " + timeout);
    }
}
