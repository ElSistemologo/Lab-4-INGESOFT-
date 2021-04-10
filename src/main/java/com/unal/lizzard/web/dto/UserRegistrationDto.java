package com.unal.lizzard.web.dto;

public class UserRegistrationDto {
    private String firstName;
    private String lastName;
    private String email;
    private String password;

    public UserRegistrationDto(String firstName, String lastName, String email, String password){
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
    }

    public String getFirstName() { return firstName; }
    public String getlastName() { return lastName; }
    public String getEmail() { return email; }
    public String getPassword() { return password; }
    public void setFirstName(String firstName){this.firstName = firstName; }
}