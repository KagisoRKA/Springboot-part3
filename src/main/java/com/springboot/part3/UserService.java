package com.springboot.part3;

public interface UserService {
    User addUser(long Id, String name, String surname);
    User removeUser(long Id);
    User getUser(long Id);
}