package com.example.bmi;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class LogIn extends AppCompatActivity {
    EditText etUserName, etPass;
    Button btnLogin;
    Button btnSignUp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);
        btnSignUp =(Button) findViewById(R.id.btn_signup);
        btnSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Create your Intent Here
                Intent i = new Intent(LogIn.this, com.example.myapplication.signupActivity.class);
                startActivity(i);
            }
        });
    }
}