package com.springboot.part3;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

@Service
public class UserServiceImpl implements UserService {
    //dependency injection
    public FakeRepo fakeRepo = new FakeRepo();
    @Override
    public User addUser(User user) {
        return fakeRepo.insertUser(user);
    }
    @Override
    @Cacheable("name")
    public User getUser(long Id) {
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
    public User removeUser(long Id) {
        return fakeRepo.deleteUser(Id);
    }
}