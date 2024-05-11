package com.amlan.test1.service;

import com.amlan.test1.entity.User;
import com.amlan.test1.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository users;

    public User saveUser(User user){
        User current = users.findById(user.getUserId()).orElse(null);
        return current == null ? null : users.save(user);
    }

    public void updateUser(User user){
        if(users.findById(user.getUserId()).isPresent()){
            users.save(user);
        }
    }


    public List<User> getAllUsers(){
        return users.findAll();
    }
}
