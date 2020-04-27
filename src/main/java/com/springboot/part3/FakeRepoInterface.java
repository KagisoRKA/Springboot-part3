package com.springboot.part3;

public interface FakeRepoInterface {
    String insertUser(long Id, String name, String surname);
    String findUserById(long Id);
    String deleteUser(long Id);
}