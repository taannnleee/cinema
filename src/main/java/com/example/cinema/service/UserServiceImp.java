package com.example.cinema.service;

import com.example.cinema.entity.User;
import com.example.cinema.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.ArrayList;
@Component
public class UserServiceImp implements UserService{

    @Autowired
    private UserRepository userRepository;
    @Override
    public User addUser(User user) {
        if(user!=null)
        {
            return (userRepository.save(user));
        }
        return null;
    }

    public  void GetOneUser() {

        System.out.println("tao là tun 2 đây");


    }
    public  void GetOneUserH() {

        System.out.println("tao là tun 2.1 đây");


    }

    public  void GetOneUserH() {

        System.out.println("tao là tũn 22 đây");
    }
}
