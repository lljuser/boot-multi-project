package com.cnabs.webapp.logic.service;

import com.cnabs.webapp.logic.model.UserModel;

public class UserService {
    private UserModel userModel;

    public UserModel getUserModel(){
        UserModel userModel=new UserModel();
        userModel.setName("llj");
        userModel.setAge(100);
        return  userModel;
    }
}
