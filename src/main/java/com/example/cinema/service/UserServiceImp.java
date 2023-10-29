package com.example.cinema.service;

import com.example.cinema.entity.User;
import com.example.cinema.repositories.UserRepository;
import jakarta.persistence.criteria.CriteriaBuilder;
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

    public  void GetOneUserH1() {

        System.out.println("tao là tũn 22 đây");
    }
    public void getOneUser1(){
        System.out.println("tao là tun1");
    }


    public void vatimain() {
        System.out.println("them vào tí main");}

    public void TriLayUSer(){
        System.out.println("Tao là trí 1");

        System.out.println("tao là trí 1 tieeps theo");\

        System.out.println("tao là Trí 1 tiếp theo");
    }
    public  void mainKeTiep(){
        System.out.println("main");
    }
}
