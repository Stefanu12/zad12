package com.example.zad12;

public class User {
    private String firstName;
    private String lastName;
    private int avatarId;

    public User(String firstName, String lastName, int avatarId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.avatarId = avatarId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
    public int getAvatarId() {
        return avatarId;
    }
}
