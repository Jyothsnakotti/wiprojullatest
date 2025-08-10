package com.example.userservice.dto;

import com.example.userservice.model.User;

public class NotificationDTO {
    private User user;
    private String action;

    public NotificationDTO() {}

    public NotificationDTO(User user, String action) {
        this.user = user;
        this.action = action;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }
}
