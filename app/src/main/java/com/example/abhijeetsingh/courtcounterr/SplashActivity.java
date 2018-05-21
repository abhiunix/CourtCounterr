package com.example.abhijeetsingh.courtcounterr;

import android.content.Intent;
import android.icu.text.NumberFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class SplashActivity extends AppCompatActivity {


    int quantity = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @RequiresApi(api = Build.VERSION_CODES.N)
    public void pointa3(View view) {

        quantity = quantity + 3;
        displayA(quantity);

    }

    @RequiresApi(api = Build.VERSION_CODES.N)
    public void pointa2(View view) {

        quantity = quantity + 2;
        displayA(quantity);

    }

    @RequiresApi(api = Build.VERSION_CODES.N)
    public void freethrowa(View view) {

        quantity = quantity + 1;
        displayA(quantity);


    }

    private void displayA(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.team_a_score);
        quantityTextView.setText("" + number);
    }

    int quantityy = 0;

    @RequiresApi(api = Build.VERSION_CODES.N)
    public void freethrowb(View view) {

        quantityy = quantityy + 1;
        displayB(quantityy);
    }

    @RequiresApi(api = Build.VERSION_CODES.N)
    public void pointb3(View view) {

        quantityy = quantityy + 3;
        displayB(quantityy);

    }

    @RequiresApi(api = Build.VERSION_CODES.N)
    public void pointb2(View view) {

        quantityy = quantityy + 2;
        displayB(quantityy);

    }

    private void displayB(int number) {
        TextView quantityyTextView = (TextView) findViewById(R.id.team_b_score);
        quantityyTextView.setText("" + number);
    }

    public void resetScore(View view) {
        quantity = 0;
        quantityy = 0;
        displayA(quantity);
        displayB(quantityy);
    }
}