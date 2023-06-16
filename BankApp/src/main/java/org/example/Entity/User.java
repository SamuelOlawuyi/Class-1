package org.example.Entity;

import org.example.Enum.Role;

public class User {
    private String name;
    private String email;

    public User(Role role) {
        this.role = role;
    }

    private Role role;
    private String dob;
    private String location;

    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 18) {
            System.out.println("You are too young to join my bank");
        } else {
            this.age = age;
        }
    }
}