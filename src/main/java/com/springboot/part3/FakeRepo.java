package com.springboot.part3;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class FakeRepo implements FakeRepoInterface{
    ArrayList<User> users = new ArrayList<>();
    @Override
    public String insertUser(long Id, String name, String surname) {
        users.add(new User(Id,name,surname));
        return name+ " successfully added";
    }

    @Override
    public String findUserById(long Id) {
        for (User user: users) {
            long currentUserId = user.getId();
            if(currentUserId == Id){
                return "Hello "+user.getName();
            }
        }
        return null;
    }

    @Override
    public String deleteUser(long Id) {
        for (User user:users) {
            long currentUserId = user.getId();
            if(currentUserId == Id){
                users.remove(user);
                return user.getName()+ " successfully deleted";
            }
        }
        return null;
    }
}