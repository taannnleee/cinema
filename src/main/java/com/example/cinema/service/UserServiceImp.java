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
    public void deleteUser(Long id, User user){
        System.out.println("ban ddax xoas thanfh coong");
        System.out.println("ban ddax xoas thanfh coong -v2");
        System.out.println("Xóa thanh công ver3 trên nhánh TestHead");
    }
}
