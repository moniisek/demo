package com.example.demo.model;

import javax.persistence.*;

@Entity
public class Employee {
    // id, firstName, lastName, emailId
    // constructor without id

    @Id
    //@GeneratedValue(strategy= GenerationType.SEQUENCE)
    @Column(updatable = false)
    private long id;
    private String firstName;
    private String lastName;
    @Column(nullable = false, unique = true)
    private String emailId;

    public Employee() {}

    public Employee(String firstName, String lastName, String emailId, long id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailId = emailId;
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }
}
