package com.example.jsf;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;

@Named("greetingBean")
@RequestScoped
public class GreetingBean {
    private String name;
    private String message;

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getMessage() { return message; }

    public void sayHello() {
        if (name != null && !name.isEmpty()) {
            this.message = "Hello from a Bootable JAR, " + name + "!";
        }
    }
}