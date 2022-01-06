package com.example.bmi;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class FoodListActivity extends AppCompatActivity {
    RecyclerView rvFoodList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foodlist);
        rvFoodList =findViewById(R.id.rv_foodlist);
        ArrayList<FoodInfo> foodInfos =new ArrayList<>();
        foodInfos.add(new FoodInfo(R.drawable.salamon,"Salamon", "fish", "22 cal/g"));
        foodInfos.add(new FoodInfo(R.drawable.salamon,"Salamon", "fish", "22 cal/g"));
        foodInfos.add(new FoodInfo(R.drawable.salamon,"Salamon", "fish", "22 cal/g"));
        foodInfos.add(new FoodInfo(R.drawable.salamon,"Salamon", "fish", "22 cal/g"));
        FoodAdapter adapter= new FoodAdapter(foodInfos);
        RecyclerView.LayoutManager lm=new GridLayoutManager( this, 2);
        rvFoodList.setHasFixedSize(true);
        rvFoodList.setLayoutManager(lm);
        rvFoodList.setAdapter(adapter);
    }

}




