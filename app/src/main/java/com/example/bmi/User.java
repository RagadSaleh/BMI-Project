package com.example.bmi;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;

import java.util.ArrayList;

public class User {
    public static User user;
    private FirebaseAuth mAuth;
    private ArrayList<com.example.myapplication.Record> records=new ArrayList<com.example.myapplication.Record>();
    private ArrayList<com.example.myapplication.FoodInfo> foodInfos =new ArrayList<com.example.myapplication.FoodInfo>();
    private String name, email, password,re_password,bd;
    private boolean male;


    public User() throws com.example.myapplication.UserInfoException {
        this(user.name, user.email, user.password, user.re_password, user.bd ,user.AppCompatActivity.context);
    }

    public User(String name, String email, String password, String re_password, String bd, AppCompatActivity context) throws com.example.myapplication.UserInfoException {
        if(!name.matches("[A-Za-z\\s]+")) throw new com.example.myapplication.UserInfoException("name");
        if(!email.matches("[A-Za-z][\\w]{0,31}@[\\w]{2,10}\\.com"))throw new com.example.myapplication.UserInfoException("email");
        if(!password.equals(re_password))throw new com.example.myapplication.UserInfoException("re-password");
        if(password.length()<3)throw new com.example.myapplication.UserInfoException("re-password");
        this.name=name;
        this.email=email;
        this.password=password;
    }

    public FirebaseAuth  getmAuth() {
        return mAuth;
    }

    public void setmAuth(FirebaseAuth mAuth) {
        this.mAuth = mAuth;
    }
    public User(String email, String password){
        this.email=email;
        this.password=password;
    }
    public boolean isMale(){ return male;}
}
