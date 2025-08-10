package com.wipro.springdemo.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Mobile {
    private Display display;

    // Constructor-based injection
    @Autowired
    public Mobile(Display display) {
        this.display = display;
    }

    public Display getDisplay() {
        return display;
    }

    @Override
    public String toString() {
        return "Mobile [display=" + display + "]";
    }
}