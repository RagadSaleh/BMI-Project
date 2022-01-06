package com.example.bmi;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class signupActivity extends AppCompatActivity {
    Button btnLogIn;
    EditText name,email, pass, rePass;
    Button btnCreate;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        btnLogIn = (Button)findViewById(R.id.btn_log);
        name=(EditText )findViewById(R.id.txt_name);
        email=(EditText )findViewById(R.id.txt_email);
        pass =(EditText )findViewById(R.id.txt_password);
        rePass =(EditText )findViewById(R.id.txt_repass);
        btnCreate =(Button )findViewById(R.id.btn_create);

        btnLogIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Create your Intent Here

                Intent i = new Intent(signupActivity.this,LogIn.class);
                startActivity(i);
            }
        });
        btnCreate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Create your Intent Here

                Intent ii = new Intent(signupActivity.this, com.example.bmi.completeProfileActivity.class);
                startActivity(ii);
            }
        });




    }
}