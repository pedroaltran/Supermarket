package com.example.supermarket;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button button;
    CheckBox checkBox1, checkBox2, checkBox3, checkBox4, checkBox5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        checkBox1 = findViewById(R.id.checkBox1);
        checkBox2 = findViewById(R.id.checkBox2);
        checkBox3 = findViewById(R.id.checkBox3);
        checkBox4 = findViewById(R.id.checkBox4);
        checkBox5 = findViewById(R.id.checkBox5);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float sum = 0;
                if (checkBox1.isChecked()){
                    sum += 3.35f;
                }if (checkBox2.isChecked()){
                    sum += 5.54f;
                }if (checkBox3.isChecked()){
                    sum += 22.00f;
                }if (checkBox4.isChecked()){
                    sum += 6.65f;
                }if (checkBox5.isChecked()){
                    sum += 7.30;
                }
                TextView textView = findViewById(R.id.txtTotal);
                textView.setText(String.valueOf(sum));

            }
        });
    }
}