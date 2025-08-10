package com.wipro.notification_ms.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.notification_ms.dto.NotificationDTO;

@RestController
public class NotificationController {

    @PostMapping("/notify")
    public void notify(@RequestBody NotificationDTO dto) {
        System.out.println("User " + dto.getUser().getUsername() + " information is " + dto.getAction());
    }
}