package com.cnabs.webapp.logic.model;

public class UserModel {
    public String name;
    public Integer age;

    public String getName(){
        return  this.name;
    }

    public void setName(String name){
        this.name=name;
    }

    public Integer getAge(){
        return this.getAge();
    }

    public void setAge(Integer age){
        this.age = age;
    }
}
