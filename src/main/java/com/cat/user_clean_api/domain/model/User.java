package com.cat.user_clean_api.domain.model;


public class User {

    private String firstName;
    private String lastName;
    private String email;
    private String phone;

    public User(String firstName, String lastName, String email, String phone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
    }

@Override
public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }


    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String setFirstName(String firstName) {
        this.firstName = firstName;
        return firstName;
    }
    public String setLastName(String lastName) {
        this.lastName = lastName;
        return lastName;
    }
    public String setEmail(String email) {
        this.email = email;
        return email;
    }
    public String setPhone(String phone) {
        this.phone = phone;
        return phone;
    }

}
