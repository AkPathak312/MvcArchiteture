package com.example.mvcarchitecture.Model;

public class User implements IUser{
    private String email,password;

    public User(String email, String password) {
        this.email = email;
        this.password = password;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public boolean isValidUser() {
        if(email.equals("a@a.com") && password.equals("123")){
            return true;
        }
        else{
            return false;
        }
    }
}
