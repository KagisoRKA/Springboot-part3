package com.springboot.part3;

public interface UserService {
    User addUser(User user);
    User removeUser(long Id);
    User getUser(long Id);
}