package com.example.The_Bags.services;

import com.example.The_Bags.entity.User;
import com.example.The_Bags.pojo.UserPojo;

import java.io.IOException;
import java.util.List;



public interface UserService {
    UserPojo save(UserPojo userPojo) throws IOException;

    List<User> fetchAll();

    User fetchById(Integer id);

    void deleteById(Integer id);

    void sendEmail();

}
