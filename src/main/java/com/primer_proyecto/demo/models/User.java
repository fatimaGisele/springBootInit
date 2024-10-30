package com.primer_proyecto.demo.models;

public class User {
    private String Name;
    private String LastName;
    private String email;
    

    public User(String name, String lastName) {
        Name = name;
        LastName = lastName;
    }
    public User(String name, String lastName, String email){
        this(name, lastName);
        this.email = email;
    }

    public String getName() {
        return Name;
    }
    public String getLastName() {
        return LastName;
    }
    public String getEmail() {
        return email;
    }
    public void setName(String name) {
        Name = name;
    }
    public void setLastName(String lastName) {
        LastName = lastName;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    

}
