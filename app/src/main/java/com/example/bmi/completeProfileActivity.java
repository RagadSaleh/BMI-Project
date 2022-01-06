package com.example.bmi;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class completeProfileActivity extends AppCompatActivity {
    RadioButton rbMale, rbFemale;
    Button btnIncrement, btnDecrement, butIncrement1, butDecrement1, btnSaveData;
    EditText etNumber1, etNumber2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_complete_profile);
        btnSaveData = findViewById(R.id.btn_save);
        btnSaveData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new  Intent(completeProfileActivity.this, com.example.myapplication.HomePage.class);
                startActivity(intent);

            }
        });
            rbFemale = findViewById(R.id.radioFemale);
            rbMale = findViewById(R.id.radioMale);

            rbMale.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                    if (b)
                        Toast.makeText(getBaseContext(), "Checked", Toast.LENGTH_LONG).show();
                    else
                        Toast.makeText(getBaseContext(), "Un checked", Toast.LENGTH_LONG).show();
                }
            });

        btnIncrement = findViewById(R.id.increment33);
        etNumber1 = findViewById(R.id.editTextText1weight);
        btnIncrement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num = Integer.parseInt(etNumber1.getText().toString());
                num += 1;
                etNumber1.setText(num+"");
            }
        });
        btnDecrement = findViewById(R.id.button11dec);
        etNumber1 = findViewById(R.id.editTextText1weight);
        btnDecrement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num = Integer.parseInt(etNumber1.getText().toString());
                num -= 1;
                etNumber1.setText(num+"");
            }
        });
        butIncrement1 = findViewById(R.id.incLength);
        etNumber2 = findViewById(R.id.edit_txtcomplete);
        butIncrement1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num = Integer.parseInt(etNumber2.getText().toString());
                num += 1;
                etNumber2.setText(num+"");
            }
        });
        butDecrement1 = findViewById(R.id.butdecrementlength);
        etNumber2 = findViewById(R.id.edit_txtcomplete);
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