package com.springboot.part3;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class FakeRepo implements FakeRepoInterface {
    ArrayList<User> users = new ArrayList<>();

    @Override
    public User insertUser(User user) {
        user= new User();
        users.add(user);
        System.out.println("Successfully added");
        return user;
    }

    @Override
    public User findUserById(long Id) {
        for (User user: users) {
            long currentUserId = user.getId();
            if(currentUserId == Id){
                System.out.println("Hello "+user.getName());
                return user;
            }
        }
        return null;
    }

    @Override
    public User deleteUser(long Id) {
        for (User user:users) {
            long currentUserId = user.getId();
            if(currentUserId == Id){
                users.remove(user);
                System.out.println(user.getName()+" removed");
                return user;
            }
        }
        return null;
    }
}