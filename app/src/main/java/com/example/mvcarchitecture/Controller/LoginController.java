package com.example.mvcarchitecture.Controller;

import com.example.mvcarchitecture.Model.User;
import com.example.mvcarchitecture.View.ILoginView;

public class LoginController implements  ILoginController{
    ILoginView iLoginView;

    public LoginController(ILoginView iLoginView) {
        this.iLoginView = iLoginView;
    }

    @Override
    public void onLogin(String email, String password) {
        User user=new User(email, password);
        boolean flag=user.isValidUser();
        if(flag){
            iLoginView.onSucess("User is Valid.");
        }else{
            iLoginView.onFailure("User is Invalid.");
        }
    }
}
