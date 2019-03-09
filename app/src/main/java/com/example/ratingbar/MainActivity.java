package com.example.ratingbar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RatingBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void go1(View view) {

        RatingBar ratingBar = findViewById(R.id.ratingBar);
        String rate = String.valueOf(ratingBar.getRating());
        Toast toast = Toast.makeText(this,rate,Toast.LENGTH_SHORT);
        toast.show();


    }


}
