package com.springboot.part3;

public interface FakeRepoInterface {
    User insertUser(long Id, String name, String surname);
    User findUserById(long Id);
    User deleteUser(long Id);
}