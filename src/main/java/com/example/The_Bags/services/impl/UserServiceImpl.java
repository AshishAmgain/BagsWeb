package com.example.The_Bags.services.impl;

import com.example.The_Bags.config.PasswordEncoderUtil;
import com.example.The_Bags.entity.User;
import com.example.The_Bags.pojo.UserPojo;
import com.example.The_Bags.repo.UserRepo;
import com.example.The_Bags.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;


@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepo userRepo;
    @Override
    public UserPojo save(UserPojo userPojo) throws IOException {
        User user= new User();
        user.setId(userPojo.getId());
        user.setEmail(userPojo.getEmail());
        user.setFullName(userPojo.getFullname());
        user.setMobileNo(userPojo.getMobile_no());
        user.setPassword(PasswordEncoderUtil.getInstance().encode(userPojo.getPassword()));

       user= userRepo.save(user);
        return new UserPojo(user);
    }

    @Override
    public List<User> fetchAll() {
        return null;
    }

    @Override
    public User fetchById(Integer id) {
        return null;
    }

    @Override
    public void deleteById(Integer id) {

    }

    @Override
    public void sendEmail() {

    }
}
