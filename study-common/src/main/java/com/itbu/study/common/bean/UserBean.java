package com.itbu.study.common.bean;

public class UserBean {
    private int id;
    private String username;
    private String password;

    public int getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }

    public String getUsername() {
        return username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public UserBean(){

    }

    public UserBean(String username, String password){
        this.username = username;
        this.password = password;
    }
}
