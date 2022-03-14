package com.example.imageview;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView myImageView;
    Button buttonHappy, buttonSad, buttonNeutral;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonHappy = findViewById(R.id.btn_happy);
        buttonNeutral = findViewById(R.id.btn_neutral);
        buttonSad = findViewById(R.id.btn_sad);

        myImageView = findViewById(R.id.top_image);

        buttonHappy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myImageView.setImageResource(R.drawable.ic_sentiment_satisfied_black_96dp);
            }
        });

        buttonNeutral.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myImageView.setImageResource(R.drawable.ic_sentiment_neutral_black_96dp);
            }
        });

        buttonSad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myImageView.setImageResource(R.drawable.ic_sentiment_sad_black_96dp);
            }
        });
    }
}