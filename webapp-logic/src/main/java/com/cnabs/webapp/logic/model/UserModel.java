package com.cnabs.webapp.logic.model;

public class UserModel {
    private String name;
    private Integer age;

    public String getName(){
        return  this.name;
    }

    public void setName(String name){
        this.name=name;
    }

    public Integer getAge(){
        return this.age;
    }

    public void setAge(Integer age){
        this.age = age;
    }
}
