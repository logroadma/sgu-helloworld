package com.mtk.boot.service;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserService userService;

    public void testSameObj(){

        System.out.println("we are the same?"+(userService==this));
    }
}
