package com.dbf.controller;

import com.dbf.entity.User;
import com.dbf.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    UserRepository userRepository;


    /* 插入用户 */
    // http://localhost:8080/user?lastName=bob&email=bob.com
    @GetMapping("user")
    public User insertUser(User user){
        User save=userRepository.save(user); // 增改的方法
        return  save;
    }

    /*
    *  根据id查询用户
    * */
    @GetMapping("user/{id}")
    public User getUser(@PathVariable("id") Integer id){
        User user=userRepository.findById(id).get();
        return  user;
    }
}
