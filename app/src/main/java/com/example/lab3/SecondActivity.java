package com.example.lab3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ConstraintLayout cl = new ConstraintLayout(this);
        ConstraintSet set = new ConstraintSet();
        set.clone(cl);
        TextView textView = new TextView(this);
        textView.setTextSize(20);
        textView.setPadding(16,16,16,16);
        textView.setText("Лабораторная работа №3. Бакумова В.Е.");
        cl.addView(textView);
        Button btn = new Button(this);
        btn.setText("Назад");
        btn.setTextSize(20);
        btn.setPadding(16,16,16,16);
        cl.addView(btn);


        setContentView(cl);
        //setContentView(R.layout.activity_second);

    }

    public void Back(View view) {
        Intent intentMain = new Intent(this, MainActivity.class);
        startActivity(intentMain);
    }
}