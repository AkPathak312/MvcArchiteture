package com.example.mvcarchitecture;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.mvcarchitecture.Controller.ILoginController;
import com.example.mvcarchitecture.Controller.LoginController;
import com.example.mvcarchitecture.View.ILoginView;

public class MainActivity extends AppCompatActivity implements ILoginView {

    EditText edtUsername,edtPassword;
    ILoginController iLoginController;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtUsername=findViewById(R.id.edtUserName);
        edtPassword=findViewById(R.id.edtPassword);
        iLoginController =new LoginController(this);
    }

    public void login(View view) {
        iLoginController.onLogin(edtUsername.getText().toString(),edtPassword.getText().toString());
    }

    @Override
    public void onSucess(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onFailure(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}