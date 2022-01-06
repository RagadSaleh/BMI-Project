package com.example.bmi;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class NewRecordActivity extends AppCompatActivity {
    Button btnIncrement, btnDecrement, butIncrement1, butDecrement1, btnSaveData;
    EditText etNumber1, etNumber2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_record);
        btnSaveData = findViewById(R.id.btn_saverecord);
        btnSaveData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent (NewRecordActivity.this, com.example.myapplication.AddFoodActivity.class);
                startActivity(intent);
            }
        });

        btnIncrement = findViewById(R.id.buttinc222);
        etNumber1 = findViewById(R.id.editTextText22);
        btnIncrement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num = Integer.parseInt(etNumber1.getText().toString());
                num += 1;
                etNumber1.setText(num+"");
            }
        });
        btnDecrement = findViewById(R.id.butdec2);
        etNumber1 = findViewById(R.id.editTextText22);
        btnDecrement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num = Integer.parseInt(etNumber1.getText().toString());
                num -= 1;
                etNumber1.setText(num+"");
            }
        });
        butIncrement1 = findViewById(R.id.buttinc2newrecord);
        etNumber2 = findViewById(R.id.editTextText2newrecord);
        butIncrement1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num = Integer.parseInt(etNumber2.getText().toString());
                num += 1;
                etNumber2.setText(num+"");
            }
        });
        butDecrement1 = findViewById(R.id.buttondecrement22);
        etNumber2 = findViewById(R.id.editTextText2newrecord);
        butDecrement1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num = Integer.parseInt(etNumber2.getText().toString());
                num -= 1;
                etNumber2.setText(num+"");
            }
        });
    }
}