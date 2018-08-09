package com.cnabs.webapp;

import com.cnabs.webapp.logic.model.UserModel;
import com.cnabs.webapp.logic.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/user")
public class UserController {

    @RequestMapping(value = "/getuser")
    public UserModel getUser(){
        UserService userService=new UserService();
        UserModel userModel= userService.getUserModel();
        return  userModel;
    }
}
