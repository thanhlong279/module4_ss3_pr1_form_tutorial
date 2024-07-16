package com.example.pr1_spring_form_tutorial.models;

public class Employee {
    private String id;
    private String name;
    private String contactNumber;

    public Employee() {}

    public Employee(String contactNumber, String id, String name) {
        this.contactNumber = contactNumber;
        this.id = id;
        this.name = name;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
