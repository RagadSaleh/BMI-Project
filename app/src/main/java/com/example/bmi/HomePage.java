package com.example.bmi;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class HomePage extends AppCompatActivity {
    static HomePage instance;
    TextView name;
    EditText status;
    Button btnAddFood, btnAddRecord, btnViewFood, btnLogout;
RecyclerView rv;
public static RecordsAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        instance = this;
        setContentView(R.layout.activity_home_page);
        rv = findViewById(R.id.rv_BMI);
        ArrayList<Record> records = new ArrayList<>();
        records.add(new Record("12/3/2020" ,2.15,    160, "Normal"));
        records.add(new Record("12/3/2020" ,2.15,    160, "Normal"));
        records.add(new Record("12/3/2020" ,2.15,    160, "Normal"));
        records.add(new Record("12/3/2020" ,2.15,    160, "Normal"));
        RecordsAdapter adapter = new RecordsAdapter(records);
        RecyclerView.LayoutManager lm;
        lm = new LinearLayoutManager(this);
        rv.setHasFixedSize(true);
        rv.setLayoutManager(lm);
        rv.setAdapter(adapter);
        name = findViewById(R.id.txt_hi);
        status = findViewById(R.id.normal);
        btnAddFood = findViewById(R.id.btn_addfood);
        btnAddRecord = findViewById(R.id.btn_addrecord);
        btnViewFood = findViewById(R.id.btn_viewfood);
        btnLogout = findViewById(R.id.btn_logout);
        btnLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                logout();
            }
        });
        btnAddFood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addFood();
            }
        });
        btnAddRecord.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addRecord();
            }
        });
        btnViewFood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewFood();
            }
        });






    }
    public void addFood(){
    Intent x= new Intent (HomePage.this, AddFoodActivity.class);
    startActivity(x);
}
public void viewFood(){
        Intent x= new Intent (HomePage.this, com.example.myapplication.FoodListActivity.class);
        startActivity(x);
        }
public void addRecord(){
        Intent x= new Intent (HomePage.this, NewRecordActivity.class);
        startActivity(x);
        }
public void logout(){
        Intent x= new Intent (HomePage.this, LogIn.class);
finish();
        startActivity(x);
}
public static void checkBMIChange(){
    if(instance==null)return;
    instance.adapter.notifyDataSetChanged();
    /*instance.status.setText(user.setHomeMessage());
    instance.name.setText("Hi," + user.getName());*/
        }
        @Override
protected void onResume(){
  super.onResume();
        checkBMIChange();
        }
}