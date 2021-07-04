package com.dbf.service;

import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class UserService {
    public void  getCron(){
        System.out.println(new Date());
    }

}
