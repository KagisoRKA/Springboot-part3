package com.springboot.part3;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    //dependency injection
    public FakeRepo fakeRepo = new FakeRepo();
    @Override
    public String addUser(long Id, String name, String surname) {
        return fakeRepo.insertUser(Id, name, surname);
    }
    @Override
    @Cacheable("name")
    public String getUser(long Id) {
        try
        {
            System.out.println("Going to sleep for 5 Secs.. to simulate backend call.");
            Thread.sleep(1000*5);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        return fakeRepo.findUserById(Id);
    }
    @Override
    public String removeUser(long Id) {
        return fakeRepo.deleteUser(Id);
    }
}
