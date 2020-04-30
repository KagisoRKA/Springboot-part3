package com.springboot.part3;

public interface FakeRepoInterface {
    User insertUser(User user);
    User findUserById(long Id);
    User deleteUser(long Id);
}