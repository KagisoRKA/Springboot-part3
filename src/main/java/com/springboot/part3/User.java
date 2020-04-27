package com.springboot.part3;

public class User {
    private long id;
    private String name;
    private String surname;

    User(long Id, String Name, String Surname){
        this.id = Id;
        this.name = Name;
        this.surname = Surname;
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
}