package com.valid.login.model;

import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

public class User {

    @Size(min = 5 , max =45)
    private String firstname;

    @Size(min = 5 , max =45 )
    private String lastname;

    @Min(18)
    private int age;

    private String email;

    public User() {
    }

    public User(@Size(min = 5, max = 45) String firstname, @Size(min = 5, max = 45) String lastname, @Min(18) int age, String email) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.email = email;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
