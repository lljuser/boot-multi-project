package com.cnabs.webapp.logic.service;

import com.cnabs.webapp.logic.model.UserModel;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    public UserModel getUserModel(){
        UserModel userModel=new UserModel();
        userModel.setName("llj");
        userModel.setAge(100);
        return  userModel;
    }
}
