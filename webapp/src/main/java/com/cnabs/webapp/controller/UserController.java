package com.cnabs.webapp.controller;

import com.cnabs.webapp.logic.model.UserModel;
import com.cnabs.webapp.logic.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Service
@RestController
@RequestMapping(value = "/user")
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping(value = "/getuser")
    public UserModel getUser(){
        UserModel userModel= this.userService.getUserModel();
        return  userModel;
    }
}
